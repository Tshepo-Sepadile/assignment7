package ac.za.cput.repository;
import ac.za.cput.domain.FifthPersonPassword;

import java.util.Set;

public interface FifthPersonPasswordRepository<T, PASSWORD> {

    T create(T t);
    T update(T t);
    void delete(PASSWORD password);
    T read(PASSWORD password);
    Set<FifthPersonPassword> getAll();
}
