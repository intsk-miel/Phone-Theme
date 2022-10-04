package databases.services.mappers;


import databases.models.Schools;
import java.util.List;


public interface ISchoolsMapper extends IBaseMapper<Schools>{
    List<Schools> getAllSchools();
}