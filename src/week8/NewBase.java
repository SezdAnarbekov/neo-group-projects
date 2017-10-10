package week8;

import week8.jany.*;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.ZoneId;

class NewBase{
    NewBase(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBounds(300,400, 400,400);
        frame.add(new RoundButton("kesha"));
    }
    public static void main(String[] args) {
        new NewBase();
    }

}
