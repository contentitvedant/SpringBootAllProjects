package com.cliSocialAnnotation_v3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SimpleContent implements Content {

    private String body;

    SimpleContent() {
        super();
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String getBody() {
        return this.body;
    }
}

