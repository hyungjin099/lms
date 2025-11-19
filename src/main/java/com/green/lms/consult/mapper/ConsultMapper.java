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
  List<ConsultVO> selectConsultHistory(ConsultVoForInsertStu consultVoForInsertStu);
}
