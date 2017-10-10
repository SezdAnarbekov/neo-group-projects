package week5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public SwingControlDemo(){
        prepareGUI();
    }
    public static void main(String[] args){
        SwingControlDemo  swingControlDemo = new SwingControlDemo();
        swingControlDemo.showScrollbarDemo();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Java Swing Examples");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    private void showScrollbarDemo() {
        headerLabel.setText("Control in action: JScrollbar");

        final JScrollBar horizontalScroller = new JScrollBar(JScrollBar.HORIZONTAL);
        final JScrollBar verticalScroller = new JScrollBar();
        verticalScroller.setOrientation(JScrollBar.VERTICAL);
        horizontalScroller.setMaximum (100);
        horizontalScroller.setMinimum (1);
        verticalScroller.setMaximum (100);
        verticalScroller.setMinimum (1);

        horizontalScroller.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                statusLabel.setText("Horozontal: "
                        +horizontalScroller.getValue()
                        +" ,Vertical: "
                        + verticalScroller.getValue());
            }
        });
        verticalScroller.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                statusLabel.setText("Horozontal: "
                        +horizontalScroller.getValue()
                        +" ,Vertical: "+ verticalScroller.getValue());
            }
        });
        controlPanel.add(horizontalScroller);
        controlPanel.add(verticalScroller);

        mainFrame.setVisible(true);
    }
}