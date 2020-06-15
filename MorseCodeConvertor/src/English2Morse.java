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
		
		center(this);
	}
	
    public static void center(JFrame frame) {
    	 
        // get the size of the screen, on systems with multiple displays,
        // the primary display is used
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
 
        // calculate the new location of the window
        int w = frame.getSize().width;
        int h = frame.getSize().height;
 
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
 
        // moves this component to a new location, the top-left corner of
        // the new location is specified by the x and y
        // parameters in the coordinate space of this component's parent
        frame.setLocation(x, y);
 
    }
	
}