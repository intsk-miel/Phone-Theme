package databases.services.mybatis.batiservices.interfaceservicebatis;


import databases.models.Students;
import java.util.List;

public interface IStudentsService extends IMainService<Students>{
    List<Students> getAllStudents();
}