package factoryMethod;

import interfaces.IAuthenticate;

public class AuthenticationGoogle implements IAuthenticate{
    @Override
    public void authenticate() {
        System.out.println("Google authentitcation was created ... Access permited");
    }
}
