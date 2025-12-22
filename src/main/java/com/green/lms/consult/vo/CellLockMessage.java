package com.green.lms.consult.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CellLockMessage {
    private Integer consultNum;
    private Integer rowIndex;
    private Integer colIndex;
    private String userName; // 편집 중인 사용자
    private Boolean isLocked; // true: 편집 시작, false: 편집 종료
}
