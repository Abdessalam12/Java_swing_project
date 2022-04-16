package TP;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Félicitations {

	public JFrame frame;
	 Gerer_client gc=null;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Félicitations(Gerer_client gc) {
		this.gc=gc;
		initialize(gc);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JPanel Pane = new JPanel();
	JLabel label=new JLabel(" Congratulation your Code is ( save your code):  ");

	 JButton jbn= new JButton("Back");
	 JTextArea	textField = new  JTextArea();
	//private final JTextField textField = new JTextField();
	private void initialize(Gerer_client gc) {
		textField.setBounds(270, 15, 84, 22);
		textField.setColumns(10);
		frame = new JFrame();
		frame.setTitle("Congratulation");
		frame.setBounds(100, 100, 400, 151);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Pane.setBackground(new Color(51, 255, 0));
		 Pane.setBorder(new EmptyBorder(10, 10, 10, 10));
		 Pane.setLayout(null);
		 label.setBounds(30, 19, 235, 14);
	
			
		 Pane.add(label);
		
		 frame.getContentPane().add(Pane);
		 String s=Integer.toString(gc.getCode());
		 textField.setText( s);
		 textField.setEditable(false);
		 Pane.add(textField);
		 jbn.setBackground(Color.LIGHT_GRAY);
		 jbn.setBounds(141, 55, 55, 23);
		 Pane.add(jbn);
	
	jbn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			Main m=new Main(gc);
			m.frame.setVisible(true);
			
			
			
		}});


	
	
	}}
