package com.green.lms.job_type.vo;

import com.green.lms.common.vo.CreationVO;
import lombok.*;


//직종
@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class JobTypeVO extends CreationVO {
  private int jobNum;
  private String jobName;
  private int jobOrder;
}
