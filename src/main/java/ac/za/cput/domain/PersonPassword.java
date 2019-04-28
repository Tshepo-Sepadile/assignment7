package ac.za.cput.domain;

public class PersonPassword implements Password {

    private String passW = "12345";

    public String password()
    {
        return passW;
    }

}
