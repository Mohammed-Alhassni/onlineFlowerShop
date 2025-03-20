package FlowerShop;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class ForgetPass extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgetPass frame = new ForgetPass();
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
	public ForgetPass() {
		setTitle("Restore Password");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 500);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(102, 143, 78, 16);
		contentPane.add(lblNewLabel);
				
		textField = new JTextField();
		textField.setBounds(236, 138, 223, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname= textField.getText();
				String email= textField_1.getText();
				if (uname.equals("") || email.equals("")) {
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Please fill all the fields");

				} else {
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "A reset email have sent to your account");
					setVisible(false);
					Welcome W= new Welcome();
					W.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(95, 253, 121, 29);
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
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(102, 181, 78, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 176, 223, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("*Reset email will be sent to your email");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(102, 225, 357, 16);
		contentPane.add(lblNewLabel_2);
				
	}

}
