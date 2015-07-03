import java.util.Random;
import javax.swing.JOptionPane;



/*****************************************************************************
 *****************************************************************************
 * @author tofu.
 * 
 * @version 1.0
 *****************************************************************************
 * ***************************************************************************
 */
public class PhilSTL {
    
    public static void main(String[]args){
        
        int n1, n2;
        int max = (38);
	int min = (1);
	String  str;
		
	Random random = new Random();
		
	n1 = random.nextInt((max - min) + 1) + min;
	n2 = random.nextInt((max - min) + 1) + min;
	
				
	str = "Lucky combination for today:  " + n1 + " x " + n2;
		
	JOptionPane.showMessageDialog(null, str, "PhilSTL by tofu.", +
                                       JOptionPane.INFORMATION_MESSAGE);
			
	System.exit(0);
                
                
        }

  
    }
