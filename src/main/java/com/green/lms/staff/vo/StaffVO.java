package com.green.lms.staff.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StaffVO {
    private int staffNum;           // 직원번호
    private String staffName;       // 직원명
    private String staffTel;        // 연락처
    private String staffEmail;      // 이메일
    private String staffRole;       // 권한
    private String staffJob;        // 직급
    private String staffTask;       // 업무
    private String staffStatus;     // 상태 ('WORKING', 'REST', 'LEAVE')
    private LocalDate joinDate;     // 입사일
}
