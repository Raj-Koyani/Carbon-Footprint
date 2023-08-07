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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Travelling_eval extends JFrame {

	private JPanel contentPane;
	protected JTextField tf_no_of_two_whl;
	protected JTextField tf_no_of_three_whl;
	protected JTextField tf_no_of_four_whl;
	protected static int flag=0;
	
	public static void main(String[] args)
	{
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
				//try {
					new Travelling_eval();
					//frame.setVisible(true);
				//} catch (Exception e) {
					//e.printStackTrace();
				//}
			}
		//});
	//}

	public Travelling_eval()
	{
		setTitle("Census Department of India - Travelling Evaluation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblTravellingEvaluation = new JLabel("Travelling Evaluation :");
		lblTravellingEvaluation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTravellingEvaluation.setBounds(10, 11, 174, 20);
		contentPane.add(lblTravellingEvaluation);
		
		JLabel lblNewLabel = new JLabel("Number of Two Wheelers :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(180, 129, 144, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumberOfThree = new JLabel("Number of Three Wheelers :");
		lblNumberOfThree.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumberOfThree.setBounds(172, 180, 167, 14);
		contentPane.add(lblNumberOfThree);
		
		JLabel lblNumberOfFour = new JLabel("Number of Four Wheelers :");
		lblNumberOfFour.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumberOfFour.setBounds(179, 232, 145, 14);
		contentPane.add(lblNumberOfFour);
		
		tf_no_of_two_whl = new JTextField();
		tf_no_of_two_whl.setBounds(334, 127, 235, 20);
		contentPane.add(tf_no_of_two_whl);
		tf_no_of_two_whl.setColumns(10);
		
		tf_no_of_three_whl = new JTextField();
		tf_no_of_three_whl.setBounds(334, 178, 235, 20);
		contentPane.add(tf_no_of_three_whl);
		tf_no_of_three_whl.setColumns(10);
		
		tf_no_of_four_whl = new JTextField();
		tf_no_of_four_whl.setBounds(334, 230, 235, 20);
		contentPane.add(tf_no_of_four_whl);
		tf_no_of_four_whl.setColumns(10);
		
		JButton btnNext = new JButton("Add");
		btnNext.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				/*if(e.getSource()==btnNext)
					if(tf_no_of_two_whl.getText().equals("0") && tf_no_of_three_whl.getText().equals("0")&& tf_no_of_four_whl.getText().equals("0"))
					{
						dispose();
						JOptionPane.showMessageDialog(null,"Successfully Working till here.");
						//new Energy_eval();
					}*/
				if(tf_no_of_two_whl.getText().equals("0"))
				{
					if(tf_no_of_three_whl.getText().equals("0"))
					{
						if(tf_no_of_four_whl.getText().equals("0"))
						{
							flag++;
							//call to food eval
							dispose();
						}
					}
				}
				else if(tf_no_of_two_whl.getText().equals("1"))
				{
					//dispose();
					new Two_wheeler_eval();
				}
				else if(tf_no_of_two_whl.getText().equals("2"))
				{
					
					//dispose();
					new Two_wheeler_eval(2);
				}
				else if(tf_no_of_two_whl.getText().equals("3"))
				{
					
					//dispose();
					new Two_wheeler_eval(3);
					
				}
				else if(tf_no_of_two_whl.getText().equals("4"))
				{
					
					//dispose();
					new Two_wheeler_eval(4);
					
				}
				else if(tf_no_of_two_whl.getText().equals("5"))
				{
					
					//dispose();
					new Two_wheeler_eval(5);
				}
				//Call to three wheeler
				if(tf_no_of_three_whl.getText().equals("1"))
				{
					//dispose();
					new Three_wheeler_eval();
				}
				else if(tf_no_of_three_whl.getText().equals("2"))
				{
					
					//dispose();
					new Two_wheeler_eval(2);
				}
				else if(tf_no_of_three_whl.getText().equals("3"))
				{
					
					//dispose();
					new Three_wheeler_eval(3);
					
				}
				else if(tf_no_of_three_whl.getText().equals("4"))
				{
					
					//dispose();
					new Three_wheeler_eval(4);
					
				}
				else if(tf_no_of_three_whl.getText().equals("5"))
				{
					
					//dispose();
					new Two_wheeler_eval(5);
				}
				//call to four wheeler
				if(tf_no_of_four_whl.getText().equals("1"))
				{
					//dispose();
					new Four_wheeler_eval();
				}
				else if(tf_no_of_four_whl.getText().equals("2"))
				{
					
					//dispose();
					new Four_wheeler_eval(2);
				}
				else if(tf_no_of_four_whl.getText().equals("3"))
				{
					
					//dispose();
					new Four_wheeler_eval(3);
					
				}
				else if(tf_no_of_four_whl.getText().equals("4"))
				{
					
					//dispose();
					new Four_wheeler_eval(4);
					
				}
				else if(tf_no_of_four_whl.getText().equals("5"))
				{
					
					//dispose();
					new Four_wheeler_eval(5);
				}
				tf_no_of_two_whl.setText(null);
				tf_no_of_three_whl.setText(null);
				tf_no_of_four_whl.setText(null);
				}
		});
		btnNext.setBounds(172, 470, 89, 23);
		contentPane.add(btnNext);
		
		final JButton btnNext_1 = new JButton("next");
		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnNext_1)
				{
					JOptionPane.showMessageDialog(null,"Traveling Evaluation Saved Successfully");
					new Food_evaluation();
					dispose();
				}
			}
		});
		btnNext_1.setBounds(480, 470, 89, 23);
		contentPane.add(btnNext_1);
		
		setVisible(true);
	}
}
