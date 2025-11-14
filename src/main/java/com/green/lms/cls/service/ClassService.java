package com.green.lms.cls.service;

import com.green.lms.cls.mapper.ClassMapper;
import com.green.lms.cls.vo.ClassInfoVO;
import com.green.lms.cls.vo.ClassOperInfoVO;
import com.green.lms.cls.vo.ClassVoForInsert;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
      }

    }

}
