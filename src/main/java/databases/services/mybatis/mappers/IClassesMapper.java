package databases.services.mybatis.mappers;

import databases.models.Classes;
import java.util.List;


public interface IClassesMapper extends IBaseMapper<Classes>{
    List<Classes> getAllClasses();
}
