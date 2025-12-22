import React, { useEffect, useState, useMemo, useRef } from 'react'
import styles from './EnrollConsult.module.css'
import Accordion from '../../components/common/Accordion'
import EnrollConsultListPerClass from '../../components/consult/EnrollConsultListPerClass';
import EnrollConsultTitle from '../../components/consult/EnrollConsultTitle';
import { selectClassAndConsultList, selectClassListRecruiting } from '../../apis/classInfoApis';
import Modal from '../../components/common/Modal';
import RegConsultModalBody from '../../components/consult/RegConsultModalBody';
import { Client } from '@stomp/stompjs';
import SockJS from 'sockjs-client';

//훈련 등록 상담
const EnrollConsult = () => {
  //모집 중 과정 목록 조회 저장 변수
  const [classList, setClassList] = useState([]);

  //훈련생 등록 모달 오픈 여부
  const [isOpenAddModal, setIsOpenAddModal] = useState(false);

  //선택한 클래스 번호
  const [selectedClassNum, setSelectedClassNum] = useState(null);

  // WebSocket 클라이언트 및 사용자명 (ConsultSheet와 공유)
  const [stompClient, setStompClient] = useState(null);
  const userNameRef = useRef("사용자" + Math.floor(Math.random() * 1000));
  const userName = userNameRef.current;

  //훈련생 등록 모달 오픈 함수
  const openAddModal = (size = 'medium') => {
    setIsOpenAddModal(true);
  };

  //훈련생 등록 모달 닫기 함수
  const closeAddModal = () => {
    setIsOpenAddModal(false);
  };

  //모집 중 과정 목록 조회 함수
  const getClassAndConsultList = async () => {
    const respose = await selectClassAndConsultList();
    setClassList(respose.data);
  };

  useEffect(() => {
    getClassAndConsultList();

    // WebSocket 연결 설정
    const socket = new SockJS('http://localhost:8080/ws-consult');
    const client = new Client({
      webSocketFactory: () => socket,
      reconnectDelay: 5000,
      heartbeatIncoming: 4000,
      heartbeatOutgoing: 4000,
      onConnect: () => {
        console.log('[EnrollConsult] WebSocket 연결 성공');
        setStompClient(client);
      },
      onStompError: (frame) => {
        console.error('[EnrollConsult] STOMP 오류:', frame);
      },
      onDisconnect: () => {
        console.log('[EnrollConsult] WebSocket 연결 해제');
      }
    });

    client.activate();

    // 컴포넌트 언마운트 시 연결 해제
    return () => {
      if (client && client.connected) {
        client.deactivate();
      }
    };
  }, []);

  // useMemo를 사용하여 불필요한 재생성 방지
  const accordionData = useMemo(() => {
    if(classList.length === 0) return [];

    return classList.map((classInfo, i) => {
      return {
        title : <EnrollConsultTitle classInfo={classInfo}/>,
        content : <EnrollConsultListPerClass
          consultList={classInfo.consultList}
          refreshConsultList={getClassAndConsultList}
          stompClient={stompClient}
          userName={userName}
        />
      }
    });
  }, [classList, stompClient, userName])

//   const items = [
//   { title: "첫 번째", content: <EnrollConsultListPerClass /> },
//   { title: "두 번째", content: "내용 B" },
//   { title: "세 번째", content: "내용 C" },
//   { title: "네 번째", content: "내용 D" },
// ];

  return (
    <div>
      <Accordion items={accordionData} openAddModal={openAddModal} setSelectedClassNum={setSelectedClassNum}/>

      {/* 신규 학생 등록 모달 */}
      <Modal
        isOpen={isOpenAddModal}
        onClose={closeAddModal}
        title="훈련 등록 상담"
        size='medium'
        iconType='add-user'
      >
        <RegConsultModalBody
          onClose={closeAddModal}
          selectedClassNum={selectedClassNum}
          getClassAndConsultList={getClassAndConsultList}
          stompClient={stompClient}
          userName={userName}
        />
      </Modal>
    </div>
  )
}

export default EnrollConsult