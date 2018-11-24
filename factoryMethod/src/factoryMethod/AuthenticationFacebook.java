package factoryMethod;

import interfaces.IAuthenticate;

public class AuthenticationFacebook implements IAuthenticate{
    @Override
    public void authenticate() {
        System.out.println("Facebook authentication was created ... Access permited");
    }
}
