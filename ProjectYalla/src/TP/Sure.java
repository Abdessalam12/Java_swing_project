package TP;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class Sure extends JFrame {
	 public JFrame frame;
	 public static int i =0 ;
	 public  Client cl=null;
	  Gerer_client gc=null ;
	  Abonne abné=null;
	 public int bonus , nbre ;
	/*public static void main(String[] args) {
		 
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sure window = new Sure( gc,abné);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	public Sure(Gerer_client gc,Abonne abné,Client cl ) {
		this.gc=gc;
		this.cl=cl;
		this.abné=abné;
		initialize(gc,abné);
	}
    
		private void initialize(Gerer_client gc,Abonne abné) {
		
	
	
	Erreur window3= new Erreur();
	

		 frame = new JFrame();
		JPanel Pane = new JPanel();
		 JLabel label=new JLabel(" Are you sure !  ");
		 JCheckBox chckbxNewCheckBox = new JCheckBox("YES",true);
		 JCheckBox chckbxNewCheckBox1 = new JCheckBox("NO",false);
		 JButton btn= new JButton("Validée");
			

			frame = new JFrame();
			frame.setBounds(100, 100, 450, 100);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
			frame.setVisible(true);
			 
			 label.setBounds(0, 0, 71, 70);
			 
			    Pane.add(label);
			 Pane.add(chckbxNewCheckBox);
			 Pane.add(chckbxNewCheckBox1);
			 btn.setBounds(200, 70, 90, 30);
				btn.setBackground(Color.orange);
				
				Pane.add(btn);
				
		frame.getContentPane().add(Pane);

			 Pane.setBackground(Color.pink);
			 Pane.setBorder(new EmptyBorder(10, 10, 10, 10));
			 
			 chckbxNewCheckBox.setBounds(0, 100, 100, 100);
			 chckbxNewCheckBox.setBackground(Color.green);
			 chckbxNewCheckBox1.setBackground(Color.green);
			 chckbxNewCheckBox1.setBounds(0, 100, 200, 200);
			 chckbxNewCheckBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
			 if (chckbxNewCheckBox.isSelected()==true)
					chckbxNewCheckBox1.setSelected(false);
				else 
				{
					chckbxNewCheckBox1.setSelected(true);
				}}});
			 chckbxNewCheckBox1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
			 if (chckbxNewCheckBox1.isSelected()==true)
					chckbxNewCheckBox.setSelected(false);
				else 
				{
					chckbxNewCheckBox.setSelected(true);
				}}});
			 
			 
			 
			 btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 if (chckbxNewCheckBox.isSelected()==false)
						 {   
							 
							 if(i==1 )
							 {
							frame.setVisible(false);
							
							 } 
							 if(i==2)
							 {
							frame.setVisible(false);
						
							 } 
							 if(i==3)
							 {
							frame.setVisible(false);
						
							 } 
							
						 }
						 else 
						 {
							 
						if(i==1)
					{     
							gc.Enregistrer_Abonne(abné);
						    Félicitations window1 = new Félicitations(gc);
						    window1.frame.setVisible(true);
						    frame.setVisible(false);
						    FaireAbonnement.frame.setVisible(false);
							         
					}
							        if(i==2)
							        {
							        	
							        	Voir_abonnement Va = new Voir_abonnement(gc);
							        	Va.frame.setVisible(true);
							        	Consulter_abonnement.frame.setVisible(false);
							        	 frame.setVisible(false);
							        }
							       
							 if(i==3)
							 {
								
								 gc.Enregistrer_client(cl);
								 System.out.print(cl.tk.compétition);
								Voir_ticket vt =new  Voir_ticket(gc,cl);
								 vt.frame.setVisible(true);
								 Acheter_ticket.frame.setVisible(false);
								 frame.setVisible(false);
								
								 
							 }
							
						 }
						
						
						
					}});
			 
			 
			 
			 
			



		
	}

	/**
	 * Launch the application.
	 */
	

}
