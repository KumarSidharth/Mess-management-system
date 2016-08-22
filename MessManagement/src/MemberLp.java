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


public class MemberLp extends JFrame implements ActionListener
{
	private JLabel memid,pass,p1,p2,or;
	private static JTextField firsttext,secondtext;
	private JPanel panel;
	private JButton login,signup,back;
	
	public MemberLp()
	{
		super("Member Login");
		 
		 memid= new JLabel("Member ID");
		 pass= new JLabel("Password");
		 or=new JLabel("or");
		 
		 firsttext= new JTextField(10);
		 secondtext= new JTextField(10);
		 login=new JButton("LOGIN");
		 signup= new JButton("SIGNUP");
		 back=new JButton("BACK");
	
		p1=new JLabel(new ImageIcon("pics/c_bed3.jpg"));
			
		p2=new JLabel(new ImageIcon("Image/Part-2.jpg"));
		
		p2.add(secondtext);
		p2.add(firsttext);
		p2.add(memid);
		p2.add(pass);
		p2.add(login);
		p2.add(or);
		p2.add(signup);
		p2.add(back);
		memid.setBounds(200, 50, 150,30);
		firsttext.setBounds(300, 50, 150,30);
		pass.setBounds(200,100,150,30);
		secondtext.setBounds(300, 100, 150, 30);
		login.setBounds(250, 150, 100, 30);
		signup.setBounds(400,150, 100, 30);
		or.setBounds(370, 150, 100, 30);
		back.setBounds(550, 150, 100, 30);
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(2,1,50,50));
		
		panel.add(p1);
		p1.setBorder(BorderFactory.createTitledBorder("ADMIN LOGIN"));
		panel.add(p2);
		p2.setBorder(BorderFactory.createTitledBorder(""));
		add(panel);
		
		login.addActionListener(this);
		signup.addActionListener(this);
		back.addActionListener(this);
		
		setSize(700,550);
		setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		MemberLp p=new MemberLp();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object a=e.getSource();	
		
	
	if(a==signup)
	{
		
				new Memvalidid();
				dispose();
		}
	if(a==back)
	{
		new CreateForm();
		dispose();
	}
		
	
}
}







