package TakeHomeTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class ClassroomApps {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassroomApps window = new ClassroomApps();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClassroomApps() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
			
		JTextPane txtpnWelcomeToClassroom = new JTextPane();
		txtpnWelcomeToClassroom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnWelcomeToClassroom.setBackground(SystemColor.inactiveCaption);
		txtpnWelcomeToClassroom.setEditable(false);
		txtpnWelcomeToClassroom.setText("Welcome to classroom\r\nfor SPM student");
		txtpnWelcomeToClassroom.setBounds(141, 68, 155, 51);
		frame.getContentPane().add(txtpnWelcomeToClassroom);
		
		Button Student = new Button("Student");
		Student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentForm sf = new StudentForm();
				sf.setVisible(true);
				frame.dispose();
			}
		});
		Student.setBounds(106, 171, 70, 22);
		frame.getContentPane().add(Student);
		
		Button Teacher = new Button("Teacher");
		Teacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherForm sf = new TeacherForm();
				sf.setVisible(true);
				frame.dispose();
			}
		});
		Teacher.setBounds(267, 171, 70, 22);
		frame.getContentPane().add(Teacher);
	}
	
	


}
