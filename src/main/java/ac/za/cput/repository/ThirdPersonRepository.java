package ac.za.cput.repository;
import ac.za.cput.domain.ThirdPerson;

import java.util.Set;

public interface ThirdPersonRepository extends IRepository <ThirdPerson, String, String> {

    Set<ThirdPerson>getAll();


}
