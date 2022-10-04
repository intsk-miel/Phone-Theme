package databases.services.batiservices.interfaceservicebatis;

public interface IMainService <M>{
    M getById(Long id);
    void insert(M object);
    void update(M object,Long id);
    void delete(Long id);
}
