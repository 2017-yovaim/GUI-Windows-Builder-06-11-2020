package edu.school.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstProblemCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;
	private JButton btnSum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstProblemCalculator frame = new FirstProblemCalculator();
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
	public FirstProblemCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResult = new JLabel("\u0420\u0435\u0437\u0443\u043B\u0442\u0430\u0442:");
		lblResult.setBounds(5, 5, 418, 20);
		contentPane.add(lblResult);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(5, 63, 146, 26);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(190, 63, 146, 26);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double number1 = Double.parseDouble(txtNumber1.getText());
				double number2 = Double.parseDouble(txtNumber2.getText());
				double result12 = number1 + number2;
				lblResult.setText("Резултат: " + result12);
			}
		});
		btnSum.setBounds(5, 138, 115, 29);
		contentPane.add(btnSum);
		
		JButton btnSubstract = new JButton("-");
		btnSubstract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1 = Double.parseDouble(txtNumber1.getText());
				double number2 = Double.parseDouble(txtNumber2.getText());
				double result12 = number1 - number2;
				lblResult.setText("Резултат: " + result12);
			}
		});
		btnSubstract.setBounds(158, 138, 115, 29);
		contentPane.add(btnSubstract);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1 = Double.parseDouble(txtNumber1.getText());
				double number2 = Double.parseDouble(txtNumber2.getText());
				double result12 = number1 * number2;
				lblResult.setText("Резултат: " + result12);
			}
		});
		btnMultiply.setBounds(5, 199, 115, 29);
		contentPane.add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1 = Double.parseDouble(txtNumber1.getText());
				double number2 = Double.parseDouble(txtNumber2.getText());
				double result12 = number1 / number2;
				lblResult.setText("Резултат: " + result12);
			}
		});
		btnDivide.setBounds(158, 199, 115, 29);
		contentPane.add(btnDivide);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumber1.setText("");
				txtNumber2.setText("");
				lblResult.setText("Резултат: ");
			}
		});
		btnClear.setBounds(288, 138, 115, 29);
		contentPane.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(288, 199, 115, 29);
		contentPane.add(btnExit);
	}
}
