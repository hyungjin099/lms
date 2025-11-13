package com.green.lms.cls.vo;

import com.green.lms.class_type.vo.ClassTypeVO;
import com.green.lms.common.vo.CreationVO;
import com.green.lms.job_type.vo.JobTypeVO;
import com.green.lms.staff.vo.StaffVO;
import lombok.*;
import java.time.LocalDate;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class ClassInfoVO extends CreationVO {
  private int classNum;             // 과정번호
  private String className;         // 과정명
  private int jobNum;               // 직종번호(FK)
  private int classTypeNum;         // 과정유형번호(FK)
  private LocalDate startDate;      // 시작일
  private LocalDate endDate;        // 종료일
  private int totalStudyDay;        // 수업일수
  private String classStatus;       // 과정상태 (시작 전, 진행 중, 종료)
  private int classQuota;           // 모집정원
  private int confirmStuCnt;        // 실시인원
  private int joinStuCnt;           // 참여인원
  private int dropStuCnt;           // 중탈인원
  private int completeStuCnt;       // 수료인원
  private int earlyCompleteCnt;     // 80% 수료인원
  private int earlyEmployCnt;       // 80% 취업인원
  private float recruitRate;        // 모집률
  private String classComment;      // 비고

  private JobTypeVO jobTypeVO;
  private ClassTypeVO classTypeVO;
}
