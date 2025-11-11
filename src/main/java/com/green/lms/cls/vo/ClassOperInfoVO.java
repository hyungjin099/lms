package com.green.lms.cls.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassOperInfoVO {
    private int classOperNum;     // 운영정보 번호
    private int staffNum;         // 담당강사 번호 (FK)
    private int classRoom;        // 강의실 번호 (FK)
    private String studyDay;      // 수업요일
    private LocalTime startTime;  // 수업 시작시간
    private LocalTime endTime;    // 수업 종료시간
    private int classNum;         // 과정번호 (FK)
    private String isUsing;       // 적용 중 여부
}
