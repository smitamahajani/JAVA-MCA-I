import javax.swing.*;  
class ScrollBarExample  
{  
ScrollBarExample(){  
    JFrame f= new JFrame("Scrollbar Example");  
 JScrollBar s=new JScrollBar();  
s.setBounds(100,100, 20,100);  
f.add(s);  
f.setSize(600,600);  
f.setLayout(null);  
f.setVisible(true);  
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
public static void main(String args[])  
{  
new ScrollBarExample();  
}}  