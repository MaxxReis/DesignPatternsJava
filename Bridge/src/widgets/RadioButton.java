package widgets;

import interfaces.IBackend;
import interfaces.Widget;

public class RadioButton extends Widget{

    public RadioButton(IBackend backend) {
        super(backend);
    }
    
    
    public void show() {
        this.backend.drawLine();
        this.backend.drawText();
    }
    
}
