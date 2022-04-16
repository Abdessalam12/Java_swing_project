package TP;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class Voir_ticket {

	public JFrame frame;
	public int prix;
	Gerer_client gc=null; ;
	Client cl = null ;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Voir_ticket(Gerer_client gc , Client cl) {
	this.gc=gc;
	this.cl=cl;
	
		initialize(gc,cl);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Gerer_client gc , Client cl) {
		frame = new JFrame();
		 JButton jbn= new JButton("Back");
		 jbn.setBounds(389,141,70,40);     
		

		 
		 
		 frame.setTitle("TICKET");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 503, 235);
		frame.setResizable(false);
		JPanel contentPane = new JPanel();
		 contentPane.add(jbn);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("CIN :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(28, 46, 46, 14);
		contentPane.add(lblNewLabel_1);
		String s=Integer.toString(cl.cin);
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel(s);
		lblNewLabel_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_2.setBounds(118, 46, 79, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Prix de ticket :");
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1.setBounds(26, 154, 79, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		String s1;
		Abonne a = gc.Chercher_Abonné (cl);
		if(a != null)
			s1=Integer.toString(gc.Getprixabn(cl));
		else
		{s1=Integer.toString(cl.tk.Getprix());}
		
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel(s1);
		lblNewLabel_1_1_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_3.setBounds(118, 154, 76, 14);
		contentPane.add(lblNewLabel_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nom :");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(27, 73, 46, 14);
		contentPane.add(lblNewLabel_1_1);
          
		JLabel lblNewLabel_1_1_1_1_4 = new JLabel(cl.nom);
		lblNewLabel_1_1_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_4.setBounds(114, 73, 76, 14);
		contentPane.add(lblNewLabel_1_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Date d'achat :");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(26, 98, 69, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_5 = new JLabel(cl.tk.get_Date_D_Achat());
		lblNewLabel_1_1_1_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_5.setBounds(119, 98, 76, 14);
		contentPane.add(lblNewLabel_1_1_1_1_5);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Code de ticket :");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setBounds(28, 21, 76, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		
		JLabel lblNewLabel_1_1_1_1_5_1 = new JLabel(Integer.toString(cl.tk.Getcode()));
		lblNewLabel_1_1_1_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_5_1.setBounds(127, 21, 76, 14);
		contentPane.add(lblNewLabel_1_1_1_1_5_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Class de ticket :");
		lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setBounds(26, 129, 79, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
	  
		
		
		JLabel lblNewLabel_1_1_1_1_6_1 = new JLabel(cl.tk.Getclass());
		lblNewLabel_1_1_1_1_6_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_6_1.setBounds(127, 128, 76, 14);
		contentPane.add(lblNewLabel_1_1_1_1_6_1);
		
		

		JLabel lblNewLabel_1_1_1_1_7_1 = new JLabel(" Tu peux rendre  le ticket jusqu \u00E0 minuit \r\n(Enregistrer votre code !)");
		lblNewLabel_1_1_1_1_7_1.setForeground(Color.PINK);
		lblNewLabel_1_1_1_1_7_1.setBounds(10, 179, 400, 16);
		contentPane.add(lblNewLabel_1_1_1_1_7_1);
		
		jbn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Main m=new Main(gc);
				m.frame.setVisible(true);
				
				
				
			}});

		frame.getContentPane().add(contentPane);
		
		JLabel lblNewLabel_1_1_1_1_5_1_1 = new JLabel("0");
		lblNewLabel_1_1_1_1_5_1_1.setIcon(new ImageIcon(Voir_ticket.class.getResource("/Projetimg/ticketimg.png")));
		lblNewLabel_1_1_1_1_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_5_1_1.setBounds(0, 0, 504, 211);
		contentPane.add(lblNewLabel_1_1_1_1_5_1_1);
		/*JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Ticket.class.getResource("/images/ticketimg.png")));
		lblNewLabel.setBounds(0, 0, 494, 201);
		contentPane.add(lblNewLabel);*/
	}

}
