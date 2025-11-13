package com.green.lms.class_type.mapper;

import com.green.lms.class_type.vo.ClassTypeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassTypeMapper {
  //과정 유형 전체 조회
  List<ClassTypeVO> getAll();
}
