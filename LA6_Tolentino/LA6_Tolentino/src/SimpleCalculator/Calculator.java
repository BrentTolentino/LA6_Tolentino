package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JPanel pMain;
    private JButton btnCompute;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JTextField textField3;
    private JLabel lblResult;

    Calculator(){
        setTitle("Simple Calculator");
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(tfNumber1.getText());
                int b = Integer.parseInt(tfNumber2.getText());
                switch (cbOperations.getSelectedIndex()){
                    case 0: //*
                        textField3.setText(Integer.toString(a * b));
                        break;
                    case 1: //-
                        textField3.setText(Integer.toString(a - b));
                        break;
                    case 2: //+
                        textField3.setText(Integer.toString(a + b));
                        break;
                    case 3: //
                        textField3.setText(Integer.toString(a / b));
                        break;
                }
            }
        });
    }
    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setContentPane(app.pMain);
        app.setSize(600,300);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
