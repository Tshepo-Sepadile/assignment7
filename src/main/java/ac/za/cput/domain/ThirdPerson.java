package ac.za.cput.domain;

public class ThirdPerson implements User {

    private String name = "Nkosinathi";
    private String surname = "Sola";

    public String personName()
    {
        return name;
    }

    public String personSurname()
    {
        return surname;
    }
}
