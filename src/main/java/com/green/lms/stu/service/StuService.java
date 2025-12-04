package com.green.lms.stu.service;

import com.green.lms.consult.vo.ConsultVoForInsertStu;
import com.green.lms.stu.mapper.StuMapper;
import com.green.lms.stu.vo.StuVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StuService {
  private final StuMapper stuMapper;

  //학생 등록 시 중복 학생 체크를 위한 학생 목록 정보 조회
  public List<StuVO> selectStuListForCheckDuplicate(ConsultVoForInsertStu consultVoForInsertStu){
    return stuMapper.selectStuListForCheckDuplicate(consultVoForInsertStu);
  }
//  //신규 등록
//  public void insertNewStu(StuVO stuVO){
//    int nextStuNum = stuMapper.selectNextStuNum();
//    stuVO.setStuNum(nextStuNum);
//    stuMapper.insertNewStu(stuVO);
//  }
}
