package databases.services.jdbc.dao.interfacesDAO;

public interface IBaseDAO<D>{
    void create(D object);
    D getById(D object,Long id);
    void remove(Long id);
    void update(String setParameter, D object, Long id);
}
