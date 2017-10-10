package hidden_calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
public class CalculatorApplication extends JFrame implements ActionListener {

    JTextField resultField;
    double operandOne;
    double operandTwo;
    int operator;

    JButton addButton;
    JButton subtractButton;
    JButton multiplyButton;
    JButton divideButton;
    JButton percentileButton;
    JButton equalsButton;
    JButton dotButton;
    JButton cancelButton;
    JButton onebyButton;
    JButton backButton;

    JButton one1;
    JButton two2;
    JButton three3;
    JButton four4;
    JButton five5;
    JButton six6;
    JButton seven7;
    JButton eight8;
    JButton nine9;
    JButton zero0;

    Object source;

    public static void main(String[] args) {

        CalculatorApplication app = new CalculatorApplication();
        app.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        app.setSize(280, 240);

        app.setVisible(true);
    }

    public CalculatorApplication() {


        super();


        JPanel operandPanel;
        JPanel buttonPanel1;
        JPanel buttonPanel2;
        JPanel buttonPanel3;
        JPanel buttonPanel4;

        Container cp;

        cp = getContentPane();

        cp.setLayout(new GridLayout(5, 1));


        operandPanel = new JPanel();
        operandPanel.setLayout(new FlowLayout());

        resultField = new JTextField("0", 23);
        resultField.setHorizontalAlignment(SwingConstants.RIGHT);

        operandPanel.add(resultField);
        cp.add(operandPanel);


        buttonPanel1 = new JPanel();
        buttonPanel1.setLayout(new FlowLayout());
        seven7 = new JButton(" 7 ");
        seven7.addActionListener(this);
        buttonPanel1.add(seven7);
        eight8 = new JButton(" 8 ");
        eight8.addActionListener(this);
        buttonPanel1.add(eight8);
        nine9 = new JButton(" 9 ");
        nine9.addActionListener(this);
        buttonPanel1.add(nine9);
        divideButton = new JButton(" / ");
        divideButton.addActionListener(this);
        buttonPanel1.add(divideButton);
        cancelButton = new JButton(" C ");
        cancelButton.addActionListener(this);
        buttonPanel1.add(cancelButton);
        cp.add(buttonPanel1);

        buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(new FlowLayout());
        four4 = new JButton(" 4 ");
        four4.addActionListener(this);
        buttonPanel2.add(four4);
        five5 = new JButton(" 5 ");
        five5.addActionListener(this);
        buttonPanel2.add(five5);
        six6 = new JButton(" 6 ");
        six6.addActionListener(this);
        buttonPanel2.add(six6);
        multiplyButton = new JButton(" * ");
        multiplyButton.addActionListener(this);
        buttonPanel2.add(multiplyButton);
        backButton = new JButton(" B ");
        backButton.addActionListener(this);
        buttonPanel2.add(backButton);
        cp.add(buttonPanel2);


        buttonPanel3 = new JPanel();
        buttonPanel3.setLayout(new FlowLayout());
        one1 = new JButton(" 1 ");
        one1.addActionListener(this);
        buttonPanel3.add(one1);
        two2 = new JButton(" 2 ");
        two2.addActionListener(this);
        buttonPanel3.add(two2);
        three3 = new JButton(" 3 ");
        three3.addActionListener(this);
        buttonPanel3.add(three3);
        subtractButton = new JButton(" - ");
        subtractButton.addActionListener(this);
        buttonPanel3.add(subtractButton);
        onebyButton = new JButton("1/x");
        onebyButton.addActionListener(this);
        buttonPanel3.add(onebyButton);
        cp.add(buttonPanel3);

        buttonPanel4 = new JPanel();
        buttonPanel4.setLayout(new FlowLayout());
        zero0 = new JButton(" 0 ");
        zero0.addActionListener(this);
        buttonPanel4.add(zero0);
        dotButton = new JButton(" . ");
        dotButton.addActionListener(this);
        buttonPanel4.add(dotButton);
        percentileButton = new JButton(" % ");
        percentileButton.addActionListener(this);
        buttonPanel4.add(percentileButton);
        addButton = new JButton(" + ");
        addButton.addActionListener(this);
        buttonPanel4.add(addButton);
        equalsButton = new JButton(" = ");
        equalsButton.addActionListener(this);
        buttonPanel4.add(equalsButton);
        cp.add(buttonPanel4);

    }

