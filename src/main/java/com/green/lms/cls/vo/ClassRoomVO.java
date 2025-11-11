package com.green.lms.cls.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassRoomVO {
    private int classRoomNum;    // 강의실 번호
    private String roomName;     // 강의실명
}
