package carbon_footprint_calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Food_evaluation extends JFrame {

	private JPanel contentPane;
	private JTextField tf_cheese;
	private JTextField tf_potatoes;
	private JTextField tf_rice;
	private JTextField tf_nuts;
	private JTextField tf_tofu;
	private JTextField tf_vege;
	private JTextField tf_milk;
	private JTextField tf_lamb;
	private JTextField tf_beef;
	private JTextField tf_pork;
	private JTextField tf_turkey;
	private JTextField tf_chicken;
	private JTextField tf_tuna;
	private JTextField tf_eggs;
	protected static float total_food_eval=0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Food_evaluation frame = new Food_evaluation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Food_evaluation() {
		setTitle("Census Department of Indian - Food Consumption Evaluation :");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Food Consumption Evaluation :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 253, 14);
		contentPane.add(lblNewLabel);
		
		final JCheckBox cheese = new JCheckBox("Cheese");
		cheese.setBounds(50, 64, 97, 23);
		contentPane.add(cheese);
		
		tf_cheese = new JTextField();
		tf_cheese.setBounds(194, 65, 96, 20);
		contentPane.add(tf_cheese);
		tf_cheese.setColumns(10);
		
		JLabel lblKgWeek = new JLabel("kg / week");
		lblKgWeek.setBounds(300, 68, 72, 14);
		contentPane.add(lblKgWeek);
		
		final JCheckBox potatoes = new JCheckBox("Potatoes");
		potatoes.setBounds(50, 90, 97, 23);
		contentPane.add(potatoes);
		
		tf_potatoes = new JTextField();
		tf_potatoes.setColumns(10);
		tf_potatoes.setBounds(194, 91, 96, 20);
		contentPane.add(tf_potatoes);
		
		JLabel label = new JLabel("kg / week");
		label.setBounds(300, 94, 72, 14);
		contentPane.add(label);
		
		final JCheckBox rice = new JCheckBox("Rice");
		rice.setBounds(50, 116, 97, 23);
		contentPane.add(rice);
		
		tf_rice = new JTextField();
		tf_rice.setColumns(10);
		tf_rice.setBounds(194, 117, 96, 20);
		contentPane.add(tf_rice);
		
		JLabel label_1 = new JLabel("kg / week");
		label_1.setBounds(300, 120, 72, 14);
		contentPane.add(label_1);
		
		final JCheckBox nuts = new JCheckBox("Nuts");
		nuts.setBounds(50, 142, 97, 23);
		contentPane.add(nuts);
		
		tf_nuts = new JTextField();
		tf_nuts.setColumns(10);
		tf_nuts.setBounds(194, 143, 96, 20);
		contentPane.add(tf_nuts);
		
		JLabel label_2 = new JLabel("kg / week");
		label_2.setBounds(300, 146, 72, 14);
		contentPane.add(label_2);
		
		final JCheckBox tofu = new JCheckBox("Tofu");
		tofu.setBounds(50, 168, 97, 23);
		contentPane.add(tofu);
		
		tf_tofu = new JTextField();
		tf_tofu.setColumns(10);
		tf_tofu.setBounds(194, 169, 96, 20);
		contentPane.add(tf_tofu);
		
		final JLabel lblSolution = new JLabel("Your Result :");
		lblSolution.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSolution.setBounds(107, 374, 572, 14);
		contentPane.add(lblSolution);
		
		JLabel label_3 = new JLabel("kg / week");
		label_3.setBounds(300, 172, 72, 14);
		contentPane.add(label_3);
		
		final JCheckBox vege = new JCheckBox("Vegetables");
		vege.setBounds(50, 194, 97, 23);
		contentPane.add(vege);
		
		tf_vege = new JTextField();
		tf_vege.setColumns(10);
		tf_vege.setBounds(194, 195, 96, 20);
		contentPane.add(tf_vege);
		
		JLabel label_4 = new JLabel("kg / week");
		label_4.setBounds(300, 198, 72, 14);
		contentPane.add(label_4);
		
		final JCheckBox milk = new JCheckBox("Milk");
		milk.setBounds(50, 220, 97, 23);
		contentPane.add(milk);
		
		tf_milk = new JTextField();
		tf_milk.setColumns(10);
		tf_milk.setBounds(194, 221, 96, 20);
		contentPane.add(tf_milk);
		
		JLabel label_5 = new JLabel("kg / week");
		label_5.setBounds(300, 224, 72, 14);
		contentPane.add(label_5);
		
		final JCheckBox lamb = new JCheckBox("Lamb");
		lamb.setBounds(430, 64, 97, 23);
		contentPane.add(lamb);
		
		tf_lamb = new JTextField();
		tf_lamb.setColumns(10);
		tf_lamb.setBounds(574, 65, 96, 20);
		contentPane.add(tf_lamb);
		
		JLabel label_6 = new JLabel("kg / week");
		label_6.setBounds(680, 68, 60, 14);
		contentPane.add(label_6);
		
		final JCheckBox beef = new JCheckBox("Beef");
		beef.setBounds(430, 90, 97, 23);
		contentPane.add(beef);
		
		tf_beef = new JTextField();
		tf_beef.setColumns(10);
		tf_beef.setBounds(574, 91, 96, 20);
		contentPane.add(tf_beef);
		
		JLabel label_7 = new JLabel("kg / week");
		label_7.setBounds(680, 94, 60, 14);
		contentPane.add(label_7);
		
		final JCheckBox pork = new JCheckBox("Pork");
		pork.setBounds(430, 116, 97, 23);
		contentPane.add(pork);
		
		tf_pork = new JTextField();
		tf_pork.setColumns(10);
		tf_pork.setBounds(574, 117, 96, 20);
		contentPane.add(tf_pork);
		
		JLabel label_8 = new JLabel("kg / week");
		label_8.setBounds(680, 120, 60, 14);
		contentPane.add(label_8);
		
		final JCheckBox turkey = new JCheckBox("Turkey");
		turkey.setBounds(430, 142, 97, 23);
		contentPane.add(turkey);
		
		tf_turkey = new JTextField();
		tf_turkey.setColumns(10);
		tf_turkey.setBounds(574, 143, 96, 20);
		contentPane.add(tf_turkey);
		
		JLabel label_9 = new JLabel("kg / week");
		label_9.setBounds(680, 146, 60, 14);
		contentPane.add(label_9);
		
		final JCheckBox chicken = new JCheckBox("Chicken");
		chicken.setBounds(430, 167, 97, 23);
		contentPane.add(chicken);
		
		tf_chicken = new JTextField();
		tf_chicken.setColumns(10);
		tf_chicken.setBounds(574, 168, 96, 20);
		contentPane.add(tf_chicken);
		
		JLabel label_10 = new JLabel("kg / week");
		label_10.setBounds(680, 171, 72, 14);
		contentPane.add(label_10);
		
		final JCheckBox tuna = new JCheckBox("Tuna");
		tuna.setBounds(430, 194, 97, 23);
		contentPane.add(tuna);
		
		tf_tuna = new JTextField();
		tf_tuna.setColumns(10);
		tf_tuna.setBounds(574, 195, 96, 20);
		contentPane.add(tf_tuna);
		
		JLabel label_11 = new JLabel("kg / week");
		label_11.setBounds(680, 198, 60, 14);
		contentPane.add(label_11);
		
		final JCheckBox eggs = new JCheckBox("Eggs");
		eggs.setBounds(430, 220, 97, 23);
		contentPane.add(eggs);
		
		tf_eggs = new JTextField();
		tf_eggs.setColumns(10);
		tf_eggs.setBounds(574, 221, 96, 20);
		contentPane.add(tf_eggs);
		
		JLabel label_12 = new JLabel("kg / week");
		label_12.setBounds(680, 224, 60, 14);
		contentPane.add(label_12);
		
		JLabel lblVegeterianFood = new JLabel("Vegeterian Food :");
		lblVegeterianFood.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVegeterianFood.setBounds(50, 40, 97, 14);
		contentPane.add(lblVegeterianFood);
		
		JLabel lblNonVegeterianFood = new JLabel("Non Vegeterian Food :");
		lblNonVegeterianFood.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNonVegeterianFood.setBounds(430, 40, 142, 14);
		contentPane.add(lblNonVegeterianFood);
		
		JLabel lblNewLabel_1 = new JLabel("Evaluation :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(50, 300, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblKgYear = new JLabel("kg / year");
		lblKgYear.setBounds(300, 301, 72, 14);
		contentPane.add(lblKgYear);
		
		final JLabel eval1 = new JLabel("0");
		eval1.setBounds(194, 301, 48, 14);
		contentPane.add(eval1);
		
		final JButton btnEvaluate = new JButton("Evaluate");
		btnEvaluate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnEvaluate)
				{
					if(total_food_eval==0)
					{
						
					}
					else if(lamb.isSelected())
					{
						int val1			=	Integer.parseInt(tf_lamb.getText());
		 				float fac			=	(float) 39.2;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;
					}
					else if(beef.isSelected())
					{
						int val1			=	Integer.parseInt(tf_beef.getText());
		 				float fac			=	(float) 27;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;	
					}
					else if(cheese.isSelected())
					{
						int val1			=	Integer.parseInt(tf_cheese.getText());
		 				float fac			=	(float) 27;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;	
					}
					else if(pork.isSelected())
					{
						int val1			=	Integer.parseInt(tf_pork.getText());
		 				float fac			=	(float) 12.1;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;	
					}
					else if(turkey.isSelected())
					{
						int val1			=	Integer.parseInt(tf_turkey.getText());
		 				float fac			=	(float) 10.9;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;	
					}
					else if(chicken.isSelected())
					{
						int val1			=	Integer.parseInt(tf_chicken.getText());
		 				float fac			=	(float) 6.9;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;	
					}
					else if(tuna.isSelected())
					{
						int val1			=	Integer.parseInt(tf_tuna.getText());
		 				float fac			=	(float) 6.1;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;	
					}
					else if(eggs.isSelected())
					{
						int val1			=	Integer.parseInt(tf_eggs.getText());
		 				float fac			=	(float) 4.8;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;	
					}
					else if(potatoes.isSelected())
					{
						int val1			=	Integer.parseInt(tf_potatoes.getText());
		 				float fac			=	(float) 2.9;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;	
					}
					else if(rice.isSelected())
					{
						int val1			=	Integer.parseInt(tf_rice.getText());
		 				float fac			=	(float) 2.7;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;	
					}
					else if(nuts.isSelected())
					{
						int val1			=	Integer.parseInt(tf_nuts.getText());
		 				float fac			=	(float) 2.3;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;	
					}
					else if(tofu.isSelected())
					{
						int val1			=	Integer.parseInt(tf_tofu.getText());
		 				float fac			=	(float) 2;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;	
					}
					else if(vege.isSelected())
					{
						int val1			=	Integer.parseInt(tf_vege.getText());
		 				float fac			=	(float) 2;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;	
					}
					else if(milk.isSelected())
					{
						int val1			=	Integer.parseInt(tf_milk.getText());
		 				float fac			=	(float) 1.9;
		 				float eval_val		=	(200*(val1*fac));
		 				total_food_eval		=	total_food_eval	+ eval_val;	
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Error....Re-Enter details...");
					}
					String ans1			=	String.valueOf(total_food_eval);
					eval1.setText(ans1);
					if(total_food_eval>2500.00)
					{
						lblSolution.setText("FAILED : Reduce Non - Vegeterian diet and go Vegen");
					}
					else
						lblSolution.setText("PASSED : Your Annual Carbon Emission of Food Consumption is within Limits");
				}
			}
		});
		btnEvaluate.setBounds(50, 430, 89, 23);
		contentPane.add(btnEvaluate);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Food Evaluation Saved Successfully");
				new Energy_eval();
				dispose();
			}
		});
		btnSave.setBounds(639, 430, 89, 23);
		contentPane.add(btnSave);
	}

}
