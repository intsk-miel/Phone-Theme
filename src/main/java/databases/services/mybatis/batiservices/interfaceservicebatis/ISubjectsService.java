package databases.services.mybatis.batiservices.interfaceservicebatis;


import databases.models.Subjects;
import java.util.List;

public interface ISubjectsService extends IMainService<Subjects>{
    List<Subjects> getAllSubjects();
}