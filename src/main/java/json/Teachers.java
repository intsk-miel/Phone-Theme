package json;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class Teachers {
    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("dateBirth")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Date dateBirth;

    @JsonProperty("phoneNumber")
    private int phoneNumber;

    @JsonProperty("email")
    private String email;

    public Teachers(String firstName, String lastName, Date dateBirth, int phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
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

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Teachers{" +"\n" +
                "firstname = " + firstName + "\n" +
                "lastname = " + lastName + "\n" +
                "date of birth = " + dateBirth + "\n" +
                "phone number = " + phoneNumber + "\n" +
                "email = " + email + "\n" + '}';
    }
}
