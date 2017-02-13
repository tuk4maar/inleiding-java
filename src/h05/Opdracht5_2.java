package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5_2 extends Applet {

    int Valerie;
    int Jeroen;
    int Hans;
    int nulpunt, som_v, som_j, som_h;//Nulpunt en de aftreksom

    public void init() {
        //De leden mogen niet extreem obesitas hebben. Onder of gelijk aan 180kg.
        Valerie= 40;
        Jeroen=100;
        Hans=80;

        // Teller begint bij 0. Stel: staaf is 80 hoog.
        // 180 is waar de grafiek begint.
        nulpunt=180; //Dit is het nulpunt van de staaf
        som_v = nulpunt - Valerie;
        som_j = nulpunt - Jeroen;
        som_h = nulpunt - Hans;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.green);
        g.fillRect(50,som_v,50,Valerie);
        g.setColor(Color.yellow);
        g.fillRect(100,som_j,50,Jeroen);
        g.setColor(Color.blue);
        g.fillRect(150,som_h,50,Hans);
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