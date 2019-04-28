package ac.za.cput.repository;
import ac.za.cput.domain.ThirdPersonPassword;

import java.util.Set;

public interface ThirdPersonPasswordRepository<T, PASSWORD> {

    T create(T t);
    T update(T t);
    void delete(PASSWORD password);
    T read(PASSWORD password);
    Set<ThirdPersonPassword> getAll();
}
