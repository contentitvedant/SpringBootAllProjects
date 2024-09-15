package com.cliSocialAnnotation_v3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BasicUser implements UserProfile {
    @Autowired
	private Content content;
    private String username;

    // Constructor injection for PostList
//    public BasicUser(Content contentList) {
//        this.contentList = contentList;
//    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public Content getContent() {
        return this.content;
    }

    @Override
    public void setContent(Content content) {
        this.content = content;
    }
}
