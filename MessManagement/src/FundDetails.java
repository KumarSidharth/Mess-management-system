import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FundDetails extends JFrame implements ActionListener
{
	private JLabel fe,to,p2;
	private static JTextField tot;
	private JPanel panel;
	private JButton lo;
	
	public FundDetails()
	{
		super("Fund Details");
		 
		 fe= new JLabel("Welcome Admin");
		 to= new JLabel("TOTAL AMOUNT IN FUND");
		 tot=new JTextField(10);
		 
		 lo=new JButton("Log out");
			
		p2=new JLabel(new ImageIcon("pics/c_bed3.jpg"));
		
		p2.add(fe);
		p2.add(to);
		p2.add(tot);
		p2.add(lo);
		p2.add(lo);
		
		fe.setBounds(50,0, 150,100);
		to.setBounds(250, 100, 150,50);
		tot.setBounds(240,150,150,50);
		lo.setBounds(400, 350, 150, 50);
		
		
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(1,1,50,50));
		
		panel.add(p2);
		p2.setBorder(BorderFactory.createTitledBorder(""));
		add(panel);
		
		
		lo.addActionListener(this);
		
		setSize(700,550);
		setVisible(true);
		
	}
	public static void main(String[] args) 
	{
	  FundDetails m=new FundDetails();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object a=e.getSource();	
		
	
	/*if(a==submit)
	{
		String userid=firsttext.getText();
		String pass=secondtext.getText();
		
		if(userid.equals("sami") && pass.equals("123"))
		{
				new AdminHp(userid);
				dispose();
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Admin ID or Password");
		}
	}*/
	if(a==lo)
	{
		new AdminDetails();
		dispose();
	}

}




}
