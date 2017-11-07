//import net.proteanit.sql.DbUtils;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.*;//import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
//import java.util.Scanner;


public class BaR {
	

	// creating connection to database using sqliteConnection class
 

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaR window = new BaR();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BaR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	Connection conn = null;
	private JComboBox comboBox;
	private void initialize() {
		// this creates a new database if an existing one is not found like when first opening the jar file
				String start = "CREATE TABLE IF NOT EXISTS 'data' ('id' INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE, 'fname' TEXT DEFAULT (null) ,'lname' TEXT DEFAULT (null) ,'confNum' INTEGER DEFAULT (null) )";
				PreparedStatement create;
				try {
					
					create = conn.prepareStatement(start);
					create.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\M\\workspace\\BaR\\img\\beachimg.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("Departure Date");
		lblFirstName.setBounds(25, 126, 84, 14);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Return Date");
		lblLastName.setBounds(137, 126, 62, 14);
		frame.getContentPane().add(lblLastName);
		
		JButton btnSubmit = new JButton("Find a Trip!");
		btnSubmit.setBackground(new Color(238, 130, 238));
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "This is a check.");
			}
		});
		btnSubmit.setBounds(23, 227, 201, 23);
		frame.getContentPane().add(btnSubmit);
		
		JRadioButton rdbtnOneWay = new JRadioButton("One Way");
		rdbtnOneWay.setBounds(137, 7, 109, 23);
		frame.getContentPane().add(rdbtnOneWay);
		
		JRadioButton rdbtnRoundTrip = new JRadioButton("Round Trip");
		rdbtnRoundTrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnRoundTrip.isSelected()){
					rdbtnOneWay.setSelected(false);
				}
			}
		});
		rdbtnRoundTrip.setBounds(21, 7, 109, 23);
		frame.getContentPane().add(rdbtnRoundTrip);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--FROM--", "Atlanta, GA", "Los Angeles, CA", "Dallas, TX"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(23, 34, 176, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"--TO--", "Atlanta, GA", "Los Angeles, CA", "Dallas, TX"}));
		comboBox_1.setBounds(25, 60, 174, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1 adult", "2 adults"}));
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			}
		});
		comboBox_2.setBounds(25, 171, 76, 20);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"0 children", "1 child", "2 children"}));
		comboBox_3.setBounds(137, 171, 76, 20);
		frame.getContentPane().add(comboBox_3);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(25, 140, 91, 20);
		frame.getContentPane().add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(133, 140, 91, 20);
		frame.getContentPane().add(dateChooser_1);
		Image image = (new ImageIcon(this.getClass().getResource("beachimg.png"))).getImage();
	}
}
