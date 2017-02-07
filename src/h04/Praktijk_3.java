package h04;

import java.awt.*;
import java.applet.*;

public class Praktijk_3 extends Applet {

    public void init() {

    }

    public void paint(Graphics g){
        g.setColor (Color.magenta);
        g.fillRect(100,200,400,200);
        g.setColor(Color.black);
        g.drawOval(100,200,400,200);
        g.drawString("Gevulde rechthoek met ovaal",225,410);
    }
}
