package ac.za.cput.repository.impl;

import ac.za.cput.domain.Person;
import ac.za.cput.factory.PersonFactory;
import ac.za.cput.factory.PersonPasswordFactory;
import ac.za.cput.repository.PersonRepository;

import java.util.HashSet;
import java.util.Set;

public class PersonRepositoryImpl implements PersonRepository {

    private static PersonRepositoryImpl repository;
    private static Set<Person> persons;

    private PersonRepositoryImpl()
    {
        this.persons = new HashSet<>();
    }

    public static PersonRepository getRepository()
    {
        if(repository == persons) repository = new PersonRepositoryImpl();
        return repository;
    }

    public Person create(Person person)
    {
        this.persons.add(person);
        return person;
    }

    public Person read(String name, String surname)
    {
        this.persons.contains(name);
        this.persons.contains(surname);
        return null;
    }

    public Person update(Person person)
    {
        if(persons == person){
          this.persons.add(person);
        }
        return person;
    }

    public void delete(String name, String surname)
    {
        this.persons.remove(name);
        this.persons.remove(surname);
    }

    public Set<Person> getAll()
    {
        return this.persons;
    }
}
