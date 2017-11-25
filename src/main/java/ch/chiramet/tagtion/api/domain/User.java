package ch.chiramet.tagtion.api.domain;


import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;

    //TODO Hashtagcollections

    //TODO Hashtagpresets


    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
