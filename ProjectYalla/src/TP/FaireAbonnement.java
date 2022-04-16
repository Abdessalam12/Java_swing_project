package TP;
import java.awt.Color;
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
import javax.swing.ImageIcon;

public class FaireAbonnement {

	public static JFrame frame;
	 JPanel Pane = new JPanel();
	
	 JTextField tf=new JTextField();
	 private  Gerer_client gc=null;

	
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public FaireAbonnement(Gerer_client gc) {
		this.gc=gc;
		initialize( gc);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize(Gerer_client gc) {
		
		 JLabel labelCIN=new JLabel("CIN");
		 labelCIN.setBounds(307, 61, 70, 30);
		 JLabel labelNOM=new JLabel("Nom");
		 labelNOM.setBounds(307, 112, 70, 30);
		 JLabel labelPRENOM=new JLabel("Prenom");
		 labelPRENOM.setBounds(307, 160, 70, 30);
		 JLabel labelCODE=new JLabel("Code de payment");
		 labelCODE.setBounds(307, 201, 116, 30);
		 //JLabel labelCLUB=new JLabel("Club");
		frame = new JFrame();
		frame.setBounds(100, 100, 704, 394);
		frame.setTitle("NEW_ABONNEMENT");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Pane.setForeground(Color.WHITE);
		 Pane.setBackground(Color.DARK_GRAY);
		 Pane.setBorder(new EmptyBorder(10, 10, 5, 5));
		 labelCIN.setForeground(Color.WHITE);
		 //label.setBackground(Color.BLUE);
		 labelNOM.setForeground(Color.WHITE);
		 labelPRENOM.setForeground(Color.WHITE);
		 labelCODE.setForeground(Color.WHITE);
		 //labelCLUB.setForeground(Color.black);
		 //labelCLUB.setBounds(120, 450, 70, 50);
	
		 JTextField	nomSaison = new JTextField();
		 nomSaison.setBounds(470, 61, 178, 30);
		 JTextField	nomSaison1 = new JTextField();
		 nomSaison1.setBounds(470, 112, 178, 30);
		 JTextField	nomSaison2 = new JTextField();
		 nomSaison2.setBounds(470, 160, 178, 30);
		 JTextField	nomSaison3 = new JTextField();
		 nomSaison3.setBounds(470, 201, 178, 30);
			Pane.setLayout(null);
			//nomSaison4.setBounds(200, 450, 1000, 50);
			Pane.add(nomSaison);
			Pane.add(nomSaison1);
			Pane.add(nomSaison2);
			Pane.add(nomSaison3);
			//Pane.add(nomSaison4);
			nomSaison.setColumns(10);
			JButton jbn= new JButton("Validée");
			jbn.setBounds(375, 297, 100, 30);
			JButton jbn2= new JButton("annuler");
			jbn2.setBounds(509, 297, 100, 30);
			jbn.setBackground(Color.GRAY);
			jbn2.setBackground(Color.GRAY);
			
			
			
		 Pane.add(labelCIN) ;
		 Pane.add( labelNOM);
		 Pane.add( labelPRENOM);
		 Pane.add(labelCODE);
		// Pane.add(labelCLUB);
		 Pane.add(jbn);
		 
		 Pane.add(jbn2);
		 frame.getContentPane().add(Pane) ;
		 
		 JCheckBox chckbxNewCheckBox = new JCheckBox("I am not robot");
		 chckbxNewCheckBox.setForeground(Color.WHITE);
		 chckbxNewCheckBox.setBackground(Color.DARK_GRAY);
		 chckbxNewCheckBox.setBounds(317, 255, 106, 23);
		 Pane.add(chckbxNewCheckBox);
		 
		 JLabel lblNewLabel = new JLabel("New label");
		 lblNewLabel.setIcon(new ImageIcon(FaireAbonnement.class.getResource("/Projetimg/sd.jpg")));
		 lblNewLabel.setBounds(0, 0, 297, 355);
		 Pane.add(lblNewLabel);
		 
	
	
	
	
	
	

		 jbn2.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) 
				{
		 Main m=new Main(gc);
			m.frame.setVisible(true);
			frame.setVisible(false);
				}});
	
		 jbn.addActionListener(new ActionListener() {
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
			 boolean test=false,test1=false;
				public void actionPerformed(ActionEvent e) {
					if( chckbxNewCheckBox.isSelected()==true)
					{
					String s= nomSaison.getText();
				    if ( verfier(s,nomSaison))    
					if(s.length()  !=  8)
						nomSaison.setText("Enter a true CIN");
					{
						test=true;
					}
					
					
					s=nomSaison3.getText();
					if (verfier(s,nomSaison3))
					if(s.length() != 8)
						nomSaison3.setText("Enter a true code");
					else
					{
						test1=true;
					}
					
				
					
					
					if (test && test1  )
					{ 
						Abonne abné=null ;
						   Abonnement abn=null ;
						
						abn=new Abonnement();
					
					int i=Integer.parseInt(nomSaison.getText());  
					abné=new Abonne(i,nomSaison1.getText(),nomSaison2.getText());
					abné.SetAbonnement(abn);
						Sure.i=1;
					
						Sure su= new Sure(gc,abné,null);
						su.frame.setVisible(true);
						
					
				
					}
					
					
					
					
					
					}
				}
		 });

	
	
	
	
	
	
	}
}
				
			
		

