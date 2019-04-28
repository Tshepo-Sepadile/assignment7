package ac.za.cput.domain;

public class FourthPerson implements User {

    private String name = "Henry";
    private String surname = "Keown";

    public String personName()
    {
        return name;
    }

    public String personSurname()
    {
        return surname;
    }
}
