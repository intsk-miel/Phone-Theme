package databases.services.jdbc.dao.interfacesDAO;

import databases.models.Directors;
import java.util.List;

public interface IDirectorsDAO extends IBaseDAO<Directors> {
    List<Directors> getAllDirectors();
}
