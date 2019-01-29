package widgets;

import interfaces.IBackend;
import interfaces.Widget;

public class ComboBox extends Widget{

    public ComboBox(IBackend backend){
        super(backend);
    }

    public void setBackend(IBackend backend) {
        this.backend = backend;
    }
    
    public void show() {
        for (int i = 0; i < 4; ++i)
            this.backend.drawLine();
        this.backend.drawText();
    }
   
}
