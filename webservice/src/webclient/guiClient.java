package webclient;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.xml.ws.WebServiceClient;

import client.Webservice;
import client.WebserviceService;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
@WebServiceClient
public class guiClient  extends JFrame implements ActionListener
{
	Webservice myWebservice = new WebserviceService().getWebservicePort();
	private JFrame frame = new JFrame("邮件");
	private Container c = frame.getContentPane();
	private JTextField input = new JTextField();
	JLabel a = new JLabel("发送邮箱:");
	JLabel a1 = new JLabel("输入信息:");
	private JButton r=new JButton("验证");
	private JTextField jtf=new JTextField(100);
	private JButton send=new JButton("发送");
	String STR="";
	List<String> _url =new ArrayList();
	public guiClient()
	{
		
		frame.setSize(300,300);
		
		c.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		JPanel fieldPanel = new JPanel();
		fieldPanel.setLayout(null);
		
		a.setBounds(10,20,80,20);
		fieldPanel.add(a);
		jtf.setBounds(80,20,120,20);
		fieldPanel.add(jtf);
		r.setBounds(210, 20, 70, 20);
		fieldPanel.add(r);
		
		a1.setBounds(10,50,80,20);;
		fieldPanel.add(a1);
		input.setBounds(80,50,190,160);
		fieldPanel.add(input);
		send.setBounds(80, 220, 140, 20);
		fieldPanel.add(send);
		c.add(fieldPanel,"Center");
		r.addActionListener(this);
		send.addActionListener(this);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		c.add(buttonPanel,"South");
	}
	
	
	public void actionPerformed(ActionEvent e)
	{   
		if(e.getActionCommand()=="验证")  
        {
			STR=jtf.getText();
			String tstr="";
			for(int i=0;i<STR.length();i++)
			{
				if(STR.charAt(i)!=',')
				{
					tstr=tstr+STR.charAt(i);
				}
				else
				{
					if(myWebservice.validateEmailAddress(tstr))
					{
						_url.add(tstr);
						tstr="";
					}
					else
					{
						JOptionPane.showMessageDialog(null, "错误", "验证结果", JOptionPane.ERROR_MESSAGE);
						break;
					}
				}
			}
			
        }
		if(e.getActionCommand()=="发送")  
        {
			if(myWebservice.sendEmailBatch(_url, input.getText()))
	    	{
				JOptionPane.showMessageDialog(null, "已发送", "发送结果", JOptionPane.INFORMATION_MESSAGE);
	    	}
        }
		
	}
	

	public static void main(String[] args) 
	{
		guiClient myg=new guiClient();
	}
}