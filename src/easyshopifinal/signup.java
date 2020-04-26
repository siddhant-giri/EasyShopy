package easyshopifinal;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class signup extends JFrame {

	private JPanel contentPane;
	private JTextField name1;
	private JTextField user;
	private JTextField ans;
	private JPasswordField password1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
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
	public signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 9));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewAccount = new JLabel("NEW ACCOUNT");
		lblNewAccount.setBackground(new Color(255, 255, 255));
		lblNewAccount.setForeground(new Color(0, 0, 0));
		lblNewAccount.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewAccount.setBounds(301, 26, 388, 45);
		contentPane.add(lblNewAccount);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Engravers MT", Font.BOLD, 14));
		lblNewLabel.setBounds(397, 148, 102, 23);
		contentPane.add(lblNewLabel);
		
		JButton jcreate = new JButton("CREATE");
		jcreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			main m=new main();
			m.setVisible(true);
				
				JOptionPane.showMessageDialog(null,"you have succesfully created your account !");
				name1.setText(null);
				user.setText(null);
				password1.setText(null);
				ans.setText(null);  			
				
			}
		});
		jcreate.setFont(new Font("Tahoma", Font.BOLD, 15));
		jcreate.setBounds(442, 356, 109, 23);
		contentPane.add(jcreate);
		
		JButton back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				main m=new main();
				m.setVisible(true);
				
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 15));
		back.setBounds(587, 356, 102, 23);
		contentPane.add(back);
		
		name1 = new JTextField();
		name1.setBounds(525, 82, 164, 29);
		contentPane.add(name1);
		name1.setColumns(10);
		
		user = new JTextField();
		user.setBounds(525, 148, 164, 24);
		contentPane.add(user);
		user.setColumns(10);
		
		JList list = new JList();
		list.setBounds(196, 276, 51, -26);
		contentPane.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Your favourite Car?", "Your favourite Book?", "Your favourite Food?", "Your favourite Song?", "Your Pet Name?"}));
		comboBox.setBounds(525, 240, 164, 26);
		contentPane.add(comboBox);
		
		ans = new JTextField();
		ans.setColumns(10);
		ans.setBounds(525, 293, 164, 26);
		contentPane.add(ans);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(new Color(255, 0, 0));
		lblUserName.setFont(new Font("Engravers MT", Font.BOLD, 14));
		lblUserName.setBounds(378, 82, 126, 23);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 0, 0));
		lblPassword.setFont(new Font("Engravers MT", Font.BOLD, 14));
		lblPassword.setBounds(365, 200, 139, 23);
		contentPane.add(lblPassword);
		
		JLabel lblSecurityQuestion = new JLabel("Security Question");
		lblSecurityQuestion.setForeground(new Color(255, 0, 0));
		lblSecurityQuestion.setFont(new Font("Engravers MT", Font.BOLD, 11));
		lblSecurityQuestion.setBounds(316, 242, 196, 23);
		contentPane.add(lblSecurityQuestion);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer.setForeground(new Color(255, 0, 0));
		lblAnswer.setFont(new Font("Engravers MT", Font.BOLD, 12));
		lblAnswer.setBounds(344, 294, 164, 23);
		contentPane.add(lblAnswer);
		
		password1 = new JPasswordField();
		password1.setBounds(525, 201, 164, 23);
		contentPane.add(password1);
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(0, 51, 102));
		label.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\IMG_20180913_094921.jpg"));
		label.setBounds(0, 0, 707, 405);
		contentPane.add(label);
	}
}
