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

public class Energy_eval extends JFrame {

	private JPanel contentPane;
	private JTextField tf_ele;
	private JTextField tf_lpg;
	protected static float total_energy_eval=0;

	public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
			//	try {
					new Energy_eval();
					//frame.setVisible(true);
				//} catch (Exception e) {
				//	e.printStackTrace();
				//}
			//}
		//});
	}

	public Energy_eval()
	{
		setTitle("Census Department of India - Energy Consumption Evaluation");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblAnnualElectricityConsumption = new JLabel("Annual Energy Consumption :");
		lblAnnualElectricityConsumption.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAnnualElectricityConsumption.setBounds(10, 11, 278, 14);
		contentPane.add(lblAnnualElectricityConsumption);
		
		final JLabel lblSolution = new JLabel("Your Result :");
		lblSolution.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSolution.setBounds(107, 374, 572, 14);
		contentPane.add(lblSolution);
		
		JLabel lblAnnualElectricityConsumption_1 = new JLabel("Annual Electricity Consumption :");
		lblAnnualElectricityConsumption_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAnnualElectricityConsumption_1.setBounds(160, 110, 176, 14);
		contentPane.add(lblAnnualElectricityConsumption_1);
		
		tf_ele = new JTextField();
		tf_ele.setColumns(10);
		tf_ele.setBounds(402, 108, 96, 20);
		contentPane.add(tf_ele);
		
		JLabel lblTotalEvaluation = new JLabel("Total Evaluation :");
		lblTotalEvaluation.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotalEvaluation.setBounds(229, 270, 107, 14);
		contentPane.add(lblTotalEvaluation);
		
		final JLabel eval = new JLabel("0");
		eval.setBounds(402, 271, 107, 14);
		contentPane.add(eval);
		
		JLabel label_4 = new JLabel("KG CO2 / Year");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_4.setBounds(508, 271, 75, 14);
		contentPane.add(label_4);
		
		final JButton evaluate = new JButton("Evaluate");
		evaluate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==evaluate)
				{
					float val1			=	Integer.parseInt(tf_ele.getText());
					float val2			=	Integer.parseInt(tf_lpg.getText());
					float ele_eval		=	(float) (val1*0.85);
					float lpg_eval		=	(float) (val2*2.983);
	 				total_energy_eval	=	ele_eval + lpg_eval ;
	 				String ans			=	String.valueOf(total_energy_eval);
	 				eval.setText(ans);
	 				if(total_energy_eval>3000.00)
					{
						lblSolution.setText("FAILED : Switch to Solar Energy and maximize usage of solar powered Appliances");
					}
					else
						lblSolution.setText("PASSED : Your Annual Carbon Emission of Energy consumption is within Limits");
				}
			}
		});
		evaluate.setBounds(107, 460, 89, 23);
		contentPane.add(evaluate);
		
		JButton button_1 = new JButton("Save");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Energy Evaluation Saved Successfully");
				new Final_result();
				dispose();
			}
		});
		button_1.setBounds(590, 460, 89, 23);
		contentPane.add(button_1);
		
		JLabel lblAnnualLpgConsumption = new JLabel("Annual LPG Consumption :");
		lblAnnualLpgConsumption.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAnnualLpgConsumption.setBounds(191, 181, 145, 14);
		contentPane.add(lblAnnualLpgConsumption);
		
		tf_lpg = new JTextField();
		tf_lpg.setColumns(10);
		tf_lpg.setBounds(402, 179, 96, 20);
		contentPane.add(tf_lpg);
		
		JLabel lblKwh = new JLabel("KWh");
		lblKwh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblKwh.setBounds(508, 111, 75, 14);
		contentPane.add(lblKwh);
		
		JLabel lblUnits = new JLabel("Units");
		lblUnits.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblUnits.setBounds(508, 182, 75, 14);
		contentPane.add(lblUnits);
	}

}
