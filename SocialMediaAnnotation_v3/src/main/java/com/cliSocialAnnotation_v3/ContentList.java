package com.cliSocialAnnotation_v3;

import java.util.ArrayList;


import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ContentList implements ContentCollection {
    private ArrayList<Content> contentItems;

    public ContentList() {
        this.contentItems = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
        System.out.println("\n ContentList bean has been initialized."
        		+" \n Pre-Existing Data   \n "
        		+ "frank  : Chasing goals and coffee  \n "
        		+ "steve  : Living life one day at a time.   \n "
        		+ "roger  : Turning dreams into plans   \n "
        		+ "stefan : Creating my own sunshine.  \n ");
        // Initialize with some default content if needed
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("ContentList bean is bean destroyed.");
        // Perform cleanup if needed
    }

    @Override
    public ArrayList<Content> getAllContent() {
        return this.contentItems;
    }

    @Override
    public Content getContent(int index) {
        return this.contentItems.get(index);
    }

    @Override
    public void addContent(Content content) {
        this.contentItems.add(content);
    }

    @Override
    public int getContentCount() {
        return this.contentItems.size();
    }
}
