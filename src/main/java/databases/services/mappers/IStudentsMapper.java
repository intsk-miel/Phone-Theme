package databases.services.mappers;

import databases.models.Students;
import java.util.List;

public interface IStudentsMapper extends IBaseMapper<Students> {
    List<Students> getAllStudents();
}
