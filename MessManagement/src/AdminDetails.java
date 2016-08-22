import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AdminDetails extends JFrame implements ActionListener
{

	private JLabel p1,p2,wl;
	private JPanel panel;
	private JButton mem,pm,fund,mrkt,fe,meald,lo;
	
	public AdminDetails()
	{
		super("Admin Details");
		 
		wl=new JLabel("Welcom Admin");
		mem=new JButton("MEMBER");
		pm=new JButton("PAYMENT");
		fund=new JButton("FUND");
		mrkt=new JButton("MARKETING");
		fe=new JButton("FIXED EXPENSES");
		meald=new JButton("MEAL DETAILS");
		lo=new JButton("Log out");
			
		p2=new JLabel(new ImageIcon("pics/c_bed3.jpg"));
		
		p2.add(wl);
		p2.add(mem);
		p2.add(fund);
		p2.add(mrkt);
		p2.add(meald);
		p2.add(lo);
		p2.add(fe);
		p2.add(pm);
		
		wl.setBounds(50, 0, 150,100);
		mem.setBounds(250,70,150,50);
		pm.setBounds(250, 140, 150,50);
		fund.setBounds(250, 210, 150,50);
		mrkt.setBounds(250, 280, 150,50);
		fe.setBounds(250,350,150,50);
		meald.setBounds(250,420,150,50);
		lo.setBounds(500, 420,150,50);
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(1,1,50,50));
		
		panel.add(p2);
		p2.setBorder(BorderFactory.createTitledBorder(""));
		add(panel);
		
		mem.addActionListener(this);
		pm.addActionListener(this);
		fund.addActionListener(this);
		mrkt.addActionListener(this);
		fe.addActionListener(this);
		meald.addActionListener(this);
		lo.addActionListener(this);
		
		setSize(700,550);
		setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		AdminDetails m=new AdminDetails();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object a=e.getSource();	
		if(a==mem)
		{
				new AdminHp("");
				dispose();
		}
		
	
	if(a==mrkt)
	{
			new MarketingEntry();
			dispose();
	}
	if(a==lo)
	{
		new AdminLogin();
		dispose();
	}
	if(a==pm)
	{
		new PaymentEntry();
		dispose();
	}
	if(a==fund)
	{
			new FundDetails();
			dispose();
	}
	if(a==fe)
	{
			new FixedExpense();
			dispose();
	}
  }
}


