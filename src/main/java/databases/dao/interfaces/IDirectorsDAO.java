package databases.dao.interfaces;

import databases.models.Directors;
import java.util.List;

public interface IDirectorsDAO extends IBaseDAO<Directors> {
    List<Directors> getAllDirectors();
}
