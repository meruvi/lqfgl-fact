package com.laqfagal.fact.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    //@JsonProperty("access_token")
    private String access_token;

    /**
     * GETTERS AND SETTERS
     */
    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
