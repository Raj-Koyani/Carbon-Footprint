package carbon_footprint_calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Welcome extends JFrame {

	private JPanel contentPane;

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

	public Welcome() {
		setTitle("Census Department of India - Carbon Footprint Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea txtrCarbonFootprintCalculator = new JTextArea();
		txtrCarbonFootprintCalculator.setForeground(new Color(0, 0, 0));
		txtrCarbonFootprintCalculator.setBackground(new Color(0, 100, 0));
		txtrCarbonFootprintCalculator.setWrapStyleWord(true);
		txtrCarbonFootprintCalculator.setText("          \r\n\r\n\t\r\n\r\n        \r\n\r\n\r\n\r\n\t\tCARBON FOOTPRINT CALCULATOR\r\n   \t                      \t           IN ASSOCIATION WITH\r\n            \t\t  CENSUS DEPARTMENT OF INDIA");
		txtrCarbonFootprintCalculator.setFont(new Font("Arial", Font.BOLD, 18));
		contentPane.add(txtrCarbonFootprintCalculator, BorderLayout.CENTER);
		/*
		JLabel background;
		setSize(800,600);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("carbon_footprint_pic.jpg");
		
		background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		add(background);
		*/
		final JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnOpen)
				{
					dispose();
					new Login_screen();
				}
			}
		});
		contentPane.add(btnOpen, BorderLayout.SOUTH);
	}

}
