package hidden_calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    String[] characters = {"1", "2", "3", "C", "4", "5", "6", "+", "7", "8", "9", "-", "*", "0", "/", "="};
    JButton[] buttons = new JButton[16];
    JFrame frame;
    JPasswordField text;
    String operator = "=";
    long result = 0;
    double result2 = 0;
    boolean calculating = true;

    public Calculator() {

        frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(200, 275);
        frame.setTitle("Syezd's Calculator");
        text = new JPasswordField("0", 20);
        text.setBackground(new Color(0, 145, 255));
        text.setEditable(false);
        text.setHorizontalAlignment(SwingConstants.RIGHT);
        text.setEchoChar((char) 0);
        frame.add(text);
        text.setBounds(0, 0, 200, 50);
        int n = 0;
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(characters[i]);
            if (i % 4 == 0)
                n = n + 50;
            buttons[i].setBounds((i % 4) * 50, 0 + n, 50, 50);
            buttons[i].addActionListener(this);
            buttons[i].setBackground(new Color(140, 146, 151));
            buttons[i].setOpaque(true);
            frame.add(buttons[i]);

        }
    }

    public void actionPerformed(ActionEvent e) {

        String cmd = e.getActionCommand();
        if ('0' <= cmd.charAt(0) && cmd.charAt(0) <= '9') {
            if (calculating)
                text.setText(cmd);
            else
                text.setText(text.getText() + cmd);
            calculating = false;
        } else {
            if (calculating) {
                if (cmd.equals("-")) {
                    text.setText(cmd);
                    calculating = false;
                } else
                    operator = cmd;
            } else {
                long x = Long.parseLong(text.getText());
                calculate(x);
                operator = cmd;
                calculating = true;
            }

        }
        if ("C" == e.getActionCommand())
            text.setText("0");
        if (text.getText().equals("10") && (buttons[15].equals(e.getActionCommand())))
            JOptionPane.showMessageDialog(frame, "kkkkkk");
    }

    public void calculate(long n) {
        if (operator.equals("+"))
            result += n;
        else if (operator.equals("-"))
            result -= n;
        else if (operator.equals("*"))
            result *= n;
        else if (operator.equals("/"))
            result /= n;
        else if (operator.equals("="))
            result = n;

        text.setText("" + result);


    }

    public static void main(String[] args) {
        new Calculator();
    }

}




