package edu.school.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondProblemPatient extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPatientNumber;
	final int PATIENTS = 3;

	private Patient[] p = new Patient[PATIENTS];
	// p[0] = new Patient("Ivan Dimitrov", 212, true);
	// p[1] = new Patient("Maria Angelova", 313, true);
	// p[2] = new Patient("Vasil Ivanov", 414, false);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondProblemPatient frame = new SecondProblemPatient();
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
	public SecondProblemPatient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(59, 44, 69, 20);
		contentPane.add(lblName);

		txtName = new JTextField();
		txtName.setBounds(143, 41, 146, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);

		JLabel lblPatientNumber = new JLabel("Patient Number:");
		lblPatientNumber.setBounds(15, 103, 128, 20);
		contentPane.add(lblPatientNumber);

		txtPatientNumber = new JTextField();
		txtPatientNumber.setBounds(143, 100, 146, 26);
		contentPane.add(txtPatientNumber);
		txtPatientNumber.setColumns(10);

		JRadioButton rdbtnIsTested = new JRadioButton("Check if tested");
		rdbtnIsTested.setBounds(11, 154, 155, 29);
		contentPane.add(rdbtnIsTested);

		JLabel lblPatientList = new JLabel("Patient List");
		lblPatientList.setBounds(396, 16, 146, 20);
		contentPane.add(lblPatientList);

		JTextArea txtAreaPatientList = new JTextArea();
		txtAreaPatientList.setBounds(319, 41, 257, 295);
		contentPane.add(txtAreaPatientList);

		JButton btnShowTested = new JButton("Show Tested");
		btnShowTested.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p[0] = new Patient("Ivan Dimitrov", 212, true);
				p[1] = new Patient("Maria Angelova", 313, true);
				p[2] = new Patient("Vasil Ivanov", 414, false);
				txtAreaPatientList.setText("");
				for (Patient o : p) {
					if (o.isTested() == true) {
						System.out.println(o.toString());
						txtAreaPatientList.append(o.toString() + "\n");
					}
				}
			}
		});
		btnShowTested.setBounds(13, 209, 169, 29);
		contentPane.add(btnShowTested);

		JButton btnShowUntested = new JButton("Show Untested");
		btnShowUntested.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p[0] = new Patient("Ivan Dimitrov", 212, true);
				p[1] = new Patient("Maria Angelova", 313, true);
				p[2] = new Patient("Vasil Ivanov", 414, false);
				txtAreaPatientList.setText("");
				for (Patient o : p) {
					if (o.isTested() == false) {
						System.out.println(o.toString());
						txtAreaPatientList.append(o.toString() + "\n");
					}
				}
			}
		});
		btnShowUntested.setBounds(15, 262, 169, 29);
		contentPane.add(btnShowUntested);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtPatientNumber.setText("");
				txtAreaPatientList.setText("");
				// clear rdbtnIsTested as well

			}
		});
		btnClear.setBounds(15, 307, 171, 29);
		contentPane.add(btnClear);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(197, 209, 115, 127);
		contentPane.add(btnExit);
	}
}
