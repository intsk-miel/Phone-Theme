package databases.services.mybatis.batiservices.interfaceservicebatis;

import databases.models.Schools;
import java.util.List;

public interface ISchoolsService extends IMainService<Schools>{
    List<Schools> getAllSchools();
}
