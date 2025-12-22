package com.green.lms.consult.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ConsultInsertMessage {
    private Integer classNum; // 어떤 과정에 상담이 등록되었는지
    private String userName; // 등록한 사용자
}
