package com.design.chainOfResponsibility.v5;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class FilterRequest {
    private String msg;

    private String order = "request的执行顺序";
}
