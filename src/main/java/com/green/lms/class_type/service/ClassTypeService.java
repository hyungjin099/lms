package com.green.lms.class_type.service;

import com.green.lms.class_type.mapper.ClassTypeMapper;
import com.green.lms.class_type.vo.ClassTypeVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassTypeService {
  private final ClassTypeMapper classTypeMapper;

  //과정 유형 전체 조회
  public List<ClassTypeVO> getAll(){
    return classTypeMapper.getAll();
  }
}
