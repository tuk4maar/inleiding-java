package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_6 extends Applet {

    public void init(){

    }
    public void paint(Graphics g){
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRoundRect(150,50,100,225,10,10);
        g.setColor(Color.red);
        g.fillOval(165,52,70,70);
        g.setColor(Color.orange);
        g.fillOval(165,123,70,70);
        g.setColor(Color.green);
        g.fillOval(165,195,70,70);
        g.setColor(Color.gray);
        g.fillRect(180,275,40,300);
        g.setColor(Color.black);
        g.fillRect(170,575,60,40);

    }
}