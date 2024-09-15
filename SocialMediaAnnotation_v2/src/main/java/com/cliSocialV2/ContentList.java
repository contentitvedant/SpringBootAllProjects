package com.cliSocialV2;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class ContentList implements ContentCollection {
    ArrayList<Content> contentList;

    public ContentList() {
        this.contentList = new ArrayList<>();
    }

    @Override
    public ArrayList<Content> getAllContents() {
        return this.contentList;
    }

    @Override
    public Content getContent(int i) {
        return this.contentList.get(i);
    }

    @Override
    public void setContent(Content content) {
        this.contentList.add(content);
    }

    @Override
    public int size() {
        return this.contentList.size();
    }
}
