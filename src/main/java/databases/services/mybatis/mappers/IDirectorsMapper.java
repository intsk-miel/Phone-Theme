package databases.services.mybatis.mappers;


import databases.models.Directors;
import java.util.List;

public interface IDirectorsMapper extends IBaseMapper<Directors>{
    List<Directors> getAllDirectors();
}
