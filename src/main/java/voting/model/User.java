package voting.model;

public class User  extends AbstractBaseEntity{

    private Integer id;
    private String userName;
    private String email;
    private String password;
    private Role role;

    private boolean voted;

    public User() {
    }

    public User(Integer id, String userName, String email, String password, Role role) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.voted = false;
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public boolean isVoted() {
        return voted;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }
}
