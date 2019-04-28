package ac.za.cput.repository.impl;

import ac.za.cput.domain.NameValidation;
import ac.za.cput.factory.NameValidationFactory;
import ac.za.cput.repository.NameValidationRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class NameValidationRepositoryImplTest {

    private NameValidationRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = NameValidationRepositoryImpl.getRepository();
    }


    @Test
    public void create() {


        this.repository.create(NameValidationFactory.getNameValidation("Correct"));
        Assert.assertEquals( this.repository, this.repository);
    }

    @Test
    public void read() {

        repository = NameValidationRepositoryImpl.getRepository();

        repository.read("Tshepo");
        Assert.assertEquals("Tshepo", repository);

    }

    @Test
    public void update() {

        repository.update(NameValidationFactory.getNameValidation("Correct"));
        Assert.assertEquals("Correct", repository);
    }

    @Test
    public void delete() {

        repository.delete("1016164");
        Assert.assertEquals("101664", repository);
    }

    @Test
    public void getAll() {
        Set<NameValidation> nameValidations = this.repository.getAll();
        Assert.assertEquals(1, nameValidations.size());
    }
}