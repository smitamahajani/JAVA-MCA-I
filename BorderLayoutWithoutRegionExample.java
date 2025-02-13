//import statements 


/*The add() method of the JFrame class can work even when we do not specify the region.
 In such a case, only the latest component added is shown in the frame, and all the components added previously get discarded. 
 The latest component covers the whole area. The following example shows the same.

 */
import java.awt.*;    
import javax.swing.*;    
    
public class BorderLayoutWithoutRegionExample  
{     
JFrame jframe;    
  
// constructor  
BorderLayoutWithoutRegionExample()  
{     
    jframe = new JFrame();    
        
    JButton btn1 = new JButton("NORTH");    
    JButton btn2 = new JButton("SOUTH");    
    JButton btn3 = new JButton("EAST");   
    JButton btn4 = new JButton("WEST");    
    JButton btn5 = new JButton("CENTER");  
      
    // horizontal gap is 7, and the vertical gap is 7  
    // Since region is not specified, the gaps are of no use  
    jframe.setLayout(new BorderLayout(7, 7));  
      
    // each button covers the whole area  
    // however, the btn5 is the latest button   
    // that is added to the frame; therefore, btn5   
    // is shown  
   // jframe.add(btn1);    
    jframe.add(btn2);    
    jframe.add(btn3);  
    jframe.add(btn4);  
    jframe.add(btn5);
    jframe.add(btn1);  
        
    jframe.setSize(300,300);    
    jframe.setVisible(true);
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
}    
  
// main method  
public static void main(String argvs[])   
{    
    new BorderLayoutWithoutRegionExample();    
}    
}   
