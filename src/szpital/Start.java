package szpital;

import frontend.EkranLogowaniaFrame;
import static java.awt.Frame.MAXIMIZED_BOTH;


public class Start {

    public static void main(String[] args) {
        EkranLogowaniaFrame el = new EkranLogowaniaFrame();
        //ls.setExtendedState(MAXIMIZED_BOTH);
        el.setSize(1000,700);
        el.setTitle("Centrum zarządzania");
        el.setVisible(true);
    }
    
}
