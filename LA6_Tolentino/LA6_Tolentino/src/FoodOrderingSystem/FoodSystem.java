package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodSystem extends JFrame {

    private JPanel pMain;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JCheckBox[] ch = {cPizza,cBurger,cFries,cSoftDrinks,cTea,cSundae};
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    FoodSystem(){
        setTitle("Food Ordering System");
        final float[] amount = {0};
        final float[] total = {0};
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(cPizza.isSelected()){
                        amount[0] +=100;
                    } if(cBurger.isSelected()){
                        amount[0] +=80;
                    } if(cFries.isSelected()){
                        amount[0] +=65;
                    } if(cSoftDrinks.isSelected()){
                        amount[0] +=55;
                    } if(cTea.isSelected()){
                        amount[0] +=50;
                    } if(cSundae.isSelected()){
                        amount[0] +=40;
                    }

                if(rb5.isSelected()){
                    total[0] = amount[0] - (amount[0] *= 0.05F);
                    JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", total[0]));
                    amount[0] = 0;
                } else if(rb10.isSelected()){
                    total[0] = amount[0] - (amount[0] *= 0.10F);
                    JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", total[0]));
                    amount[0] = 0;
                } else if(rb15.isSelected()){
                    total[0] = amount[0] - (amount[0] *= 0.15F);
                    JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", total[0]));
                    amount[0] = 0;
                } else if(rbNone.isSelected()){
                    total[0] = amount[0];
                    JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", total[0]));
                    amount[0] = 0;
                } else {
                    JOptionPane.showMessageDialog(null, "Choose Discount");
                }
            }
        });
    }

    public static void main(String[] args) {
        FoodSystem app = new FoodSystem();
        app.setContentPane(app.pMain);
        app.setSize(700,500);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
