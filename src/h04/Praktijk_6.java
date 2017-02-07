package h04;

import java.awt.*;
import java.applet.*;

public class Praktijk_6 extends Applet {

    public void init() {

    }

    public void paint(Graphics g){
        g.setColor (Color.magenta);
        g.fillOval(100,200,400,200);
        g.setColor (Color.black);
        g.drawString("Gevulde ovaal",250,410);
    }
}
