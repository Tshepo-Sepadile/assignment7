package ac.za.cput.repository;
import ac.za.cput.domain.Job;

import java.util.Set;

public interface JobRepository<T, ID> {

    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
    Set<Job> getAll();
}
