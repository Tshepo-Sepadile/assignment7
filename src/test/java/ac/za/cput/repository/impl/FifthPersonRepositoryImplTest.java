package ac.za.cput.repository.impl;

import ac.za.cput.domain.FifthPerson;
import ac.za.cput.factory.FifthPersonFactory;
import ac.za.cput.repository.FifthPersonRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class FifthPersonRepositoryImplTest {

    private FifthPersonRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = FifthPersonRepositoryImpl.getRepository();
    }


    @Test
    public void create() {


        this.repository.create(FifthPersonFactory.getFifthPerson("Tinashe", "Madzimbamuto"));
        Assert.assertEquals( this.repository, this.repository);
    }

    @Test
    public void read() {

        repository = FifthPersonRepositoryImpl.getRepository();

        repository.read("Tinashe", "Madzimbamuto");
        Assert.assertEquals("Tinashe", repository);

    }

    @Test
    public void update() {

        repository.update(FifthPersonFactory.getFifthPerson("Tinashe","Madzimbamuto"));
        Assert.assertEquals(null, repository);
    }

    @Test
    public void delete() {

        repository.delete("Tinashe", "Madzimbamuto");
        Assert.assertEquals(null, repository);
    }

    @Test
    public void getAll() {
        Set<FifthPerson> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}