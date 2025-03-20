package FlowerShop;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 500);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(112, 147, 78, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(112, 180, 78, 16);
		contentPane.add(lblNewLabel_1);
				
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(112, 119, 78, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name");
		lblNewLabel_3.setBounds(112, 91, 78, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("First Name");
		lblNewLabel_4.setBounds(112, 61, 78, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Confirm Password");
		lblNewLabel_5.setBounds(112, 208, 127, 16);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(236, 56, 223, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(236, 86, 223, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(236, 114, 223, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(236, 142, 223, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(236, 175, 223, 26);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(236, 203, 223, 26);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname= textField.getText();
				String lname= textField_2.getText();
				String email= textField_3.getText();
				String uname= textField.getText();
				String pass= passwordField.getText();
				String pass2= passwordField_1.getText();
				if (fname.equals("") || lname.equals("") || email.equals("") || uname.equals("") || pass.equals("") || pass2.equals("")) {
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Please fill all the fields");

				} else {
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Account have been created");
					Login L = new Login();
					L.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnNewButton.setBounds(102, 253, 121, 29);
		contentPane.add(btnNewButton);		
		
		JButton btnNewButton_3 = new JButton("Return Home");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Welcome W= new Welcome();
				W.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(282, 253, 177, 29);
		contentPane.add(btnNewButton_3);
	}
}