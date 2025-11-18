package com.green.lms.enroll.vo;

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
public class EnrollVO extends CreationVO {
  private int enrollNum;
  private int classNum;
  private int stuNum;
  private String stuStatus;
  private int managerNum;

  private ClassInfoVO classInfoVO;
  private StuVO stuVO;
  private StaffVO staffVO;
}
