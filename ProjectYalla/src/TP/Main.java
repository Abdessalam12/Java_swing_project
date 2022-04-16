
//Notre projet est la gestion de ticket d'un stade :
//petits Remarque:
//Il faut entrer un cin ou un code bancaire de 8 chiffre .
//les code de ticket  et d'abonnement  est important . 
//l'abonné a un ticket d ' un cout moins important
//Il faut  charger l'abonnement pour baiser le prix du ticket

package TP;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Main {

	public  JFrame frame;
	private  Gerer_client gc= null;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args)  {
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		
			gc=new  Gerer_client();
		
		initialize();
	}
	public Main(Gerer_client gc) {
		this.gc=gc;
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 608, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Acheter abonnement");
		btnNewButton.setBounds(349, 125, 147, 23);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Consulter abonnement");
		btnNewButton_1.setBounds(349, 81, 147, 23);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		     
				{
					
				Consulter_abonnement window1= new Consulter_abonnement(gc);
				window1.frame.setVisible(true); 
				frame.setVisible(false);
				}
				
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Recharger abonnement");
		btnNewButton_1_1.setBounds(349, 193, 147, 23);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Recharger_abonnement RA= new Recharger_abonnement(gc);
				RA.frame.setVisible(true);
				frame.setVisible(false);
				
				
			}
		});
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Annuler ticket");
		btnNewButton_1_1_1.setBounds(349, 234, 147, 23);
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().add(btnNewButton_1_1_1);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Annuler_ticket At= new Annuler_ticket(gc);
				At.frame.setVisible(true);
				frame.setVisible(false);
				
				
			}});
		
		JButton btnNewButton_1_1_1_1 = new JButton("Acheter ticket ");
		btnNewButton_1_1_1_1.setBounds(349, 159, 147, 23);
		btnNewButton_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acheter_ticket At= new Acheter_ticket(gc);
				Acheter_ticket.frame.setVisible(true);
				frame.setVisible(false);
				
				
			}});
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("2020-2021");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(130, 108, 73, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("YALLA SHOOT");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(88, 55, 152, 67);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/Projetimg/imgmain (2).jpg")));
		lblNewLabel.setBounds(0, 0, 592, 361);
		frame.getContentPane().add(lblNewLabel);
	
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FaireAbonnement window= new FaireAbonnement (gc) ;
				window.frame.setVisible(true); 
				frame.setVisible(false);
				
						
				
				
			}});	
	
		frame.setVisible(true);
	
	
	
	
	
	}
}