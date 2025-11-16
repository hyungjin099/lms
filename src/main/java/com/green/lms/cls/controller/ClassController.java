package com.green.lms.cls.controller;

import com.green.lms.cls.service.ClassService;
import com.green.lms.cls.vo.ClassOperInfoVO;
import com.green.lms.cls.vo.ClassVoForInsert;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cls")
public class ClassController {
  private final ClassService classService;

  @PostMapping("")
  public ResponseEntity<?> saveClassInfo(@RequestBody ClassVoForInsert classVoForInsert){
    System.out.println(classVoForInsert);
    try{
      classService.insertClassInfo(classVoForInsert);
      return ResponseEntity.status(HttpStatus.CREATED).build();
    }catch (Exception e){
      log.error("ClassController - saveClassInfo", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

  //모집중인 과정 정보 조회
  @GetMapping("/recruiting")
  public ResponseEntity<?> getClassListRecruiting(){
    try{
      List<ClassOperInfoVO> list = classService.getClassListRecruiting();
      return ResponseEntity.status(HttpStatus.OK).body(list);
    }catch (Exception e){
      log.error("ClassController - getClassListRecruiting", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

}
