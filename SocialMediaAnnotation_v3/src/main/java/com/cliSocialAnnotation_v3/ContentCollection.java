package com.cliSocialAnnotation_v3;

import java.util.ArrayList;


public interface ContentCollection {
    public ArrayList<Content> getAllContent();
    public Content getContent(int index);
    public void addContent(Content content);
    public int getContentCount();
}