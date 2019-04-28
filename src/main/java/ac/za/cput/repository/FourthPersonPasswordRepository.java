package ac.za.cput.repository;
import ac.za.cput.domain.FourthPersonPassword;

import java.util.Set;

public interface FourthPersonPasswordRepository<T, PASSWORD> {

    T create(T t);
    T update(T t);
    void delete(PASSWORD password);
    T read(PASSWORD password);
    Set<FourthPersonPassword> getAll();
}