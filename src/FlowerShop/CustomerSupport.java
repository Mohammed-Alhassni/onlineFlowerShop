package FlowerShop;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

public class CustomerSupport extends JFrame {

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
					CustomerSupport frame = new CustomerSupport();
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
	public CustomerSupport() {
		setTitle("Customer Support");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 500);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);
				
		textField = new JTextField();
		textField.setBounds(236, 138, 223, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 176, 223, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("What is your issue?");
		lblNewLabel.setBounds(44, 143, 136, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Description of the issue");
		lblNewLabel_1.setBounds(44, 181, 199, 16);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("*Support team will contact you through an email");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(102, 225, 357, 16);
		contentPane.add(lblNewLabel_2);				
		
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
					JOptionPane.showMessageDialog(frame, "Your request have been submitted");
					setVisible(false);
					HomeUser HU= new HomeUser();
					HU.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(95, 253, 121, 29);
		contentPane.add(btnNewButton);
				
		JButton btnNewButton_3 = new JButton("Return Home");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				HomeUser HU= new HomeUser();
				HU.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(282, 253, 177, 29);
		contentPane.add(btnNewButton_3);
		
		JLabel iconLabel_2 = new JLabel("");
		Image icon2= new ImageIcon(this.getClass().getResource("/images/logout.png")).getImage();
		iconLabel_2.setIcon(new ImageIcon(icon2));
		iconLabel_2.setBounds(463, 6, 16, 20);
		contentPane.add(iconLabel_2);
		
		JButton btnNewButton_4 = new JButton("Log out");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Welcome W= new Welcome();
				W.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(480, 6, 72, 20);
		contentPane.add(btnNewButton_4);
	}

}