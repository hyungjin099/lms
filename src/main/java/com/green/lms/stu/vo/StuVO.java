package com.green.lms.stu.vo;

import com.green.lms.common.vo.CreationVO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class StuVO extends CreationVO {
  private int stuNum;
  private String stuName;
  private String stuBirthday;
  private String stuPhone;
  private String stuComment;

}
