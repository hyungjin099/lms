package com.green.lms.staff.vo;

import com.green.lms.common.vo.CreationVO;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class StaffVO extends CreationVO {
  private int staffNum;           // 직원번호
  private String staffName;       // 직원명
  private String staffTel;        // 연락처
  private String staffEmail;      // 이메일
  private String staffRole;       // 권한
  private String nickName;
  private String staffJob;        // 직급
  private String staffTask;       // 업무
  private String staffStatus;     // 상태 ('WORKING', 'REST', 'LEAVE')
  private LocalDate joinDate;     // 입사일
  private int staffOrder;
}
