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

public class Four_wheeler_eval extends JFrame {

	private JPanel contentPane;
	private JTextField tf_daily_avg;
	protected static float total_travelling_eval=0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Four_wheeler_eval();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	protected Four_wheeler_eval(int n)
	{
		for(int i=0;i<n;i++)
		{
			Four_wheeler_eval t	=	new Four_wheeler_eval();
		}
	}
	public Four_wheeler_eval()
	{
		setTitle("Census Department of India - Travelling Evaluation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel title_four_wheeler_eval = new JLabel("Four Wheeler Carbon Emission Details :");
		title_four_wheeler_eval.setFont(new Font("Tahoma", Font.BOLD, 14));
		title_four_wheeler_eval.setBounds(10, 11, 278, 14);
		contentPane.add(title_four_wheeler_eval);
		
		final JLabel lblSolution = new JLabel("Your Result :");
		lblSolution.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSolution.setBounds(107, 374, 572, 14);
		contentPane.add(lblSolution);
		
		JLabel lbl_four_whl_type = new JLabel("Enter the Type of Four Wheeler :");
		lbl_four_whl_type.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_four_whl_type.setBounds(167, 160, 192, 14);
		contentPane.add(lbl_four_whl_type);
		
		JLabel lbl_daily_avg = new JLabel("Enter Daily running average in kms :");
		lbl_daily_avg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_daily_avg.setBounds(147, 240, 212, 14);
		contentPane.add(lbl_daily_avg);
		
		tf_daily_avg = new JTextField();
		tf_daily_avg.setColumns(10);
		tf_daily_avg.setBounds(402, 238, 192, 20);
		contentPane.add(tf_daily_avg);
		
		final JComboBox four_whl_type = new JComboBox();
		four_whl_type.setBounds(402, 157, 192, 22);
		contentPane.add(four_whl_type);
		
		JLabel lbl_eval = new JLabel("Evaluation :");
		lbl_eval.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_eval.setBounds(273, 320, 81, 14);
		contentPane.add(lbl_eval);
		
		final JLabel eval = new JLabel("0");
		eval.setBounds(402, 321, 107, 14);
		contentPane.add(eval);
		
		four_whl_type.addItem("CNG Small < 1000cc");
		four_whl_type.addItem("-- Petrol --");
		four_whl_type.addItem("Petrol Hatchback < 1000cc");
		four_whl_type.addItem("Petrol Hatchback < 1400cc");
		four_whl_type.addItem("Petrol Hatchback < 1600cc");
		four_whl_type.addItem("Petrol Gypsy 1300cc");
		four_whl_type.addItem("Petrol Sedan < 1400cc");
		four_whl_type.addItem("Petrol Sedan < 1600cc");
		four_whl_type.addItem("Petrol Sedan < 2000cc");
		four_whl_type.addItem("Petrol Sedan < 2500cc");
		four_whl_type.addItem("Petrol SUV < 1600cc");
		four_whl_type.addItem("Petrol SUV < 2000cc");
		four_whl_type.addItem("Petrol SUV < 2500cc");
		four_whl_type.addItem("Petrol SUV < 3000cc");
		four_whl_type.addItem("Petrol SUV > 3000cc");
		four_whl_type.addItem("Petrol MUV < 1400cc");
		four_whl_type.addItem("-- Petrol --");
		four_whl_type.addItem("Diesel Hatchback < 1000cc");
		four_whl_type.addItem("Diesel Hatchback < 1400cc");
		four_whl_type.addItem("Diesel Hatchback < 1600cc");
		four_whl_type.addItem("Diesel Gypsy 1300cc");
		four_whl_type.addItem("Diesel Sedan < 1400cc");
		four_whl_type.addItem("Diesel Sedan < 1600cc");
		four_whl_type.addItem("Diesel Sedan < 2000cc");
		four_whl_type.addItem("Diesel Sedan < 2500cc");
		four_whl_type.addItem("Diesel SUV < 1600cc");
		four_whl_type.addItem("Diesel SUV < 2000cc");
		four_whl_type.addItem("Diesel SUV < 2500cc");
		four_whl_type.addItem("Diesel SUV < 3000cc");
		four_whl_type.addItem("Diesel SUV > 3000cc");
		four_whl_type.addItem("Diesel MUV < 1400cc");
		
		final JButton btnEvaluate = new JButton("Evaluate");
		btnEvaluate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String 	val	=	(String)four_whl_type.getSelectedItem();
				if(e.getSource()==btnEvaluate)
				{	
					if(val == "CNG Small < 1000cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.068;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		            }
		            else if(val == "Petrol Hatchback < 1000cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.127;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Petrol Hatchback < 1400cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.140;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Petrol Hatchback < 1600cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.162;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Petrol Gypsy 1300cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.204;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Petrol Sedan < 1400cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.150;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Petrol Sedan < 1600cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.153;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Petrol Sedan < 2000cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.161;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Petrol Sedan < 2500cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.176;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Petrol SUV < 1600cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.166;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Petrol SUV < 2000cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.208;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Petrol SUV < 2500cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.260;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Petrol SUV < 3000cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.280;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Petrol SUV > 3000cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.290;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            //diesel
		            else if(val == "Diesel Hatchback < 1000cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.113;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Diesel Hatchback < 1400cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.126;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Diesel Hatchback < 1600cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.147;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Diesel Gypsy 1300cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.200;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Diesel Sedan < 1400cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.131;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Diesel Sedan < 1600cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.141;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Diesel Sedan < 2000cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.161;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Diesel Sedan < 2500cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.164;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Diesel SUV < 1600cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.180;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Diesel SUV < 2000cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.201;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Diesel SUV < 2500cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.210;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Diesel SUV < 3000cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.240;
		 				float eval_val	=	(365*(val1*fac));
		 				total_travelling_eval	=	total_travelling_eval + eval_val;
		 				String ans		=	String.valueOf(eval_val);
		 				eval.setText(ans);
		  		 	}
		            else if(val == "Diesel SUV > 3000cc")
		            {
		 				int val1	=	Integer.parseInt(tf_daily_avg.getText());
		 				float fac		=	(float) 0.400;
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
					if(total_travelling_eval>1400)
					{
						lblSolution.setText("FAILED : Try using Public Transport on Alternate days and switch to Electric Vehicle.");
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
