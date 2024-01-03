import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UIShipping extends JFrame {

        //declare variables 
    private JPanel contentPane;
    private JTextField textFieldShippingCost;
    
    //constructor
    public UIShipping(double actualCost, double sellingPrice, double webFee) {
        setTitle("Profit Calculator [Shipping]");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 684, 638);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblTitle = new JLabel("PROFIT CALCULATOR");
        lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 26));
        lblTitle.setBounds(175, 31, 266, 41);
        contentPane.add(lblTitle);
        
        JLabel lblShippingCost = new JLabel("SHIPPING COST");
        lblShippingCost.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblShippingCost.setBounds(166, 226, 219, 41);
        contentPane.add(lblShippingCost);
        
        textFieldShippingCost = new JTextField();
        textFieldShippingCost.setText("0");
        textFieldShippingCost.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldShippingCost.setBounds(166, 278, 286, 59);
        contentPane.add(textFieldShippingCost);
        textFieldShippingCost.setColumns(10);
        
        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double shippingCost = Double.parseDouble(textFieldShippingCost.getText());
                
                UIProfit frame = new UIProfit(actualCost, sellingPrice,webFee,shippingCost);
                frame.setVisible(true);
                
                dispose();
                
            }
        });
        btnNext.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNext.setBounds(492, 505, 123, 59);
        contentPane.add(btnNext);
    
    }

}
