package h04;

import java.awt.*;
import java.applet.*;

public class Praktijk_1 extends Applet {

    public void init(){

    }
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawLine(50,200,275,200);
        g.drawString("Lijn",150,210);
    }
}