package com.green.lms.cls.controller;

import com.green.lms.cls.service.ClassService;
import com.green.lms.cls.vo.ClassVoForInsert;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cls")
public class ClassController {
  private final ClassService classService;

  @PostMapping("")
  public ResponseEntity<?> saveClassInfo(@RequestBody ClassVoForInsert classVoForInsert){
    System.out.println(classVoForInsert);
    classService.insertClassInfo(classVoForInsert);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

}
