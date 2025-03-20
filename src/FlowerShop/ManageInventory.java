package FlowerShop;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

public class ManageInventory extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageInventory frame = new ManageInventory();
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
	public ManageInventory() {
		setTitle("Manage Inventory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 500);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		
		JButton btnNewButton = new JButton("Return Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				HomeAdmin HA= new HomeAdmin();
				HA.setVisible(true);
			}
		});
		btnNewButton.setBounds(44, 397, 177, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save as Excel Sheet");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "Excel sheet have been generated");
			}
		});
		btnNewButton_1.setBounds(344, 397, 177, 29);
		contentPane.add(btnNewButton_1);
		
		JList<?> list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {
					"Rose                       Listed                             200 stems                     2024-11",
					"Tulip                       Listed                             150 stems                     2024-12",
					"Lily                          Listed                            100 stems                      2025-1",
					"Sunflower               Listed                            80 stems                         2024-8",
					"Orchid                     new                              120 stems                      2025-8",
					"Carnation                new                              180 stems                       2025-9"
					};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setToolTipText("Select the flower");
		list.setBounds(44, 79, 477, 294);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("Name                     Status                             Qunatity                       Expire Date");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setBounds(44, 57, 508, 24);
		contentPane.add(lblNewLabel);
		
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