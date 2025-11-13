package com.green.lms.staff.service;

import com.green.lms.staff.mapper.StaffMapper;
import com.green.lms.staff.vo.StaffVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StaffService {
  private final StaffMapper staffMapper;

  public List<StaffVO> getAll(){
    return staffMapper.getAll();
  }
}
