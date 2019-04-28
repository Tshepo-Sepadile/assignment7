package ac.za.cput.repository.impl;

import ac.za.cput.domain.Occupation;
import ac.za.cput.factory.OccupationFactory;
import ac.za.cput.repository.OccupationRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class OccupationRepositoryImplTest {

    private OccupationRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = OccupationRepositoryImpl.getRepository();
    }


    @Test
    public void create() {


        this.repository.create(OccupationFactory.getOccupation("101664"));
        Assert.assertEquals( this.repository, this.repository);
    }

    @Test
    public void read() {

        repository = OccupationRepositoryImpl.getRepository();

        repository.read("101664");
        Assert.assertEquals("101664", repository);

    }

    @Test
    public void update() {

        repository.update(OccupationFactory.getOccupation("101664"));
        Assert.assertEquals("101664", repository);
    }

    @Test
    public void delete() {

        repository.delete("1016164");
        Assert.assertEquals("101664", repository);
    }

    @Test
    public void getAll() {
        Set<Occupation> occupations = this.repository.getAll();
        Assert.assertEquals(1, occupations.size());
    }
}