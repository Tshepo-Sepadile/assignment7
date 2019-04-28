package ac.za.cput.repository;
import ac.za.cput.domain.SecondPersonPassword;

import java.util.Set;

public interface SecondPersonPasswordRepository<T, PASSWORD> {

    T create(T t);
    T update(T t);
    void delete(PASSWORD password);
    T read(PASSWORD password);
    Set<SecondPersonPassword> getAll();
}
