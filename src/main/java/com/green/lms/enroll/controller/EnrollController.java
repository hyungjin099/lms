package com.green.lms.enroll.controller;

import com.green.lms.enroll.service.EnrollService;
import com.green.lms.enroll.vo.EnrollVO;
import com.green.lms.stu.vo.StuVO;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/enroll")
public class EnrollController {
  private final EnrollService enrollService;

  //훈련생 등록 시 기등록 훈련생 여부 판단을 위한 조회
  @GetMapping("/list-for-check-duplicate/{stuNum}")
  public ResponseEntity<?> getEnrollListForCheckDuplicate(@PathVariable("stuNum") int stuNum){
    try {
      List<EnrollVO> list = enrollService.getEnrollListForCheckDuplicate(stuNum);
      return ResponseEntity.status(HttpStatus.OK).body(list);
    }catch (Exception e){
      log.error("EnrollController - getEnrollListForCheckDuplicate error", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

}
