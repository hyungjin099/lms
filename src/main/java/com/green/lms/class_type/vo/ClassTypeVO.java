package com.green.lms.class_type.vo;


import com.green.lms.common.vo.CreationVO;
import lombok.*;

@Getter
@Setter
@ToString
public class ClassTypeVO extends CreationVO {
  private int classTypeNum;
  private String classTypeName;
  private int classTypeOrder;
}
