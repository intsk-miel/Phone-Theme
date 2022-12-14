package databases.dao.interfaces;

import databases.models.Schools;
import java.util.List;

public interface ISchoolsDAO extends IBaseDAO<Schools> {
    List<Schools> getAllSchools();
}
