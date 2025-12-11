package com.green.lms.cls.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
public class ClassVoForGetConsultList {
  private Integer classNum;
  private String className;
  private Integer jobNum;
  private String jobName;
  private Integer classTypeNum;
  private String classTypeName;
  private LocalDate startDate;
  private LocalDate endDate;
  private Integer totalStudyHour;
  private Integer totalStudyDay;
  private Integer teacherNum;
  private String teacherName;
  private Integer classRoomNum;
  private String classRoomName;
  private String studyDay;
  private Integer studyHour;
  private String startTime;
  private String endTime;

  private List<ConsultVoForGetList> consultList;
}

@Getter
@Setter
@ToString
class ConsultVoForGetList {
  private Integer consultNum;
  private Integer stuNum;
  private String StuName;
  private Integer managerNum;
  private String managerName;
  private String consultContent;
  private String consultStatus;     // 상담중(불확실), 등록확정, 취소
  private String consultType;       // 실업자, 재직자
  private String supportType;       // 일반, 국1, 국2
  private String hrdStatus;         // 실업자 HRD대기 등
  private String consultGrade;      // A, B, C
  private String customRows;
  private Integer attitudeScore;     // 성향태도 점수
  private Integer attendanceScore;   // 출결예측 점수
  private Integer mindScore;         // 수강의지 점수
  private Integer jobScore;          // 취업역량 점수
  private Integer totalScore;        // 점수 합
}
