package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame{
    private JButton checkYearButton;
    private JPanel pMain;
    private JTextField yearTextField;

    LeapYear(){
        setTitle("Leap Year Checker");
        yearTextField.setText("");
        final boolean[] leapYear = {false};
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(yearTextField.getText());
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        leapYear[0] = year % 400 == 0;
                    }
                    else
                        leapYear[0] = true;
                }
                else
                    leapYear[0] = false;
                if(leapYear[0]){
                    JOptionPane.showMessageDialog(null, "Leap year");
                } else {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });
    }
    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setContentPane(app.pMain);
        app.setSize(300,200);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
