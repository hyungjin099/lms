package com.green.lms.consult.controller;

import com.green.lms.consult.service.ConsultService;
import com.green.lms.consult.vo.ConsultVO;
import com.green.lms.consult.vo.ConsultVoForInsertStu;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/consult")
public class ConsultController {
  private final ConsultService consultService;

  //신규 상담 등록 API
  @PostMapping("")
  public ResponseEntity<?> insertConsult(@RequestBody ConsultVoForInsertStu consultVoForInsertStu){
    try{
      consultService.insertConsult(consultVoForInsertStu);
      return ResponseEntity.status(HttpStatus.CREATED).build();
    }catch (Exception e){
      log.error("ConsultController - insertConsult error", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

  //신규 학생 등록 시 상담 이력 조회
  @GetMapping("/history/{stuNum}")
  public ResponseEntity<?> getConsultHistory(@PathVariable("stuNum") int stuNum){
    try{
      List<ConsultVO> list = consultService.selectConsultHistory(stuNum);
      return ResponseEntity.status(HttpStatus.OK).body(list);
    }catch (Exception e){
      log.error("ConsultController - getConsultHistory error", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

  //동일 학생이 한 과정에 중복 상담 체크인지 확인
  @GetMapping("/is-possible-add")
  public ResponseEntity<?> isPossibleAdd(ConsultVoForInsertStu consultVoForInsertStu){
    try{
      boolean result = consultService.isPossibleAdd(consultVoForInsertStu);
      return ResponseEntity.status(HttpStatus.OK).body(result);
    }catch (Exception e){
      log.error("ConsultController - isPossibleAdd error", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

  //상담 내용 수정
  @PutMapping("/{consultNum}")
  public ResponseEntity<?> updateConsultInfo(@PathVariable("consultNum") int consultNum , @RequestBody ConsultVO consultVO){
    try{
      consultVO.setConsultNum(consultNum);
      System.out.println(consultVO);
      consultService.updateConsultInfo(consultVO);
      return ResponseEntity.status(HttpStatus.OK).build();
    }catch (Exception e){
      log.error("ConsultController - updateConsultInfo error", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }




}
