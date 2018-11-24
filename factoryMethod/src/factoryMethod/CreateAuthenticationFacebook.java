package factoryMethod;

import interfaces.IAuthenticate;
import interfaces.ICreate;

public class CreateAuthenticationFacebook implements ICreate{
    private IAuthenticate instance;
    
    public CreateAuthenticationFacebook(){
        this.instance = new AuthenticationFacebook();
    }

    @Override
    public IAuthenticate getInstance() {
        return this.instance;
    }
    
    
}
