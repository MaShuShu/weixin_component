package com.ysw.adsense.ip.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * For error, insert, delete, update actions
 *
 * @author : csyangchsh@gmail.com
 */
public class StatusResponse {


    @JsonProperty
    private int code = 0;

    @JsonProperty
    private String message = "操作成功！";

    @JsonProperty
    private boolean success = true;

	public StatusResponse() {

    }

    public StatusResponse(String msg) {
        this.message = msg;
    }

    public StatusResponse(String msg, boolean success) {
        this.message = msg;
        this.success = success;
    }

    public StatusResponse(String msg, int code, boolean success) {
        this.message = msg;
        this.success = success;
        this.code = code;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }
}
