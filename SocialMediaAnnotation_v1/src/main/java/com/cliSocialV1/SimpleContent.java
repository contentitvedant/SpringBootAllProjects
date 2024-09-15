package com.cliSocialV1;

import org.springframework.stereotype.Component;

@Component
public class SimpleContent implements Content {

    String message;

    @Override
    public void setBody(String message) {
        this.message = message;
    }

    @Override
    public String getBody() {
        return this.message;
    }
}
