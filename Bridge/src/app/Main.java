package app;

import backends.BackendLinux;
import backends.BackendWindows;
import interfaces.IBackend;
import interfaces.Widget;
import widgets.ComboBox;
import widgets.RadioButton;

public class Main {
    public static void main(String[] args) {
        Widget widget = new RadioButton(new BackendLinux());
        widget.show();
        System.out.println("***************************");
        widget.setBackend(new BackendWindows());
        widget.show();

        //System.out.println("****************************");
        //widget = new RadioButton(new BackendLinux());
        //widget.show();
    }
}
