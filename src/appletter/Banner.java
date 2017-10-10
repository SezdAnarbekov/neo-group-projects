package appletter;
import java.awt.*;
import java.applet.*;

/*
<applet code = "appletter.Banner" width = 2000 height = 600>
</applet>
*/
    public class Banner extends Applet implements Runnable{
        String msg = "Syezd Anarbekov ";
        Thread t;
        boolean stopflag;
        public void init(){
           t = null;
        }
        public void start(){
            t = new Thread(this);
            stopflag = false;
            t.start();
        }
        @Override
        public void run() {
        for (;;){
            try{
                repaint();
                Thread.sleep(500);
                if(stopflag)
                    break;
            }
            catch (InterruptedException e){

            }
        }
        }
        public void stop(){
            stopflag = true;
            t = null;
        }
        public void paint(Graphics g){
            char ch;
            ch = msg.charAt(0);
            msg = msg.substring(1, msg.length());
            msg += ch;
            g.drawString(msg, 500, 300);
        }


    }