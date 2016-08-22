import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateForm extends JFrame implements ActionListener 
{
	private JLabel p1,p2,wl;

	private JPanel panel;
	private JButton admin,mem;
	
	public CreateForm()
	{
		super("Homepage");
		 
		admin=new JButton("ADMIN");
		mem=new JButton("MEMBERS AREA");
		wl=new JLabel("Welcome to Mess Management system");
	
		p1=new JLabel(new ImageIcon("pics/c_bed3.jpg"));
			
		p2=new JLabel(new ImageIcon("Image/Part-2.jpg"));
		
		p2.add(admin);
		p2.add(mem);
		p2.add(wl);
		admin.setBounds(180, 100, 150,50);
		mem.setBounds(380,100,150,50);
		wl.setBounds(250, 0, 300,100);
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(2,1,50,50));
		
		panel.add(p1);
		p1.setBorder(BorderFactory.createTitledBorder(""));
		panel.add(p2);
		p2.setBorder(BorderFactory.createTitledBorder(""));
		add(panel);
		
		admin.addActionListener(this);
		mem.addActionListener(this);
		
		setSize(700,550);
		setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		CreateForm m=new CreateForm();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object a=e.getSource();	
		
	
	if(a==admin)
	{
			new AdminLogin();
			dispose();
	}
	if(a==mem)
	{
		new MemberLp();
		dispose();
	}
  }
	
}