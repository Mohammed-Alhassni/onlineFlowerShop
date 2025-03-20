package FlowerShop;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 500);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(102, 143, 78, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(102, 180, 78, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Forget Password?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ForgetPass FP= new ForgetPass();
				FP.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(214, 253, 138, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New User?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Register R= new Register();
				R.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(344, 253, 115, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Return Home");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Welcome W= new Welcome();
				W.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(198, 294, 177, 29);
		contentPane.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBounds(236, 138, 223, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(236, 175, 223, 26);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname= textField.getText();
				String pass= passwordField.getText();
				if (uname.equals("user") && pass.equals("123")) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "Login successful");
				setVisible(false);
				HomeUser HU = new HomeUser();
				HU.setVisible(true);
				} else if (uname.equals("admin") && pass.equals("123")) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "Login successful");
				setVisible(false);
				HomeAdmin HA = new HomeAdmin();
				HA.setVisible(true);
				} else {
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "Invalid Login");
				}	
			}
		});
		btnNewButton.setBounds(102, 253, 121, 29);
		contentPane.add(btnNewButton);
			
	}

}
