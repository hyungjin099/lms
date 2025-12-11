package com.green.lms.cls.mapper;

import com.green.lms.cls.vo.ClassInfoVO;
import com.green.lms.cls.vo.ClassOperInfoVO;
import com.green.lms.cls.vo.ClassVoForGetConsultList;
import com.green.lms.cls.vo.ClassVoForInsert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassMapper {
  int getNextClassNum();
  void insertClassInfo(ClassVoForInsert classVoForInsert);
  void insertClassOperInfo(ClassVoForInsert classVoForInsert);

  //모집중인 과정 정보 조회
  List<ClassOperInfoVO> getClassListRecruiting();

  //모집 과정 + 상담 목록 조회
  List<ClassVoForGetConsultList> selectClassAndConsultList();

}
