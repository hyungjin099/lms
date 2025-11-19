package com.green.lms.stu.mapper;

import com.green.lms.consult.vo.ConsultVoForInsertStu;
import com.green.lms.stu.vo.StuVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StuMapper {
  //신규 등록 학생번호 조회
  Integer selectNextStuNum();

  //신규 등록
  void insertNewStu(ConsultVoForInsertStu consultVoForInsertStu);

}
