package databases.services.batiservices.mappers;

public interface IBaseMapper <M>{
    M getById(Long id);
    void insert(M object);
    void update(M students);
    void delete(Long id);
}
