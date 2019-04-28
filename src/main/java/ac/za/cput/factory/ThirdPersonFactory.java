package ac.za.cput.factory;

import ac.za.cput.domain.ThirdPerson;

public class ThirdPersonFactory
{
    public static ThirdPerson getThirdPerson(String name, String surname) {
        if((name == "Nkosinathi") && (surname == "Sola")){
            return new ThirdPerson();
        }
        return null;
    }
}
