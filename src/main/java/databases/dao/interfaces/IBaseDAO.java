package databases.dao.interfaces;

public interface IBaseDAO <D>{
    D getById(Long id);
    void insert(D object);
    void update(D object);
    void delete(Long id);

}
