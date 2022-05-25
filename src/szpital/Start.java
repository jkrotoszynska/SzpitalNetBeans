package szpital;

import frontend.EkranLogowaniaFrame;

public class Start {

    public static void main(String[] args) {
        EkranLogowaniaFrame el = new EkranLogowaniaFrame();
        //ls.setExtendedState(MAXIMIZED_BOTH);
        el.setSize(1000,670);
        el.setTitle("Centrum zarządzania");
        el.setVisible(true);
    }
}
