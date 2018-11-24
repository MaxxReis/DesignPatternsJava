package app;

import factoryMethod.CreateAuthenticationFacebook;
import factoryMethod.CreateAuthenticationGoogle;
import interfaces.IAuthenticate;
import interfaces.ICreate;

public class Main {
    public static void main(String[] args) {
        ICreate[] creators = new ICreate[2];
        creators[0] = new CreateAuthenticationGoogle();
        creators[1] = new CreateAuthenticationFacebook();
        
        for (ICreate creator : creators) {
            IAuthenticate authenticator = creator.getInstance();
            authenticator.authenticate();
        }
    }
}
