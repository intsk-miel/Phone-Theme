package databases.services.batiservices.mappers;


import databases.models.Subjects;
import java.util.List;

public interface ISubjectsMapper extends IBaseMapper<Subjects>{
    List<Subjects> getAllSubjects();
}
