package ac.za.cput.repository.impl;

import ac.za.cput.domain.SecondPerson;
import ac.za.cput.repository.SecondPersonRepository;

import java.util.HashSet;
import java.util.Set;

public class SecondPersonRepositoryImpl implements SecondPersonRepository {

    private static SecondPersonRepositoryImpl repository = null;
    private Set<SecondPerson> secondPersons;
    //private SecondPerson secondPersons;

    private SecondPersonRepositoryImpl()
    {
        this.secondPersons = new HashSet<>();
    }

    public static SecondPersonRepository getRepository()
    {
        if(repository == null) repository = new SecondPersonRepositoryImpl();
        return repository;
    }

    public SecondPerson create(SecondPerson secondPerson)
    {
        this.secondPersons.add(secondPerson);
        return secondPerson;
    }

    public SecondPerson read(String name, String surname)
    {
        this.secondPersons.contains(name);
        this.secondPersons.contains(surname);
        return null;
    }

    public SecondPerson update(SecondPerson person)
    {
        if(secondPersons == person){
            this.secondPersons.add(person);
        }
        return person;
    }

    public void delete(String name, String surname)
    {
        this.secondPersons.remove(name);
        this.secondPersons.remove(surname);
    }

    public Set<SecondPerson> getAll()
    {
        return this.secondPersons;
    }
}
