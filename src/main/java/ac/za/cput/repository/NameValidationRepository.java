package ac.za.cput.repository;
import ac.za.cput.domain.NameValidation;

import java.util.Set;

public interface NameValidationRepository<T, NAME> {

    T create(T t);
    T update(T t);
    void delete(NAME name);
    T read(NAME name);
    Set<NameValidation> getAll();
}
