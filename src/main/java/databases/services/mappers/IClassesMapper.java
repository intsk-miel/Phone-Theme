package databases.services.mappers;

import databases.models.Classes;
import java.util.List;


public interface IClassesMapper extends IBaseMapper<Classes>{
    List<Classes> getAllClasses();
}
