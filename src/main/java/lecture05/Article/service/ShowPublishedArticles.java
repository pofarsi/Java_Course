package lecture05.Article.service;


import lecture05.Article.entity.Article;
import lecture05.Article.repository.ArticleRepository;

import java.sql.SQLException;

public class ShowPublishedArticles {

    public void showPublishedArticlese() throws SQLException {
        ArticleRepository articleRepository = new ArticleRepository();
        Article[] articles;
        articles = articleRepository.loadAllArticle();
        while (true) {
            if (articles.length == 0) {
                System.out.println("published article is not exist");
                break;
            } else {
                for (int i = 0; i < articles.length; i++) {

                    if (articles[i] != null) {
                        System.out.println(articles[i]);
                    }
                }
            }
            System.out.println("********");
            break;
        }
    }

}
