package com.green.lms.class_room.mapper;

import com.green.lms.class_room.vo.ClassRoomVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassRoomMapper {
  List<ClassRoomVO> getAll();
}
