import javax.swing.*;  
public class CheckBoxExample  
{  
     CheckBoxExample(){  
        JFrame f= new JFrame("CheckBox Example");  
        JCheckBox checkBox1 = new JCheckBox("MCA 1");  
        checkBox1.setBounds(100,100, 100,50);  
        JCheckBox checkBox2 = new JCheckBox("MCA 2", true);  
        checkBox2.setBounds(100,150, 100,50);  
        f.add(checkBox1);  
        f.add(checkBox2);  
        f.setSize(1000,1000);  
        f.setLayout(null);  
        f.setVisible(true);  
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
     }  
public static void main(String args[])  
    {  
    new CheckBoxExample();  
    }}  