    public void showResult() {
        boolean validOperands;
        DecimalFormat df = new DecimalFormat("0.00");

        try {
            // operandOne = Double.parseDouble(operandOneField.getText());
            // operandTwo = Double.parseDouble(operandTwoField.getText());
            validOperands = true;
        } catch(NumberFormatException nfe) {
            validOperands = false;
        }

        if (validOperands) {
            if (source == addButton) {
                operandOne =Double.parseDouble(resultField.getText());
                resultField.setText("0");
                operator = 1;
            }
            else if (source == subtractButton) {
                operandOne =Double.parseDouble(resultField.getText());
                resultField.setText("0");
                operator = 2;
            }
            else if (source == multiplyButton) {
                operandOne = Double.parseDouble(resultField.getText());
                resultField.setText("0");
                operator = 3;
            }
            else if (source == divideButton) {
                operandOne = Double.parseDouble(resultField.getText());
                resultField.setText("0");
                operator = 4;
            }
            else if (source == percentileButton) {
                operandOne =Double.parseDouble(resultField.getText());
                resultField.setText("0");
                operator = 5;
            }
            else if (source == equalsButton) {
                operandTwo = Double.parseDouble(resultField.getText());
                switch(operator){
                    case 1:
                        resultField.setText(Double.toString(operandOne + operandTwo));
                        operandOne = 0.0;
                        operandTwo = 0.0;
                        break;
                    case 2:
                        resultField.setText(Double.toString(operandOne - operandTwo));
                        operandOne = 0.0;
                        operandTwo = 0.0;
                        break;
                    case 3:
                        resultField.setText(Double.toString(operandOne * operandTwo));
                        operandOne = 0.0;
                        operandTwo = 0.0;
                        break;
                    case 4:
                        if (operandTwo != 0.0){
                            resultField.setText(Double.toString(operandOne / operandTwo));
                            operandOne = 0.0;
                            operandTwo = 0.0;}
                        else{
                            resultField.setText("0");}
                        break;
                    case 5:
                        resultField.setText(Double.toString(operandOne % operandTwo));
                        operandOne = 0.0;
                        operandTwo = 0.0;
                }

            }
            else if (source == onebyButton) {
                if (resultField.getText().equals("0"))
                    resultField.setText("0");
                else
                    resultField.setText(Double.toString(1.0 / Double.parseDouble(resultField.getText())));
            }
            else if (source == one1) {
                if (resultField.getText().equals("0"))
                    resultField.setText("1");
                else
                    resultField.setText(resultField.getText() + "1");
            }
            else if (source == two2) {
                if (resultField.getText().equals("0"))
                    resultField.setText("2");
                else
                    resultField.setText(resultField.getText() + "2");
            }
            else if (source == three3) {
                if (resultField.getText().equals("0"))
                    resultField.setText("3");
                else
                    resultField.setText(resultField.getText() + "3");
            }
            else if (source == four4) {
                if (resultField.getText().equals("0"))
                    resultField.setText("4");
                else
                    resultField.setText(resultField.getText() + "4");
            }
            else if (source == five5) {
                if (resultField.getText().equals("0"))
                    resultField.setText("5");
                else
                    resultField.setText(resultField.getText() + "5");
            }
            else if (source == six6) {
                if (resultField.getText().equals("0"))
                    resultField.setText("6");
                else
                    resultField.setText(resultField.getText() + "6");
            }
            else if (source == seven7) {
                if (resultField.getText().equals("0"))
                    resultField.setText("7");
                else
                    resultField.setText(resultField.getText() + "7");
            }
            else if (source == eight8) {
                if (resultField.getText().equals("0"))
                    resultField.setText("8");
                else
                    resultField.setText(resultField.getText() + "8");
            }
            else if (source == nine9) {
                if (resultField.getText().equals("0"))
                    resultField.setText("9");
                else
                    resultField.setText(resultField.getText() + "9");
            }
            else if (source == zero0) {
                if (resultField.getText().equals("0"))
                    resultField.setText("0");
                else
                    resultField.setText(resultField.getText() + "0");
            }
            else if (source == dotButton) {
                if (resultField.getText().equals("0"))
                    resultField.setText("0.");
                else if (resultField.getText().indexOf('.') == -1){
                    resultField.setText(resultField.getText() + ".");
                }
                else{}

            }
            else if (source == cancelButton) {
                resultField.setText("0");
            }
            else if (source == backButton) {
                if (!(resultField.getText().equals("0") || resultField.getText().equals("0.0")) && resultField.getText().length() > 1){
                    resultField.setText(resultField.getText().substring(0,resultField.getText().length()-1));
                }
            }
        } else
            resultField.setText("Invalid operand");
    }

    public void actionPerformed(ActionEvent ae) {

        source = ae.getSource();
        showResult();
    }

}
