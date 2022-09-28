package databases.models;

public class Subjects {
    private Long id;
    private String name;
    private int maxCapacity;
    private Long schoolId;

    public Subjects() {}
    public Subjects(Long id, String name, int maxCapacity, Long schoolId) {
        this.id = id;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.schoolId = schoolId;
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

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    public String toString() {
        return "Subjects {" + "\n" +
                "name = " + name + "\n" +
                "max capacity = " + maxCapacity + "\n" +
                "schoolId = " + schoolId + "\n" +
                '}' + "\n";
    }
}
