package ac.za.cput.repository;

public interface IRepository <T, NAME, SURNAME> {

    T create(T t);
    T update(T t);
    void delete(NAME name, SURNAME surname);
    T read(NAME name, SURNAME surname);
}
