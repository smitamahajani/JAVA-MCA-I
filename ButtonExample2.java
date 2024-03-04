import javax.swing.*;      
public class ButtonExample2
{    
ButtonExample2()
{    
JFrame f=new JFrame("Button Example");            
//JButton b=new JButton(new ImageIcon("D:\\icon.png"));
JButton b=new JButton(new ImageIcon("C:\\Screenshot 2023-12-15 135730.png"));    
b.setBounds(500,500,500, 540);    
f.add(b);    
f.setSize(300,400);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new ButtonExample2();    
}    
}    