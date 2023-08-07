package carbon_footprint_calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Final_result extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args)
	{
		new Final_result();
	}

	public Final_result() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Nothing in this world justifies growth,");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(246, 172, 400, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblIfItDoesnt = new JLabel("if it doesn't bring well being to");
		lblIfItDoesnt.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIfItDoesnt.setBounds(268, 204, 400, 36);
		contentPane.add(lblIfItDoesnt);
		
		JLabel lblEachAndEvery = new JLabel("each and every creature of this Planet.");
		lblEachAndEvery.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEachAndEvery.setBounds(246, 238, 400, 36);
		contentPane.add(lblEachAndEvery);
		
		JLabel lblOurPlanetIs = new JLabel("Our Planet is our responsibility.");
		lblOurPlanetIs.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOurPlanetIs.setBounds(268, 273, 400, 36);
		contentPane.add(lblOurPlanetIs);
		
		JButton btnNewButton = new JButton("GO GREEN. SAVE OUR PLANET.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				System.exit(EXIT_ON_CLOSE);
			}
		});
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(10, 528, 764, 23);
		contentPane.add(btnNewButton);
	}
}
