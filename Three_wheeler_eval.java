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
import java.awt.event.ActionEvent;

public class Three_wheeler_eval extends JFrame {

	private JPanel contentPane;
	private JTextField tf_daily_avg;
	protected static float total_travelling_eval=0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Three_wheeler_eval();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	protected Three_wheeler_eval(int n)
	{
		for(int i=0;i<n;i++)
		{
			Three_wheeler_eval t	=	new Three_wheeler_eval();
		}
	}
	public Three_wheeler_eval()
	{
		setTitle("Census Department of India - Travelling Evaluation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		final JLabel lblSolution = new JLabel("Your Result :");
		lblSolution.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSolution.setBounds(107, 374, 572, 14);
		contentPane.add(lblSolution);
		
		JLabel title_three_wheeler_eval = new JLabel("Three Wheeler Carbon Emission Details :");
		title_three_wheeler_eval.setFont(new Font("Tahoma", Font.BOLD, 14));
		title_three_wheeler_eval.setBounds(10, 11, 278, 14);
		contentPane.add(title_three_wheeler_eval);
		
		JLabel lbl_three_whl_type = new JLabel("Enter the Type of Three Wheeler :");
		lbl_three_whl_type.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_three_whl_type.setBounds(167, 160, 192, 14);
		contentPane.add(lbl_three_whl_type);
		
		JLabel lbl_daily_avg = new JLabel("Enter Daily running average in kms :");
		lbl_daily_avg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_daily_avg.setBounds(147, 240, 212, 14);
		contentPane.add(lbl_daily_avg);
		
		tf_daily_avg = new JTextField();
		tf_daily_avg.setColumns(10);
		tf_daily_avg.setBounds(402, 238, 192, 20);
		contentPane.add(tf_daily_avg);
		
		final JComboBox three_whl_type = new JComboBox();
		three_whl_type.setBounds(402, 157, 192, 22);
		contentPane.add(three_whl_type);
		
		JLabel lbl_eval = new JLabel("Evaluation :");
		lbl_eval.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_eval.setBounds(273, 320, 81, 14);
		contentPane.add(lbl_eval);
		
		final JLabel eval = new JLabel("0");
		eval.setBounds(402, 321, 107, 14);
		contentPane.add(eval);
		
		//two_whl_type.addItem("-- SCOOTER --");
		three_whl_type.addItem("Petrol");
		three_whl_type.addItem("Diesel");
		//two_whl_type.addItem("-- MOTORCYCLE --");
		three_whl_type.addItem("CNG");
		
		three_whl_type.setSelectedItem(null);
		
		final JButton btnEvaluate = new JButton("Evaluate");
		btnEvaluate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String 	val	=	(String)three_whl_type.getSelectedItem();
				if(e.getSource()==btnEvaluate)
				{	
					if(val == "Petrol")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.1135;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		            }
		            else if(val == "Diesel")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.1322;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "CNG")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.10768;
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
					if(total_travelling_eval>1800.00)
					{
						lblSolution.setText("FAILED : Switch to an Electric Vehicle");
					}
					else
						lblSolution.setText("PASSED : Your Annual Carbon Emission of this vehicle is within Limits");
				}
			}
		});
		btnEvaluate.setBounds(107, 460, 89, 23);
		contentPane.add(btnEvaluate);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Saved Successfully");
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
