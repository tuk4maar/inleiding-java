package h02;

import java.awt.*;
import java.applet.*;

public class Opdracht2_2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Johan", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Rasanayagam", 50, 80 );
    }
}