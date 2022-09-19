package xml;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;


@XmlRootElement
@XmlType(name="teachers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Teachers {
    @XmlElement(name="teacher")

    private ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
    public Teachers() {}
    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public String toString() {
        return "Teachers{" + "list of teachers = " + teacherList + '}';
    }

}
