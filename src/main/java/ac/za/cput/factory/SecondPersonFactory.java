package ac.za.cput.factory;

import ac.za.cput.domain.SecondPerson;

public class SecondPersonFactory
{
    public static SecondPerson getSecondPerson(String name, String surname) {
        if((name == "Valery") && (surname == "Burtsev")){
            return new SecondPerson();
        }
        return null;
    }
}
