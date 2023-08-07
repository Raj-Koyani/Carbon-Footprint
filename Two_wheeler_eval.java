package carbon_footprint_calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Two_wheeler_eval extends JFrame
{

	private JPanel contentPane;
	private JTextField tf_daily_avg;
	protected static float total_travelling_eval=0;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try {
					new Two_wheeler_eval();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	protected Two_wheeler_eval(int n)
	{
		for(int i=0;i<n;i++)
		{
			Two_wheeler_eval t	=	new Two_wheeler_eval();
		}
	}
	public Two_wheeler_eval()
	{
		setTitle("Census Department of India - Travelling Evaluation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel title_two_wheeler_eval = new JLabel("Two Wheeler Carbon Emission Details :");
		title_two_wheeler_eval.setFont(new Font("Tahoma", Font.BOLD, 14));
		title_two_wheeler_eval.setBounds(10, 11, 278, 14);
		contentPane.add(title_two_wheeler_eval);
		
		JLabel lbl_two_whl_type = new JLabel("Enter the Type of Two Wheeler :");
		lbl_two_whl_type.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_two_whl_type.setBounds(167, 160, 192, 14);
		contentPane.add(lbl_two_whl_type);
		
		JLabel lbl_daily_avg = new JLabel("Enter Daily running average in kms :");
		lbl_daily_avg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_daily_avg.setBounds(147, 240, 212, 14);
		contentPane.add(lbl_daily_avg);
		
		final JLabel lblSolution = new JLabel("Your Result :");
		lblSolution.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSolution.setBounds(107, 374, 572, 14);
		contentPane.add(lblSolution);
		
		tf_daily_avg = new JTextField();
		tf_daily_avg.setColumns(10);
		tf_daily_avg.setBounds(402, 238, 192, 20);
		contentPane.add(tf_daily_avg);
		
		final JComboBox two_whl_type = new JComboBox();
		two_whl_type.setBounds(402, 157, 192, 22);
		contentPane.add(two_whl_type);
		
		JLabel lbl_eval = new JLabel("Evaluation :");
		lbl_eval.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_eval.setBounds(273, 320, 81, 14);
		contentPane.add(lbl_eval);
		
		final JLabel eval = new JLabel("0");
		eval.setBounds(402, 321, 107, 14);
		contentPane.add(eval);
		
		//two_whl_type.addItem("-- SCOOTER --");
		two_whl_type.addItem("Scooter < 110cc");
		two_whl_type.addItem("Scooter < 150cc");
		//two_whl_type.addItem("-- MOTORCYCLE --");
		two_whl_type.addItem("Motorcycle < 100cc");
		two_whl_type.addItem("Motorcycle < 125cc");
		two_whl_type.addItem("Motorcycle < 135cc");
		two_whl_type.addItem("Motorcycle < 200cc");
		two_whl_type.addItem("Motorcycle < 300cc");
		two_whl_type.addItem("Motorcycle < 500cc");
		
		two_whl_type.setSelectedItem(null);
		
		final JButton btnEvaluate = new JButton("Evaluate");
		btnEvaluate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String 	val	=	(String)two_whl_type.getSelectedItem();
				if(e.getSource()==btnEvaluate)
				{	
					if(val == "Scooter < 110cc")
		            {
		 				int val1				=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac				=	(float) 0.0368;
		 				float eval_val			=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		            }
		            else if(val == "Scooter < 150cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.0387;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Motorcycle < 100cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.0358;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Motorcycle < 125cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.0319;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Motorcycle < 135cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.0356;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Motorcycle < 200cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.0458;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Motorcycle < 300cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.0595;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Motorcycle < 500cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.0597;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else
		            {
		            	JOptionPane.showMessageDialog(null,"Error.... Re-Enter Values....");
		            	tf_daily_avg.setText(null);
		            	eval.setText(null);
		            }
					//JOptionPane.showMessageDialog(null,"Your "+val+" emits "+eval+" KG CO2 / Year");
				}
				if(total_travelling_eval>800.00)
				{
					lblSolution.setText("FAILED : Try using Public Transport on Alternate days and switch to an Electric Vehicle");
				}
				else
					lblSolution.setText("PASSED : Your Annual Carbon Emission of this vehicle is within Limits");
			}
		});
		btnEvaluate.setBounds(107, 460, 89, 23);
		contentPane.add(btnEvaluate);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carbondata","root","jaitra0312%");
					PreparedStatement ps = conn.prepareStatement("insert into co2_footprint_database values(?,?,?)");
					JLabel tf_no_of_two_whl;
					ps.setString(1,tf_no_of_two_whl.getText());
					JLabel tf_name;
					ps.setString(2,tf_name.getText());
					JLabel tf_area;
					ps.setString(3,tf_area.getText());
					JLabel tf_district;
					ps.setString(4,tf_district.getText());
					JLabel tf_state;
					ps.setString(5,tf_state.getText());
					JLabel tf_pin;
					ps.setString(6,tf_pin.getText());
					JLabel tf_set_uname;
					ps.setString(7,tf_set_uname.getText());
					JLabel tf_set_pass;
					ps.setString(8,tf_set_pass.getText());
					
					int x = ps.executeUpdate();
					if(x>0)
					{
						JOptionPane.showMessageDialog(null,"Details Saved....");
					}
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Error.... Re - Enter the Details....");
					lbl_c_id.setText(null);
					lbl_name.setText(null);
					lbl_area.setText(null);
					lbl_district.setText(null);
					lbl_state.setText(null);
					lbl_pin.setText(null);
				}
				JOptionPane.showMessageDialog(null,"Saved Successfully....");
				dispose();
			}
		});
		btnNewButton.setBounds(590, 460, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblKgCo = new JLabel("KG CO2 / Year");
		lblKgCo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblKgCo.setBounds(519, 321, 75, 14);
		contentPane.add(lblKgCo);
		
		setVisible(true);
	}
}
