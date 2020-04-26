package easyshopifinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class main extends JFrame {

	private JPanel contentPane;
	private JTextField jname;
	private JTextField jno;
	private JTextField jtime;
	private JTextField jdate;
	private JTextField atotal;
	private JTextField atax;
	private JTextField anet;
	private JTextField aprice;
	private JTextField foodq1;
	private JTextField foodp1;
	private JTextField foodt1;
	private JTextField foodq2;
	private JTextField foodq3;
	private JTextField foodq4;
	private JTextField foodq5;
	private JTextField foodp2;
	private JTextField foodp3;
	private JTextField foodp4;
	private JTextField foodp5;
	private JTextField foodt2;
	private JTextField foodt3;
	private JTextField foodt4;
	private JTextField foodt5;
	private JTextField clothq1;
	private JTextField clothp1;
	private JTextField clothq2;
	private JTextField clothq3;
	private JTextField clothq4;
	private JTextField clothq5;
	private JTextField clothp2;
	private JTextField clothp3;
	private JTextField clothp4;
	private JTextField clothp5;
	private JTextField clotht2;
	private JTextField clotht3;
	private JTextField clotht4;
	private JTextField clotht5;
	private JTextField gadq1;
	private JTextField gadp1;
	private JTextField gadt1;
	private JTextField gadq2;
	private JTextField gadq3;
	private JTextField gadq4;
	private JTextField gadq5;
	private JTextField gadp2;
	private JTextField gadp3;
	private JTextField gadp4;
	private JTextField gadp5;
	private JTextField gadt2;
	private JTextField gadt3;
	private JTextField gadt4;
	private JTextField gadt5;
	private JTextField cosmq1;
	private JTextField cosmp1;
	private JTextField cosmt1;
	private JTextField cosmq2;
	private JTextField cosmq3;
	private JTextField cosmq4;
	private JTextField cosmq5;
	private JTextField cosmp2;
	private JTextField cosmp3;
	private JTextField cosmp4;
	private JTextField cosmp5;
	private JTextField cosmt2;
	private JTextField cosmt3;
	private JTextField cosmt4;
	private JTextField cosmt5;
	private JTextField ftotal;
	private JTextField ftax;
	private JTextField fnet;
	private JTextField fprice;
	private JTextField etotal;
	private JTextField etax;
	private JTextField enet;
	private JTextField eprice;
	private JTextField clotht1;
	
	double wheat = 90 ;
	double rice = 80;
	double dal = 60;
	double vegpack = 200;
	double nonvegpack = 500;
	double shirts = 410;
	double tshirts = 350;
	double kurtas = 650;
	double jeans = 560;
	double sarees = 6000;
	double mobile = 8000;
	double laptops = 30000;
	double tablets = 12000;
	double earphones = 1500;
	double speakers = 6000;
	double creams = 954;
	double lotion = 865;
	double perfumes = 200;
	double deodrants = 250;
	double lipsticks = 59;
	double amtax = 2.5;
	double fltax = 3.0;
	double ebtax=3.5;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		setTitle("EASY-SHOPY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1447, 784);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_3.setBounds(28, 11, 1318, 153);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblEasyshopi = new JLabel("EASY-SHOPI");
		lblEasyshopi.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEasyshopi.setHorizontalAlignment(SwingConstants.CENTER);
		lblEasyshopi.setBounds(416, 11, 273, 22);
		panel_3.add(lblEasyshopi);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(76, 65, 46, 14);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PHONE NO.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(65, 112, 97, 14);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ORDER TIME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(722, 68, 97, 14);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ORDER DATE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(722, 112, 97, 14);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddress.setBounds(331, 61, 60, 22);
		panel_3.add(lblAddress);
		
		jname = new JTextField();
		jname.setBounds(150, 62, 86, 20);
		panel_3.add(jname);
		jname.setColumns(10);
		
		jno = new JTextField();
		jno.setBounds(150, 109, 86, 20);
		panel_3.add(jno);
		jno.setColumns(10);
		
		final JTextPane jadd = new JTextPane();
		jadd.setBounds(416, 68, 207, 58);
		panel_3.add(jadd);
		
		jtime = new JTextField();
		jtime.setBounds(858, 65, 86, 20);
		panel_3.add(jtime);
		jtime.setColumns(10);
		
		jdate = new JTextField();
		jdate.setColumns(10);
		jdate.setBounds(858, 109, 86, 20);
		panel_3.add(jdate);
		
		JLabel lblDeliveryDetails = new JLabel("DELIVERY DETAILS");
		lblDeliveryDetails.setBounds(29, 16, 133, 14);
		panel_3.add(lblDeliveryDetails);
		
		JButton btnSignIn = new JButton("CREATE ACCOUNT");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				signup s=new signup();
				s.setVisible(true);
			}
		});
		btnSignIn.setBounds(1146, 108, 148, 23);
		panel_3.add(btnSignIn);
		
		JLabel lblIfYouAre = new JLabel("IF YOU ARE NEW ?");
		lblIfYouAre.setBounds(1010, 112, 126, 14);
		panel_3.add(lblIfYouAre);
		
		JLabel lblAlreadyHaveAccount = new JLabel("ALREADY HAVE ACCOUNT ?");
		lblAlreadyHaveAccount.setBounds(979, 65, 164, 14);
		panel_3.add(lblAlreadyHaveAccount);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				login l=new login();
				l.setVisible(true);
			}
		});
		btnNewButton.setBounds(1146, 61, 148, 23);
		panel_3.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBounds(28, 452, 256, 238);
		contentPane.add(panel);
		
		JLabel lblOrderTotal = new JLabel("ORDER TOTAL");
		lblOrderTotal.setBounds(10, 91, 96, 14);
		panel.add(lblOrderTotal);
		
		JLabel lblTaxPaid = new JLabel("TAX PAID");
		lblTaxPaid.setBounds(10, 141, 63, 21);
		panel.add(lblTaxPaid);
		
		JLabel lblNetPrice = new JLabel("NET PRICE");
		lblNetPrice.setBounds(10, 173, 79, 14);
		panel.add(lblNetPrice);
		
		atotal = new JTextField();
		atotal.setColumns(10);
		atotal.setBounds(128, 88, 86, 20);
		panel.add(atotal);
		
		atax = new JTextField();
		atax.setColumns(10);
		atax.setBounds(128, 142, 86, 20);
		panel.add(atax);
		
		anet = new JTextField();
		anet.setColumns(10);
		anet.setBounds(128, 170, 86, 20);
		panel.add(anet);
		
		JButton amam = new JButton("BUY FROM AMAZON");
		amam.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				jtime.setText(tTime.format(timer.getTime()));
				
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
				jdate.setText(Tdate.format(timer.getTime()));
				
				
			}
		});
		amam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				double qt1=Double.parseDouble(foodq1.getText());
				double qt2=Double.parseDouble(foodq2.getText());
				double qt3=Double.parseDouble(foodq3.getText());
				double qt4=Double.parseDouble(foodq4.getText());
				double qt5=Double.parseDouble(foodq5.getText());
				double qt6=Double.parseDouble(clothq1.getText());
				double qt7=Double.parseDouble(clothq2.getText());
				double qt8=Double.parseDouble(clothq3.getText());
				double qt9=Double.parseDouble(clothq4.getText());
				double qt10=Double.parseDouble(clothq5.getText());
				double qt11=Double.parseDouble(gadq1.getText());
				double qt12=Double.parseDouble(gadq2.getText());
				double qt13=Double.parseDouble(gadq3.getText());
				double qt14=Double.parseDouble(gadq4.getText());
				double qt15=Double.parseDouble(gadq5.getText());
				double qt16=Double.parseDouble(cosmq1.getText());
				double qt17=Double.parseDouble(cosmq2.getText());
				double qt18=Double.parseDouble(cosmq3.getText());
				double qt19=Double.parseDouble(cosmq4.getText());
				double qt20=Double.parseDouble(cosmq5.getText());
				
				
				String wheat_w = String.format("Rs%.2f", wheat);
				foodp1.setText(wheat_w);
				String rice_r = String.format("Rs%.2f", rice);
				foodp2.setText(rice_r);
				String dal_d = String.format("Rs%.2f", dal);
				foodp3.setText(dal_d);
				String veg_v = String.format("Rs%.2f", vegpack);
				foodp4.setText(veg_v);
				String nonveg_n = String.format("Rs%.2f", nonvegpack);
				foodp5.setText(nonveg_n);
				
				String shirt_s = String.format("Rs%.2f", shirts);
				clothp1.setText(shirt_s);
				String t_shirt = String.format("Rs%.2f", tshirts);
				clothp2.setText(t_shirt);
				String kurta_s = String.format("Rs%.2f", kurtas);
				clothp3.setText(kurta_s);
				String jean_s = String.format("Rs%.2f", jeans);
				clothp4.setText(jean_s);
				String saree_s = String.format("Rs%.2f", sarees);
				clothp5.setText(saree_s);
				
				String mobile_s = String.format("Rs%.2f", mobile);
				gadp1.setText(mobile_s);
				String laptop_s = String.format("Rs%.2f", laptops);
				gadp2.setText(laptop_s);
				String tablet_s = String.format("Rs%.2f", tablets);
				gadp3.setText(tablet_s);
				String earphone_s = String.format("Rs%.2f", earphones);
				gadp4.setText(earphone_s);
				String speaker_s = String.format("Rs%.2f", speakers);
				gadp5.setText(speaker_s);
				
				String cream_s = String.format("Rs%.2f", creams);
				cosmp1.setText(cream_s);
				String lotion_s = String.format("Rs%.2f", lotion);
				cosmp2.setText(lotion_s);
				String perfume_s = String.format("Rs%.2f", perfumes);
				cosmp3.setText(perfume_s);
				String deodrant_s = String.format("Rs%.2f", deodrants );
				cosmp4.setText(deodrant_s);
				String lipstick_s = String.format("Rs%.2f", lipsticks );
				cosmp5.setText(lipstick_s);
				
				double purchase1=qt1*wheat;
				double purchase2=qt2*rice;
				double purchase3=qt3*dal;
				double purchase4=qt4*vegpack;
				double purchase5=qt5*nonvegpack;
				double purchase6=qt6*shirts;
				double purchase7=qt7*tshirts;
				double purchase8=qt8*kurtas;
				double purchase9=qt9*jeans;
				double purchase10=qt10*sarees;
				double purchase11=qt11*mobile;
				double purchase12=qt12*laptops;
				double purchase13=qt13*tablets;
				double purchase14=qt14*earphones;
				double purchase15=qt15*speakers;
				double purchase16=qt16*creams;
				double purchase17=qt17*lotion;
				double purchase18=qt18*perfumes;
				double purchase19=qt19*deodrants;
				double purchase20=qt20*lipsticks;
				
				
				String sub1 = String.format("Rs%.2f", purchase1);
				foodt1.setText(sub1);
				String sub2 = String.format("Rs%.2f", purchase2);
				foodt2.setText(sub2);
				String sub3 = String.format("Rs%.2f", purchase3);
				foodt3.setText(sub3);
				String sub4 = String.format("Rs%.2f", purchase4);
				foodt4.setText(sub4);
				String sub5 = String.format("Rs%.2f", purchase5);
				foodt5.setText(sub5);
				
				String sub6 = String.format("Rs%.2f", purchase6);
				clotht1.setText(sub6);
				String sub7 = String.format("Rs%.2f", purchase7);
				clotht2.setText(sub7);
				String sub8 = String.format("Rs%.2f", purchase8);
				clotht3.setText(sub8);
				String sub9 = String.format("Rs%.2f", purchase9);
				clotht4.setText(sub9);
				String sub10 = String.format("Rs%.2f", purchase10);
				clotht5.setText(sub10);
				
				String sub11 = String.format("Rs%.2f", purchase11);
				gadt1.setText(sub11);
				String sub12 = String.format("Rs%.2f", purchase12);
				gadt2.setText(sub12);
				String sub13 = String.format("Rs%.2f", purchase13);
				gadt3.setText(sub13);
				String sub14 = String.format("Rs%.2f", purchase14);
				gadt4.setText(sub14);
				String sub15 = String.format("Rs%.2f", purchase15);
				gadt5.setText(sub15);
				
				String sub16 = String.format("Rs%.2f", purchase16);
				cosmt1.setText(sub16);
				String sub17 = String.format("Rs%.2f", purchase17);
				cosmt2.setText(sub17);
				String sub18 = String.format("Rs%.2f", purchase18);
				cosmt3.setText(sub18);
				String sub19 = String.format("Rs%.2f", purchase19);
				cosmt4.setText(sub19);
				String sub20 = String.format("Rs%.2f", purchase20);
				cosmt5.setText(sub20);
				
				//=============tax==========================
				
				double subtotal=purchase1+purchase2+purchase3+purchase4+purchase5+purchase6+purchase7+purchase8+purchase9+purchase10+purchase11+purchase12+purchase13+purchase14+purchase15+purchase16+purchase17+purchase18+purchase19+purchase20;
				double vtax=(subtotal*amtax)/100;
				
				String subTax = String.format("Rs%.2f", vtax);
				atax.setText(subTax);
				
				
				//============total=================
				
				String subtol = String.format("Rs%.2f", subtotal);
				atotal.setText(subtol);
				
				//=============amazon total=====================
				
			     double arate=(subtotal*50/100)+vtax;
			     
			     String amazon = String.format("Rs%.2f", arate);
			     aprice.setText(amazon);
			     
			     //=============net worth====================
			     
			 	double addup=subtotal*50/100+vtax;
				String totall = String.format("Rs%.2f", addup);
				anet.setText(totall);
				
				
				
				
				
				
				
				
				
				
				
				
				//==========date n time======================
				
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				jtime.setText(tTime.format(timer.getTime()));
				
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
				jdate.setText(Tdate.format(timer.getTime()));
				
				
				//===========bought=================
				String ama=aprice.getText();
				
				JOptionPane.showMessageDialog(null,"YOU HAVE SUCCESSFULLY BOUGHT YOUR PRODUCT FROM AMAZON ! \n YOUR TOTAL COST IS "+ama);
				
			}
		});
		amam.setBounds(54, 198, 160, 29);
		panel.add(amam);
		
		aprice = new JTextField();
		aprice.setColumns(10);
		aprice.setBounds(128, 113, 86, 20);
		panel.add(aprice);
		
		JLabel lblAmazonPrice = new JLabel("AMAZON PRICE");
		lblAmazonPrice.setBounds(10, 116, 96, 14);
		panel.add(lblAmazonPrice);
		
		JLabel jamazon = new JLabel("AMAZON MARKET");
		jamazon.setFont(new Font("Tahoma", Font.BOLD, 15));
		jamazon.setBounds(54, 11, 160, 31);
		panel.add(jamazon);
		
		JLabel lblGreatIndianFestival = new JLabel("#GREAT INDIAN FESTIVAL");
		lblGreatIndianFestival.setForeground(new Color(255, 0, 0));
		lblGreatIndianFestival.setBounds(54, 42, 160, 14);
		panel.add(lblGreatIndianFestival);
		
		JLabel lblDiscountOn = new JLabel("50% DISCOUNT ON EVERY PRODUCT");
		lblDiscountOn.setForeground(new Color(255, 51, 0));
		lblDiscountOn.setBounds(21, 67, 213, 14);
		panel.add(lblDiscountOn);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_4.setBounds(837, 452, 509, 238);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		final JTextArea jdisplay = new JTextArea();
		jdisplay.setBounds(21, 51, 458, 126);
		panel_4.add(jdisplay);
		
		JButton button_2 = new JButton("exit");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		button_2.setBounds(274, 190, 89, 29);
		panel_4.add(button_2);
		
		JButton button_4 = new JButton("reset");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jdate.setText(null);
				jtime.setText(null);
				jname.setText(null);
				jno.setText(null);
			    jadd.setText(null);
				foodq1.setText("0");
				foodq2.setText("0");
				foodq3.setText("0");
				foodq4.setText("0");
				foodq5.setText("0");
				foodp1.setText("Rs 90.00");
				foodp2.setText("Rs 80.00");
				foodp3.setText("Rs 60.00");
				foodp4.setText("Rs 200.00");
				foodp5.setText("Rs 500.00");
				foodt1.setText(null);
				foodt2.setText(null);
				foodt3.setText(null);
				foodt4.setText(null);
				foodt5.setText(null);
				clothq1.setText("0");
				clothq2.setText("0");
				clothq3.setText("0");
				clothq4.setText("0");
				clothq5.setText("0");
				clothp1.setText("Rs 410.00");
				clothp2.setText("Rs 350.00");
				clothp3.setText("Rs 650.00");
				clothp4.setText("Rs 560.00");
				clothp5.setText("Rs 6000.00");
				clotht1.setText(null);
				clotht2.setText(null);
				clotht3.setText(null);
				clotht4.setText(null);
				clotht5.setText(null);
				gadq1.setText("0");
				gadq2.setText("0");
				gadq3.setText("0");
				gadq4.setText("0");
				gadq5.setText("0");
				gadp1.setText("Rs 8000.00");
				gadp2.setText("Rs 30000.00");
				gadp3.setText("Rs 12000.00");
				gadp4.setText("Rs 1500.00");
				gadp5.setText("Rs 6000.00");
				gadt1.setText(null);
				gadt2.setText(null);
				gadt3.setText(null);
			    gadt4.setText(null);
				gadt5.setText(null);
				cosmq1.setText("0");
				cosmq2.setText("0");
				cosmq3.setText("0");
				cosmq4.setText("0");
				cosmq5.setText("0");
				cosmp1.setText("Rs 954.00");
				cosmp2.setText("Rs 865.00");
				cosmp3.setText("Rs 200.00");
				cosmp4.setText("Rs 250.00");
				cosmp5.setText("Rs 59.00");
				cosmt1.setText(null);
				cosmt2.setText(null);
				cosmt3.setText(null);
				cosmt4.setText(null);
				cosmt5.setText(null);
				atotal.setText(null);
				aprice.setText(null);
				atax.setText(null);
				anet.setText(null);
				
				ftotal.setText(null);
				fprice.setText(null);
				ftax.setText(null);
				fnet.setText(null);
				
				etotal.setText(null);
				eprice.setText(null);
				etax.setText(null);
				enet.setText(null);
				jdisplay.setText(null);
			}
		});
		button_4.setBounds(98, 190, 66, 29);
		panel_4.add(button_4);
		
		JButton btnDisplay = new JButton("display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				String name=jname.getText();
				String date=jdate.getText();
				String time=jtime.getText();
				String amazon=atotal.getText();
				String flipkart=ftotal.getText();
				String ebay=etotal.getText();
				String delivery=jadd.getText();
				
				
			jdisplay.append("THANKS ****"+name+"**** FOR BUYING YOUR PRODUCT FROM E-SHOPI \n ****YOUR ORDER TIME**** :"+time+"\n ****YOUR ORDER DATE**** :"+date);
			
				
					jdisplay.append(" \n ******YOUR ORDER WILL BE DELIVERED TO YOU IN 5 DAYS AT ******* \n"+delivery+"\n ###### DO VISIT AGAIN ######"); 
			
				
				
				
			}
			
			
		});
		btnDisplay.setBounds(174, 190, 89, 29);
		panel_4.add(btnDisplay);
		
		JLabel lblFinalDelivery = new JLabel("FINAL DELIVERY");
		lblFinalDelivery.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFinalDelivery.setBounds(33, 11, 215, 29);
		panel_4.add(lblFinalDelivery);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_5.setBackground(Color.GRAY);
		panel_5.setBounds(28, 213, 329, 238);
		contentPane.add(panel_5);
		
		JLabel lblFood = new JLabel("FOOD");
		lblFood.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFood.setBounds(10, 36, 81, 31);
		panel_5.add(lblFood);
		
		JLabel lblWheat = new JLabel("WHEAT (1 KG)");
		lblWheat.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWheat.setBounds(10, 78, 92, 14);
		panel_5.add(lblWheat);
		
		foodq1 = new JTextField();
		foodq1.setText("0");
		foodq1.setColumns(10);
		foodq1.setBounds(112, 76, 35, 20);
		panel_5.add(foodq1);
		
		JLabel label_18 = new JLabel("Qty");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_18.setBounds(112, 46, 46, 14);
		panel_5.add(label_18);
		
		JLabel label_19 = new JLabel("Unit Price");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_19.setBounds(157, 46, 57, 14);
		panel_5.add(label_19);
		
		JLabel label_20 = new JLabel("Sub Total");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_20.setBounds(240, 46, 65, 14);
		panel_5.add(label_20);
		
		foodp1 = new JTextField();
		foodp1.setText("Rs 90.00");
		foodp1.setColumns(10);
		foodp1.setBounds(151, 76, 63, 20);
		panel_5.add(foodp1);
		
		foodt1 = new JTextField();
		foodt1.setColumns(10);
		foodt1.setBounds(226, 76, 81, 20);
		panel_5.add(foodt1);
		
		JLabel label_21 = new JLabel("Order processing");
		label_21.setBounds(10, 11, 107, 14);
		panel_5.add(label_21);
		
		JLabel lblRicekg = new JLabel("RICE (1KG)");
		lblRicekg.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRicekg.setBounds(10, 109, 92, 14);
		panel_5.add(lblRicekg);
		
		JLabel lblDalkg = new JLabel("DAL (1KG)");
		lblDalkg.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDalkg.setBounds(10, 140, 92, 14);
		panel_5.add(lblDalkg);
		
		JLabel lblVeggiePack = new JLabel("VEG PACK");
		lblVeggiePack.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVeggiePack.setBounds(10, 171, 92, 14);
		panel_5.add(lblVeggiePack);
		
		JLabel lblNonvegPack = new JLabel("NON-VEG PACK");
		lblNonvegPack.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNonvegPack.setBounds(10, 202, 92, 14);
		panel_5.add(lblNonvegPack);
		
		foodq2 = new JTextField();
		foodq2.setText("0");
		foodq2.setColumns(10);
		foodq2.setBounds(112, 107, 35, 20);
		panel_5.add(foodq2);
		
		foodq3 = new JTextField();
		foodq3.setText("0");
		foodq3.setColumns(10);
		foodq3.setBounds(112, 138, 35, 20);
		panel_5.add(foodq3);
		
		foodq4 = new JTextField();
		foodq4.setText("0");
		foodq4.setColumns(10);
		foodq4.setBounds(112, 169, 35, 20);
		panel_5.add(foodq4);
		
		foodq5 = new JTextField();
		foodq5.setText("0");
		foodq5.setColumns(10);
		foodq5.setBounds(112, 200, 35, 20);
		panel_5.add(foodq5);
		
		foodp2 = new JTextField();
		foodp2.setText("Rs 80.00");
		foodp2.setColumns(10);
		foodp2.setBounds(151, 107, 65, 20);
		panel_5.add(foodp2);
		
		foodp3 = new JTextField();
		foodp3.setText("Rs 60.00");
		foodp3.setColumns(10);
		foodp3.setBounds(151, 138, 65, 20);
		panel_5.add(foodp3);
		
		foodp4 = new JTextField();
		foodp4.setText("Rs 200.00");
		foodp4.setColumns(10);
		foodp4.setBounds(151, 169, 65, 20);
		panel_5.add(foodp4);
		
		foodp5 = new JTextField();
		foodp5.setText("Rs 500.00");
		foodp5.setColumns(10);
		foodp5.setBounds(152, 200, 64, 20);
		panel_5.add(foodp5);
		
		foodt2 = new JTextField();
		foodt2.setColumns(10);
		foodt2.setBounds(226, 107, 81, 20);
		panel_5.add(foodt2);
		
		foodt3 = new JTextField();
		foodt3.setColumns(10);
		foodt3.setBounds(226, 138, 81, 20);
		panel_5.add(foodt3);
		
		foodt4 = new JTextField();
		foodt4.setColumns(10);
		foodt4.setBounds(226, 169, 81, 20);
		panel_5.add(foodt4);
		
		foodt5 = new JTextField();
		foodt5.setColumns(10);
		foodt5.setBounds(226, 200, 81, 20);
		panel_5.add(foodt5);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_9.setBounds(28, 175, 1318, 27);
		contentPane.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("PRODUCTS  AVAILABLE ...!");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 0, 1298, 27);
		panel_9.add(lblNewLabel_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_6.setBackground(Color.GRAY);
		panel_6.setBounds(360, 213, 329, 238);
		contentPane.add(panel_6);
		
		JLabel lblClothing = new JLabel("CLOTHING");
		lblClothing.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClothing.setBounds(10, 36, 81, 31);
		panel_6.add(lblClothing);
		
		JLabel lblShirts = new JLabel("SHIRTS");
		lblShirts.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblShirts.setBounds(10, 78, 92, 14);
		panel_6.add(lblShirts);
		
		clothq1 = new JTextField();
		clothq1.setText("0");
		clothq1.setColumns(10);
		clothq1.setBounds(112, 76, 35, 20);
		panel_6.add(clothq1);
		
		JLabel label_24 = new JLabel("Qty");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_24.setBounds(112, 46, 46, 14);
		panel_6.add(label_24);
		
		JLabel label_25 = new JLabel("Unit Price");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_25.setBounds(157, 46, 57, 14);
		panel_6.add(label_25);
		
		JLabel label_26 = new JLabel("Sub Total");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_26.setBounds(240, 46, 65, 14);
		panel_6.add(label_26);
		
		clothp1 = new JTextField();
		clothp1.setText("Rs 410.00");
		clothp1.setColumns(10);
		clothp1.setBounds(151, 76, 65, 20);
		panel_6.add(clothp1);
		
		clotht1 = new JTextField();
		clotht1.setColumns(10);
		clotht1.setBounds(226, 76, 81, 20);
		panel_6.add(clotht1);
		
		JLabel label_27 = new JLabel("Order processing");
		label_27.setBounds(10, 11, 107, 14);
		panel_6.add(label_27);
		
		JLabel lblTshirts = new JLabel("T-SHIRTS");
		lblTshirts.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTshirts.setBounds(10, 109, 92, 14);
		panel_6.add(lblTshirts);
		
		JLabel lblPants = new JLabel("KURTAS");
		lblPants.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPants.setBounds(10, 140, 92, 14);
		panel_6.add(lblPants);
		
		JLabel lblJeans = new JLabel("JEANS");
		lblJeans.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblJeans.setBounds(10, 171, 92, 14);
		panel_6.add(lblJeans);
		
		JLabel lblTrousers = new JLabel("SAREES");
		lblTrousers.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTrousers.setBounds(10, 202, 92, 14);
		panel_6.add(lblTrousers);
		
		clothq2 = new JTextField();
		clothq2.setText("0");
		clothq2.setColumns(10);
		clothq2.setBounds(112, 107, 35, 20);
		panel_6.add(clothq2);
		
		clothq3 = new JTextField();
		clothq3.setText("0");
		clothq3.setColumns(10);
		clothq3.setBounds(112, 138, 35, 20);
		panel_6.add(clothq3);
		
		clothq4 = new JTextField();
		clothq4.setText("0");
		clothq4.setColumns(10);
		clothq4.setBounds(112, 169, 35, 20);
		panel_6.add(clothq4);
		
		clothq5 = new JTextField();
		clothq5.setText("0");
		clothq5.setColumns(10);
		clothq5.setBounds(112, 200, 35, 20);
		panel_6.add(clothq5);
		
		clothp2 = new JTextField();
		clothp2.setText("Rs 350.00");
		clothp2.setColumns(10);
		clothp2.setBounds(151, 107, 65, 20);
		panel_6.add(clothp2);
		
		clothp3 = new JTextField();
		clothp3.setText("Rs 650.00");
		clothp3.setColumns(10);
		clothp3.setBounds(151, 138, 65, 20);
		panel_6.add(clothp3);
		
		clothp4 = new JTextField();
		clothp4.setText("Rs 560.00");
		clothp4.setColumns(10);
		clothp4.setBounds(150, 169, 66, 20);
		panel_6.add(clothp4);
		
		clothp5 = new JTextField();
		clothp5.setHorizontalAlignment(SwingConstants.CENTER);
		clothp5.setText("Rs 6000.00");
		clothp5.setColumns(10);
		clothp5.setBounds(149, 200, 68, 20);
		panel_6.add(clothp5);
		
		clotht2 = new JTextField();
		clotht2.setColumns(10);
		clotht2.setBounds(226, 107, 81, 20);
		panel_6.add(clotht2);
		
		clotht3 = new JTextField();
		clotht3.setColumns(10);
		clotht3.setBounds(226, 138, 81, 20);
		panel_6.add(clotht3);
		
		clotht4 = new JTextField();
		clotht4.setColumns(10);
		clotht4.setBounds(226, 169, 81, 20);
		panel_6.add(clotht4);
		
		clotht5 = new JTextField();
		clotht5.setColumns(10);
		clotht5.setBounds(226, 200, 81, 20);
		panel_6.add(clotht5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_7.setBackground(Color.GRAY);
		panel_7.setBounds(690, 213, 323, 238);
		contentPane.add(panel_7);
		
		JLabel lblGadgets = new JLabel("GADGETS");
		lblGadgets.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGadgets.setBounds(10, 36, 81, 31);
		panel_7.add(lblGadgets);
		
		JLabel lblMobiles = new JLabel("MOBILES");
		lblMobiles.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMobiles.setBounds(10, 78, 92, 14);
		panel_7.add(lblMobiles);
		
		gadq1 = new JTextField();
		gadq1.setText("0");
		gadq1.setColumns(10);
		gadq1.setBounds(98, 76, 35, 20);
		panel_7.add(gadq1);
		
		JLabel label_34 = new JLabel("Qty");
		label_34.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_34.setBounds(101, 46, 46, 14);
		panel_7.add(label_34);
		
		JLabel label_35 = new JLabel("Unit Price");
		label_35.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_35.setBounds(157, 46, 57, 14);
		panel_7.add(label_35);
		
		JLabel label_36 = new JLabel("Sub Total");
		label_36.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_36.setBounds(240, 46, 65, 14);
		panel_7.add(label_36);
		
		gadp1 = new JTextField();
		gadp1.setText("Rs 8000.00");
		gadp1.setColumns(10);
		gadp1.setBounds(135, 76, 81, 20);
		panel_7.add(gadp1);
		
		gadt1 = new JTextField();
		gadt1.setColumns(10);
		gadt1.setBounds(226, 76, 81, 20);
		panel_7.add(gadt1);
		
		JLabel label_37 = new JLabel("Order processing");
		label_37.setBounds(10, 11, 107, 14);
		panel_7.add(label_37);
		
		JLabel lblLaptops = new JLabel("LAPTOPS");
		lblLaptops.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLaptops.setBounds(10, 109, 92, 14);
		panel_7.add(lblLaptops);
		
		JLabel lblTablets = new JLabel("TABLETS");
		lblTablets.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTablets.setBounds(10, 140, 92, 14);
		panel_7.add(lblTablets);
		
		JLabel lblEarphones = new JLabel("EAR PHONES");
		lblEarphones.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEarphones.setBounds(10, 171, 92, 14);
		panel_7.add(lblEarphones);
		
		JLabel lblSpeakers = new JLabel("SPEAKERS");
		lblSpeakers.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSpeakers.setBounds(10, 202, 92, 14);
		panel_7.add(lblSpeakers);
		
		gadq2 = new JTextField();
		gadq2.setText("0");
		gadq2.setColumns(10);
		gadq2.setBounds(98, 107, 35, 20);
		panel_7.add(gadq2);
		
		gadq3 = new JTextField();
		gadq3.setText("0");
		gadq3.setColumns(10);
		gadq3.setBounds(98, 138, 35, 20);
		panel_7.add(gadq3);
		
		gadq4 = new JTextField();
		gadq4.setText("0");
		gadq4.setColumns(10);
		gadq4.setBounds(98, 169, 35, 20);
		panel_7.add(gadq4);
		
		gadq5 = new JTextField();
		gadq5.setText("0");
		gadq5.setColumns(10);
		gadq5.setBounds(98, 200, 35, 20);
		panel_7.add(gadq5);
		
		gadp2 = new JTextField();
		gadp2.setText("Rs 30000.00");
		gadp2.setColumns(10);
		gadp2.setBounds(135, 107, 81, 20);
		panel_7.add(gadp2);
		
		gadp3 = new JTextField();
		gadp3.setText("Rs 12000.00");
		gadp3.setColumns(10);
		gadp3.setBounds(135, 138, 81, 20);
		panel_7.add(gadp3);
		
		gadp4 = new JTextField();
		gadp4.setText("Rs 1500.00");
		gadp4.setColumns(10);
		gadp4.setBounds(135, 169, 81, 20);
		panel_7.add(gadp4);
		
		gadp5 = new JTextField();
		gadp5.setHorizontalAlignment(SwingConstants.CENTER);
		gadp5.setText("Rs 6000.00");
		gadp5.setColumns(10);
		gadp5.setBounds(135, 200, 80, 20);
		panel_7.add(gadp5);
		
		gadt2 = new JTextField();
		gadt2.setColumns(10);
		gadt2.setBounds(226, 107, 81, 20);
		panel_7.add(gadt2);
		
		gadt3 = new JTextField();
		gadt3.setColumns(10);
		gadt3.setBounds(226, 138, 81, 20);
		panel_7.add(gadt3);
		
		gadt4 = new JTextField();
		gadt4.setColumns(10);
		gadt4.setBounds(226, 169, 81, 20);
		panel_7.add(gadt4);
		
		gadt5 = new JTextField();
		gadt5.setColumns(10);
		gadt5.setBounds(226, 200, 81, 20);
		panel_7.add(gadt5);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_8.setBackground(Color.GRAY);
		panel_8.setBounds(1017, 213, 329, 238);
		contentPane.add(panel_8);
		
		JLabel lblBeautyAndGroom = new JLabel("COSMETICS");
		lblBeautyAndGroom.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBeautyAndGroom.setBounds(10, 36, 92, 31);
		panel_8.add(lblBeautyAndGroom);
		
		JLabel lblCreams = new JLabel("CREAMS");
		lblCreams.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCreams.setBounds(10, 78, 92, 14);
		panel_8.add(lblCreams);
		
		cosmq1 = new JTextField();
		cosmq1.setText("0");
		cosmq1.setColumns(10);
		cosmq1.setBounds(112, 76, 35, 20);
		panel_8.add(cosmq1);
		
		JLabel label_44 = new JLabel("Qty");
		label_44.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_44.setBounds(112, 46, 46, 14);
		panel_8.add(label_44);
		
		JLabel label_45 = new JLabel("Unit Price");
		label_45.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_45.setBounds(157, 46, 57, 14);
		panel_8.add(label_45);
		
		JLabel label_47 = new JLabel("Sub Total");
		label_47.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_47.setBounds(240, 46, 65, 14);
		panel_8.add(label_47);
		
		cosmp1 = new JTextField();
		cosmp1.setText("Rs 954.00");
		cosmp1.setColumns(10);
		cosmp1.setBounds(152, 76, 64, 20);
		panel_8.add(cosmp1);
		
		cosmt1 = new JTextField();
		cosmt1.setColumns(10);
		cosmt1.setBounds(226, 76, 81, 20);
		panel_8.add(cosmt1);
		
		JLabel label_48 = new JLabel("Order processing");
		label_48.setBounds(10, 11, 107, 14);
		panel_8.add(label_48);
		
		JLabel lblLotions = new JLabel("LOTIONS");
		lblLotions.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLotions.setBounds(10, 109, 92, 14);
		panel_8.add(lblLotions);
		
		JLabel lblPerfumes = new JLabel("PERFUMES");
		lblPerfumes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPerfumes.setBounds(10, 140, 92, 14);
		panel_8.add(lblPerfumes);
		
		JLabel lblDeodrants = new JLabel("DEODRANTS");
		lblDeodrants.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDeodrants.setBounds(10, 171, 92, 14);
		panel_8.add(lblDeodrants);
		
		JLabel lblLipsticks = new JLabel("LIPSTICKS");
		lblLipsticks.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLipsticks.setBounds(10, 202, 92, 14);
		panel_8.add(lblLipsticks);
		
		cosmq2 = new JTextField();
		cosmq2.setText("0");
		cosmq2.setColumns(10);
		cosmq2.setBounds(112, 107, 35, 20);
		panel_8.add(cosmq2);
		
		cosmq3 = new JTextField();
		cosmq3.setText("0");
		cosmq3.setColumns(10);
		cosmq3.setBounds(112, 138, 35, 20);
		panel_8.add(cosmq3);
		
		cosmq4 = new JTextField();
		cosmq4.setText("0");
		cosmq4.setColumns(10);
		cosmq4.setBounds(112, 169, 35, 20);
		panel_8.add(cosmq4);
		
		cosmq5 = new JTextField();
		cosmq5.setText("0");
		cosmq5.setColumns(10);
		cosmq5.setBounds(112, 200, 35, 20);
		panel_8.add(cosmq5);
		
		cosmp2 = new JTextField();
		cosmp2.setText("Rs 865.00");
		cosmp2.setColumns(10);
		cosmp2.setBounds(153, 107, 63, 20);
		panel_8.add(cosmp2);
		
		cosmp3 = new JTextField();
		cosmp3.setText("Rs 200.00");
		cosmp3.setColumns(10);
		cosmp3.setBounds(153, 138, 63, 20);
		panel_8.add(cosmp3);
		
		cosmp4 = new JTextField();
		cosmp4.setText("Rs 250.00");
		cosmp4.setColumns(10);
		cosmp4.setBounds(153, 169, 63, 20);
		panel_8.add(cosmp4);
		
		cosmp5 = new JTextField();
		cosmp5.setText("Rs 59.00");
		cosmp5.setColumns(10);
		cosmp5.setBounds(153, 200, 63, 20);
		panel_8.add(cosmp5);
		
		cosmt2 = new JTextField();
		cosmt2.setColumns(10);
		cosmt2.setBounds(226, 107, 81, 20);
		panel_8.add(cosmt2);
		
		cosmt3 = new JTextField();
		cosmt3.setColumns(10);
		cosmt3.setBounds(226, 138, 81, 20);
		panel_8.add(cosmt3);
		
		cosmt4 = new JTextField();
		cosmt4.setColumns(10);
		cosmt4.setBounds(226, 169, 81, 20);
		panel_8.add(cosmt4);
		
		cosmt5 = new JTextField();
		cosmt5.setColumns(10);
		cosmt5.setBounds(226, 200, 81, 20);
		panel_8.add(cosmt5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(294, 452, 267, 238);
		contentPane.add(panel_1);
		
		JLabel label_2 = new JLabel("ORDER TOTAL");
		label_2.setBounds(10, 91, 96, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("TAX PAID");
		label_3.setBounds(10, 141, 63, 21);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("NET PRICE");
		label_4.setBounds(10, 173, 79, 14);
		panel_1.add(label_4);
		
		ftotal = new JTextField();
		ftotal.setColumns(10);
		ftotal.setBounds(128, 88, 86, 20);
		panel_1.add(ftotal);
		
		ftax = new JTextField();
		ftax.setColumns(10);
		ftax.setBounds(128, 141, 86, 20);
		panel_1.add(ftax);
		
		fnet = new JTextField();
		fnet.setColumns(10);
		fnet.setBounds(128, 170, 86, 20);
		panel_1.add(fnet);
		
		JButton flipm = new JButton("BUY FROM FLIPKART");
		flipm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				jtime.setText(tTime.format(timer.getTime()));
				
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
				jdate.setText(Tdate.format(timer.getTime()));
				
			}
		});
		flipm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				double qt1=Double.parseDouble(foodq1.getText());
				double qt2=Double.parseDouble(foodq2.getText());
				double qt3=Double.parseDouble(foodq3.getText());
				double qt4=Double.parseDouble(foodq4.getText());
				double qt5=Double.parseDouble(foodq5.getText());
				double qt6=Double.parseDouble(clothq1.getText());
				double qt7=Double.parseDouble(clothq2.getText());
				double qt8=Double.parseDouble(clothq3.getText());
				double qt9=Double.parseDouble(clothq4.getText());
				double qt10=Double.parseDouble(clothq5.getText());
				double qt11=Double.parseDouble(gadq1.getText());
				double qt12=Double.parseDouble(gadq2.getText());
				double qt13=Double.parseDouble(gadq3.getText());
				double qt14=Double.parseDouble(gadq4.getText());
				double qt15=Double.parseDouble(gadq5.getText());
				double qt16=Double.parseDouble(cosmq1.getText());
				double qt17=Double.parseDouble(cosmq2.getText());
				double qt18=Double.parseDouble(cosmq3.getText());
				double qt19=Double.parseDouble(cosmq4.getText());
				double qt20=Double.parseDouble(cosmq5.getText());
				
				
				String wheat_w = String.format("Rs%.2f", wheat);
				foodp1.setText(wheat_w);
				String rice_r = String.format("Rs%.2f", rice);
				foodp2.setText(rice_r);
				String dal_d = String.format("Rs%.2f", dal);
				foodp3.setText(dal_d);
				String veg_v = String.format("Rs%.2f", vegpack);
				foodp4.setText(veg_v);
				String nonveg_n = String.format("Rs%.2f", nonvegpack);
				foodp5.setText(nonveg_n);
				
				String shirt_s = String.format("Rs%.2f", shirts);
				clothp1.setText(shirt_s);
				String t_shirt = String.format("Rs%.2f", tshirts);
				clothp2.setText(t_shirt);
				String kurta_s = String.format("Rs%.2f", kurtas);
				clothp3.setText(kurta_s);
				String jean_s = String.format("Rs%.2f", jeans);
				clothp4.setText(jean_s);
				String saree_s = String.format("Rs%.2f", sarees);
				clothp5.setText(saree_s);
				
				String mobile_s = String.format("Rs%.2f", mobile);
				gadp1.setText(mobile_s);
				String laptop_s = String.format("Rs%.2f", laptops);
				gadp2.setText(laptop_s);
				String tablet_s = String.format("Rs%.2f", tablets);
				gadp3.setText(tablet_s);
				String earphone_s = String.format("Rs%.2f", earphones);
				gadp4.setText(earphone_s);
				String speaker_s = String.format("Rs%.2f", speakers);
				gadp5.setText(speaker_s);
				
				String cream_s = String.format("Rs%.2f", creams);
				cosmp1.setText(cream_s);
				String lotion_s = String.format("Rs%.2f", lotion);
				cosmp2.setText(lotion_s);
				String perfume_s = String.format("Rs%.2f", perfumes);
				cosmp3.setText(perfume_s);
				String deodrant_s = String.format("Rs%.2f", deodrants );
				cosmp4.setText(deodrant_s);
				String lipstick_s = String.format("Rs%.2f", lipsticks );
				cosmp5.setText(lipstick_s);
				
				double purchase1=qt1*wheat;
				double purchase2=qt2*rice;
				double purchase3=qt3*dal;
				double purchase4=qt4*vegpack;
				double purchase5=qt5*nonvegpack;
				double purchase6=qt6*shirts;
				double purchase7=qt7*tshirts;
				double purchase8=qt8*kurtas;
				double purchase9=qt9*jeans;
				double purchase10=qt10*sarees;
				double purchase11=qt11*mobile;
				double purchase12=qt12*laptops;
				double purchase13=qt13*tablets;
				double purchase14=qt14*earphones;
				double purchase15=qt15*speakers;
				double purchase16=qt16*creams;
				double purchase17=qt17*lotion;
				double purchase18=qt18*perfumes;
				double purchase19=qt19*deodrants;
				double purchase20=qt20*lipsticks;
				
				
				String sub1 = String.format("Rs%.2f", purchase1);
				foodt1.setText(sub1);
				String sub2 = String.format("Rs%.2f", purchase2);
				foodt2.setText(sub2);
				String sub3 = String.format("Rs%.2f", purchase3);
				foodt3.setText(sub3);
				String sub4 = String.format("Rs%.2f", purchase4);
				foodt4.setText(sub4);
				String sub5 = String.format("Rs%.2f", purchase5);
				foodt5.setText(sub5);
				
				String sub6 = String.format("Rs%.2f", purchase6);
				clotht1.setText(sub6);
				String sub7 = String.format("Rs%.2f", purchase7);
				clotht2.setText(sub7);
				String sub8 = String.format("Rs%.2f", purchase8);
				clotht3.setText(sub8);
				String sub9 = String.format("Rs%.2f", purchase9);
				clotht4.setText(sub9);
				String sub10 = String.format("Rs%.2f", purchase10);
				clotht5.setText(sub10);
				
				String sub11 = String.format("Rs%.2f", purchase11);
				gadt1.setText(sub11);
				String sub12 = String.format("Rs%.2f", purchase12);
				gadt2.setText(sub12);
				String sub13 = String.format("Rs%.2f", purchase13);
				gadt3.setText(sub13);
				String sub14 = String.format("Rs%.2f", purchase14);
				gadt4.setText(sub14);
				String sub15 = String.format("Rs%.2f", purchase15);
				gadt5.setText(sub15);
				
				String sub16 = String.format("Rs%.2f", purchase16);
				cosmt1.setText(sub16);
				String sub17 = String.format("Rs%.2f", purchase17);
				cosmt2.setText(sub17);
				String sub18 = String.format("Rs%.2f", purchase18);
				cosmt3.setText(sub18);
				String sub19 = String.format("Rs%.2f", purchase19);
				cosmt4.setText(sub19);
				String sub20 = String.format("Rs%.2f", purchase20);
				cosmt5.setText(sub20);
				
				//=============tax==========================
				
				double subtotal=purchase1+purchase2+purchase3+purchase4+purchase5+purchase6+purchase7+purchase8+purchase9+purchase10+purchase11+purchase12+purchase13+purchase14+purchase15+purchase16+purchase17+purchase18+purchase19+purchase20;
				double vtax=(subtotal*fltax)/100;
				
				String subTax = String.format("Rs%.2f", vtax);
				ftax.setText(subTax);
				
				
				//============total=================
				
				String subtol = String.format("Rs%.2f", subtotal);
				ftotal.setText(subtol);
				
				//=============amazon total=====================
				
			     double frate=(subtotal*65/100)+vtax;
			     
			     String flipkart = String.format("Rs%.2f", frate);
			     fprice.setText(flipkart);
			     
			     //=============net worth====================
			     
			 	double addup=subtotal*65/100+vtax;
				String totall = String.format("Rs%.2f", addup);
				fnet.setText(totall);
				
			
				
			//============bought=========================
	String flip=fprice.getText();
				
				JOptionPane.showMessageDialog(null,"YOU HAVE SUCCESSFULLY BOUGHT YOUR PRODUCT FROM FLIPKART ! \n YOUR TOTAL COST IS "+flip);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//=========date n time==============
				
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				jtime.setText(tTime.format(timer.getTime()));
				
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
				jdate.setText(Tdate.format(timer.getTime()));
				
			}
		});
		flipm.setBounds(54, 198, 160, 29);
		panel_1.add(flipm);
		
		fprice = new JTextField();
		fprice.setColumns(10);
		fprice.setBounds(128, 113, 86, 20);
		panel_1.add(fprice);
		
		JLabel lblFlipkartPrice = new JLabel("FLIPKART PRICE");
		lblFlipkartPrice.setBounds(10, 116, 96, 14);
		panel_1.add(lblFlipkartPrice);
		
		JLabel jflipkart = new JLabel("FLIPKART MARKET");
		jflipkart.setForeground(new Color(51, 51, 204));
		jflipkart.setFont(new Font("Tahoma", Font.BOLD, 15));
		jflipkart.setBounds(54, 11, 160, 29);
		panel_1.add(jflipkart);
		
		JLabel lblbigBillionDays = new JLabel("#BIG BILLION DAYS");
		lblbigBillionDays.setForeground(new Color(0, 102, 0));
		lblbigBillionDays.setBounds(78, 42, 136, 14);
		panel_1.add(lblbigBillionDays);
		
		JLabel lblDiscountOn_1 = new JLabel("35% DISCOUNT ON EVERY PRODUCT");
		lblDiscountOn_1.setForeground(new Color(0, 153, 0));
		lblDiscountOn_1.setBounds(31, 66, 214, 14);
		panel_1.add(lblDiscountOn_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(571, 452, 256, 238);
		contentPane.add(panel_2);
		
		JLabel label_8 = new JLabel("ORDER TOTAL");
		label_8.setBounds(10, 91, 96, 14);
		panel_2.add(label_8);
		
		JLabel label_9 = new JLabel("TAX PAID");
		label_9.setBounds(10, 141, 63, 21);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("NET PRICE");
		label_10.setBounds(10, 173, 79, 14);
		panel_2.add(label_10);
		
		etotal = new JTextField();
		etotal.setColumns(10);
		etotal.setBounds(128, 88, 86, 20);
		panel_2.add(etotal);
		
		etax = new JTextField();
		etax.setColumns(10);
		etax.setBounds(128, 141, 86, 20);
		panel_2.add(etax);
		
		enet = new JTextField();
		enet.setColumns(10);
		enet.setBounds(128, 167, 86, 20);
		panel_2.add(enet);
		
		JButton ebaym = new JButton("BUY FROM EBAY");
		ebaym.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				jtime.setText(tTime.format(timer.getTime()));
				
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
				jdate.setText(Tdate.format(timer.getTime()));
			}
		});
		ebaym.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				double qt1=Double.parseDouble(foodq1.getText());
				double qt2=Double.parseDouble(foodq2.getText());
				double qt3=Double.parseDouble(foodq3.getText());
				double qt4=Double.parseDouble(foodq4.getText());
				double qt5=Double.parseDouble(foodq5.getText());
				double qt6=Double.parseDouble(clothq1.getText());
				double qt7=Double.parseDouble(clothq2.getText());
				double qt8=Double.parseDouble(clothq3.getText());
				double qt9=Double.parseDouble(clothq4.getText());
				double qt10=Double.parseDouble(clothq5.getText());
				double qt11=Double.parseDouble(gadq1.getText());
				double qt12=Double.parseDouble(gadq2.getText());
				double qt13=Double.parseDouble(gadq3.getText());
				double qt14=Double.parseDouble(gadq4.getText());
				double qt15=Double.parseDouble(gadq5.getText());
				double qt16=Double.parseDouble(cosmq1.getText());
				double qt17=Double.parseDouble(cosmq2.getText());
				double qt18=Double.parseDouble(cosmq3.getText());
				double qt19=Double.parseDouble(cosmq4.getText());
				double qt20=Double.parseDouble(cosmq5.getText());
				
				
				String wheat_w = String.format("Rs%.2f", wheat);
				foodp1.setText(wheat_w);
				String rice_r = String.format("Rs%.2f", rice);
				foodp2.setText(rice_r);
				String dal_d = String.format("Rs%.2f", dal);
				foodp3.setText(dal_d);
				String veg_v = String.format("Rs%.2f", vegpack);
				foodp4.setText(veg_v);
				String nonveg_n = String.format("Rs%.2f", nonvegpack);
				foodp5.setText(nonveg_n);
				
				String shirt_s = String.format("Rs%.2f", shirts);
				clothp1.setText(shirt_s);
				String t_shirt = String.format("Rs%.2f", tshirts);
				clothp2.setText(t_shirt);
				String kurta_s = String.format("Rs%.2f", kurtas);
				clothp3.setText(kurta_s);
				String jean_s = String.format("Rs%.2f", jeans);
				clothp4.setText(jean_s);
				String saree_s = String.format("Rs%.2f", sarees);
				clothp5.setText(saree_s);
				
				String mobile_s = String.format("Rs%.2f", mobile);
				gadp1.setText(mobile_s);
				String laptop_s = String.format("Rs%.2f", laptops);
				gadp2.setText(laptop_s);
				String tablet_s = String.format("Rs%.2f", tablets);
				gadp3.setText(tablet_s);
				String earphone_s = String.format("Rs%.2f", earphones);
				gadp4.setText(earphone_s);
				String speaker_s = String.format("Rs%.2f", speakers);
				gadp5.setText(speaker_s);
				
				String cream_s = String.format("Rs%.2f", creams);
				cosmp1.setText(cream_s);
				String lotion_s = String.format("Rs%.2f", lotion);
				cosmp2.setText(lotion_s);
				String perfume_s = String.format("Rs%.2f", perfumes);
				cosmp3.setText(perfume_s);
				String deodrant_s = String.format("Rs%.2f", deodrants );
				cosmp4.setText(deodrant_s);
				String lipstick_s = String.format("Rs%.2f", lipsticks );
				cosmp5.setText(lipstick_s);
				
				double purchase1=qt1*wheat;
				double purchase2=qt2*rice;
				double purchase3=qt3*dal;
				double purchase4=qt4*vegpack;
				double purchase5=qt5*nonvegpack;
				double purchase6=qt6*shirts;
				double purchase7=qt7*tshirts;
				double purchase8=qt8*kurtas;
				double purchase9=qt9*jeans;
				double purchase10=qt10*sarees;
				double purchase11=qt11*mobile;
				double purchase12=qt12*laptops;
				double purchase13=qt13*tablets;
				double purchase14=qt14*earphones;
				double purchase15=qt15*speakers;
				double purchase16=qt16*creams;
				double purchase17=qt17*lotion;
				double purchase18=qt18*perfumes;
				double purchase19=qt19*deodrants;
				double purchase20=qt20*lipsticks;
				
				
				String sub1 = String.format("Rs%.2f", purchase1);
				foodt1.setText(sub1);
				String sub2 = String.format("Rs%.2f", purchase2);
				foodt2.setText(sub2);
				String sub3 = String.format("Rs%.2f", purchase3);
				foodt3.setText(sub3);
				String sub4 = String.format("Rs%.2f", purchase4);
				foodt4.setText(sub4);
				String sub5 = String.format("Rs%.2f", purchase5);
				foodt5.setText(sub5);
				
				String sub6 = String.format("Rs%.2f", purchase6);
				clotht1.setText(sub6);
				String sub7 = String.format("Rs%.2f", purchase7);
				clotht2.setText(sub7);
				String sub8 = String.format("Rs%.2f", purchase8);
				clotht3.setText(sub8);
				String sub9 = String.format("Rs%.2f", purchase9);
				clotht4.setText(sub9);
				String sub10 = String.format("Rs%.2f", purchase10);
				clotht5.setText(sub10);
				
				String sub11 = String.format("Rs%.2f", purchase11);
				gadt1.setText(sub11);
				String sub12 = String.format("Rs%.2f", purchase12);
				gadt2.setText(sub12);
				String sub13 = String.format("Rs%.2f", purchase13);
				gadt3.setText(sub13);
				String sub14 = String.format("Rs%.2f", purchase14);
				gadt4.setText(sub14);
				String sub15 = String.format("Rs%.2f", purchase15);
				gadt5.setText(sub15);
				
				String sub16 = String.format("Rs%.2f", purchase16);
				cosmt1.setText(sub16);
				String sub17 = String.format("Rs%.2f", purchase17);
				cosmt2.setText(sub17);
				String sub18 = String.format("Rs%.2f", purchase18);
				cosmt3.setText(sub18);
				String sub19 = String.format("Rs%.2f", purchase19);
				cosmt4.setText(sub19);
				String sub20 = String.format("Rs%.2f", purchase20);
				cosmt5.setText(sub20);
				
				//=============tax==========================
				
				double subtotal=purchase1+purchase2+purchase3+purchase4+purchase5+purchase6+purchase7+purchase8+purchase9+purchase10+purchase11+purchase12+purchase13+purchase14+purchase15+purchase16+purchase17+purchase18+purchase19+purchase20;
				double vtax=(subtotal*ebtax)/100;
				
				String subTax = String.format("Rs%.2f", vtax);
				etax.setText(subTax);
				
				
				//============total=================
				
				String subtol = String.format("Rs%.2f", subtotal);
				etotal.setText(subtol);
				
				//=============ebay total=====================
				
			     double arate=(subtotal*75/100)+vtax;
			     
			     String ebay = String.format("Rs%.2f", arate);
			     eprice.setText(ebay);
			     
			     //=============net worth====================
			     
			 	double addup=subtotal*75/100+vtax;
				String totall = String.format("Rs%.2f", addup);
				enet.setText(totall);
				
				
				
			//====================bought============================
	String eba=eprice.getText();
				
				JOptionPane.showMessageDialog(null,"YOU HAVE SUCCESSFULLY BOUGHT YOUR PRODUCT FROM EBAY ! \n YOUR TOTAL COST IS "+eba);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//===========date n time =================
				
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				jtime.setText(tTime.format(timer.getTime()));
				
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
				jdate.setText(Tdate.format(timer.getTime()));
				
			}
		});
		ebaym.setBounds(54, 198, 160, 29);
		panel_2.add(ebaym);
		
		eprice = new JTextField();
		eprice.setColumns(10);
		eprice.setBounds(128, 113, 86, 20);
		panel_2.add(eprice);
		
		JLabel lblEbayPrice = new JLabel("EBAY PRICE");
		lblEbayPrice.setBounds(10, 116, 96, 14);
		panel_2.add(lblEbayPrice);
		
		JLabel jebay = new JLabel("E-BAY MARKET");
		jebay.setForeground(new Color(255, 102, 0));
		jebay.setFont(new Font("Tahoma", Font.BOLD, 15));
		jebay.setBounds(65, 11, 132, 29);
		panel_2.add(jebay);
		
		JLabel lblfestiveSeason = new JLabel("#FESTIVE SEASON");
		lblfestiveSeason.setForeground(new Color(204, 153, 0));
		lblfestiveSeason.setBounds(75, 42, 136, 14);
		panel_2.add(lblfestiveSeason);
		
		JLabel lblDiscountOn_2 = new JLabel("25% DISCOUNT ON EVERY PRODUCT");
		lblDiscountOn_2.setForeground(new Color(204, 153, 0));
		lblDiscountOn_2.setBounds(21, 66, 210, 14);
		panel_2.add(lblDiscountOn_2);
	}
}
