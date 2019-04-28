package ac.za.cput.factory;

import ac.za.cput.domain.FifthPerson;

public class FifthPersonFactory
{
    public static FifthPerson getFifthPerson(String name, String surname) {
        if((name == "Tinashe") && (surname == "Madzimbamuto")){
            return new FifthPerson();
        }
        return null;
    }
}
