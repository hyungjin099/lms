package com.green.lms.cls.vo;

import com.green.lms.class_room.vo.ClassRoomVO;
import com.green.lms.common.vo.CreationVO;
import com.green.lms.staff.vo.StaffVO;
import lombok.*;

import java.time.LocalTime;

@Setter
@Getter
@ToString

public class ClassOperInfoVO extends CreationVO {
  private int classOperNum;     // 운영정보 번호
  private int staffNum;         // 담당강사 번호 (FK)
  private int classRoomNum;     // 강의실 번호 (FK)
  private String studyDay;      // 수업요일
  private int studyHour;        // 일일수업시간
  private String startTime;     // 수업 시작시간
  private String endTime;       // 수업 종료시간
  private int classNum;         // 과정번호 (FK)
  private String isUsing;       // 적용 중 여부

  private StaffVO staffVO;
  private ClassInfoVO classInfoVO;
  private ClassRoomVO classRoomVO;
}
