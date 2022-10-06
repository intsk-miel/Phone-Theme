package databases.dao.interfaces;

import databases.models.Teachers;
import java.util.List;

public interface ITeachersDAO extends IBaseDAO<Teachers> {
    List<Teachers> getAllTeachers();
}
