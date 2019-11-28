package com.git.response;

public class ResponseInfo {
    private String code;
    private String messgae;

    public ResponseInfo() {
    }

    public ResponseInfo(String code, String messgae) {
        this.code = code;
        this.messgae = messgae;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessgae() {
        return messgae;
    }

    public void setMessgae(String messgae) {
        this.messgae = messgae;
    }
}
