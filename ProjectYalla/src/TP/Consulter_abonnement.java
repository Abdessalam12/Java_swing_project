package TP;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class Consulter_abonnement {

	public static  JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
     Gerer_client gc;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Consulter_abonnement(Gerer_client gc) {
		
		this.gc=gc;
		
		initialize(gc);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Gerer_client gc) {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setTitle("Consulter");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		textField = new JTextField();
		textField.setBounds(170, 34, 139, 20);
		
		textField.setText("");
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(170, 77, 139, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(170, 118, 139, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblNewLabel.setBounds(53, 37, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCode = new JLabel("CIN :");
		lblCode.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblCode.setBounds(53, 80, 46, 14);
		frame.getContentPane().add(lblCode);
		
		JLabel lblCode_1 = new JLabel("Code :");
		lblCode_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lblCode_1.setBounds(53, 121, 46, 14);
		frame.getContentPane().add(lblCode_1);
		
		JButton btnTermin = new JButton("termin\u00E9");
		btnTermin.setBackground(Color.LIGHT_GRAY);
		btnTermin.setBounds(99, 200, 89, 23);
		frame.getContentPane().add(btnTermin);
		
		JButton btnback = new JButton("annuler");
		btnback.setBackground(Color.LIGHT_GRAY);
		btnback.setBounds(258, 200, 89, 23);
		 btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main m=new Main(gc);
				m.frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		frame.getContentPane().add(btnback);
	

	btnTermin.addActionListener(new ActionListener() {
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
			
					
					
				
					String s1=textField_1.getText();
					String s2=textField_2.getText();
				
				
					
						
					if(verfier(s1,textField_1))
					if(s1.length() !=  8)
						textField_1.setText("Enter a true CIN");
					else
					{
						
						test=true;
					}
					
				    if (verfier(s2,textField_2))	
					if(s2.length() !=  4)
						textField_2.setText("Enter a true Code");
					else
					{test1=true;}
			if(test && test1   )
				
			{  
				
				
				
				
				if (gc.verfier_Abonne(null, s1, s2,1)) 
						{ 
					
					Sure.i=2;
					Sure su;
					
					su= new Sure (gc,null,null);
					   
					  
					   
					   su.frame.setVisible(true);
					   //frame.setVisible(false);
						}
			
			
			else
			{
				Erreur E = new Erreur(); 
				E.frame.setVisible(true);
			}
				}
			
		}});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
