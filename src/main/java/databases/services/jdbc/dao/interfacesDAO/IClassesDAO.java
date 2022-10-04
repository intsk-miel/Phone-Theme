package databases.services.jdbc.dao.interfacesDAO;

import databases.models.Classes;
import java.util.List;

public interface IClassesDAO extends IBaseDAO<Classes> {
    List<Classes> getAllClasses();
}
