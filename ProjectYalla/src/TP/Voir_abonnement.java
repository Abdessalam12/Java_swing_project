package TP;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
public class Voir_abonnement {

	public JFrame frame;
	public  static int bonus, nbre;
    Gerer_client gc ;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Voir_abonnement(Gerer_client gc ) {
		//this.bonus=bonus;
		this.gc=gc ;
		
		//this.nbre=nbre;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JPanel Pane = new JPanel();
	private void initialize() {
		
		JLabel label=new JLabel("   Bonus");
		JLabel label1=new JLabel("  Nbre de partie entrée");
		
		  
		 
		 JTextArea	nomSaison = new  JTextArea();
		 JTextArea	nomSaison1 = new  JTextArea();
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setTitle("Votre Abonnement");
		
		 nomSaison.setBounds(267, 50, 314, 50);
			nomSaison1.setBounds(267, 150, 314, 50);
			 label.setForeground(Color.blue);
			 label.setBounds(21, 50, 169, 57);
			 Pane.setLayout(null);
			label1.setForeground(Color.blue);
			 label1.setBounds(21, 150, 182,50);
			 Border lineborder = BorderFactory.createLineBorder(Color.black, 3); 
			 label.setBorder(lineborder);
			 label1.setBorder(lineborder);
		 Pane.setBackground(Color.yellow);
		 Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		 Pane.add(label);
		 Pane.add(label1);
		 Pane.add(nomSaison);
		 Pane.add(nomSaison1);
		  String s = Integer.toString(bonus);
		  String s1 = Integer.toString(nbre);
		 nomSaison.setText(s);
		 nomSaison.setEditable(false);
		 nomSaison1.setText(s1);
		 nomSaison1.setEditable(false);
			
		
		 frame.getContentPane().add(Pane);
		 
		 JButton btnNewButton = new JButton("Back");
		 btnNewButton.setBounds(339, 287, 89, 23);
		 Pane.add(btnNewButton);
		 
		 btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				Main M = new Main(gc);
				M.frame.setVisible(true);
				frame.setVisible(false);
					
				}});
	}
}
