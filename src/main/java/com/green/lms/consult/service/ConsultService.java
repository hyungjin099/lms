package com.green.lms.consult.service;

import com.green.lms.consult.mapper.ConsultMapper;
import com.green.lms.consult.vo.ConsultVO;
import com.green.lms.consult.vo.ConsultVoForInsertStu;
import com.green.lms.stu.mapper.StuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsultService {
  private final ConsultMapper consultMapper;
  private final StuMapper stuMapper;

  //신규 상담 등록
  @Transactional(rollbackFor = Exception.class)
  public void insertConsult(ConsultVoForInsertStu consultVoForInsertStu){

    //신규 등록 학생이면 학생 등록 + 상담등록
    if(consultVoForInsertStu.getIsDuplicate().equals("N")){
      //신규 학번 조회
      int nextStuNum = stuMapper.selectNextStuNum();
      //신규 학생 등록
      consultVoForInsertStu.setStuNum(nextStuNum);
      stuMapper.insertNewStu(consultVoForInsertStu);
      //신규 상담 등록
      consultMapper.insertConsult(consultVoForInsertStu);
    }
    //기존 학생이라면 상담등록 + 연락처 수정
    else{
      //신규 상담 등록
      consultMapper.insertConsult(consultVoForInsertStu);

      //연락처 업데이트
      stuMapper.updateStuPhone(consultVoForInsertStu);
    }
  }

  //신규 학생 등록 시 상담 이력 조회
  public List<ConsultVO> selectConsultHistory(int stuNum){
    return consultMapper.selectConsultHistory(stuNum);
  }

  //동일 학생이 한 과정에 중복 상담 체크인지 확인
  public boolean isPossibleAdd(ConsultVoForInsertStu consultVoForInsertStu){
    String result = consultMapper.checkDuplicateConsult(consultVoForInsertStu);
    return result == null;
  }

}
