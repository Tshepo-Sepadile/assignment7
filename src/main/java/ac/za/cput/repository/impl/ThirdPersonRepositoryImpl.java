package ac.za.cput.repository.impl;

import ac.za.cput.domain.ThirdPerson;
import ac.za.cput.repository.ThirdPersonRepository;

import java.util.HashSet;
import java.util.Set;

public class ThirdPersonRepositoryImpl implements ThirdPersonRepository {

    private static ThirdPersonRepositoryImpl repository = null;
    private Set<ThirdPerson> thirdPersons;
    //private SecondPerson secondPersons;

    private ThirdPersonRepositoryImpl()
    {
        this.thirdPersons = new HashSet<>();
    }

    public static ThirdPersonRepository getRepository()
    {
        if(repository == null) repository = new ThirdPersonRepositoryImpl();
        return repository;
    }

    public ThirdPerson create(ThirdPerson thirdPerson)
    {
        this.thirdPersons.add(thirdPerson);
        return thirdPerson;
    }

    public ThirdPerson read(String name, String surname)
    {
        this.thirdPersons.contains(name);
        this.thirdPersons.contains(surname);
        return null;
    }

    public ThirdPerson update(ThirdPerson person)
    {
        if(thirdPersons == person){
            this.thirdPersons.add(person);
        }
        return person;
    }

    public void delete(String name, String surname)
    {
        this.thirdPersons.remove(name);
        this.thirdPersons.remove(surname);
    }

    public Set<ThirdPerson> getAll()
    {
        return this.thirdPersons;
    }
}
