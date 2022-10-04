package databases.services.mappers;


import databases.models.Directors;
import java.util.List;

public interface IDirectorsMapper extends IBaseMapper<Directors>{
    List<Directors> getAllDirectors();
}
