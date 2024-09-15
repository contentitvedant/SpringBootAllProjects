package com.cliSocialV2;

import java.util.ArrayList;

public interface ContentCollection {
    ArrayList<Content> getAllContents();
    Content getContent(int i);
    void setContent(Content content);
    int size();
}
