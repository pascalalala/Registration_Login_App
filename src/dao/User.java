package dao;

import java.sql.Timestamp;
import java.util.Date;

public class User {

    public enum Sex {
        male,
        female
    }


    private int id;
    private String firstname;
    private String lastnname;
    private String email;
    private Date birthdate;
    private Timestamp registrationDate;
    private String password;              //hash-password
    private Enum sex;
    private boolean mailSent;

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public Date getBirthdate() {
        return birthdate;
    }


    public String getLastnname() {
        return lastnname;
    }

    public String getFirstname() {
        return firstname;
    }

    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public String getPassword() {
        return password;
    }

    public Enum getSex() {
        return sex;
    }

    public boolean isMailSent() {
        return mailSent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastnname(String lastnname) {
        this.lastnname = lastnname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(Enum sex) {
        this.sex = sex;
    }

    public void setMailSent(boolean mailSent) {
        this.mailSent = mailSent;
    }
}