package com.green.lms.stu.mapper;

import com.green.lms.consult.vo.ConsultVoForInsertStu;
import com.green.lms.stu.vo.StuVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuMapper {
  //신규 등록 학생번호 조회
  Integer selectNextStuNum();

  //신규 등록
  void insertNewStu(ConsultVoForInsertStu consultVoForInsertStu);

  //학생 등록 시 중복 학생 체크를 위한 학생 목록 정보 조회
  List<StuVO> selectStuListForCheckDuplicate(ConsultVoForInsertStu consultVoForInsertStu);

  //연락처 수정
  void updateStuPhone(ConsultVoForInsertStu consultVoForInsertStu);
}
