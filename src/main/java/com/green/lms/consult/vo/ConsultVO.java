package com.green.lms.consult.vo;

import com.green.lms.cls.vo.ClassInfoVO;
import com.green.lms.common.vo.CreationVO;
import com.green.lms.staff.vo.StaffVO;
import com.green.lms.stu.vo.StuVO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ConsultVO extends CreationVO {
  private Integer consultNum;
  private Integer stuNum;
  private Integer managerNum;
  private String consultContent;
  private Integer classNum;
  private String consultStatus;     // 상담중(불확실), 등록확정, 취소
  private String consultType;       // 실업자, 재직자
  private String hrdStatus;         // 실업자 HRD대기 등
  private String consultGrade;      // A, B, C
  private String option1;
  private String option2;
  private String option3;
  private String option4;
  private String option5;
  private String useOption1;
  private String useOption2;
  private String useOption3;
  private String useOption4;
  private String useOption5;
  private Integer attitudeScore;     // 성향태도 점수
  private Integer attendanceScore;   // 출결예측 점수
  private Integer mindScore;         // 수강의지 점수
  private Integer jobScore;          // 취업역량 점수
  private Integer totalScore;        // 점수 합

  private StuVO stuVO;
  private StaffVO staffVO;
  private ClassInfoVO classInfoVO;

}