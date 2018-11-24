package factoryMethod;

import interfaces.IAuthenticate;
import interfaces.ICreate;

public class CreateAuthenticationGoogle implements ICreate{
    private IAuthenticate instance;
    
    public CreateAuthenticationGoogle(){
        this.instance = new AuthenticationGoogle();
    }
    
    @Override
    public IAuthenticate getInstance() {
        return this.instance;
    }
}   
