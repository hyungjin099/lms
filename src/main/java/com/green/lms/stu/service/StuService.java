package com.green.lms.stu.service;

import com.green.lms.stu.mapper.StuMapper;
import com.green.lms.stu.vo.StuVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StuService {
  private final StuMapper stuMapper;

//  //신규 등록
//  public void insertNewStu(StuVO stuVO){
//    int nextStuNum = stuMapper.selectNextStuNum();
//    stuVO.setStuNum(nextStuNum);
//    stuMapper.insertNewStu(stuVO);
//  }
}
