package com.green.lms.job_type.service;

import com.green.lms.job_type.vo.JobTypeVO;
import com.green.lms.job_type.mapper.JobTypeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobTypeService {
  private final JobTypeMapper jobTypeMapper;

  //직종 전체 조회
  public List<JobTypeVO> getAll(){
    return jobTypeMapper.getAll();
  }
}
