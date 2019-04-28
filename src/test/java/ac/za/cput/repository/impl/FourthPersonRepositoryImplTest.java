package ac.za.cput.repository.impl;

import ac.za.cput.domain.FourthPerson;
import ac.za.cput.factory.FourthPersonFactory;
import ac.za.cput.repository.FourthPersonRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class FourthPersonRepositoryImplTest {

    private FourthPersonRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = FourthPersonRepositoryImpl.getRepository();
    }


    @Test
    public void create() {


        this.repository.create(FourthPersonFactory.getFourthPerson("Hnery", "Keown"));
        Assert.assertEquals( this.repository, this.repository);
    }

    @Test
    public void read() {

        repository = FourthPersonRepositoryImpl.getRepository();

        repository.read("Henry", "Keown");
        Assert.assertEquals("Henry", repository);

    }

    @Test
    public void update() {

        repository.update(FourthPersonFactory.getFourthPerson("Hnery","Keown"));
        Assert.assertEquals(null, repository);
    }

    @Test
    public void delete() {

        repository.delete("Henry", "Keown");
        Assert.assertEquals(null, repository);
    }

    @Test
    public void getAll() {
        Set<FourthPerson> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}