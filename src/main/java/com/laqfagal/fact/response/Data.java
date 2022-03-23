package com.laqfagal.fact.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Data {

    //@JsonProperty("access_token")
    private String access_token;
    //@JsonProperty("token_type")
    private String token_type;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT-04:00")
    private Date expires_at;

    /**
     * GETTERS AND SETTERS
     */
    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public Date getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(Date expires_at) {
        this.expires_at = expires_at;
    }
}
