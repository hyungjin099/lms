package com.green.lms.consult.vo;

import com.green.lms.common.vo.CreationVO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ConsultVoForInsertStu extends CreationVO {
  private int stuNum;
  private String stuName;
  private String stuPhone;
  private String stuBirthday;
  private int managerNum;
  private int classNum;
}
