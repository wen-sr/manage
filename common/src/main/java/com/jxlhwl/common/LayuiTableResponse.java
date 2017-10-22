package com.jxlhwl.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class LayuiTableResponse<T> implements Serializable {
    private int code;
    private String msg;
    private T data;
    private long total;
    private long count;
}
