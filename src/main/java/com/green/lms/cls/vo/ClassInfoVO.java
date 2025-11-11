package com.green.lms.cls.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassInfoVO {
    private int classNum;             // 과정번호
    private String className;         // 과정명
    private String jobClass;          // 직종
    private String classType;         // 과정유형
    private LocalDate startDate;      // 시작일
    private LocalDate endDate;        // 종료일
    private int totalStudyDay;        // 수업일수
    private String classStatus;       // 과정상태 (시작 전, 진행 중, 종료)
    private int classQuota;           // 모집 정원
    private int confirmStuCnt;        // 실시인원
    private int joinStuCnt;           // 참여인원
    private int dropStuCnt;           // 중탈인원
    private int completeStuCnt;       // 수료인원
    private int earlyCompleteCnt;     // 80% 수료인원
    private int earlyEmployCnt;       // 80% 취업인원
    private float recruitRate;        // 모집률
    private int staffNum;             // 담당강사 번호 (FK)
    private String classComment;      // 비고
}
