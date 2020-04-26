package easyshopifinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class intro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					intro frame = new intro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public intro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 444);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 0, 204));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEasyShopi = new JLabel("STYLOX  KART");
		lblEasyShopi.setForeground(Color.DARK_GRAY);
		lblEasyShopi.setBackground(Color.YELLOW);
		lblEasyShopi.setHorizontalAlignment(SwingConstants.CENTER);
		lblEasyShopi.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 20));
		lblEasyShopi.setBounds(222, -22, 348, 106);
		contentPane.add(lblEasyShopi);
		
		JLabel lblIntro = new JLabel("WHAT WE DO?");
		lblIntro.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		lblIntro.setBounds(22, 96, 178, 34);
		contentPane.add(lblIntro);
		
		JLabel lblWeCompareAll = new JLabel("WE COMPARE ALL THE FAMOUS E-COMMERCE WEBSITES AND GIVES YOU THE BEST DISCOUNT AND RATES OF YOUR PRODUCTS.");
		lblWeCompareAll.setForeground(Color.RED);
		lblWeCompareAll.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblWeCompareAll.setVerticalAlignment(SwingConstants.TOP);
		lblWeCompareAll.setBounds(12, 166, 705, 43);
		contentPane.add(lblWeCompareAll);
		
		JLabel lblEnjoyYourShopping = new JLabel("ENJOY YOUR SHOPPING EXPERIENCE WITH EASY-SHOPY.");
		lblEnjoyYourShopping.setForeground(Color.RED);
		lblEnjoyYourShopping.setBackground(Color.WHITE);
		lblEnjoyYourShopping.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblEnjoyYourShopping.setBounds(22, 195, 584, 61);
		contentPane.add(lblEnjoyYourShopping);
		
		JButton btnContinueShopping = new JButton("START SHOPPING");
		btnContinueShopping.setBackground(new Color(255, 255, 102));
		btnContinueShopping.setForeground(new Color(51, 51, 255));
		btnContinueShopping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login l=new login();
				l.setVisible(true);
			}
		});
		btnContinueShopping.setFont(new Font("Showcard Gothic", Font.BOLD, 15));
		btnContinueShopping.setBounds(266, 281, 212, 53);
		contentPane.add(btnContinueShopping);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\cameff_1538811838596.png"));
		lblNewLabel.setBounds(0, 0, 717, 405);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(156, 195, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(89, 209, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setBounds(106, 209, 46, 14);
		contentPane.add(label);
	}
}
