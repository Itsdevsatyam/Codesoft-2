package gradecoventer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class mainmenu {
    private static JLabel[] sl;
    private static JTextField[] subjectFields;
    private static JButton b1,b2;
    private static JLabel rl;
    private static JFrame frame;
    public static int totalMarks; 
    public static String formattedPercentage;
    public static String grade;

    public static void mainmenu() {
    	System.out.println("f:"+ subjects.choice);
        frame = new JFrame(); // Initialize the JFrame
        frame.getContentPane().setBackground(new Color(0, 204, 144));
        frame.setTitle("Student Grade Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocation(400,150);

        // Replace 'subjects.choice' with a specific number of subjects, e.g., 5
        int numSubjects = subjects.choice;
        System.out.println("S:"+numSubjects);
        sl = new JLabel[numSubjects];
        subjectFields = new JTextField[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            sl[i] = new JLabel("Subject " + (i + 1) + " Marks: ");
            sl[i].setBounds(10, 10 + i * 30, 180, 20);
            frame.add(sl[i]);

            subjectFields[i] = new JTextField(10);
            subjectFields[i].setBounds(140, 10 + i * 30, 90, 20);
            frame.add(subjectFields[i]);
            sl[i].setForeground(Color.WHITE);
            
        }

        b1 = new JButton("Calculate");
        b2 = new JButton("Back");

        b1.setBounds(320, 200, 120, 30);
        b2.setBounds(20, 200, 120, 30);
        frame.add(b1);
        frame.add(b2);

        rl = new JLabel("");
        rl.setBounds(10, 240, 300, 20);
        frame.add(rl);
        rl.setBackground(new Color(113, 128, 255));
        rl.setForeground(Color.WHITE);
        
        b1.setBackground(new Color(32, 234, 151));
        b1.setForeground(Color.WHITE);
        b2.setBackground(new Color(32, 234, 151));
        b2.setForeground(Color.WHITE);
       

       b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateAndDisplayResult();
            }
        });
       b2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               frame.dispose();
              new subjects();
           }
       });

        frame.setSize(500, 300); 
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    
    private static void calculateAndDisplayResult() {
        totalMarks = 0;
        int choice = sl.length;

       
        for (int i = 0; i < choice; i++) {
            String subjectMarksStr = subjectFields[i].getText();
            if (!subjectMarksStr.isEmpty()) {
                int subjectMarks = Integer.parseInt(subjectMarksStr);
               if( subjectMarks<0 || subjectMarks >100) {
            	   JOptionPane.showMessageDialog(null, "Input marks are invaild ");
            	   
            	   return;
            	   
               }
               else {
                totalMarks += subjectMarks;
               }
            }
            else {
            	 JOptionPane.showMessageDialog(null, "Empty entity ");
            	 return;
            }
            
        }

        if (choice > 0) {
            double averagePercentage = (double) totalMarks / (choice * 100) * 100;
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            formattedPercentage = decimalFormat.format(averagePercentage);
                 
         
          grade = calculateGrade(averagePercentage);
         
    new grade();
          }
    }

    private static String calculateGrade(double percentage) {
      if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if(totalMarks==0) {
        	return "No Grade";
        }
        else {
            return "F";
        }
	
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new mainmenu();
        });
    }
}
