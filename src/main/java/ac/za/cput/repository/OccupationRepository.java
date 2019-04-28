package ac.za.cput.repository;
import ac.za.cput.domain.Occupation;

import java.util.Set;

public interface OccupationRepository<T, ID> {

    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
    Set<Occupation> getAll();
}
