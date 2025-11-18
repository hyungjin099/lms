package com.green.lms.enroll.service;

import com.green.lms.enroll.mapper.EnrollMapper;
import com.green.lms.enroll.vo.EnrollVO;
import com.green.lms.stu.vo.StuVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnrollService {
  private final EnrollMapper enrollMapper;

  //훈련생 등록 시 기등록 훈련생 여부 판단을 위한 조회
  public List<EnrollVO> getEnrollListForCheckDuplicate(StuVO stuVO){
    return enrollMapper.getEnrollListForCheckDuplicate(stuVO);
  }
}
