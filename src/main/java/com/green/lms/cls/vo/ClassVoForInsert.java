package com.green.lms.cls.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@ToString
public class ClassVoForInsert {
  private int jobNum;
  private int classTypeNum;
  private int classRoomNum;
  private String className;
  private int classQuota;
  private int totalStudyDay;
  private int studyHour;
  private LocalDate startDate;
  private LocalDate endDate;
  private int staffNum;
  private LocalTime startTime;
  private LocalTime endTime;
  private String[] studyDay;
  private String classComment;
  private int classNum;
  private String studyDayString;

  //배열을 문자열로 반환
  public void setDaysToString(){
    studyDayString = String.join(",", studyDay);
  }

}
