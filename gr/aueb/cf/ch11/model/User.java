package gr.aueb.cf.ch11.model;

public class User {
    private int userId;
    private String firstname;
    private String lastname;
    private UserCredentials userCredentials;

    public User() {}

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUserCredentials(UserCredentials userCredentials) {
        this.userCredentials = userCredentials;
    }

    public int getUserId() {
        return userId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public UserCredentials getUserCredentials() {
        return userCredentials;
    }
}
