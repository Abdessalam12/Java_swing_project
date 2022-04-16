package TP;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Acheter_ticket {

	public static JFrame  frame;

	
	private String CIN;
	private String Nom;
	
	private String competition;
	private int prix;
	private String class1;
	Gerer_client gc ;
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acheter_ticket window = new Acheter_ticket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	

	/**
	 * Create the application.
	 */
	public Acheter_ticket(Gerer_client gc) {
		this.gc=gc;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 713, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		
		

		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"First class", "Second class","Third class"}));
		comboBox.setBounds(483, 181, 97, 22);
		frame.getContentPane().add(comboBox);
		
		
		
		
		
		
		
		JLabel lblClassDeTicket = new JLabel("Class de ticket");
		lblClassDeTicket.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblClassDeTicket.setBounds(349, 184, 84, 22);
		frame.getContentPane().add(lblClassDeTicket);
		
		JLabel lblNewLabel = new JLabel("CIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(349, 40, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNom.setBounds(349, 75, 46, 14);
		frame.getContentPane().add(lblNom);
		
		JLabel lblDateDachat = new JLabel("competition");
		lblDateDachat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDateDachat.setBounds(349, 112, 76, 14);
		frame.getContentPane().add(lblDateDachat);
		
		JLabel lblCarteBancaire = new JLabel("Carte bancaire");
		lblCarteBancaire.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCarteBancaire.setBounds(349, 150, 84, 14);
		frame.getContentPane().add(lblCarteBancaire);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("v\u00E9rifi\u00E9");
		chckbxNewCheckBox.setBackground(SystemColor.inactiveCaption);
		chckbxNewCheckBox.setBounds(409, 235, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JTextField t1= new JTextField();
		t1.setBounds(483, 40, 179, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
	
		
		JTextField t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(483, 73, 179, 20);
		frame.getContentPane().add(t2);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"league1", "Coupe","Champions_league "}));
		comboBox1.setBounds(483, 108, 179, 20);
		frame.getContentPane().add(comboBox1);
		
		
		
		
		JTextField t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(483, 145, 179, 20);
		frame.getContentPane().add(t4);
		
		
		//JLabel lblNewLabel_1 = new JLabel("New label");
		//lblNewLabel_1.setIcon(new ImageIcon(Acheter_ticket.class.getResource("/images/profile_mag-max-1280x722.jpg")));
		//lblNewLabel_1.setBounds(0, 0, 484, 361);
		//frame.getContentPane().add(lblNewLabel_1);
		Button button = new Button("termin\u00E9");
		button.setBounds(449, 297, 70, 22);
		frame.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			Client cl=null;
			Ticket tk=null;
			boolean verfier(String s ,JTextField nomSaison )
			{    
				int i=0 ;
				boolean test = true ;
				while ( i<s.length() && test)
				{ 
					char c=s.charAt(i);
					
					if (c < '0' || c>'9' )
						{nomSaison.setText("Enter only numeric digits(0-9)");
					     test=false;
					}
					i++;
				}
				return test;
			}
			    public void actionPerformed(ActionEvent e) {
			    	boolean test=false,test1=false;
				if(chckbxNewCheckBox.isSelected())
	            {
						String s= t1.getText();
					    if ( verfier(s,t1))    
						if(s.length()  !=  8)
							t1.setText("Enter a true CIN");
						{
							test=true;
						   CIN=s;
						}
						
						
						s=t4.getText();
						if (verfier(s,t4))
						if(s.length() != 8)
							t4.setText("Enter a true code");
						else
						{
							test1=true;
							
						}
						
	            }
				if(test && test1 )
				{
					int cin = Integer.parseInt( CIN);
					 class1 = comboBox.getSelectedItem().toString();
					 competition=comboBox1.getSelectedItem().toString();
					 tk= new Ticket(class1,competition);
					cl=new Client(cin,t2.getText(),null);
					cl.achter_ticket(tk);
					
					
					Sure.i=3;
					Sure su = new Sure(gc,null,cl);
					
					su.frame.setVisible(true);
				}
			    
			    
			    }
			
			});
		
		
		Button button_1 = new Button("annuler");
		button_1.setBounds(579, 297, 70, 22);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Acheter_ticket.class.getResource("/Projetimg/cheap-sports-tickets.jpg")));
		lblNewLabel_1.setBounds(0, 0, 300, 361);
		frame.getContentPane().add(lblNewLabel_1);
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				
				
				frame.setVisible(false);
				Main m=new Main(gc);
				m.frame.setVisible(true);
				
				
				
				
			}
			
		});
		
	}
}
