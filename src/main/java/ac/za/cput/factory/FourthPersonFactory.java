package ac.za.cput.factory;

import ac.za.cput.domain.FourthPerson;

public class FourthPersonFactory
{
    public static FourthPerson getFourthPerson(String name, String surname) {
        if((name == "Henry") && (surname == "Keown")){
            return new FourthPerson();
        }
        return null;
    }
}
