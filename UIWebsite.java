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
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class UIWebsite extends JFrame {
    
        //declare variables 
    private JPanel contentPane;
    private JTextField textFieldFee;
    private double webFee = 0;
    
    //constructor
    public UIWebsite(double actualCost, double sellingPrice) {
        
        ButtonGroup buttonGroup = new ButtonGroup();
        
        setTitle("Profit Calculator [Website]");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 684, 638);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblTitle = new JLabel("PROFIT CALCULATOR");
        lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 26));
        lblTitle.setBounds(196, 31, 266, 41);
        contentPane.add(lblTitle);
        
        JLabel lblSelectWebsite = new JLabel("SELECT WEBSITE");
        lblSelectWebsite.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSelectWebsite.setBounds(57, 94, 164, 41);
        contentPane.add(lblSelectWebsite);
        
        textFieldFee = new JTextField();
        textFieldFee.setText("0");
        textFieldFee.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldFee.setColumns(10);
        textFieldFee.setBounds(360, 414, 255, 66);
        contentPane.add(textFieldFee);
        
        JLabel lblFee = new JLabel("FEE ($)");
        lblFee.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblFee.setBounds(360, 365, 144, 41);
        contentPane.add(lblFee);
        
        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                UIShipping frame = new UIShipping(actualCost, sellingPrice,webFee);
                frame.setVisible(true);
                
                dispose();
                
            }
        });
        btnNext.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNext.setBounds(492, 505, 123, 59);
        contentPane.add(btnNext);
        
        JToggleButton btnEbay = new JToggleButton("");
        btnEbay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                webFee = sellingPrice * 0.1 + sellingPrice * 0.029;
                
                webFee = Math.round(webFee * 100.0) / 100.0;
                
                textFieldFee.setText(webFee+"");
            }
        });
        btnEbay.setBackground(Color.WHITE);
        btnEbay.setIcon(new ImageIcon(UIWebsite.class.getResource("/images/ebay_.png")));
        btnEbay.setBounds(57, 142, 187, 66);
        contentPane.add(btnEbay);
        
        JToggleButton btnGoat = new JToggleButton("G O A T");
        btnGoat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                webFee =  sellingPrice * 0.095 + 0.30;
                webFee = Math.round(webFee * 100.0) / 100.0;
                textFieldFee.setText(webFee+"");
            }
        });
        btnGoat.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 24));
        btnGoat.setBackground(Color.WHITE);
        btnGoat.setBounds(57, 219, 187, 66);
        contentPane.add(btnGoat);
        
        JToggleButton btnStockx = new JToggleButton("");
        btnStockx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                webFee = sellingPrice * 0.1;
                webFee = Math.round(webFee * 100.0) / 100.0;
                textFieldFee.setText(webFee+"");
            }
        });
        btnStockx.setIcon(new ImageIcon(UIWebsite.class.getResource("/images/_stockx.png")));
        btnStockx.setBackground(Color.WHITE);
        btnStockx.setBounds(57, 296, 187, 66);
        contentPane.add(btnStockx);
        
        JToggleButton btnOther = new JToggleButton("Other...");
        btnOther.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                webFee = Double.parseDouble(textFieldFee.getText());
                
            }
        });
        btnOther.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 24));
        btnOther.setBackground(Color.WHITE);
        btnOther.setBounds(57, 416, 187, 63);
        contentPane.add(btnOther);
        
        JLabel lblEbayFee = new JLabel("Selling Price - 10% - 2.9%");
        lblEbayFee.setHorizontalAlignment(SwingConstants.LEFT);
        lblEbayFee.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEbayFee.setBounds(360, 156, 255, 41);
        contentPane.add(lblEbayFee);
        
        JLabel lblGoatFee = new JLabel("Selling Price - 9.5% - $0.30");
        lblGoatFee.setHorizontalAlignment(SwingConstants.LEFT);
        lblGoatFee.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblGoatFee.setBounds(360, 231, 255, 41);
        contentPane.add(lblGoatFee);
        
        JLabel lblStockxFee = new JLabel("Selling Price - 10%");
        lblStockxFee.setHorizontalAlignment(SwingConstants.LEFT);
        lblStockxFee.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblStockxFee.setBounds(360, 313, 255, 41);
        contentPane.add(lblStockxFee);

        buttonGroup.add(btnEbay);
        buttonGroup.add(btnGoat);
        buttonGroup.add(btnStockx);
        buttonGroup.add(btnOther);
        
        
    }
}
