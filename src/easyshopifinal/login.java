package easyshopifinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN / SIGNUP");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(131, 31, 310, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(46, 159, 131, 31);
		contentPane.add(lblNewLabel_1);
		
		user = new JTextField();
		user.setBounds(219, 161, 218, 31);
		contentPane.add(user);
		user.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(46, 228, 131, 31);
		contentPane.add(lblNewLabel_2);
		
		pass = new JPasswordField();
		pass.setBounds(219, 230, 218, 31);
		contentPane.add(pass);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String u=user.getText();
				
				
				
					JOptionPane.showMessageDialog(null,"WELCOME  " +u+"  YOU HAVE LOGGED IN SUCCESFULLY !");
					main m=new main();
					m.setVisible(true);
				
					
					
				
				
				
				
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(255, 286, 104, 31);
		contentPane.add(btnNewButton);
		
		JButton btnSignup = new JButton("SIGNUP");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				signup s=new signup();
				s.setVisible(true);
			}
		});
		btnSignup.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignup.setBounds(255, 344, 104, 31);
		contentPane.add(btnSignup);
		
		JLabel label = new JLabel("");
		label.setBounds(499, 94, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\shop.jpg"));
		label_1.setBounds(449, 105, 258, 227);
		contentPane.add(label_1);
		
		JLabel lblIfYouAre = new JLabel("IF YOU ARE ALREADY A MEMBER ?.........");
		lblIfYouAre.setForeground(new Color(255, 0, 0));
		lblIfYouAre.setBounds(26, 296, 203, 14);
		contentPane.add(lblIfYouAre);
		
		JLabel lblIfYouAre_1 = new JLabel("IF YOU ARE NEW ?.........");
		lblIfYouAre_1.setForeground(Color.RED);
		lblIfYouAre_1.setBounds(98, 354, 131, 14);
		contentPane.add(lblIfYouAre_1);
	}
}
