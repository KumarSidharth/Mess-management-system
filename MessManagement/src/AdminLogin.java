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


public class AdminLogin extends JFrame implements ActionListener
{
	private JLabel userid,pass,p1,p2;
	private static JTextField firsttext;
	private JPasswordField secondtext;
	private JPanel panel;
	private JButton login,back;
	
	public AdminLogin()
	{
		super("Admin Login");
		 
		 userid= new JLabel("Admin User ID");
		 pass= new JLabel("Password");
		 
		 firsttext= new JTextField(10);
		 secondtext= new JPasswordField();
		 login=new JButton("LOGIN");
		 back=new JButton("BACK");
	
		p1=new JLabel(new ImageIcon("pics/c_bed3.jpg"));
			
		p2=new JLabel(new ImageIcon("Image/Part-2.jpg"));
		
		p2.add(secondtext);
		p2.add(firsttext);
		p2.add(userid);
		p2.add(pass);
		p2.add(login);
		p2.add(back);
		userid.setBounds(200, 50, 150,30);
		firsttext.setBounds(300, 50, 150,30);
		pass.setBounds(200,100,150,30);
		secondtext.setBounds(300, 100, 150, 30);
		login.setBounds(250, 150, 100, 30);
		back.setBounds(400, 150, 100, 30);
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(2,1,50,50));
		
		panel.add(p1);
		p1.setBorder(BorderFactory.createTitledBorder("ADMIN LOGIN"));
		panel.add(p2);
		p2.setBorder(BorderFactory.createTitledBorder(""));
		add(panel);
		
		login.addActionListener(this);
		back.addActionListener(this);
		
		setSize(700,550);
		setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		AdminLogin p=new AdminLogin();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object a=e.getSource();	
		
	
	if(a==login)
	{
		String userid=firsttext.getText();
		String pass=secondtext.getText();
		
		if(userid.equals("sami") && pass.equals("123"))
		{
				new AdminDetails();
				dispose();
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Admin ID or Password");
		}
	}
	if(a==back)
	{
		new CreateForm();
		dispose();
	}

}
}



