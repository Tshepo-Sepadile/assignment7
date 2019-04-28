package ac.za.cput.repository.impl;

import ac.za.cput.domain.Person;
import ac.za.cput.factory.PersonFactory;
import ac.za.cput.repository.PersonRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class PersonRepositoryImplTest {

    private PersonRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = PersonRepositoryImpl.getRepository();
    }


    @Test
    public void create() {


        this.repository.create(PersonFactory.getPerson("Tshepo", "Sepadile"));
        Assert.assertEquals( this.repository, this.repository);
    }

    @Test
    public void read() {

        repository = PersonRepositoryImpl.getRepository();

        repository.read("Tshepo", "Sepadile");
        Assert.assertEquals("Tshepo", repository);

    }

    @Test
    public void update() {

        repository.update(PersonFactory.getPerson("Tshepo","Sepadile"));
        Assert.assertEquals(null, repository);
    }

    @Test
    public void delete() {

        repository.delete("Tshepo", "Speadile");
        Assert.assertEquals(null, repository);
    }

    @Test
    public void getAll() {
        Set<Person> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}