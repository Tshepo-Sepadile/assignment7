package ac.za.cput.repository;
import ac.za.cput.domain.FourthPerson;

import java.util.Set;

public interface FourthPersonRepository extends IRepository <FourthPerson, String, String> {

    Set<FourthPerson>getAll();


}
