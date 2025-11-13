package com.green.lms.class_type.controller;

import com.green.lms.class_type.service.ClassTypeService;
import com.green.lms.class_type.vo.ClassTypeVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/class-type")
public class ClassTypeController {
  private final ClassTypeService classTypeService;

  //과정 유형 전체 조회 API
  @GetMapping("")
  public ResponseEntity<?> getAll(){
    List<ClassTypeVO> list = classTypeService.getAll();
    return ResponseEntity.status(HttpStatus.OK).body(list);
  }

}
