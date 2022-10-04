package databases.services.jdbc.dao.interfacesDAO;

import databases.models.Teachers;
import java.util.List;

public interface ITeachersDAO extends IBaseDAO<Teachers> {
    List<Teachers> getAllTeachers();
}
