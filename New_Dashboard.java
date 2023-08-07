package carbon_footprint_calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class New_Dashboard extends JFrame
{
	private JPanel contentPane;
	protected JLabel ppl_covered_cnt;
	protected JLabel ppl_left_cnt;
	protected String total;
	protected JLabel tf_travel_emsn;
	protected JLabel tf_total_co2;
	protected JLabel tf_co2_avg;

	public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
				//try {
					new New_Dashboard();
					//frame.setVisible(true);
				//} catch (Exception e) {
					//e.printStackTrace();
				}
			//}
		//});
	//}

	protected New_Dashboard()
	{
		setTitle("Census Department of India - Dashboard");
		setBackground(new Color(0, 128, 0));
		//if(tf_pwd.equals)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblDashboard = new JLabel("Dashboard :");
		lblDashboard.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDashboard.setBounds(10, 11, 111, 14);
		contentPane.add(lblDashboard);
		
		JLabel lbl_no_of_ppl_covered = new JLabel("Number of People covered :");
		lbl_no_of_ppl_covered.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_no_of_ppl_covered.setBounds(30, 80, 166, 14);
		contentPane.add(lbl_no_of_ppl_covered);
		
		
		JLabel lbl_ppl_left = new JLabel("Number of People left :");
		lbl_ppl_left.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_ppl_left.setBounds(30, 120, 146, 14);
		contentPane.add(lbl_ppl_left);
		
		JLabel lbl_travel_emsn = new JLabel("Total Travelling Emission :");
		lbl_travel_emsn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_travel_emsn.setBounds(30, 160, 146, 14);
		contentPane.add(lbl_travel_emsn);
		
		JLabel lbl_energy_emsn = new JLabel("Total Energy Emission :");
		lbl_energy_emsn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_energy_emsn.setBounds(30, 200, 146, 14);
		contentPane.add(lbl_energy_emsn);
		
		JLabel lbl_food_emsn = new JLabel("Total Food Emission :     ");
		lbl_food_emsn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_food_emsn.setBounds(30, 240, 146, 14);
		contentPane.add(lbl_food_emsn);
		
		JLabel lblNewLabel_2 = new JLabel("Total Carbon Footprint :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(30, 320, 156, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblKgs = new JLabel("Kgs");
		lblKgs.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblKgs.setBounds(340, 201, 48, 14);
		contentPane.add(lblKgs);
		
		JLabel label_4 = new JLabel("Kgs");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_4.setBounds(340, 241, 48, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Kgs");
		label_5.setBounds(340, 321, 48, 14);
		contentPane.add(label_5);
		
		JLabel lbl_avg_co2_emsn = new JLabel("Average CO2 Footprint :");
		lbl_avg_co2_emsn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_avg_co2_emsn.setBounds(30, 360, 146, 14);
		contentPane.add(lbl_avg_co2_emsn);
		
		JLabel lblKgsPerPerson = new JLabel("Kgs / person");
		lblKgsPerPerson.setBounds(340, 361, 89, 14);
		contentPane.add(lblKgsPerPerson);
		
		final JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnAdd)
				{
					dispose();
					new Add_person();
				}
			}
		});
		btnAdd.setBounds(608, 460, 89, 23);
		contentPane.add(btnAdd);
		
		JLabel no_of_ppl_covered = new JLabel("0");
		no_of_ppl_covered.setFont(new Font("Tahoma", Font.PLAIN, 11));
		no_of_ppl_covered.setBounds(264, 81, 48, 14);
		contentPane.add(no_of_ppl_covered);
		
		final JLabel ppl_left_cnt = new JLabel("0");
		ppl_left_cnt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ppl_left_cnt.setBounds(264, 121, 48, 14);
		contentPane.add(ppl_left_cnt);
		
		final JLabel travel_emsn_cnt = new JLabel("0");
		travel_emsn_cnt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		travel_emsn_cnt.setBounds(264, 161, 48, 14);
		contentPane.add(travel_emsn_cnt);
		
		JLabel energy_emsn_cnt = new JLabel("0");
		energy_emsn_cnt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		energy_emsn_cnt.setBounds(264, 201, 48, 14);
		contentPane.add(energy_emsn_cnt);
		
		JLabel food_emsn_emsn = new JLabel("0");
		food_emsn_emsn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		food_emsn_emsn.setBounds(264, 241, 48, 14);
		contentPane.add(food_emsn_emsn);
		
		JLabel total_co2_emsn = new JLabel("0");
		total_co2_emsn.setBounds(264, 321, 48, 14);
		contentPane.add(total_co2_emsn);
		
		JLabel avg_co2_emsn = new JLabel("0");
		avg_co2_emsn.setBounds(264, 361, 48, 14);
		contentPane.add(avg_co2_emsn);
		
		final JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnRefresh)
				{
					JOptionPane.showMessageDialog(null,"Details Refreshed....");
				
					try
					{
						
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carbondata","root","jaitra0312%");
						Statement st	=	conn.createStatement();
						ResultSet rs	=	st.executeQuery("select p_id from co2_footprint_data");
						
						//display people covered count
						ResultSet rs0	=	st.executeQuery("select p_id from co2_footprint_data");
						ResultSetMetaData rsmd	=	rs0.getMetaData();
						int col1	=	rsmd.getColumnCount();
						ppl_covered_cnt.setText("col1");
						//ppl_covered_cnt.setEditable(false);
						
						//display people left
						ResultSet rs1	=	st.executeQuery("select p_id from co2_footprint_data");
						ResultSetMetaData rsmd1	=	rs.getMetaData();
						int col2	=	rsmd.getColumnCount();
					    ppl_left_cnt.setText("10000-col1");
						//ppl_left_cnt.setEditable(false);
						
						//display total traveling emission
						ResultSet rs2	=	st.executeQuery("select travelling_emsn from co2_footprint_data");
						ResultSetMetaData rsmd2	=	rs.getMetaData();
						String total_travel_emsn=0;
						int col3	=	rsmd.getColumnCount();
						for(int i=1;i<=col3;i++)
						{
							total_travel_emsn = total_travel_emsn + rsmd.getColumnLabel(i);
						}
						travel_emsn_cnt.setText("total_travel_emsn");
						//travel_emsn_cnt.setEditable(false);
						
						//display total energy footprint
						ResultSet rs	=	st.executeQuery("select annual_energy_emsn from co2_footprint_data");
						ResultSetMetaData rsmd	=	rs.getMetaData();
						int total_energy_emsn=0;
						int col4	=	rsmd1.getColumnCount();
						for(int i=1;i<=col3;i++)
						{
							total = total + rsmd1.getColumnLabel(i);
						}
						tf_travel_emsn.setText("total_energy_emsn");
						tf_travel_emsn.setFocusable(false);
						
						//display total food footprint
						ResultSet rs	=	st.executeQuery("select annual_food_emsn from co2_footprint_data");
						ResultSetMetaData rsmd	=	rs.getMetaData();
						int total_food_emsn=0;
						int col5	=	rsmd.getColumnCount();
						for(int i=1;i<=col3;i++)
						{
							total = total + rsmd.getColumnLabel(i);
						}
						tf_travel_emsn.setText("total_food_emsn");
						tf_travel_emsn.setFocusable(false);
						
						String total_emsn=0;
						double avg_emsn;
						total_emsn	= 	total_travel_emsn + total_energy_emsn + total_food_emsn;
						avg_emsn	=	total_emsn/3;
						tf_total_co2.setText("total_emsn");
						tf_total_co2.setFocusable(false);
						tf_co2_avg.setText("total_emsn");
						tf_co2_avg.setFocusable(false);
						
						conn.close();
				}
					catch(Exception ex)
					{
						
					}
				}
			}
		});
		btnRefresh.setBounds(80, 460, 89, 23);
		contentPane.add(btnRefresh);
		
		JLabel label = new JLabel("Kgs");
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setBounds(340, 161, 48, 14);
		contentPane.add(label);
		
		
		setVisible(true);
	}
}