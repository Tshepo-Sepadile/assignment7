package ac.za.cput.factory;

import ac.za.cput.domain.Person;

public class PersonFactory
{
    public static Person getPerson(String name, String surname) {
        if((name == "Tshepo") && (surname == "Sepadile")){
            return new Person();
        }
        return null;
    }
}
