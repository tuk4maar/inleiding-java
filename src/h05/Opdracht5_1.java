package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht5_1 extends Applet {
    int  width;
    int length;
    Color fillcolor;
    Color linecolor;

    public void init(){
        width = 200;
        length = 100;
        fillcolor = Color.magenta;
        linecolor= Color.black;



    }
    public void paint(Graphics g){
        g.drawLine(50,75,250,75);
        g.drawRect(50,150, width, length);
        g.setColor(fillcolor);
        g.fillOval(300,300,width,length);
        g.fillRect(300,150,width,length);
        g.fillArc(550,150,width,length,0,45);
        g.setColor(linecolor);
        g.drawOval(300,150,width,length);
        g.drawOval(550,150,width,length);
        g.drawRoundRect(50,300,width,length,25,25);
        g.drawOval(600,300,100,100);


    }

}