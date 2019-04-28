package ac.za.cput.domain;

public class Person implements User {

    private String name = "Tshepo";
    private String surname = "Sepadile";

    public String personName()
    {
        return name;
    }

    public String personSurname()
    {
        return surname;
    }
}
