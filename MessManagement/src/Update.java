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


public class Update extends JFrame implements ActionListener
{
	private static final String String = null;
	private JLabel numid,Welc,p1,p2;
	private JTextField numtext;
	private JButton update,back;
	private JPanel panel;
	
	public Update(String f)
	{
	super("Update");
	 
	numid=new JLabel("NUMBER ID");
	Welc= new JLabel("Welcome " +f); 
	numtext= new JTextField(10);
	update=new JButton("UPDATE");
	back=new JButton("BACK");

	p1=new JLabel(new ImageIcon("pics/c_bed3.jpg"));
		
	p2=new JLabel(new ImageIcon("Image/Part-2.jpg"));
	
	p2.add(Welc);
	p2.add(numid);
	p2.add(numtext);
	p2.add(update);
	p2.add(back);
	
	Welc.setBounds(20, 10, 150,30);
	numid.setBounds(200,50,150,30);
	numtext.setBounds(300,50,150,30);
	update.setBounds(200,130,150,30);
	back.setBounds(400, 130, 150, 30);
	
	panel=new JPanel();
	panel.setLayout(new GridLayout(2,1,50,50));
	
	panel.add(p1);
	p1.setBorder(BorderFactory.createTitledBorder(""));
	panel.add(p2);
	p2.setBorder(BorderFactory.createTitledBorder(""));
	add(panel);
	
	update.addActionListener(this);
	back.addActionListener(this);
	
	setSize(700,550);
	setVisible(true);
	
}

public static void main(String[] args) 
{
	Update b=new Update("Sami");
}

@Override
public void actionPerformed(ActionEvent e)
{
	Object a=e.getSource();	
	

if(a==back)
{
		new AdminHp(String);
		dispose();
}
}
}


	

