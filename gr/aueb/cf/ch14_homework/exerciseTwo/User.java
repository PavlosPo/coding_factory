package gr.aueb.cf.ch14_homework.exerciseTwo;

/**
 *
 * Creates a {@link User} instance.
 * <br>
 * @version 0.1
 * @since 0.0.1
 * @author pavlospoulos
 */
public class User {
    private long id;
    private String firstname;
    private String lastname;

    /**
     * The constructor of the class {@link User}.
     */
    public User() {}

    /**
     *  When called the User registers himself.
     */
    public void registerUser() {
        System.out.println("user is registered succesfully");
    }
}
