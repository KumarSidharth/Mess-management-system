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


public class FixedExpense extends JFrame implements ActionListener
{
	private JLabel fee,pur,amt,date,p2,a,b;
	private static JTextField purt,amtt,datet;
	private JPanel panel;
	private JButton submit,lo;
	
	public FixedExpense()
	{
		super("Fixed Expense");
		 
		 fee= new JLabel("Fixed Expense Entry");
		 pur=new JLabel("PURPOSE");
		 amt= new JLabel("AMOUNT");
		 date= new JLabel("DATE");
		 a= new JLabel("Welcome Admin");
		 purt=new JTextField(10);
		 amtt=new JTextField(10);
		 datet=new JTextField(10);
		 submit=new JButton("SUBMIT");
		 lo=new JButton("Log out");
			
		p2=new JLabel(new ImageIcon("pics/c_bed3.jpg"));
		
		p2.add(fee);
		p2.add(pur);
		p2.add(amt);
		p2.add(date);
		p2.add(amtt);
		p2.add(datet);
		p2.add(purt);
		p2.add(a);
		p2.add(submit);
		p2.add(lo);
		
		a.setBounds(50,0, 150,100);
		fee.setBounds(300, 20, 150,50);
		pur.setBounds(250, 100, 150, 50);
		purt.setBounds(350, 100, 150, 50);
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
