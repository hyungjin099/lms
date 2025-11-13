package com.green.lms.cls.mapper;

import com.green.lms.cls.vo.ClassInfoVO;
import com.green.lms.cls.vo.ClassOperInfoVO;
import com.green.lms.cls.vo.ClassVoForInsert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassMapper {
  int getNextClassNum();
  void insertClassInfo(ClassVoForInsert classVoForInsert);
  void insertClassOperInfo(ClassVoForInsert classVoForInsert);
}
