package h04;

import java.awt.*;
import java.applet.*;

public class Praktijk_4 extends Applet {

    public void init() {

    }

    public void paint(Graphics g){
        g.setColor (Color.magenta);
        g.fillArc(100,200,400,200,0,45);
        g.setColor(Color.black);
        g.drawOval(100,200,400,200);
        g.drawString("Taartpunt met ovaal eromheen",225,410);
    }
}
