package com.green.lms.class_room.service;

import com.green.lms.class_room.mapper.ClassRoomMapper;
import com.green.lms.class_room.vo.ClassRoomVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassRoomService {
  private final ClassRoomMapper classRoomMapper;

  public List<ClassRoomVO> getAll(){
    return classRoomMapper.getAll();
  }
}
