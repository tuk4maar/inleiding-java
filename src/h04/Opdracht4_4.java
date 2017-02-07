package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.green);
        g.fillRect(50,140,50,40);
        g.setColor(Color.yellow);
        g.fillRect(100,80,50,100);
        g.setColor(Color.blue);
        g.fillRect(150,100,50,80);
        g.setColor(Color.black);
        g.drawString("Valerie",50,190);
        g.setColor(Color.black);
        g.drawString("Jeroen",100,190);
        g.setColor(Color.black);
        g.drawString("Hans",150,190);
        g.drawLine(200,180,200,10);
        g.drawString("0",205,190);
        g.drawString("20",205,170);
        g.drawString("40",205,150);
        g.drawString("60",205,130);
        g.drawString("80",205,110);
        g.drawString("100",205,90);
    }
}