package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawPolygon(new int[]{40,100,160}, new int[]{100,20,100},3);
        g.setColor(Color.black);
        g.drawRect(40,100,120,100);
        g.setColor(Color.black);
        g.drawRect(60,130,30,30);
        g.setColor(Color.black);
        g.drawRect(120,150,25,50);
    }
}