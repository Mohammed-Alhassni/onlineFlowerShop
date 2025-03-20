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

public class HomeAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeAdmin frame = new HomeAdmin();
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
	public HomeAdmin() {
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
		
		JButton btnNewButton = new JButton("Manage inventory");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ManageInventory MI= new ManageInventory();
				MI.setVisible(true);
			}
		});
		btnNewButton.setBounds(368, 184, 155, 67);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Manage Products Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ProductsMenuManagement PMM= new ProductsMenuManagement();
				PMM.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(368, 252, 155, 61);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Supply Management");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				FlowerSupply FS= new FlowerSupply();
				FS.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(368, 318, 155, 61);
		contentPane.add(btnNewButton_2);
		
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
