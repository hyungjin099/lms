package com.green.lms.staff.mapper;

import com.green.lms.staff.vo.StaffVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StaffMapper {
  List<StaffVO> getAll();
}
