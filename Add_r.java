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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Add_r extends JFrame
{

	private JPanel contentPane;
	private JTextField tf_c_id;
	private JTextField tf_name;
	private JTextField tf_area;
	private JTextField tf_district;
	private JTextField tf_state;
	private JTextField tf_pin;
	private JTextField tf_set_uname;
	private JTextField tf_set_pass;

	public static void main(String[] args)
	{
			new Add_r();		
	}

	protected Add_r()
	{
		setTitle("Census Department of India - Add Representative");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,800,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lbl_c_id = new JLabel("Census Representative ID :");
		lbl_c_id.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_c_id.setBounds(191, 50, 133, 14);
		contentPane.add(lbl_c_id);
		
		tf_c_id = new JTextField();
		tf_c_id.setBounds(350, 47, 275, 20);
		contentPane.add(tf_c_id);
		tf_c_id.setColumns(10);
		
		final JLabel lbl_name = new JLabel("Name :");
		lbl_name.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_name.setBounds(191, 100, 120, 14);
		contentPane.add(lbl_name);
		
		tf_name = new JTextField();
		tf_name.setBounds(350, 98, 275, 20);
		contentPane.add(tf_name);
		tf_name.setColumns(10);
		
		final JLabel lbl_area = new JLabel("Area :");
		lbl_area.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_area.setBounds(191, 150, 120, 14);
		contentPane.add(lbl_area);
		
		tf_area = new JTextField();
		tf_area.setBounds(350, 147, 275, 20);
		contentPane.add(tf_area);
		tf_area.setColumns(10);
		
		final JLabel lbl_district = new JLabel("District :");
		lbl_district.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_district.setBounds(191, 200, 120, 14);
		contentPane.add(lbl_district);
		
		tf_district = new JTextField();
		tf_district.setBounds(350, 197, 275, 20);
		contentPane.add(tf_district);
		tf_district.setColumns(10);
		
		final JLabel lbl_state = new JLabel("State :");
		lbl_state.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_state.setBounds(191, 250, 120, 14);
		contentPane.add(lbl_state);
		
		tf_state = new JTextField();
		tf_state.setBounds(350, 247, 275, 20);
		contentPane.add(tf_state);
		tf_state.setColumns(10);
		
		final JLabel lbl_pin = new JLabel("PIN Code :");
		lbl_pin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_pin.setBounds(191, 300, 133, 14);
		contentPane.add(lbl_pin);
		
		tf_pin = new JTextField();
		tf_pin.setBounds(350, 297, 275, 20);
		contentPane.add(tf_pin);
		tf_pin.setColumns(10);
		
		JLabel lblEnterTheDetails = new JLabel("Enter the Details to add Representative :");
		lblEnterTheDetails.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterTheDetails.setBounds(10, 11, 352, 14);
		contentPane.add(lblEnterTheDetails);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carbondata","root","jaitra0312%");
					PreparedStatement ps = conn.prepareStatement("insert into census_representative(?,?,?,?,?,?,?,?)");
					ps.setString(1,tf_c_id.getText());
					ps.setString(2,tf_name.getText());
					ps.setString(3,tf_area.getText());
					ps.setString(4,tf_district.getText());
					ps.setString(5,tf_state.getText());
					ps.setString(6,tf_pin.getText());
					ps.setString(7,tf_set_uname.getText());
					ps.setString(8,tf_set_pass.getText());
					
					int x = ps.executeUpdate();
					if(x>0)
					{
						//JOptionPane.showMessageDialog(null,"Details Saved....");
					}
				}
				catch(Exception e1)
				{
					//JOptionPane.showMessageDialog(null,"Error.... Re - Enter the Details....");
					lbl_c_id.setText(null);
					lbl_name.setText(null);
					lbl_area.setText(null);
					lbl_district.setText(null);
					lbl_state.setText(null);
					lbl_pin.setText(null);
				}
				JOptionPane.showMessageDialog(null,"Details Saved....");
			}
		});
		btnAdd.setBounds(350, 500, 89, 23);
		contentPane.add(btnAdd);
		
		final JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNext)
				{
					dispose();
					new Login_screen();
				}
			}
		});
		btnNext.setBounds(590, 500, 89, 23);
		contentPane.add(btnNext);
		
		final JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnBack)
				{
					dispose();
					new Login_screen();
				}
			}
		});
		btnBack.setBounds(100, 500, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lbl_set_username = new JLabel("Set User Name :");
		lbl_set_username.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_set_username.setBounds(191, 350, 133, 14);
		contentPane.add(lbl_set_username);
		
		tf_set_uname = new JTextField();
		tf_set_uname.setBounds(350, 347, 275, 20);
		contentPane.add(tf_set_uname);
		tf_set_uname.setColumns(10);
		
		JLabel lbl_set_pass = new JLabel("Set Password :");
		lbl_set_pass.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_set_pass.setBounds(191, 400, 133, 14);
		contentPane.add(lbl_set_pass);
		
		tf_set_pass = new JPasswordField();
		tf_set_pass.setBounds(350, 397, 275, 20);
		contentPane.add(tf_set_pass);
		tf_set_pass.setColumns(10);
		setVisible(true);
	}
}