package com.green.lms.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreationVO {
    private String createUser;
    private String updateUser;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
