package ir.component.core.dao.model;

import javax.persistence.Entity;

/**
 * @author Mohammad Yasin Kaji
 */
@Entity
public class User extends BaseEntityInfo<Integer> {

    private String firstName;
    private String lastName;
    private String tel;
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, String tel, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tel = tel;
        this.email = email;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return firstName + " " + lastName;
    }
}
