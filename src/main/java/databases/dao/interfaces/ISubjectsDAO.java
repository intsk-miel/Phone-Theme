package databases.dao.interfaces;

import databases.models.Subjects;
import java.util.List;

public interface ISubjectsDAO extends IBaseDAO<Subjects> {
    List<Subjects> getAllSubjects();
}
