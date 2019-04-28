package ac.za.cput.repository.impl;

import ac.za.cput.domain.ThirdPerson;
import ac.za.cput.factory.ThirdPersonFactory;
import ac.za.cput.repository.ThirdPersonRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ThirdPersonRepositoryImplTest {

    private ThirdPersonRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = ThirdPersonRepositoryImpl.getRepository();
    }


    @Test
    public void create() {


        this.repository.create(ThirdPersonFactory.getThirdPerson("Nkosinathi", "Sola"));
        Assert.assertEquals( this.repository, this.repository);
    }

    @Test
    public void read() {

        repository = ThirdPersonRepositoryImpl.getRepository();

        repository.read("Nkosinathi", "Sola");
        Assert.assertEquals("Nkosinathi", repository);

    }

    @Test
    public void update() {

        repository.update(ThirdPersonFactory.getThirdPerson("Nkosinathi","Sola"));
        Assert.assertEquals(null, repository);
    }

    @Test
    public void delete() {

        repository.delete("Nkosinathi", "Sola");
        Assert.assertEquals(null, repository);
    }

    @Test
    public void getAll() {
        Set<ThirdPerson> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}