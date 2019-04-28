package ac.za.cput.repository.impl;

import ac.za.cput.domain.FourthPerson;
import ac.za.cput.repository.FourthPersonRepository;

import java.util.HashSet;
import java.util.Set;

public class FourthPersonRepositoryImpl implements FourthPersonRepository {

    private static FourthPersonRepositoryImpl repository = null;
    private Set<FourthPerson> fourthPersons;
    //private SecondPerson secondPersons;

    private FourthPersonRepositoryImpl()
    {
        this.fourthPersons = new HashSet<>();
    }

    public static FourthPersonRepository getRepository()
    {
        if(repository == null) repository = new FourthPersonRepositoryImpl();
        return repository;
    }

    public FourthPerson create(FourthPerson fourthPerson)
    {
        this.fourthPersons.add(fourthPerson);
        return fourthPerson;
    }

    public FourthPerson read(String name, String surname)
    {
        this.fourthPersons.contains(name);
        this.fourthPersons.contains(surname);
        return null;
    }

    public FourthPerson update(FourthPerson person)
    {
        if(fourthPersons == person){
            this.fourthPersons.add(person);
        }
        return person;
    }

    public void delete(String name, String surname)
    {
        this.fourthPersons.remove(name);
        this.fourthPersons.remove(surname);
    }

    public Set<FourthPerson> getAll()
    {
        return this.fourthPersons;
    }
}
