package gradecoventer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class grade {
    private static JLabel total;
    private static JLabel[] sl;
    private static JTextField[] subjectFields;
    
    private static JLabel avg;
    private static String grade1;
    private static JButton back;
    private static JFrame f;
    public static int totalMarks; 
    public static String formattedPercentage;
    public static JLabel grade;


   grade() {
	   f=new JFrame();
        f.setTitle("Grade Calculator");
        f.getContentPane().setBackground(new Color(0, 204, 144));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        total = new JLabel("Total Marks: ");
        avg = new JLabel("Average: ");
        grade = new JLabel("Grade:");
        back = new JButton("Back");
       total.setBounds(10,50,200,30);
       avg.setBounds(10,100,200,30);
       grade.setBounds(10,150,200,30);
       back.setBounds(0,200,100,30);
       back.setBackground(new Color(32, 234, 151));
       back.setForeground(Color.WHITE);
       total.setForeground(Color.WHITE);
       avg.setForeground(Color.WHITE);
       grade.setForeground(Color.WHITE);
       total.setText("Total Marks : " + mainmenu.totalMarks);
       avg.setText("Avgrage : "+mainmenu.formattedPercentage);
       grade.setText("Grade : "+mainmenu.grade);
        f.add(total);
        f.add(avg);
        f.add(grade);
        f.add(back);
        f.setVisible(true);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

       f.setSize(500,300);
        f.setLocationRelativeTo(null);
    }
  

    public static void main(String[] args) {
       new grade();
    }
}

