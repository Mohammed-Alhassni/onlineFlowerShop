package FlowerShop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;

public class FlowerBrowser extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowerBrowser frame = new FlowerBrowser();
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
	public FlowerBrowser() {
		setTitle("Flower Browser");
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
				Welcome W= new Welcome();
				W.setVisible(true);
			}
		});
		btnNewButton.setBounds(44, 397, 177, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Log in");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Login L= new Login();
				L.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(344, 397, 177, 29);
		contentPane.add(btnNewButton_1);

		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {
					"Rose                      Cut Flower                      $2.50                           200 stems",
					"Tulip                      Bulb Flower                    $1.50                           150 stems", 
					"Lily                         Cut Flower                      $3.00                          100 stems",
					"Sunflower                Cut Flower                     $1.80                            80 stems"
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
		
		JLabel lblNewLabel = new JLabel("Name                     Type                             Price                                    Stock");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setBounds(44, 57, 508, 24);
		contentPane.add(lblNewLabel);
		
		
	}
}
