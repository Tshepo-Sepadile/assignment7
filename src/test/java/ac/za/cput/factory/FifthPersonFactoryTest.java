package ac.za.cput.factory;

import ac.za.cput.domain.FifthPerson;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FifthPersonFactoryTest {

    @Test
    public void getFifthPerson() {
        FifthPerson fifthPerson  = FifthPersonFactory.getFifthPerson("Tinashe", "Madzimbamuto");
        Assert.assertNotNull(fifthPerson.personName());
    }
}