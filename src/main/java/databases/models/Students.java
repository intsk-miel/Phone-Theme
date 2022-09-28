package databases.models;

import java.util.Date;

public class Students {
    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int phoneNumber;
    private String address;
    private String email;
    private Long schoolId;
    private Long subjectId;

    public Students(){}

    public Students(Long id, String firstName, String lastName, Date dateOfBirth, int phoneNumber, String address, String email, Long schoolId, Long subjectId){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.schoolId = schoolId;
        this.subjectId = subjectId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return "Students {" + "\n" +
                "id = " + id + "\n" +
                "name = " + firstName + "\n" +
                "lastname = " + lastName + "\n" +
                "date of birth = " + dateOfBirth + "\n" +
                "phone number = " + phoneNumber + "\n" +
                "address = " + address + "\n" +
                "schoolId = " + schoolId + "\n" +
                "subjectId = " + subjectId + "\n" +
                '}' + "\n";
    }
}

