package databases.services.mybatis.batiservices.interfaceservicebatis;


import databases.models.Directors;
import java.util.List;

public interface IDirectorsService extends IMainService<Directors>{
    List<Directors> getAllDirectors();
}
