package FlowerShop;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setTitle("Flower Shop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 500);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		
		JLabel title = new JLabel("Welcome to Flower shop");
		title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		title.setBounds(161, 60, 345, 46);
		contentPane.add(title);
		
		JLabel iconLabel = new JLabel("");
		Image icon1= new ImageIcon(this.getClass().getResource("/images/icon1.png")).getImage();
		iconLabel.setIcon(new ImageIcon(icon1));
		iconLabel.setBounds(82, 38, 67, 67);
		contentPane.add(iconLabel);
		
		JLabel iconLabel_1 = new JLabel("");
		Image pic= new ImageIcon(this.getClass().getResource("/images/pic.png")).getImage();
		iconLabel_1.setIcon(new ImageIcon(pic));
		iconLabel_1.setBounds(72, 105, 284, 330);
		contentPane.add(iconLabel_1);
		
		JButton btnNewButton = new JButton("Browse Products");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				FlowerBrowser F= new FlowerBrowser();
				F.setVisible(true);
			}
		});
		btnNewButton.setBounds(368, 175, 162, 67);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Login L= new Login();
				L.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(368, 254, 162, 61);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Register");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Register R= new Register();
				R.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(368, 327, 162, 61);
		contentPane.add(btnNewButton_3);
		
		
	}
}