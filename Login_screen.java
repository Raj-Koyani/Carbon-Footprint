package carbon_footprint_calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Login_screen extends JFrame {

	private JPanel contentPane;
	private JTextField tf_username;
	public JPasswordField tf_pwd;

	public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
				//try {
					new Login_screen();
					//frame.setVisible(true);
				//} catch (Exception e) {
					//e.printStackTrace();
				}
			//}
		//});
	//}

	public Login_screen()
	{
		setTitle("Census Department of India - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lbl_username = new JLabel("Username :");
		lbl_username.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_username.setBounds(223, 99, 65, 14);
		contentPane.add(lbl_username);
		
		tf_username = new JTextField();
		tf_username.setBounds(330, 97, 275, 20);
		contentPane.add(tf_username);
		tf_username.setColumns(10);
		
		JLabel lbl_password = new JLabel("Password :");
		lbl_password.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_password.setBounds(223, 168, 65, 14);
		contentPane.add(lbl_password);
		
		tf_pwd = new JPasswordField();
		tf_pwd.setBounds(330, 166, 275, 20);
		contentPane.add(tf_pwd);
		tf_pwd.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Representative Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(295, 39, 189, 20);
		contentPane.add(lblNewLabel);
		
		final JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnLogin)
				{
				/*	Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.16.1:test","testty54045","modern");
					DatabaseMetaData dbmd = conn.getMetaData();
					ResultSet rs	dbmd.get
					*/
					
					if(tf_username.getText().equals("Khushika") && tf_pwd.getText().equals("Khushika"))
		            {
		 				JOptionPane.showMessageDialog(null,"Login Successful.");
		 				dispose();
						new New_Dashboard();
		  		 	}
		            else if(tf_username.getText().equals("Madhurima") && tf_pwd.getText().equals("Madhurima"))
		            {
		 				 JOptionPane.showMessageDialog(null,"Login Successful.");
		 				dispose();
		 				new New_Dashboard();
		  		 	}
		  		 	else if(tf_username.getText().equals("Urmila") && tf_pwd.getText().equals("Urmila"))
					{
						 JOptionPane.showMessageDialog(null,"Login Successful.");
						 dispose();
						 new New_Dashboard();
		  		 	}
		  		 	else
		            {
		                JOptionPane.showMessageDialog(null,"Invalid!! Try again..");
		                tf_username.setText(null);
		                tf_pwd.setText(null);
		            }
				}
			}
		});
		btnLogin.setBounds(516, 279, 89, 23);
		contentPane.add(btnLogin);
		
		final JButton btnAddRepresentative = new JButton("Add Representative");
		btnAddRepresentative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnAddRepresentative)
				{
					dispose();
					new Add_r();
				}
			}
		});
		btnAddRepresentative.setBounds(200, 279, 155, 23);
		contentPane.add(btnAddRepresentative);
		setVisible(true);
	}
}

























