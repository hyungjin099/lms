package com.green.lms.consult.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ConsultUpdateMessage {
    private Integer consultNum;
    private Integer rowIndex;
    private Integer colIndex;
    private String fieldName;
    private String value;
    private String userName; // 수정한 사용자 정보
}
