package lecture05.Article.service;


import lecture05.Article.entity.Article;
import lecture05.Article.repository.ArticleRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class AddNewArticle {

    private Article article = new Article();
    Scanner scanner = new Scanner(System.in);


    private void takeTitle() {
        String title;
        do {
            System.out.println("please enter the title: ");
            title = scanner.nextLine();
            if (title.length() <= 20) {
                break;
            } else {
                System.out.println("U+1F595");
            }
        } while (true);
        article.setTitle(title);
    }

    private void takeBrief() {
        String brief;
        do {
            System.out.println("please enter the summery of the article: ");
            brief = scanner.nextLine();
            if (brief.length() <= 250) {
                break;
            } else {
                System.out.println("U+1F595");
            }
        } while (true);
        article.setBrief(brief);
    }


    private void takeContent() {
        String content;
        do {
            System.out.println("please enter the content: ");
            content = scanner.nextLine();
            if (content.length() <= 500) {
                break;
            } else {
                System.out.println("U+1F595");
            }
        } while (true);
        article.setContent(content);
    }

    private void takeCreatDate() {
        String createDate;
        do {
            System.out.println("please enter the create: ");
            createDate = scanner.next();
            if (createDate.length() <= 9) {
                break;
            } else {
                System.out.println("U+1F595");
            }
        } while (true);
        article.setCreateDate(createDate);
    }


    private void takeIsPublished() {
        boolean ispublished;
        String published;
        do {
            System.out.println("please enter the published: ");
            published = scanner.next();
            if (published.length() <= 5) {
                if (published.equals("true")) {
                    ispublished = true;
                    break;
                } else if (published.equals("false")) {
                    ispublished = false;
                    break;
                }

            } else {
                System.out.println("U+1F595");
            }
        } while (true);
        article.setPublished(ispublished);
    }

    public void AddnewArticle(int id) throws SQLException {
        takeTitle();
        takeBrief();
        takeContent();
        takeCreatDate();
        takeIsPublished();
        article.setUserId(id);
        ArticleRepository articleRepository = new ArticleRepository();
        articleRepository.insertArticle(article);
    }
}
