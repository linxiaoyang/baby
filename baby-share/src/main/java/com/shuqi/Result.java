package com.shuqi;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -6752087515496710111L;

    /**
     * 调用是否成功的标志
     */
    private boolean success;
    /**
     * 错误信息。调用失败时有值
     */
    private String errorMsg;
    /**
     * 错误码。调用失败时有值
     */
    private String errorCode;
    /**
     * 业务数据
     */
    private T model;

    public Result(){}


    public Result(boolean success, String errorMsg, String errorCode, T model) {
        this.success = success;
        if (null != errorMsg) {
            this.errorMsg = errorMsg;
        }
        if (null != errorCode) {
            this.errorCode = errorCode;
        }
        if (null != model) {
            this.model = model;
        }
    }

    public static <T> Result<T> success() {
        return new Result(Boolean.TRUE, StringUtils.EMPTY, StringUtils.EMPTY, null);
    }

    public static <T> Result<T> success(T data) {
        return new Result(Boolean.TRUE, StringUtils.EMPTY, StringUtils.EMPTY, data);
    }


    public static <T> Result<T> failed() {
        return new Result(Boolean.FALSE, StringUtils.EMPTY, StringUtils.EMPTY, null);
    }

    public static <T> Result<T> failed(String errorMsg) {
        return failed(errorMsg, StringUtils.EMPTY);
    }

    public static <T> Result<T> failed(String errorMsg, String errorCode) {
        return new Result(Boolean.FALSE, errorMsg, errorCode, null);
    }

}
