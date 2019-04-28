package ac.za.cput.factory;

import ac.za.cput.domain.SecondPersonPassword;

public class SecondPersonPasswordFactory {

    public static SecondPersonPassword getSecondPersonPassword(String passW2) {
        if(passW2 == "678910"){
            return new SecondPersonPassword();
        }
        return null;
    }
}
