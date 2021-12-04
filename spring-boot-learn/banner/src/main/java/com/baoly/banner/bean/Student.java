package com.baoly.banner.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
    @Value("${student.sid}")
    private Integer sid;
    @Value("${student.stuAge}")
    private Integer stuAge;
    @Value("${student.stuName}")
    private String stuName;
}
