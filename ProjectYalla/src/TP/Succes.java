package TP;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Succes {
     Gerer_client gc ;
	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Succes window = new Succes();
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
	public Succes() {
		initialize();
	}
	public Succes(Gerer_client gc ) {
		this.gc=gc;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JPanel Pane = new JPanel();
	JLabel label=new JLabel(" load successfully !  ");
	 JButton jbn= new JButton("Back");

	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Warning");
		frame.setBounds(100, 100, 438, 156);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		Pane.setBackground(Color.green);
		 Pane.setBorder(new EmptyBorder(10, 10, 10, 10));
		 Pane.setLayout(null);
		 label.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		 label.setBounds(97, 55, 125, 14);
		 Pane.add(label);
		
		 frame.getContentPane().add(Pane);
		 jbn.setBackground(Color.LIGHT_GRAY);
		 jbn.setBounds(243, 51, 78, 23);
		 
		 
		 Pane.add(jbn);
	
	
	
		 jbn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					frame.setVisible(false);
				}});
	
	
	
	
	
	}
	

}
