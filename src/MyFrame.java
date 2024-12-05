import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfskill;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	JComboBox<String> skillcb;
	private JTextField tfname;
	private JTextField tfemail;
	private JTextField tfmobile;
	JLabel getnamelbl;
	JLabel getemaillbl;
	JLabel getmobilelbl;
	JLabel getsublbl;
	JLabel gettopskilllbl;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 139, 438, 137);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox suscheck = new JCheckBox("Subscribe!");
		suscheck.setBounds(68, 7, 97, 23);
		panel.add(suscheck);
		
		JPanel smspanel = new JPanel();
		smspanel.setBounds(68, 37, 327, 89);
		panel.add(smspanel);
		smspanel.setLayout(null);
		
		smspanel.setVisible(false);
		
		suscheck.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				boolean isSelected = suscheck.isSelected();
				smspanel.setVisible(isSelected);
			}
			
		});
		
		JRadioButton rdbtnsms = new JRadioButton("SMS");
		rdbtnsms.setSelected(true);
		buttonGroup.add(rdbtnsms);
		rdbtnsms.setBounds(29, 34, 109, 23);
		smspanel.add(rdbtnsms);
		
		JRadioButton rdbtnemail = new JRadioButton("Email");
		buttonGroup.add(rdbtnemail);
		rdbtnemail.setBounds(179, 34, 109, 23);
		smspanel.add(rdbtnemail);
		
		JLabel lblNewLabel = new JLabel("Choose :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(29, 13, 75, 14);
		smspanel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 276, 438, 137);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Add Skill :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(50, 34, 79, 14);
		panel_1.add(lblNewLabel_1);
		
		tfskill = new JTextField();
		tfskill.setBounds(139, 32, 136, 20);
		panel_1.add(tfskill);
		tfskill.setColumns(10);
		
		JButton skillbtn = new JButton("Add");
		skillbtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String a = tfskill.getText();
				skillcb.addItem(a);
			}
		});
		skillbtn.setBounds(300, 31, 89, 23);
		panel_1.add(skillbtn);
		
		JLabel lblNewLabel_1_1 = new JLabel("Top Skills :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(50, 83, 79, 14);
		panel_1.add(lblNewLabel_1_1);
		
		skillcb = new JComboBox<>();
		skillcb.setBounds(139, 80, 136, 22);
		panel_1.add(skillcb);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 11, 438, 126);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Name :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(89, 22, 46, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(89, 48, 46, 14);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Mobile :");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_2.setBounds(89, 75, 56, 14);
		panel_2.add(lblNewLabel_2_2);
		
		tfname = new JTextField();
		tfname.setBounds(187, 20, 118, 20);
		panel_2.add(tfname);
		tfname.setColumns(10);
		
		tfemail = new JTextField();
		tfemail.setColumns(10);
		tfemail.setBounds(187, 46, 118, 20);
		panel_2.add(tfemail);
		
		tfmobile = new JTextField();
		tfmobile.setColumns(10);
		tfmobile.setBounds(187, 73, 118, 20);
		panel_2.add(tfmobile);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 413, 438, 205);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnprint = new JButton("Print");
		btnprint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String name = tfname.getText();
				String email = tfemail.getText();
				String mobile = tfmobile.getText();
				
				getnamelbl.setText(name);
				getemaillbl.setText(email);
				getmobilelbl.setText(mobile);
				if(suscheck.isSelected())
				{
					if(rdbtnsms.isSelected())
					{
						getsublbl.setText("SMS");
					}
					else if(rdbtnemail.isSelected())
					{
						getsublbl.setText("Email");
					}
				}
				else
				{
					getsublbl.setText("False");
				}
				
				String item_get = (String) skillcb.getSelectedItem();
				gettopskilllbl.setText(item_get);
				
				
			}
		});
		btnprint.setBounds(173, 11, 89, 23);
		panel_3.add(btnprint);
		
		JLabel prlblname = new JLabel("Name :");
		prlblname.setFont(new Font("Tahoma", Font.BOLD, 13));
		prlblname.setBounds(68, 52, 46, 14);
		panel_3.add(prlblname);
		
		JLabel prlblemail = new JLabel("Email :");
		prlblemail.setFont(new Font("Tahoma", Font.BOLD, 13));
		prlblemail.setBounds(68, 76, 46, 14);
		panel_3.add(prlblemail);
		
		JLabel prlblmobile = new JLabel("Mobile :");
		prlblmobile.setFont(new Font("Tahoma", Font.BOLD, 13));
		prlblmobile.setBounds(68, 101, 61, 14);
		panel_3.add(prlblmobile);
		
		getnamelbl = new JLabel("");
		getnamelbl.setBounds(173, 53, 89, 14);
		panel_3.add(getnamelbl);
		
		getemaillbl = new JLabel("");
		getemaillbl.setBounds(173, 77, 89, 14);
		panel_3.add(getemaillbl);
		
		getmobilelbl = new JLabel("");
		getmobilelbl.setBounds(173, 102, 89, 14);
		panel_3.add(getmobilelbl);
		
		JLabel prlblsub = new JLabel("Subscribe :");
		prlblsub.setFont(new Font("Tahoma", Font.BOLD, 13));
		prlblsub.setBounds(68, 126, 72, 14);
		panel_3.add(prlblsub);
		
		getsublbl = new JLabel("");
		getsublbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		getsublbl.setBounds(173, 127, 89, 14);
		panel_3.add(getsublbl);
		
		JLabel prlbltopskill = new JLabel("Top Skill :");
		prlbltopskill.setFont(new Font("Tahoma", Font.BOLD, 13));
		prlbltopskill.setBounds(68, 151, 72, 14);
		panel_3.add(prlbltopskill);
		
		gettopskilllbl = new JLabel("");
		gettopskilllbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		gettopskilllbl.setBounds(173, 152, 89, 14);
		panel_3.add(gettopskilllbl);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
			}
		});
		btnClose.setBounds(173, 171, 89, 23);
		panel_3.add(btnClose);
		
		skillcb.addItem("Programming");
		skillcb.addItem("Gaming");
		skillcb.addItem("Debugging");
		
		
	}
}
