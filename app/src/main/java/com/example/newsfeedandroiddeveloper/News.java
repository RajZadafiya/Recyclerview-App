package com.example.newsfeedandroiddeveloper;

public class News {
    String img_thumb;
    String news_source;
    String news_title;
    String news_desc;

    String news_source_logo;
    String news_category;
    String news_date;

    public News(String img_thumb, String news_source, String news_title, String news_desc, String news_source_logo, String news_category, String news_date) {
        this.img_thumb = img_thumb;
        this.news_source = news_source;
        this.news_title = news_title;
        this.news_desc = news_desc;
        this.news_source_logo = news_source_logo;
        this.news_category = news_category;
        this.news_date = news_date;
    }
}
