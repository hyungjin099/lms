package com.green.lms.consult.mapper;

import com.green.lms.consult.vo.ConsultVO;
import com.green.lms.consult.vo.ConsultVoForInsertStu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConsultMapper {
  //신규 상담 등록
  void insertConsult(ConsultVoForInsertStu consultVoForInsertStu);

  //신규 상담 등록 시 상담 이력 조회
  List<ConsultVO> selectConsultHistory(int stuNUm);

  //동일 학생이 한 과정에 중복 상담 체크인지 확인
  String checkDuplicateConsult(ConsultVoForInsertStu consultVoForInsertStu);
}
