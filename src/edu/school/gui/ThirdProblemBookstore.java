package edu.school.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThirdProblemBookstore extends JFrame {

	private JPanel contentPane;
	private JTextField txtAuthor;
	private JTextField txtTitle;
	private JTextField txtPublisher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThirdProblemBookstore frame = new ThirdProblemBookstore();
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
	public ThirdProblemBookstore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAuthor = new JLabel("Author:");
		lblAuthor.setBounds(15, 67, 69, 20);
		contentPane.add(lblAuthor);

		txtAuthor = new JTextField();
		txtAuthor.setBounds(97, 64, 146, 26);
		contentPane.add(txtAuthor);
		txtAuthor.setColumns(10);

		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(15, 33, 69, 20);
		contentPane.add(lblTitle);

		txtTitle = new JTextField();
		txtTitle.setBounds(97, 30, 146, 26);
		contentPane.add(txtTitle);
		txtTitle.setColumns(10);

		JLabel lblPublisher = new JLabel("Publisher:");
		lblPublisher.setBounds(15, 103, 85, 20);
		contentPane.add(lblPublisher);

		txtPublisher = new JTextField();
		txtPublisher.setBounds(97, 100, 146, 26);
		contentPane.add(txtPublisher);
		txtPublisher.setColumns(10);

		JTextArea txtAreaListOfBooks = new JTextArea();
		txtAreaListOfBooks.setBounds(270, 33, 307, 309);
		contentPane.add(txtAreaListOfBooks);

		JLabel lblListOfBooks = new JLabel("List of Books That Match");
		lblListOfBooks.setBounds(270, 16, 208, 20);
		contentPane.add(lblListOfBooks);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//txtAreaListOfBooks.setText("");
				Books[] b = new Books[4];
				b[0] = new Books("Guards! Guards!", "Sir Terry Prattchet", "Gollancz");
				b[1] = new Books("Neverwhere", "Neil Gaiman", "BBC Books");
				b[2] = new Books("I Shall Wear Midnight", "Sir Terry Prattchet", "Doubleday");
				b[3] = new Books("American Gods", "Neil Gaiman", "BBC Books");

				String currentTitle = txtTitle.getText();
				String currentAuthor = txtAuthor.getText();
				String currentPublisher = txtPublisher.getText();
				for (Books o : b) {
					if (currentTitle.isEmpty() == false && currentAuthor.isEmpty() == false
							&& currentPublisher.isEmpty() == false) {
						if (o.getAuthor() == currentAuthor && o.getPublisher() == currentPublisher
								&& o.getTitle() == currentTitle) {
							txtAreaListOfBooks.append(o.toString() + "\n");
						}
					} else if (currentTitle.isEmpty() == true && currentAuthor.isEmpty() == true) {
						if (o.getPublisher() == currentPublisher) {
							txtAreaListOfBooks.append(o.toString() + "\n");
						}
					} else if (currentTitle.isEmpty() == true && currentPublisher.isEmpty() == true) {
						if (o.getAuthor() == currentAuthor) {
							txtAreaListOfBooks.append(o.toString() + "\n");
						}
					} else if (currentTitle.isEmpty() == true) {
						if (o.getAuthor() == currentAuthor && o.getPublisher() == currentPublisher) {
							txtAreaListOfBooks.append(o.toString() + "\n");
						}
					} else if (currentAuthor.isEmpty() == true && currentPublisher.isEmpty() == true) {
						if (o.getTitle() == currentTitle) {
							txtAreaListOfBooks.append(o.toString() + "\n");
						}
					} else if(currentAuthor.isEmpty() == true) {
						if(o.getTitle() == currentTitle && o.getPublisher() == currentPublisher) {
							txtAreaListOfBooks.append(o.toString() + "\n");
						}
					}
					else {
						if(o.getTitle() == currentTitle && o.getAuthor() == currentAuthor) {
							txtAreaListOfBooks.append(o.toString() + "\n");
						}
					}
					
				}
			}
		});
		btnSearch.setBounds(15, 161, 115, 29);
		contentPane.add(btnSearch);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTitle.setText("");
				txtAuthor.setText("");
				txtPublisher.setText("");
				txtAreaListOfBooks.setText("");
			}
		});
		btnClear.setBounds(15, 216, 115, 29);
		contentPane.add(btnClear);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(15, 273, 115, 29);
		contentPane.add(btnExit);
	}

}
