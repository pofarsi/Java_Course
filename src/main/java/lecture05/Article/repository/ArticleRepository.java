package lecture05.Article.repository;


import lecture05.Article.config.ApplicationConnection;
import lecture05.Article.entity.Article;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ArticleRepository {
    public Article[] loadAllArticle() throws SQLException {
        final String query = " select * from article where ispublished = true order by id DESC;";
        PreparedStatement statement = ApplicationConnection.getConnection().prepareStatement(query);


        ResultSet resultSet = statement.executeQuery();
        Article[] articles = new Article[1000];

        int index = 0;
        while (resultSet.next()) {
            Article article = new Article();
            article.setId(resultSet.getInt("id"));
            article.setTitle(resultSet.getString("title"));
            article.setBrief(resultSet.getString("summery"));
            article.setContent(resultSet.getString("content"));
            article.setCreateDate(resultSet.getString("create"));
            article.setPublished(resultSet.getBoolean("published"));
            article.setUserId(resultSet.getInt("userid"));
            articles[index] = article;
            index++;

        }
        resultSet.close();
        return articles;
    }

    public void insertArticle(Article article) throws SQLException {
        String sql = " INSERT INTO article(title , summery ,  content , creatdate , ispublished , userid) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = ApplicationConnection.getConnection()
                .prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, article.getTitle());
        ps.setString(2, article.getBrief());
        ps.setString(3, article.getContent());
        ps.setString(4, article.getCreateDate());
        ps.setBoolean(5, article.isPublished());
        ps.setInt(6, article.getUserId());

        ps.execute();
        ps.close();

    }

    public Article[] loadUserArticle(int id) throws SQLException {
        final String query = " select * from article where userid = ? order by id DESC;";
        PreparedStatement statement = ApplicationConnection.getConnection().prepareStatement(query);
        statement.setInt(1, id);

        ResultSet result = statement.executeQuery();
        Article[] articles = new Article[1000];

        int index = 0;
        while (result.next()) {
            Article article = new Article();
            article.setId(result.getInt("id"));
            article.setTitle(result.getString("title"));
            article.setBrief(result.getString("summery"));
            article.setContent(result.getString("content"));
            article.setCreateDate(result.getString("create"));
            article.setPublished(result.getBoolean("published"));
            article.setUserId(result.getInt("userid"));
            articles[index] = article;
            index++;

        }
        result.close();
        return articles;
    }

    public boolean ArticleContains(String title, int id) throws SQLException {
        String sql = "SELECT title from article WHERE title=? and userid = ? ";
        PreparedStatement ps = ApplicationConnection.getConnection().prepareStatement(sql);
        ps.setString(1, title);
        ps.setInt(2, id);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public void editArticle(Article oldArticle, Article newArticle) throws SQLException {
        String sql = " UPDATE article SET title = ? , brief = ? , content = ? , creatdate = ? , ispublished = ?  WHERE title = ? and userid = ?  ";
        PreparedStatement ps = ApplicationConnection.getConnection()
                .prepareStatement(sql);
        ps.setString(1, newArticle.getTitle());
        ps.setString(2, newArticle.getBrief());
        ps.setString(3, newArticle.getContent());
        ps.setString(4, newArticle.getCreateDate());
        ps.setBoolean(5, newArticle.isPublished());
        ps.setString(6, oldArticle.getTitle());
        ps.setInt(7, oldArticle.getUserId());
        ps.executeUpdate();
        ps.close();
    }
}
