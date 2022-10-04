package databases.services.jdbc.dao.interfacesDAO;

import databases.models.Students;
import java.util.List;

public interface IStudentsDAO extends IBaseDAO<Students> {
    List<Students> getAllStudents();
}
