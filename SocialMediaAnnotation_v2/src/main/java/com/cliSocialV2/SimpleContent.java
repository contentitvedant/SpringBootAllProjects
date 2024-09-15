package com.cliSocialV2;

import org.springframework.stereotype.Component;

@Component
public class SimpleContent implements Content {

    String message;

    SimpleContent() {
        super();
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
