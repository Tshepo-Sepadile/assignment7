package ac.za.cput.repository;
import ac.za.cput.domain.PersonPassword;

import java.util.Set;

public interface PersonPasswordRepository<T, PASSWORD> {

    T create(T t);
    T update(T t);
    void delete(PASSWORD password);
    T read(PASSWORD password);
    Set<PersonPassword> getAll();
}
