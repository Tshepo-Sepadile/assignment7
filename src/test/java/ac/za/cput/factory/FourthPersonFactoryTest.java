package ac.za.cput.factory;

import ac.za.cput.domain.FourthPerson;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FourthPersonFactoryTest {

    @Test
    public void getFourthPerson() {
        FourthPerson fourthPerson  = FourthPersonFactory.getFourthPerson("Henry", "Keown");
        Assert.assertEquals("Keown", fourthPerson.personSurname());
    }
}