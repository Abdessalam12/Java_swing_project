package TP;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;

public class Recharger_abonnement {
   Gerer_client gc ;
	public static  JFrame frame;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recharger_abonnement window = new Recharger_abonnement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		}
	/**
	 * Create the application.
	 */
	public Recharger_abonnement() {
		initialize();
	}
	public Recharger_abonnement(Gerer_client gc) {
		this.gc=gc;
		initialize();
	}
   
	 
 
	/**
	 * Initialize the contents of the frame.
	 */
	

	private void initialize() {
		JPanel Pane = new JPanel();
	JLabel label=new JLabel("code:");
	label.setBounds(100, 30, 120, 50);
	JLabel label1=new JLabel("CIN:");
	label1.setBounds(100, 81, 120, 50);
	JLabel label2=new JLabel("Price");
	label2.setBounds(100, 135, 120, 50);
	JLabel label3=new JLabel("Bank code");
	label3.setBounds(100, 192, 120, 50);
	JTextField	nomSaison = new JTextField();
	nomSaison.setBounds(250, 30, 150, 30);
	JTextField	nomSaison1 = new JTextField();
	nomSaison1.setBounds(250, 91, 150, 30);
	JTextField	nomSaison2 = new JTextField();
	nomSaison2.setBounds(250, 145, 150, 30);
	JTextField	nomSaison3 = new JTextField();
	nomSaison3.setBounds(250, 202, 150, 30);
	 JButton btny= new JButton("Yes");
	 btny.setForeground(Color.WHITE);
	 btny.setBounds(100, 348, 80, 50);
	 JButton btnn= new JButton("No");
	 btnn.setForeground(Color.WHITE);
	 btnn.setBounds(191, 348, 80, 50);
	 JButton btnb= new JButton("Back");
	 btnb.setForeground(Color.WHITE);
	 btnb.setBounds(364, 358, 80, 50);
		frame = new JFrame();
		frame.setTitle("Recharger_Abonnement");
		frame.setBounds(100, 100,600, 468);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		Pane.setBackground(Color.GRAY);
		 Pane.setBorder(new EmptyBorder(10, 10, 10, 10));
		 btny.setBackground(Color.LIGHT_GRAY);
		 btnn.setBackground(Color.LIGHT_GRAY);
		 btnb.setBackground(Color.LIGHT_GRAY);
		 Pane.setLayout(null);
		 
		 Pane.add(nomSaison);
		 Pane.add(nomSaison1);
		 Pane.add(nomSaison2);
		 Pane.add(nomSaison3);
		 Pane.add(label3);
		 Pane.add(label2);
		 Pane.add(label);
		 Pane.add(label1);
		 Pane.add(btny);
		 Pane.add(btnn);
		 Pane.add(btnb);
		 frame.getContentPane().add(Pane);
		 
		 JCheckBox chckbxNewCheckBox = new JCheckBox("I am not robot");
		 chckbxNewCheckBox.setBackground(Color.GRAY);
		 chckbxNewCheckBox.setBounds(160, 281, 97, 23);
		 Pane.add(chckbxNewCheckBox);
		 
		 btnb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Main M = new Main(gc);
					
					M.frame.setVisible(true) ;
					frame.setVisible(false) ;
					
					
				}
			});
		 btnn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if( chckbxNewCheckBox.isSelected()==true)
					{nomSaison.setText("");
					nomSaison1.setText("");
					nomSaison2.setText("");
					nomSaison3.setText("");
					}
				
					
				}
			});
		btny.addActionListener(new ActionListener() {
			boolean test=false,test1=false,test2=false,test3=false ;
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
				if( chckbxNewCheckBox.isSelected()==true)
				{
				String s,code = null,cin = null ,price=null;
				s=nomSaison.getText();
				if (verfier (s,nomSaison))
				{
					if(s.length() != 4 )
					{
						nomSaison.setText("Enter a true code");
					}
					else
					{test=true;
					code=s;}
				}
				s=nomSaison1.getText();
				
				if (verfier (s,nomSaison1))
				{
					if(s.length() !=8)
					{
						nomSaison1.setText("Enter a true CIN ");
					}
					else
					{test1=true;
					cin=s;}
				}
               s=nomSaison2.getText();
				
				if (verfier (s,nomSaison2))
				{
					if(s.length() !=4)
					{
						nomSaison2.setText("between 1000 and 9999 ");
					}
					else
					{test2=true;
					price=s;}

				}
				
				 s=nomSaison3.getText();
					
					if (verfier (s,nomSaison3))
					{
						if(s.length() !=8)
						{
							nomSaison3.setText("Enter a true code ");
						}
						else
						{test3=true;}
					}
				
				if( test && test1 )
					if(test2 && test3)
					{
						if(gc.verfier_Abonne(price, cin, code, 2))
						{
							Succes sc = new Succes();
							sc.frame.setVisible(true);
						}
						else
						{
							Erreur Er = new Erreur() ;
							Er.frame.setVisible(true);
						}
					}
				
				
				
				
				}}});
			 

			
	

		 
		 
		 
		 
		 
}}



/*public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
	public void run() {
		try {
			Recharger_abonnement window = new Recharger_abonnement();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
});
}*/
