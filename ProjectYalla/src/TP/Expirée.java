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
import java.awt.Font;

public class Expirée {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Expirée window = new Expirée();
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
	public Expirée() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JPanel Pane = new JPanel();
	JLabel label=new JLabel(" Date Expirée !  ");
	 JButton jbn= new JButton("Back");

	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Warning");
		frame.setBounds(100, 100, 400, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		Pane.setBackground(Color.red);
		 Pane.setBorder(new EmptyBorder(10, 10, 10, 10));
		 Pane.setLayout(null);
		 label.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		 label.setBounds(86, 24, 115, 14);
		 Pane.add(label);
		
		 frame.getContentPane().add(Pane);
		 jbn.setBackground(Color.LIGHT_GRAY);
		 jbn.setBounds(212, 21, 70, 23);
		 
		 
		 Pane.add(jbn);
	
	
	
		 jbn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					frame.setVisible(false);
				}});
	
	
	
	
	
	}
	
	
}



/*public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
	public void run() {
		try {
			Expirée window = new Expirée();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
});
}*/
