package h04;

import java.awt.*;
import java.applet.*;

public class Praktijk_5 extends Applet {

    public void init() {

    }

    public void paint(Graphics g){
        g.drawRoundRect(100,200,500,200,50,50);
        g.drawString("Afgeronde rechthoek",300,410);
    }
}
