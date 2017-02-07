package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_7 extends Applet {

    public void init() {

    }

    public void paint(Graphics g){
        g.drawRoundRect(100,200,400,400,50,50);
        g.fillOval(125,225,150,150);
        g.fillOval(325,225,150,150);
        g.fillOval(125,425,150,150);
        g.fillOval(325,425,150,150);
    }
}