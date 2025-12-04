package com.green.lms.stu.controller;

import com.green.lms.consult.vo.ConsultVoForInsertStu;
import com.green.lms.stu.service.StuService;
import com.green.lms.stu.vo.StuVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/stu")
public class StuController {
  private final StuService stuService;

  //학생 등록 시 중복 학생 체크를 위한 학생 목록 정보 조회 API
  @GetMapping("/list-check-duplicate")
  public ResponseEntity<?> getStuListForCheckDuplicate(ConsultVoForInsertStu consultVoForInsertStu){
    try{
      List<StuVO> list = stuService.selectStuListForCheckDuplicate(consultVoForInsertStu);
      return ResponseEntity.status(HttpStatus.OK).body(list);
    }catch (Exception e){
      log.error("StuController - getStuListForCheckDuplicate error", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

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
