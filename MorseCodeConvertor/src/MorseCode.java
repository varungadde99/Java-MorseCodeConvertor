// these imports are from Java Swing library
import javax.swing.*;

//these imports are from awt- Abstract Windowing Toolkit
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;


public class MorseCode {

	public static void main(String[] args) {
		Login obj = new Login();
	}
	
}

class Login extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	JLabel  welcome;
	JButton b1;
	JButton b2;
	
	
	//Constructor
	public Login() {
		
		//Creating elements for SwingGUI Window.
		b1 = new JButton("English to Morse Code");
		b2 = new JButton("Morse Code to English");
		welcome = new JLabel("Welcome to Java based Morse Code Convertor");
		
		//Adding elements on SwingGUI Window.
		add(welcome);
		add(b1);
		add(b2);
		
		 // To avoid the redundant code of ActionListener by concepts of
		//Inner Class + Lambda Expressions of SE8 and write the following 
	   //compact code.
		b1.addActionListener(ae_eng_to_morse ->
		{
			//Call the English2Morse Frame
			new E2M();
			dispose();
			
		});
		
		b2.addActionListener(ae_morse_to_eng ->
		{
			
		});
		
		setTitle("Convertor");
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
	
}