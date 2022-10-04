package databases.services.batiservices.mappers;


import databases.models.Teachers;
import java.util.List;

public interface ITeachersMapper extends IBaseMapper<Teachers>{
    List<Teachers> getAllTeachers();
}
