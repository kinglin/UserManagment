package model;

/**
 * Created by kinglin on 2015/8/18.
 */
public class User {

    private String id;
    private String username;
    private String password;

    public User(String username, String password) {

        this.id = System.currentTimeMillis()+"";
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
