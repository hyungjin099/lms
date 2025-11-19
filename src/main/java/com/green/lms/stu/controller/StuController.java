package com.green.lms.stu.controller;

import com.green.lms.stu.service.StuService;
import com.green.lms.stu.vo.StuVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/stu")
public class StuController {
  private final StuService stuService;

//  //신규 등록 API
//  @PostMapping("")
//  public ResponseEntity<?> insertNewStu(@RequestBody StuVO stuVO){
//    try{
//      stuService.insertNewStu(stuVO);
//      return ResponseEntity.status(HttpStatus.CREATED).build();
//    }catch (Exception e){
//      log.error("StuController - insertNewStu error", e);
//      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//    }
//  }

}
