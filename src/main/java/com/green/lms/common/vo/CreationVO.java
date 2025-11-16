package com.green.lms.common.vo;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class CreationVO {
    private String createUser;
    private String updateUser;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
