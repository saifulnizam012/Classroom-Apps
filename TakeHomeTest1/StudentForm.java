package TakeHomeTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class StudentForm extends JFrame {

	protected static final String Gender = null;
	JPanel studentPane;
	private JTextField studentName;
	private JTextField ID;
	private JTextField year;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentForm frame = new StudentForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentForm() {
		setTitle("Student Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		studentPane = new JPanel();
		studentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(studentPane);
		studentPane.setLayout(null);
		
		JLabel NameLabel = new JLabel("Name :");
		NameLabel.setBounds(11, 14, 54, 14);
		studentPane.add(NameLabel);
		
		studentName = new JTextField();
		studentName.setBounds(90, 11, 243, 20);
		studentPane.add(studentName);
		studentName.setColumns(10);
		
		JLabel IDLabel = new JLabel("ID :");
		IDLabel.setBounds(11, 40, 54, 14);
		studentPane.add(IDLabel);
		
		ID = new JTextField();
		ID.setBounds(90, 37, 110, 20);
		studentPane.add(ID);
		ID.setColumns(10);
		
		JLabel YearLabel = new JLabel("Year :");
		YearLabel.setBounds(253, 42, 54, 14);
		studentPane.add(YearLabel);
		
		year = new JTextField();
		year.setBounds(292, 37, 90, 20);
		studentPane.add(year);
		year.setColumns(10);
		
		JLabel GenderLabel = new JLabel("Gender :");
		GenderLabel.setBounds(11, 67, 73, 14);
		studentPane.add(GenderLabel);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(90, 63, 110, 23);
		studentPane.add(female);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(206, 63, 127, 23);
		studentPane.add(male);
		
		ButtonGroup G1 = new ButtonGroup();
		getContentPane().add(female);
		getContentPane().add(male);
		G1.add(female);
		G1.add(male);
		
		JLabel ClassLabel = new JLabel("Class :");
		ClassLabel.setBounds(11, 95, 54, 14);
		studentPane.add(ClassLabel);
		
		JLabel SubjectLabel = new JLabel("Subject taken :");
		SubjectLabel.setBounds(11, 122, 90, 14);
		studentPane.add(SubjectLabel);
		
		JCheckBox BM = new JCheckBox("Bahasa Melayu");
		BM.setBounds(90, 118, 121, 23);
		studentPane.add(BM);
		
		JCheckBox MT = new JCheckBox("Matematik");
		MT.setBounds(216, 118, 127, 23);
		studentPane.add(MT);
		
		JCheckBox KM = new JCheckBox("Kimia");
		KM.setBounds(341, 118, 121, 23);
		studentPane.add(KM);
		
		JCheckBox BI = new JCheckBox("Bahasa Inggeris");
		BI.setBounds(90, 147, 121, 23);
		studentPane.add(BI);
		
		JCheckBox MTT = new JCheckBox("Matematik Tambahan");
		MTT.setBounds(216, 147, 127, 23);
		studentPane.add(MTT);
		
		JCheckBox BL = new JCheckBox("Biologi");
		BL.setBounds(341, 147, 90, 23);
		studentPane.add(BL);
		
		JCheckBox PI = new JCheckBox("Pendidikan Islam");
		PI.setBounds(90, 176, 127, 23);
		studentPane.add(PI);
		
		JCheckBox AK = new JCheckBox("Perakaunan");
		AK.setBounds(216, 176, 127, 23);
		studentPane.add(AK);
		
		JCheckBox FZ = new JCheckBox("Fizik");
		FZ.setBounds(341, 176, 90, 23);
		studentPane.add(FZ);
		
		JCheckBox PM = new JCheckBox("Pendidikan Moral");
		PM.setBounds(90, 205, 127, 23);
		studentPane.add(PM);
		
		JCheckBox AD = new JCheckBox("Perdagangan");
		AD.setBounds(216, 205, 127, 23);
		studentPane.add(AD);
		
		JCheckBox Sn = new JCheckBox("Seni");
		Sn.setBounds(341, 205, 90, 23);
		studentPane.add(Sn);
		
		
		JRadioButton a = new JRadioButton("A");
		a.setBounds(91, 91, 54, 23);
		studentPane.add(a);
		
		JRadioButton b = new JRadioButton("B");
		b.setBounds(149, 91, 51, 23);
		studentPane.add(b);
		
		JRadioButton c = new JRadioButton("C");
		c.setBounds(206, 89, 54, 23);
		studentPane.add(c);
		
		JRadioButton d = new JRadioButton("D");
		d.setBounds(262, 89, 109, 23);
		studentPane.add(d);
		
		ButtonGroup G3 = new ButtonGroup();
		
		getContentPane().add(a);
		getContentPane().add(b);
		getContentPane().add(c);
		getContentPane().add(d);
		
		G3.add(a);
		G3.add(b);
		G3.add(c);
		G3.add(d);
		
		
		Button close = new Button("Close");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClassroomApps sf = new ClassroomApps();
				dispose();
			}
		});
		close.setBounds(11, 236, 70, 22);
		studentPane.add(close);
		
		
		Button Submit = new Button("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = studentName.getText().toString().trim();
				String id = ID.getText().toString().trim();
				
				String str = id + " " + name ;
				String url = "user.txl";
				FileReader fr;
				try {
					fr = new FileReader(url);
					BufferedReader br = new BufferedReader(fr);
					String next_line;
					row_Temp.clearScript();
					try {
						next_line = br.readLine();
						while(next_line != null) {
							row_Temp rt = new row_Temp();
							rt.setscript(next_line);
							next_line = br.readLine();
						}
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						System.out.println("Error : Problem at reading lines.");
						e1.printStackTrace();
					}	
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					System.out.println("Error : User Details contained file not found.");
					e1.printStackTrace();
				}
				//END
				
				try {
					FileWriter fw = new FileWriter(url);
					int length = row_Temp.getscriptsize();
					for(int l=0; l<=length; l++) {
						if(l!=length) {
							fw.write(row_Temp.getscript(l) + "\n");
						}
						if(l==length){
							fw.write(str);
						}
					}
					fw.close();
					row_Temp.clearScript();
					//frame.setVisible(false);
					StudentForm umf = new StudentForm();
					//umf.main(null);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				row_Temp tab = new row_Temp();
				tab.setVisible(true);
				
				
				StudentSubmission sub = new StudentSubmission();
                sub.setVisible(true);
				
				
			}
				
			});
		Submit.setBounds(341, 234, 70, 22);
		studentPane.add(Submit);
	}

}
