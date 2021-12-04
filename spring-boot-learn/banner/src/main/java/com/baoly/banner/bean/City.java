package com.baoly.banner.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class City {
    private Integer cityId;
    private String cityName;
}
