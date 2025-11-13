package com.green.lms.job_type.controller;

import com.green.lms.job_type.vo.JobTypeVO;
import com.green.lms.job_type.service.JobTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/job-type")
public class JobTypeController {
  private final JobTypeService jobTypeService;

  //직종 전체 조회 API
  @GetMapping("")
  public ResponseEntity<?> getAll(){
    List<JobTypeVO> list = jobTypeService.getAll();
    return ResponseEntity.status(HttpStatus.OK).body(list);
  }

}
