package ac.za.cput.repository;
import ac.za.cput.domain.FifthPerson;

import java.util.Set;

public interface FifthPersonRepository extends IRepository <FifthPerson, String, String> {

    Set<FifthPerson>getAll();


}
