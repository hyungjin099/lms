package com.green.lms.cls.service;

import com.green.lms.cls.mapper.ClassMapper;
import com.green.lms.cls.vo.ClassOperInfoVO;
import com.green.lms.cls.vo.ClassVoForGetConsultList;
import com.green.lms.cls.vo.ClassVoForInsert;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClassService {
  private final ClassMapper classMapper;

  @Transactional(rollbackFor = Exception.class)
  public void insertClassInfo(ClassVoForInsert classVoForInsert){
    try{
      classVoForInsert.setDaysToString();
      int nextClassNum = classMapper.getNextClassNum();
      classVoForInsert.setClassNum(nextClassNum);
      classVoForInsert.setCreateUser("admin");
      classMapper.insertClassInfo(classVoForInsert);
      classMapper.insertClassOperInfo(classVoForInsert);
    }catch (Exception e){
      log.error("ClassService-insertClassInfo error", e);
      throw e;
    }
  }

  //모집중인 과정 정보 조회
  public List<ClassOperInfoVO> getClassListRecruiting(){
    return classMapper.getClassListRecruiting();
  }

  //모집과정 + 상담목록 조회
  public List<ClassVoForGetConsultList> selectClassAndConsultList(){
    return classMapper.selectClassAndConsultList();
  }

}
