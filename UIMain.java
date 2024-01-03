import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//Main class
public class UIMain extends JFrame {
        //declare variables 
    private JPanel contentPane;
    private JTextField textFieldCost;
    private JTextField textFieldSellingPrice;
    
    //constructor
    public UIMain() {
        
        setTitle("Profit Calculator [Price]");
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
        
        JLabel lblActualCost = new JLabel("ACTUAL COST");
        lblActualCost.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblActualCost.setBounds(175, 125, 219, 41);
        contentPane.add(lblActualCost);
        
        textFieldCost = new JTextField();
        textFieldCost.setText("0");
        textFieldCost.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldCost.setBounds(175, 177, 286, 59);
        contentPane.add(textFieldCost);
        textFieldCost.setColumns(10);
        
        textFieldSellingPrice = new JTextField();
        textFieldSellingPrice.setText("0");
        textFieldSellingPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldSellingPrice.setColumns(10);
        textFieldSellingPrice.setBounds(175, 301, 286, 59);
        contentPane.add(textFieldSellingPrice);
        
        JLabel lblSellingPrice = new JLabel("SELLING PRICE");
        lblSellingPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSellingPrice.setBounds(175, 257, 249, 41);
        contentPane.add(lblSellingPrice);
        
        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double actualCost = Double.parseDouble(textFieldCost.getText());
                double sellingPrice = Double.parseDouble(textFieldSellingPrice.getText());
                
                UIWebsite frame = new UIWebsite(actualCost, sellingPrice);
                frame.setVisible(true);
                
                dispose();
                
            }
        });
        btnNext.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNext.setBounds(492, 505, 123, 59);
        contentPane.add(btnNext);
        
        setVisible(true);
    
    }
}
