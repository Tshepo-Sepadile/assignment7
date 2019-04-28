package ac.za.cput.domain;

public class SecondPerson implements User {

    private String name = "Valery";
    private String surname = "Burtsev";

    public String personName()
    {
        return name;
    }

    public String personSurname()
    {
        return surname;
    }
}
