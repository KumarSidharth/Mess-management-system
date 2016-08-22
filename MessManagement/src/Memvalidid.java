

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
public class Memvalidid extends JFrame implements ActionListener
	
	{
		private JLabel memid, p1,p2;
		private JTextField memidt;
		private JPanel panel;
		private JButton submit,back;
		
		public Memvalidid()
		{
			super("Member Valid ID");
			 memid=new JLabel("Enter your valid user id");
			 memidt=new JTextField(10);
			submit=new JButton("SUBMIT");
			back=new JButton("BACK");
		
			p1=new JLabel(new ImageIcon("pics/c_bed3.jpg"));
				
			p2=new JLabel(new ImageIcon("Image/Part-2.jpg"));
			
			p2.add(memid);
			p2.add(memidt);
			p2.add(submit);
			p2.add(back);
			memid.setBounds(150, 50, 150,50);
			memidt.setBounds(300,50,150,50);
			submit.setBounds(270, 140, 150, 50);
			back.setBounds(450,140,150,50);
			
			panel=new JPanel();
			panel.setLayout(new GridLayout(2,1,50,50));
			
			panel.add(p1);
			p1.setBorder(BorderFactory.createTitledBorder(""));
			panel.add(p2);
			p2.setBorder(BorderFactory.createTitledBorder(""));
			add(panel);
			
			submit.addActionListener(this);
			back.addActionListener(this);
			
			setSize(700,550);
			setVisible(true);
			
		}
		public static void main(String[] args) 
		{
			Memvalidid s=new Memvalidid();
		}
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Object a=e.getSource();	
			
		
		if(a==submit)
		{
			String memid=memidt.getText();
			//JOptionPane.showMessageDialog(null, memid);
			try
			{
				Admin aa=new Admin();
				boolean res=aa.cek_mem(memid);
				if(res==true)
				{
					new MemSup(memid);
					dispose();
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
	

