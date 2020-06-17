// these imports are from Java Swing library
import javax.swing.*;

//these imports are from awt- Abstract Windowing Toolkit
import java.awt.*;
/*import java.awt.event.*;
import java.awt.FlowLayout;*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Morse2English {

	public static void main(String[] args) {
		M2E obj1 = new M2E();
	}
}

class M2E extends JFrame{
	
	JLabel  e2m,text,res,ans;
	JButton convert;
	JTextField input;
	Container c;
	
	public M2E() {
		
		c=getContentPane();
		c.setLayout(null);
		
		//FIrst Label with Bounds;
		e2m = new JLabel("Morse Code to English");
		e2m.setBounds(130,10,150,30);

		text = new JLabel("Input Morse Code text below");
		text.setBounds(125,50,200,30);
		
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
		
		setTitle("Morse to English");
		
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
			System.out.println(s);
			
			// Step1: Converting / separated string to String[]
			String words[] = new String[100];
			String letters[] = new String[100];
			//String temp[] = new String[100];
			String s1=null,answer="";
			
			words = s.split("/");
			
			for(int j=0; j<words.length; j++)
			{ System.out.println(words[j]);}
			

			for(int i=0; i<words.length; i++){
				letters= words[i].split(" ");
				
				for(int j=0; j<letters.length; j++)
				{
					String x = letters[j];
					s1= morseEncode(x);
					answer= answer +s1;
				}
				
				answer = answer + " ";
			}
			
			ans.setText(answer);
			
		});
		
			
	}
	
	 public static String morseEncode(String x)  
	    { 
	       //String currentLetter = x;
	       //MorseTable SwitchCase 
		 
		 //HashMap Implementation can also be done.
		 /*HashMap<String,String> lookup = new HashMap<String,String>();
		 lookup.put(".-", "a");
		 return lookup.get(x);*/
		 
	       switch (x)  
	        { 
	            case ".-": 
	            	return "a"; 
	            case "-...":
	            	return "b"; 
	            case "-.-.": 	
	            	return "c"; 
	            case "-..": 
	                return "d"; 
	            case ".": 
	                return "e"; 
	            case "..-.": 
	                return "f"; 
	            case "--.": 
	                return "g"; 
	            case "....": 
	                return "h"; 
	            case "..": 
	                return "i"; 
	            case ".---": 
	                return "j"; 
	            case "-.-": 
	                return "k"; 
	            case ".-..": 
	                return "l"; 
	            case "--": 
	                return "m"; 
	            case "-.": 
	                return "n"; 
	            case "---": 
	                return "o"; 
	            case ".--.": 
	                return "p"; 
	            case "--.-": 
	                return "q"; 
	            case ".-.": 
	                return "r"; 
	            case "...": 
	                return "s"; 
	            case "-": 
	                return "t"; 
	            case "..-": 
	                return "u"; 
	            case "...-": 
	                return "v"; 
	            case ".--": 
	                return "w" ; 
	            case "-..-": 
	                return "x"; 
	            case "-.--": 
	                return "y"; 
	            case "--..": 
	                return "z"; 
	        }
	        // for space 
	        return "";
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