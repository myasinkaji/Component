package ir.component.core.dao.model;

import javax.persistence.Entity;

/**
 * @author Mohammad Yasin Kaji
 */
@Entity
public class UserProfile extends BaseEntityInfo<Integer> {

    private String username;
    private String password;

    private String firstName;
    private String lastName;


    public UserProfile() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return username;
    }

    public void setTitle(String title) {
        this.username = title;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
