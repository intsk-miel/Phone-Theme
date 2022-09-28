package databases.models;

import java.util.Date;

public class Directors {
    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int phoneNumber;
    private String city;
    private String email;

    public Directors(){}
    public Directors(Long id, String firstName, String lastName, Date dateOfBirth, int phoneNumber, String city, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Directors {" + "\n" +
                "id = " + id + "\n" +
                "name = " + firstName + "\n" +
                "lastname = " + lastName + "\n" +
                "date of birth = " + dateOfBirth + "\n" +
                "phone number = " + phoneNumber + "\n" +
                "city = " + city + "\n" +
                "email = " + email + "\n" +
                '}' + "\n";
    }
}
