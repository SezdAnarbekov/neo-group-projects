package appletter;


import javax.swing.*;
import java.awt.Graphics;
/*
   <applet code = "HappyFace.class" width = 200 height = 60>
   </applet>
   */
public class HappyFace extends JApplet {
    public void paint(Graphics canvas){
        canvas.drawOval(100, 50,200,200);
        canvas.fillOval(155,100,10,20);
        canvas.fillOval(230,100,10,20);
        canvas.drawArc(150, 160, 100, 50, 180, 180);
    }
}
