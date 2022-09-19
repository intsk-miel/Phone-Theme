package xml;

import javax.xml.bind.annotation.*;
import java.util.Date;

    @XmlRootElement
    @XmlType(name = "teacher", propOrder = {"first_name", "last_name", "Date_Of_Birth", "phone_number", "city", "subject", "email"})
    @XmlAccessorType(XmlAccessType.FIELD)
    public class Teacher {
        @XmlAttribute(required = true)
        private long id;

        @XmlElement(required = true)
        private String first_name;

        @XmlElement(required = true)
        private String last_name;

        @XmlElement(required = true)
        private Date Date_Of_Birth;

        @XmlElement(required = true)
        private int phone_number;

        @XmlElement(required = true)
        private String city;

        @XmlElement(required = true)
        private String subject;

        @XmlElement(required = true)
        private String email;


        public Teacher() {
        }

        public Teacher(long id, String first_name, String last_name, Date Date_Of_Birth, String city, int phone_number, String subject, String email) {
            this.id = id;
            this.first_name = first_name;
            this.last_name = last_name;
            this.Date_Of_Birth = Date_Of_Birth;
            this.city = city;
            this.phone_number = phone_number;
            this.subject = subject;
            this.email = email;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public Date getDate_Of_Birth() {
            return Date_Of_Birth;
        }

        public void setDate_Of_Birth(Date date_Of_Birth) {
            Date_Of_Birth = date_Of_Birth;
        }

        public int getPhone_number() {
            return phone_number;
        }

        public void setPhone_number(int phone_number) {
            this.phone_number = phone_number;
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
                    "name = " + first_name + "\n" +
                    "lastname = " + last_name + "\n" +
                    "date of birth = " + Date_Of_Birth + "\n" +
                    "phone number = " + phone_number + "\n" +
                    "city = " + city + "\n" +
                    "subject = " + subject + "\n" +
                    "email = " + email + "\n" +
                    '}' + "\n";
        }
    }

