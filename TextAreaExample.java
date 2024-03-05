import javax.swing.*;  
public class TextAreaExample  
{  
     TextAreaExample(){  
        JFrame f= new JFrame();  
        JTextArea area=new JTextArea("Welcome to  TextAreaExample  ");  
        area.setBounds(10,30, 200,200);  
        f.add(area);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     }  
public static void main(String args[])  
    {  
   new TextAreaExample();  
    }}  