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

public class Erreur {

	public JFrame frame;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Erreur() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JPanel Pane = new JPanel();
	JLabel label=new JLabel(" You insert false data or you not subscriber !  ");
	 JButton jbn= new JButton("Back");

	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Warning");
		frame.setBounds(100, 100, 437, 111);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		Pane.setBackground(Color.LIGHT_GRAY);
		 Pane.setBorder(new EmptyBorder(10, 10, 10, 10));
		 Pane.setLayout(null);
		 label.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		 label.setBounds(10, 25, 289, 14);
		 Pane.add(label);
		
		 frame.getContentPane().add(Pane);
		 jbn.setBackground(Color.LIGHT_GRAY);
		 jbn.setBounds(321, 22, 72, 23);
		 
		 
		 Pane.add(jbn);
	
	
	
		 jbn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					frame.setVisible(false);
				}});
	
	
	
	
	
	}
	
	
}
