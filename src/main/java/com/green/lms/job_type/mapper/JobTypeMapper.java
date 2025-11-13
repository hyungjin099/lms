package com.green.lms.job_type.mapper;

import com.green.lms.job_type.vo.JobTypeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobTypeMapper {
  //직종 전체 조회
  List<JobTypeVO> getAll();
}
