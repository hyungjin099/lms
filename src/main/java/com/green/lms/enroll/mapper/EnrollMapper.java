package com.green.lms.enroll.mapper;

import com.green.lms.enroll.vo.EnrollVO;
import com.green.lms.stu.vo.StuVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnrollMapper {
  //훈련생 등록 시 기등록 훈련생 여부 판단을 위한 조회
  List<EnrollVO> getEnrollListForCheckDuplicate(StuVO stuVO);
}
