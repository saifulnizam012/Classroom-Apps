package TakeHomeTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;

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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;

public class TeacherForm extends JFrame {

	private JPanel teacherPane;
	private JTextField Name;
	private JTextField ID;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherForm frame = new TeacherForm();
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
	public TeacherForm() {
		setTitle("Teacher Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		teacherPane = new JPanel();
		teacherPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(teacherPane);
		teacherPane.setLayout(null);
		
		JLabel teacherName = new JLabel("Name :");
		teacherName.setBounds(11, 14, 76, 14);
		teacherPane.add(teacherName);
		
		Name = new JTextField();
		Name.setBounds(97, 11, 271, 20);
		teacherPane.add(Name);
		Name.setColumns(10);
		
		JLabel IDLabel = new JLabel("ID :");
		IDLabel.setBounds(11, 40, 76, 14);
		teacherPane.add(IDLabel);
		
		ID = new JTextField();
		ID.setBounds(97, 37, 138, 20);
		teacherPane.add(ID);
		ID.setColumns(10);
		
		JLabel GenderLabel = new JLabel("Gender :");
		GenderLabel.setBounds(11, 67, 80, 14);
		teacherPane.add(GenderLabel);
		
		JRadioButton Female = new JRadioButton("Female");
		Female.setBounds(97, 63, 138, 23);
		teacherPane.add(Female);
		
		JRadioButton Male = new JRadioButton("Male");
		Male.setBounds(237, 64, 127, 23);
		teacherPane.add(Male);
		
		ButtonGroup G1 = new ButtonGroup();
		getContentPane().add(Female);
		getContentPane().add(Male);
		G1.add(Female);
		G1.add(Male);
		
		JLabel SubjectLabel = new JLabel("Subject Taught :");
		SubjectLabel.setBounds(11, 96, 80, 14);
		teacherPane.add(SubjectLabel);
		
		JRadioButton BM = new JRadioButton("Bahasa Melayu");
		BM.setBounds(97, 92, 138, 23);
		teacherPane.add(BM);
		
		JRadioButton MT = new JRadioButton("Matematik");
		MT.setBounds(237, 92, 127, 23);
		teacherPane.add(MT);
		
		JRadioButton KM = new JRadioButton("Kimia");
		KM.setBounds(366, 92, 80, 23);
		teacherPane.add(KM);
		
		JRadioButton BI = new JRadioButton("Bahasa Inggeris");
		BI.setBounds(97, 121, 138, 23);
		teacherPane.add(BI);
		
		JRadioButton MTT = new JRadioButton("Matematik Tambahan");
		MTT.setBounds(237, 121, 127, 23);
		teacherPane.add(MTT);
		
		JRadioButton BL = new JRadioButton("Biologi");
		BL.setBounds(366, 121, 127, 23);
		teacherPane.add(BL);
		
		JRadioButton PI = new JRadioButton("Pendidikan Islam");
		PI.setBounds(97, 150, 138, 23);
		teacherPane.add(PI);
		
		JRadioButton AK = new JRadioButton("Perakaunan");
		AK.setBounds(237, 150, 127, 23);
		teacherPane.add(AK);
		
		JRadioButton FZ = new JRadioButton("Fizik");
		FZ.setBounds(366, 150, 102, 23);
		teacherPane.add(FZ);
		
		JRadioButton PM = new JRadioButton("Pendidikan Moral");
		PM.setBounds(97, 179, 138, 23);
		teacherPane.add(PM);
		
		JRadioButton PD = new JRadioButton("Perdagangan");
		PD.setBounds(237, 179, 127, 23);
		teacherPane.add(PD);
		
		JRadioButton Sn = new JRadioButton("Seni");
		Sn.setBounds(366, 179, 102, 23);
		teacherPane.add(Sn);
		
		JLabel ClassLabel = new JLabel("Class Teacher :");
		ClassLabel.setBounds(11, 211, 117, 14);
		teacherPane.add(ClassLabel);
		
		ButtonGroup G2 = new ButtonGroup ();
		getContentPane().add(BM);
		getContentPane().add(MT);
		getContentPane().add(KM);
		getContentPane().add(BI);
		getContentPane().add(MTT);
		getContentPane().add(BL);
		getContentPane().add(PI);
		getContentPane().add(AK);
		getContentPane().add(FZ);
		getContentPane().add(PM);
		getContentPane().add(PD);
		getContentPane().add(Sn);

		
		G2.add(BM);
		G2.add(BI);
		G2.add(MT);
		G2.add(KM);
		G2.add(MTT);
		G2.add(BL);
		G2.add(PI);
		G2.add(AK);
		G2.add(FZ);
		G2.add(PM);
		G2.add(PD);
		G2.add(Sn);
		
		
		JRadioButton A = new JRadioButton("A");
		A.setBounds(97, 207, 51, 23);
		teacherPane.add(A);
		
		JRadioButton B = new JRadioButton("B");
		B.setBounds(150, 207, 57, 23);
		teacherPane.add(B);
		
		JRadioButton C = new JRadioButton("C");
		C.setBounds(209, 207, 57, 23);
		teacherPane.add(C);
		
		JRadioButton D = new JRadioButton("D");
		D.setBounds(276, 207, 51, 23);
		teacherPane.add(D);
		
		JRadioButton None = new JRadioButton("None");
		None.setBounds(337, 207, 91, 23);
		teacherPane.add(None);
		
		ButtonGroup G3 = new ButtonGroup();
		
		getContentPane().add(A);
		getContentPane().add(B);
		getContentPane().add(C);
		getContentPane().add(D);
		getContentPane().add(None);
		
		G3.add(A);
		G3.add(B);
		G3.add(C);
		G3.add(D);
		G3.add(None);
		
		Button button_2 = new Button("Submit");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = Name.getText().toString().trim();
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
		button_2.setBounds(347, 236, 70, 22);
		teacherPane.add(button_2);
		
		Button button = new Button("Close");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClassroomApps sf = new ClassroomApps();
				dispose();
			}
		});
		button.setBounds(11, 236, 70, 22);
		teacherPane.add(button);
		
		JButton Display = new JButton("Display");
		Display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Name :" + Name.getText().toString());
				System.out.println("ID :" + ID.getText().toString());}
			String getGender()
			{
			    if(Male.isSelected())
			    {
			        return "Male";
			    }
			    else if(Female.isSelected())
			    {
			        return "Female";
			    }
			    else
			    {
			        return null;
			    }
			}
		});
		Display.setBounds(177, 237, 89, 23);
		teacherPane.add(Display);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
