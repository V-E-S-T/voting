package voting.model;


import org.springframework.util.CollectionUtils;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User  extends AbstractBaseEntity{

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 2, max = 100)
    private String userName;

    @Column(name = "email", nullable = false)
    @Email
    @NotBlank
    @Size(min = 5, max = 100)
    private String email;

    @Column(name = "password", nullable = false)
    @NotBlank
    @Size(min = 5, max = 20)
    private String password;

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "usersrole", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role")
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;

    @Column(name = "voted", nullable = false, columnDefinition = "bool default false")
    private boolean voted;

    @Column(name = "restaurantId")
    private int restaurantId;

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public User() {

    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public User(User user) {
        this(user.getId(), user.getUserName(), user.getEmail(), user.getPassword(), user.getRoles());
    }

    public User(Integer id, String userName, String email, String password, Role role, Role...roles) {
        this(id, userName, email, password, EnumSet.of(role, roles));
    }

    public User(Integer id, String userName, String email, String password, Collection<Role> roles) {
        super(id);
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.voted = false;
        setRoles(roles);
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

    public Set<Role> getRoles() {
        return roles;
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

    public void setRoles(Collection<Role> roles) {
        this.roles = CollectionUtils.isEmpty(roles) ? Collections.emptySet() : EnumSet.copyOf(roles);
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                ", voted=" + voted +
                ", id=" + id +
                '}';
    }
}
