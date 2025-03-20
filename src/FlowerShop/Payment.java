package FlowerShop;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Payment extends JFrame {

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
					Payment frame = new Payment();
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
	public Payment() {
		setTitle("Payment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 500);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("CVV");
		lblNewLabel.setBounds(61, 200, 141, 16);
		contentPane.add(lblNewLabel);
				
		JLabel lblNewLabel_2 = new JLabel("Expire Date");
		lblNewLabel_2.setBounds(61, 154, 78, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Card Number");
		lblNewLabel_3.setBounds(61, 108, 141, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Card Holder Name");
		lblNewLabel_4.setBounds(61, 63, 141, 16);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(236, 56, 223, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(236, 103, 223, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(236, 149, 223, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(236, 195, 223, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name= textField.getText();
				String number= textField_2.getText();
				String date= textField_3.getText();
				String cvv= textField.getText();
				if (name.equals("") || number.equals("") || date.equals("") || cvv.equals("") ) {
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Please fill all the fields");

				} else {
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Your payment have been confirmed");
				}
			}
		});
		btnNewButton.setBounds(61, 252, 121, 29);
		contentPane.add(btnNewButton);		
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ViewCart VC= new ViewCart();
				VC.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(338, 252, 121, 29);
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
