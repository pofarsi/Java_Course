package lecture05.Article.entity;

import lombok.Data;

@Data
public class UserInfo {

    private int id;
    private String userName;
    private String nationalCode;
    private String birthday;
    private String password;
}
