package databases.models;

public class Schools {
    private Long id;
    private String name;
    private String city;
    private String street;
    private String webAddress;
    private String email;
    private Long directorId;

    public Schools() {}
    public Schools(Long id, String name, String city, String street, String webAddress, String email, Long directorId) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.street = street;
        this.webAddress = webAddress;
        this.email = email;
        this.directorId = directorId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
    }

    @Override
    public String toString() {
        return "Schools {" + "\n" +
                "id = " + id + "\n" +
                "name = " + name + "\n" +
                "city = " + city + "\n" +
                "street = " + street + "\n" +
                "web address = " + webAddress + "\n" +
                "email = " + email + "\n" +
                "web address = " + webAddress + "\n" +
                "directorId = " + directorId + "\n" +
                '}' + "\n";
    }
}
