import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.sql.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Flight extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flight frame = new Flight();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;

	/**
	 * Create the frame.
	 */
	public Flight() {
		connection = sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(20, 85, 108, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(168, 85, 108, 20);
		contentPane.add(dateChooser_1);
		
		JLabel lblDepartureDate = new JLabel("Departure Date:");
		lblDepartureDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDepartureDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblDepartureDate.setBounds(21, 55, 108, 32);
		contentPane.add(lblDepartureDate);
		
		JLabel lblArrivalDate = new JLabel("Arrival Date:");
		lblArrivalDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblArrivalDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArrivalDate.setBounds(168, 55, 108, 33);
		contentPane.add(lblArrivalDate);
		
		textField = new JTextField();
		textField.setText("BaR - BOOKING & RESERVATIONS");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBounds(190, 11, 255, 41);
		contentPane.add(textField);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\M\\workspace\\SE_BaR\\images\\world_travel.jpg"));
		label.setBounds(345, 64, 232, 220);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//***---DB QUERIES, TWEAK FOR ACTION PERFORMED---***
			//	try {
			//		String query = "select * from flightinfo";
			//		PreparedStatement pst = connection.prepareStatement(query);
			//		ResultSet rs = pst.executeQuery();
			//} catch (Exception e) {
			//		e.printStackTrace();
			//	}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(96, 235, 108, 49);
		contentPane.add(btnNewButton);
		
		JComboBox comboBoxDepFlight = new JComboBox();
		comboBoxDepFlight.setModel(new DefaultComboBoxModel(new String[] {"Atlanta, GA", "Dallas, TX", "Los Angeles, CA"}));
		comboBoxDepFlight.setEditable(true);
		comboBoxDepFlight.setBounds(20, 136, 108, 20);
		contentPane.add(comboBoxDepFlight);
		
		JComboBox comboBoxArrFlight = new JComboBox();
		comboBoxArrFlight.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBoxArrFlight.setModel(new DefaultComboBoxModel(new String[] {"Atlanta, GA", "Dallas, TX", "Los Angeles, CA"}));
		comboBoxArrFlight.setEditable(true);
		comboBoxArrFlight.setBounds(168, 136, 108, 20);
		contentPane.add(comboBoxArrFlight);
		
		JLabel lblNewLabel = new JLabel("FROM:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(20, 116, 138, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblArrivalDestination = new JLabel("TO:");
		lblArrivalDestination.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArrivalDestination.setBounds(168, 116, 138, 20);
		contentPane.add(lblArrivalDestination);
		
		JLabel lblPassengers = new JLabel("Passengers:");
		lblPassengers.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassengers.setBounds(20, 178, 138, 14);
		contentPane.add(lblPassengers);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		comboBox.setBounds(20, 197, 108, 20);
		contentPane.add(comboBox);
		
		JLabel lblSelectSeats = new JLabel("Select Seat(s):");
		lblSelectSeats.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSelectSeats.setBounds(168, 178, 109, 14);
		contentPane.add(lblSelectSeats);
		
		JButton btnSeatingChart = new JButton("Seating Chart");
		btnSeatingChart.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSeatingChart.setBounds(168, 196, 108, 23);
		contentPane.add(btnSeatingChart);
	}
}
