package databases.models;

public class Classes {
    private Long id;
    private Long teacherId;
    private Long schoolId;
    private Long subjectId;
    private double time;

    public Classes() {}
    public Classes(Long id, Long teacherId, Long schoolId, Long subjectId, double time) {
        this.id = id;
        this.teacherId = teacherId;
        this.schoolId = schoolId;
        this.subjectId = subjectId;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
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

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Classes {" + "\n" +
                "id = " + id + "\n" +
                "teacherId = " + teacherId + "\n" +
                "schoolId = " + schoolId + "\n" +
                "subjectId = " + subjectId + "\n" +
                "time = " + time + "\n" +
                '}' + "\n";
    }
}
