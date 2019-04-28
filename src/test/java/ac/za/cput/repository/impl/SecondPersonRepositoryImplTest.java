package ac.za.cput.repository.impl;

import ac.za.cput.domain.SecondPerson;
import ac.za.cput.factory.SecondPersonFactory;
import ac.za.cput.repository.SecondPersonRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class SecondPersonRepositoryImplTest {

    private SecondPersonRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = SecondPersonRepositoryImpl.getRepository();
    }


    @Test
    public void create() {


        this.repository.create(SecondPersonFactory.getSecondPerson("Valery", "Burtsev"));
        Assert.assertEquals( this.repository, this.repository);
    }

    @Test
    public void read() {

        repository = SecondPersonRepositoryImpl.getRepository();

        repository.read("Valery", "Burtsev");
        Assert.assertEquals("Valery", repository);

    }

    @Test
    public void update() {

        repository.update(SecondPersonFactory.getSecondPerson("Valery","Burtsev"));
        Assert.assertEquals(null, repository);
    }

    @Test
    public void delete() {

        repository.delete("Valery", "Burtsev");
        Assert.assertEquals(null, repository);
    }

    @Test
    public void getAll() {
        Set<SecondPerson> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}