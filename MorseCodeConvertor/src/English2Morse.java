// these imports are from Java Swing library
import javax.swing.*;

//these imports are from awt- Abstract Windowing Toolkit
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;


public class English2Morse {

	public static void main(String[] args) {
		E2M obj1 = new E2M();
	}
}

class E2M extends JFrame{
	
	JLabel  e2m;
	
	public E2M() {
		e2m = new JLabel("English to Morse Code");
		add(e2m);
		
		setTitle("English to Morse");
		setLayout(new FlowLayout());
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}