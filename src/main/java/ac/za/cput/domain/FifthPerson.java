package ac.za.cput.domain;

public class FifthPerson implements User {

    private String name = "Tinashe";
    private String surname = "Madzimbamuto";

    public String personName()
    {
        return name;
    }

    public String personSurname()
    {
        return surname;
    }
}
