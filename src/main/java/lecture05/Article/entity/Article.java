package lecture05.Article.entity;

import lombok.Data;

@Data
public class Article {
    private int id;
    private String title;
    private String brief;
    private String content;
    private String createDate;
    private boolean isPublished;
    private int userId;
}

