package com.green.lms.staff.controller;

import com.green.lms.staff.service.StaffService;
import com.green.lms.staff.vo.StaffVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("staff")
public class StaffController {
  private final StaffService staffService;

  @GetMapping("")
  public ResponseEntity<?> getAll(@RequestParam(name = "staffTask", required = false) String staffTask){
    List<StaffVO> list = staffService.getAll(staffTask);
    return ResponseEntity.status(HttpStatus.OK).body(list);
  }

}
