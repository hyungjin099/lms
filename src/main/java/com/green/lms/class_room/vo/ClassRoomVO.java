package com.green.lms.class_room.vo;

import com.green.lms.common.vo.CreationVO;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class ClassRoomVO extends CreationVO {
    private int classRoomNum;    // 강의실 번호
    private String classRoomName;     // 강의실명
    private int classRoomOrder;
}
