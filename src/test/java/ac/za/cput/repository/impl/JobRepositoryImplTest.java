package ac.za.cput.repository.impl;

import ac.za.cput.domain.Job;
import ac.za.cput.factory.JobFactory;
import ac.za.cput.repository.JobRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class JobRepositoryImplTest {

    private JobRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = JobRepositoryImpl.getRepository();
    }


    @Test
    public void create() {


        this.repository.create(JobFactory.getJob("Developer"));
        Assert.assertEquals( this.repository, this.repository);
    }

    @Test
    public void read() {

        repository = JobRepositoryImpl.getRepository();

        repository.read("12345");
        Assert.assertEquals("12345", repository);

    }

    @Test
    public void update() {

        repository.update(JobFactory.getJob("Developer"));
        Assert.assertEquals("Developer", repository);
    }

    @Test
    public void delete() {

        repository.delete("12345");
        Assert.assertEquals("12345", repository);
    }

    @Test
    public void getAll() {
        Set<Job> jobs = this.repository.getAll();
        Assert.assertEquals(1, jobs.size());
    }
}