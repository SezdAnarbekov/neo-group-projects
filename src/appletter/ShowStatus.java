package appletter;

import java.applet.Applet;
import java.awt.*;

/*
<applet code = "appletter.Banner" width = 2000 height = 600>
</applet>
*/
    public class ShowStatus extends Applet {
        String msg = "Syezd Anarbekov ";

        public void paint(Graphics g){

            g.drawString(msg, 50, 30);
            showStatus("Menin aaty jonum");
        }


    }