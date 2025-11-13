package com.green.lms.class_room.controller;

import com.green.lms.class_room.service.ClassRoomService;
import com.green.lms.class_room.vo.ClassRoomVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/class-room")
public class ClassRoomController {
  private final ClassRoomService classRoomService;

  //강의실 목록 조회 API
  @GetMapping("")
  public ResponseEntity<?> getAll(){
    List<ClassRoomVO> list = classRoomService.getAll();
    return ResponseEntity.status(HttpStatus.OK).body(list);
  }

}
