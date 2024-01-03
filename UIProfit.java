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

public class UIProfit extends JFrame {

        //declare variables 
    private JPanel contentPane;
    private JTextField textFieldCost;
    private JTextField textFieldSellingPrice;
    private JTextField textFieldProfit;
    private JTextField textFieldWebFee;
    private JTextField textFieldShippingFee;
    
    //constructor
    public UIProfit(double actualCost, double sellingPrice, double webFee, double shippingFee) {
        
        setTitle("Profit Calculator [Profit]");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        
        JLabel lblActualCost = new JLabel("ACTUAL COST");
        lblActualCost.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblActualCost.setBounds(69, 125, 219, 41);
        contentPane.add(lblActualCost);
        
        textFieldCost = new JTextField();
        textFieldCost.setEditable(false);
        textFieldCost.setText("0");
        textFieldCost.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldCost.setBounds(385, 116, 204, 59);
        contentPane.add(textFieldCost);
        textFieldCost.setColumns(10);
        
        textFieldSellingPrice = new JTextField();
        textFieldSellingPrice.setEditable(false);
        textFieldSellingPrice.setText("0");
        textFieldSellingPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldSellingPrice.setColumns(10);
        textFieldSellingPrice.setBounds(385, 186, 204, 59);
        contentPane.add(textFieldSellingPrice);
        
        JLabel lblSellingPrice = new JLabel("SELLING PRICE");
        lblSellingPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSellingPrice.setBounds(69, 195, 249, 41);
        contentPane.add(lblSellingPrice);
        
        JButton btnNext = new JButton("CLOSE");
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
                
            }
        });
        btnNext.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNext.setBounds(466, 505, 123, 59);
        contentPane.add(btnNext);
        
        JLabel lblProfit = new JLabel("PROFIT ($)");
        lblProfit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblProfit.setBounds(69, 427, 249, 41);
        contentPane.add(lblProfit);
        
        textFieldProfit = new JTextField();
        textFieldProfit.setEditable(false);
        textFieldProfit.setText("0");
        textFieldProfit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldProfit.setColumns(10);
        textFieldProfit.setBounds(385, 418, 204, 59);
        contentPane.add(textFieldProfit);
        
        textFieldWebFee = new JTextField();
        textFieldWebFee.setEditable(false);
        textFieldWebFee.setText("0");
        textFieldWebFee.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldWebFee.setColumns(10);
        textFieldWebFee.setBounds(385, 256, 204, 59);
        contentPane.add(textFieldWebFee);
        
        JLabel lblWebsiteFee = new JLabel("WEBSITE FEE  ($)");
        lblWebsiteFee.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblWebsiteFee.setBounds(69, 265, 249, 41);
        contentPane.add(lblWebsiteFee);
        
        JLabel lblSeparater = new JLabel("_________________________________________");
        lblSeparater.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSeparater.setBounds(93, 366, 484, 41);
        contentPane.add(lblSeparater);
        
        textFieldShippingFee = new JTextField();
        textFieldShippingFee.setText("0");
        textFieldShippingFee.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldShippingFee.setEditable(false);
        textFieldShippingFee.setColumns(10);
        textFieldShippingFee.setBounds(385, 326, 204, 59);
        contentPane.add(textFieldShippingFee);
        
        JLabel lblShippingFee = new JLabel("SHIPPING FEE  ($)");
        lblShippingFee.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblShippingFee.setBounds(69, 330, 249, 41);
        contentPane.add(lblShippingFee);
            
        //calculate profit
        double profit = sellingPrice-actualCost-webFee-shippingFee;
        
        profit = Math.round(profit * 100.0) / 100.0;
        
        textFieldShippingFee.setText(shippingFee+"");
        textFieldCost.setText(actualCost+"");
        textFieldSellingPrice.setText(sellingPrice+"");
        textFieldWebFee.setText(webFee+"");
        textFieldProfit.setText(profit+"");
        
    }

}
