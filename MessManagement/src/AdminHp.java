import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AdminHp extends JFrame implements ActionListener
{
	private static final String String = null;

	private JLabel Welc, p1,p2;

	private JPanel panel;
	private JButton create,update,delete,show,back;
	
	public AdminHp(String f)
	{
		super("Admin Homepage");
		Welc= new JLabel("Welcome " +f); 
		create=new JButton("CREATE");
		update=new JButton("UPDATE");
		delete=new JButton("DELETE");
		show=new JButton("SHOW");
		back=new JButton("BACK");
	
		p1=new JLabel(new ImageIcon("pics/c_bed3.jpg"));
			
		p2=new JLabel(new ImageIcon("Image/Part-2.jpg"));
		
		p2.add(create);
		p2.add(update);
		p2.add(delete);
		p2.add(show);
		p2.add(Welc);
		p2.add(back);
		
		Welc.setBounds(20, 10,150,30);
		create.setBounds(250, 20,150,30);
		update.setBounds(250,60,150,30);
		delete.setBounds(250,100,150, 30);
		show.setBounds(250, 140,150, 30);
		back.setBounds(250, 180, 150, 30);
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(2,1,50,50));
		
		panel.add(p1);
		p1.setBorder(BorderFactory.createTitledBorder(""));
		panel.add(p2);
		p2.setBorder(BorderFactory.createTitledBorder(""));
		add(panel);
		
		create.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);
		show.addActionListener(this);
		back.addActionListener(this);
		
		
		setSize(700,550);
		setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		AdminHp s=new AdminHp("Sami");
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object a=e.getSource();	
		
	
	if(a==create)
	{
			new Create(String );
			dispose();
	}
	  if(a==update)
	  	{
		  	new Update(String);
		  	dispose();
	  	}
	  	if(a==delete)
	  		{
	  			new Delete(String);
	  			dispose();
	  		}
	  		if(a==show)
	  			{
	  				new Show(String);
	  				dispose();
	  			}
	  		if(a==back)
	  		{
	  				new AdminDetails();
	  				dispose();
	  		}

		}
	}
	



