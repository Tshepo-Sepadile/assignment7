package ac.za.cput.repository;
import ac.za.cput.domain.PasswordValidation;

import java.util.Set;

public interface PasswordValidationRepository<T, PASSWORD> {

    T create(T t);
    T update(T t);
    void delete(PASSWORD password);
    T read(PASSWORD password);
    Set<PasswordValidation> getAll();
}
