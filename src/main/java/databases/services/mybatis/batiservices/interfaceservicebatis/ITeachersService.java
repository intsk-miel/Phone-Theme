package databases.services.mybatis.batiservices.interfaceservicebatis;

import databases.models.Teachers;
import java.util.List;

public interface ITeachersService extends IMainService<Teachers>{
    List<Teachers> getAllTeachers();
}
