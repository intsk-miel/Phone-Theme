package databases.dao.interfaces;

import databases.models.Classes;
import java.util.List;

public interface IClassesDAO extends IBaseDAO<Classes> {
    List<Classes> getAllClasses();
}
