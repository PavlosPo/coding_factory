package gr.aueb.cf.ch11.homework;

public class UserCredentials {
    private long id = 1L;
    private String username;
    private String password;

    UserCredentials() {}

    UserCredentials(long id, String username, String password) {
        this.id = id;
        this.username  = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
