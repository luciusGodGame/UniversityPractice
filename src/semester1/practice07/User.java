package semester1.practice07;

public class User {
    private String login;
    private String email;
    private String role;
    private boolean isActive;

    public User(String login, String email, String role, boolean isActive) {
        this.login = login;
        this.email = email;
        this.role = role;
        this.isActive = isActive;
    }

    public User(String login, String email) {
        this(login, email, "USER", true);
    }

    public User(String login) {
        this(login, login + " @domain.com");
    }

    public User() {
        this("quest");
    }

    public void printProfile() {
        System.out.println(login + " (" + role + ") " + email + " " + isActive);
    }
}
