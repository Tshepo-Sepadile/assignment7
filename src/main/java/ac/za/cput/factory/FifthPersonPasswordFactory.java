package ac.za.cput.factory;

import ac.za.cput.domain.FifthPersonPassword;

public class FifthPersonPasswordFactory {

    public static FifthPersonPassword getFifthPersonPassword(String passW5) {
        if(passW5 == "2122232425"){
            return new FifthPersonPassword();
        }
        return null;
    }
}
