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
	
	JLabel  e2m,text,res,ans;
	JButton convert;
	JTextField input;
	Container c;
	public E2M() {
		
				
		c=getContentPane();
		c.setLayout(null);
		
		//FIrst Label with Bounds;
		e2m = new JLabel("English to Morse Code");
		e2m.setBounds(130,10,150,30);

		text = new JLabel("Input English text below");
		text.setBounds(125,50,150,30);
		
		input = new JTextField(300);
		input.setBounds(100,100,200,50);
		
		convert = new JButton("Convert");
		convert.setBounds(145,150,110,30);
		
		res = new JLabel("Text after conversion:");
		res.setBounds(130,200,150,30);
		
		ans = new JLabel();
		ans.setBounds(100,230,500,50);
		
		c.add(e2m);
		c.add(text);
		c.add(input);
		c.add(convert);
		c.add(res);
		c.add(ans);
		
		setTitle("English to Morse");
		
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		center(this);
		
		Font f = new Font("Arial",Font.PLAIN,30);
		ans.setFont(f);
		
		convert.addActionListener(ae_convert ->
		{
			String s = input.getText();
			s = s.toLowerCase();
			String s1,answer="";
			for (int i = 0;i<s.length(); i++) 
			{ 
				s1= morseEncode(s.charAt(i));
				answer = answer + " " + s1;
			} 
			
			ans.setText(answer);
			
		});
		
			
	}
	
	 public static String morseEncode(char x)  
	    { 
	      
	       //MorseTable SwitchCase 
	        switch (x)  
	        { 
	            case 'a': 
	                return ".-"; 
	            case 'b': 
	                return "-..."; 
	            case 'c': 
	                return "-.-."; 
	            case 'd': 
	                return "-.."; 
	            case 'e': 
	                return "."; 
	            case 'f': 
	                return "..-."; 
	            case 'g': 
	                return "--."; 
	            case 'h': 
	                return "...."; 
	            case 'i': 
	                return ".."; 
	            case 'j': 
	                return ".---"; 
	            case 'k': 
	                return "-.-"; 
	            case 'l': 
	                return ".-.."; 
	            case 'm': 
	                return "--"; 
	            case 'n': 
	                return "-."; 
	            case 'o': 
	                return "---"; 
	            case 'p': 
	                return ".--."; 
	            case 'q': 
	                return "--.-"; 
	            case 'r': 
	                return ".-."; 
	            case 's': 
	                return "..."; 
	            case 't': 
	                return "-"; 
	            case 'u': 
	                return "..-"; 
	            case 'v': 
	                return "...-"; 
	            case 'w': 
	                return ".--"; 
	            case 'x': 
	                return "-..-"; 
	            case 'y': 
	                return "-.--"; 
	            case 'z': 
	                return "--.."; 
	        }
	        // for space 
	        return "/"; 
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