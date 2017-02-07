package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);
        g.fillRect(50,50,150,40);
        g.setColor(Color.white);
        g.fillRect(50,90,150,40);
        g.setColor(Color.blue);
        g.fillRect(50,130,150,40);
        g.setColor(Color.green);
        g.drawLine(50,50,50,250);
    }
}