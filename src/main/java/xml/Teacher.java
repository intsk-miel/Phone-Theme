package xml;

import javax.xml.bind.annotation.*;
import java.util.Date;

    @XmlRootElement
    @XmlType(name = "teacher")
//    propOrder = {"firstName", "lastName", "dateBirth", "phoneNumber", "city", "subject", "email"})
    @XmlAccessorType(XmlAccessType.FIELD)
    public class Teacher {
        @XmlAttribute(name = "Id", required = true)
        private long id;

        @XmlElement(name = "Name", required = true)
        private String firstName;

        @XmlElement(name = "LastName", required = true)
        private String lastName;

        @XmlElement(name = "DateOfBirth", required = true)
        private Date dateBirth;

        @XmlElement(name = "PhoneNumber", required = true)
        private int phoneNumber;

        @XmlElement(name = "City", required = true)
        private String city;

        @XmlElement(name = "Subject", required = true)
        private String subject;

        @XmlElement(name = "Email", required = true)
        private String email;


        public Teacher() {
        }

        public Teacher(long id, String firstName, String lastName, Date dateBirth, String city, int phoneNumber, String subject, String email) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateBirth = dateBirth;
            this.city = city;
            this.phoneNumber = phoneNumber;
            this.subject = subject;
            this.email = email;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
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

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Teacher {" + "\n" +
                    "id = " + id + "\n" +
                    "name = " + firstName + "\n" +
                    "lastname = " + lastName + "\n" +
                    "date of birth = " + dateBirth + "\n" +
                    "phone number = " + phoneNumber + "\n" +
                    "city = " + city + "\n" +
                    "subject = " + subject + "\n" +
                    "email = " + email + "\n" +
                    '}' + "\n";
        }
    }

