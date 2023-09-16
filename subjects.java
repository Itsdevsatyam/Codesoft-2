package gradecoventer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class subjects {
	public static int choice;
	private static JTextField tf;
	private static JButton b1;
	private static JLabel l;
	private static JFrame f;
	        
	        

        subjects(){        
		

        f = new JFrame(); 
        f.getContentPane().setBackground(new Color(0, 204, 144));
        f.setTitle("Student Grade Calculator");
        f.setLocation(488,213);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(400, 300);
        l=new JLabel("Enter the no. of subjects");
        l.setForeground(Color.WHITE);
       
        l.setBounds(10,50,200,20);
        tf=new JTextField();
        tf.setBounds(200,50,80,20);
        
        b1=new JButton("Continue");
        b1.setBounds(110,130,110,30);
        b1.setBackground(new Color(32, 234, 151));
        b1.setForeground(Color.WHITE);
        
        f.add(tf);
        f.add(l);
        f.add(b1);
        
         f.setVisible(true);
        
	     b1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	String s=tf.getText();
	            	 
	            	 if(s.isEmpty()) 
	            	 {
	            		 JOptionPane.showMessageDialog(null, "Enter a number");
	            	 }
	            	 else { 
	            		 choice = Integer.parseInt(tf.getText());	            	 
	            		 if (choice >6) {
	            		
	            		 JOptionPane.showMessageDialog(null, "Enter the no less than or equal to 6");
	            		 
	            	 }
	            	 else {
	            		 choice=Integer.parseInt(tf.getText());
	            	mainmenu.mainmenu();
	            	f.dispose();
	            	System.out.println(choice);
	            }
	            	 }
	            	 }
	        });
}
        
	public static void main(String[]args) {
		new subjects();
	}
}