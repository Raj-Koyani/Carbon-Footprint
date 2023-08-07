package carbon_footprint_calculator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_person extends JFrame {

	private JPanel contentPane;
	private JTextField tf_name;
	private JTextField tf_census_id;
	private JTextField textField;
	protected static float total_food_eval=0;
	protected static float total_travelling_eval=0;

	public static void main(String[] args)
	{
		
					new Add_person();
					
	}

	public Add_person()
	{
		setTitle("Census Department of India - Add Person");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Add Family / Group Details :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 490, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lbl_members = new JLabel("Enter Number of Members :");
		lbl_members.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_members.setBounds(176, 70, 148, 14);
		contentPane.add(lbl_members);
		
		tf_name = new JTextField();
		tf_name.setBounds(344, 68, 250, 20);
		contentPane.add(tf_name);
		tf_name.setColumns(10);
		
		JLabel lbl_census_id = new JLabel("Enter Census ID :");
		lbl_census_id.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_census_id.setBounds(231, 150, 93, 14);
		contentPane.add(lbl_census_id);
		
		tf_census_id = new JTextField();
		tf_census_id.setBounds(344, 148, 250, 20);
		contentPane.add(tf_census_id);
		tf_census_id.setColumns(10);
		
		final JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnAdd)
				{
					dispose();
					new Travelling_eval();
				}
			}
		});
		btnAdd.setBounds(327, 430, 89, 23);
		contentPane.add(btnAdd);
		
		JLabel lblEnterFamilyRepresentative = new JLabel("Enter Representative Name :");
		lblEnterFamilyRepresentative.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterFamilyRepresentative.setBounds(171, 110, 153, 14);
		contentPane.add(lblEnterFamilyRepresentative);
		
		textField = new JTextField();
		textField.setBounds(344, 108, 253, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		setVisible(true);
	}
}
