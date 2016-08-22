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
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class MemSup extends JFrame implements ActionListener
{
	private JLabel memid,fn,ln,addrs,dob,phn,passw,p1;
	private static JTextField memidt,fnt,lnt,addrst,phnt,dobt;
	private JPanel panel;
	private JPasswordField passwt;
	private JButton signup,back;
	
	public MemSup(String mid)
	{
		super("Member Sign Up");
		 
		 memid= new JLabel("MEMBER ID");
		 fn= new JLabel("FIRST NAME");
		 ln= new JLabel("LAST NAME");
		 addrs= new JLabel("ADDRESS");
		 dob= new JLabel("DATE OF BIRTH");
		 phn= new JLabel("PHONE NUMBER");
		 passw= new JLabel("PASSWORD");
		 
		 
		 memidt= new JTextField(10);
		 memidt.setText(mid);
		 fnt= new JTextField(10);
		 lnt= new JTextField(10);
		 addrst= new JTextField(10);
		 dobt= new JTextField(10);
		 phnt= new JTextField(10);
		 passwt= new JPasswordField();
		 
		 
		 signup=new JButton("SIGNUP");
		 back=new JButton("BACK");
	
		p1=new JLabel(new ImageIcon("Image/green.jpg"));
		
		p1.add(fn);
		p1.add(fnt);
		p1.add(ln);
		p1.add(lnt);
		p1.add(addrs);
		p1.add(addrst);
		p1.add(dob);
		p1.add(dobt);
		p1.add(memid);
		p1.add(memidt);
		p1.add(passw);
		p1.add(passwt);
		p1.add(phn);
		p1.add(phnt);
		p1.add(signup);
		p1.add(back);
		
		memid.setBounds(200, 40, 150,30);
		memidt.setBounds(400, 40, 150,30);
		fn.setBounds(200,80,150,30);
		fnt.setBounds(400, 80, 150, 30);
		ln.setBounds(200, 120, 150, 30);
		lnt.setBounds(400, 120, 150, 30);
		addrs.setBounds(200, 160, 150, 30);
		addrst.setBounds(400, 160, 150, 30);
		dob.setBounds(200, 200, 150, 30);
		dobt.setBounds(400, 200, 150, 30);
		phn.setBounds(200, 240, 150, 30);
		phnt.setBounds(400, 240, 150, 30);
		passw.setBounds(200, 280, 150, 30);
		passwt.setBounds(400, 280, 150, 30);
		signup.setBounds(200, 400, 100, 30);
		back.setBounds(400, 400, 100, 30);
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(1,1,50,50));
		
		panel.add(p1);
        add(panel);
		
		signup.addActionListener(this);
		back.addActionListener(this);
		
		setSize(700,550);
		setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		MemSup t=new MemSup("123");

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object a=e.getSource();	
		
	
	if(a==signup)
	{
		String memid=memidt.getText();
		String fn=fnt.getText();
		String ln=lnt.getText();
		String addrs=addrst.getText();
		String dob=dobt.getText();
		int phn=Integer.parseInt(phnt.getText());
		String passw=passwt.getText();
		
		try
		{
			Admin aa=new Admin();
			boolean res=aa.signup(memid, fn, ln, addrs, dob, phn, passw);
			if(res==true)
			{
				JOptionPane.showMessageDialog(null, "Signup Successfully...!!!!");
				new MemberLp();
				dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Failed.....!!!");
			}
		}
			catch(Exception ee)
			{
				
			}
	}
	
	
	if(a==back)
	{
		new MemberLp();
		dispose();
	}

}
}
	
	

	





