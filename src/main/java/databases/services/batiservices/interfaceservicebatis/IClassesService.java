package databases.services.batiservices.interfaceservicebatis;

import databases.models.Classes;
import java.util.List;

public interface IClassesService extends IMainService<Classes>{
    List<Classes> getAllClasses();
}
