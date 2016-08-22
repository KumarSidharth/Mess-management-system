import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PaymentEntry extends JFrame implements ActionListener
{
	private JLabel memid,amt,date,p2,a,b;
	private static JTextField memt,amtt,datet;
	private JPanel panel;
	private JButton submit,lo;
	
	public PaymentEntry()
	{
		super("Payment Entry");
		 
		 memid= new JLabel("MEMBER ID");
		 amt= new JLabel("AMOUNT");
		 date= new JLabel("DATE");
		 a= new JLabel("Welcome Admin");
		 b= new JLabel("PAYMENT ENTRY");
		 memt=new JTextField(10);
		 amtt=new JTextField(10);
		 datet=new JTextField(10);
		 submit=new JButton("SUBMIT");
		 lo=new JButton("Log out");
			
		p2=new JLabel(new ImageIcon("pics/c_bed3.jpg"));
		
		p2.add(memid);
		p2.add(memt);
		p2.add(amt);
		p2.add(date);
		p2.add(amtt);
		p2.add(datet);
		p2.add(a);
		p2.add(b);
		p2.add(submit);
		p2.add(lo);
		
		a.setBounds(50,0, 150,100);
		b.setBounds(300, 20, 150,50);
		memid.setBounds(250,100,150,50);
		memt.setBounds(350, 100, 150, 50);
		amt.setBounds(250, 170, 150, 50);
		amtt.setBounds(350, 170, 150, 50);
		date.setBounds(250, 240, 150, 50);
		datet.setBounds(350, 240, 150, 50);
		submit.setBounds(200, 350,150, 50);
		lo.setBounds(400, 350, 150, 50);
		
		
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(1,1,50,50));
		
		panel.add(p2);
		p2.setBorder(BorderFactory.createTitledBorder(""));
		add(panel);
		
		submit.addActionListener(this);
		lo.addActionListener(this);
		
		setSize(700,550);
		setVisible(true);
		
	}
	public static void main(String[] args) 
	{
	  PaymentEntry m=new PaymentEntry();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object a=e.getSource();	
		
	
	if(a==submit)
	{
		String memid=memt.getText();
		int amt=Integer.parseInt(amtt.getText());
		String pdate=datet.getText();
			
		
		try
		{
			Admin aa=new Admin();
			boolean res=aa.cek_mem(memid);
			if(res==true)
			{
				boolean r=aa.addpayment(memid, amt, pdate);
				if(r==true)
				{
					JOptionPane.showMessageDialog(null, "Payment Successfully inserted");
					new AdminDetails();
					dispose();
				
				}
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Memberid does'nt exist");
			}
		}
	
		
		catch(Exception ee)
		{
			
		}
	}
	if(a==lo)
	{
		new AdminDetails();
		dispose();
	}

}




}


