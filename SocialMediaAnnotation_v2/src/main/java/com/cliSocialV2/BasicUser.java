package com.cliSocialV2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasicUser implements UserProfile {
//	@Autowired
    private Content contentList;
    private String userName;

    // Constructor injection for ContentList
//    public BasicUser(Content contentList) {
//        this.contentList = contentList;
//    }

//    Setter Injection 
//    @Autowired
//	@Override
//	   public void setContent(Content contentList) {
//        this.contentList = contentList;
//    }
    
    
	@Override
	   public void setContent(Content contentList) {
        this.contentList = contentList;
    }
    
    @Override
    public void setUsername(String userName) {
        this.userName = userName;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public Content getContent() {
        return this.contentList;
    }

    
}
