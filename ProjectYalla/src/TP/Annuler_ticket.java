package TP;


import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;



	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.BorderFactory;
import javax.swing.JButton;
	import javax.swing.JTextField;
import javax.swing.border.Border;

	public class Annuler_ticket {

	public JFrame frame;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		JLabel jl;
        Gerer_client gc ;
        
		/**
		 * Launch the application.
		 */
	

		/**
		 * Create the application.
		 */
		public Annuler_ticket( Gerer_client gc) {
			this.gc=gc;
			initialize(gc);
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize(Gerer_client gc) {
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.LIGHT_GRAY);
			frame.setBounds(100, 100, 450, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			//frame.setResizable(false);
			
			/*JLabel lblNewLabel = new JLabel("nom :");
			lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
			lblNewLabel.setBounds(58, 44, 46, 14);
			frame.getContentPane().add(lblNewLabel);*/
			
			JLabel lblCodeAbonnement = new JLabel("CIN :");
			lblCodeAbonnement.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
			lblCodeAbonnement.setBounds(58, 80, 46, 14);
			frame.getContentPane().add(lblCodeAbonnement);
			
			JLabel lblNewLabel_1_1 = new JLabel("code ticket :");
			lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
			lblNewLabel_1_1.setBounds(58, 122, 87, 14);
			frame.getContentPane().add(lblNewLabel_1_1);
			
			JCheckBox chckbxNewCheckBox = new JCheckBox("accept\u00E9");
			chckbxNewCheckBox.setBackground(Color.LIGHT_GRAY);
			chckbxNewCheckBox.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
			chckbxNewCheckBox.setBounds(95, 161, 116, 35);
			frame.getContentPane().add(chckbxNewCheckBox);
			
			JButton btnNewButton = new JButton("termin\u00E9");
			btnNewButton.setBackground(Color.LIGHT_GRAY);
			btnNewButton.setBounds(110, 208, 89, 23);
			frame.getContentPane().add(btnNewButton);
			
			JButton btnAnnuler = new JButton("annuler");
			btnAnnuler.setBackground(Color.LIGHT_GRAY);
			btnAnnuler.setBounds(241, 208, 89, 23);
			frame.getContentPane().add(btnAnnuler);
			
			/*textField = new JTextField();
			textField.setBounds(197, 44, 133, 20);
			frame.getContentPane().add(textField);
			textField.setColumns(10);*/
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(197, 80, 133, 20);
			frame.getContentPane().add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(197, 122, 133, 20);
			frame.getContentPane().add(textField_2);
			
			btnAnnuler.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					
					Main m=new Main(gc);
					frame.setVisible(false);
					m.frame.setVisible(true);
					
					
				}});
			
			
			btnNewButton.addActionListener(new ActionListener() {
				String cin=null,code=null ;
				private Object JLabel;
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
							String s= textField_1 .getText();
						    if ( verfier(s,textField_1 ))    
							if(s.length()  !=  8)
								textField_1 .setText("Enter a true CIN");
							{
								test=true;
							     cin=s;  
							}
							
							
							s=textField_2.getText();
							if (verfier(s,textField_2))
							if(s.length() != 4)
							
							{
								test1=true;
								code=s;
							}
							
		            }
					if(test && test1 )
					{
						Client cl1=null;
						cl1=gc.Ret_client(cin, code);
						if (cl1!=null)
						{  
							
							if(gc.verfier_date(cl1))
								{
								
								Expirée Ex= new Expirée();
								Ex.frame.setVisible(true);
								
								}
							else
							{
							gc.Effacer(cl1);
							Abonne a = gc.Chercher_Abonné (cl1);
							if (a!=null)
						    gc.RendreBonus(a);
							
									Succes Sc= new Succes();
									Sc.frame.setVisible(true);
						}}
				    else 
					{
						Erreur E = new Erreur() ;
						E.frame.setVisible(true);
					}
				    
				    }
					
				    
				    }});
			
			
		}
		

	}
