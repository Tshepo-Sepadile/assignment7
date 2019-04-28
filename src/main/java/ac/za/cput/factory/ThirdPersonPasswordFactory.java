package ac.za.cput.factory;

import ac.za.cput.domain.ThirdPersonPassword;

public class ThirdPersonPasswordFactory {

    public static ThirdPersonPassword getThirdPersonPassword(String passW3) {
        if(passW3 == "1112131415"){
            return new ThirdPersonPassword();
        }
        return null;
    }
}
