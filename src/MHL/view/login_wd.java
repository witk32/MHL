package MHL.view;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.*;
public class login_wd extends JDialog implements ActionListener{
	JP_login1 jp1;
	JLabel jl1,jl2,jl3;
	JButton jb1,jb2;
	JTextField jtf1,jtf2;
	JPasswordField jpf;
	private JTextField textField;
	private JPasswordField passwordField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_wd dialog = new login_wd();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public login_wd() {
		this.setSize(354, 543);
//		this.setUndecorated(true);
		this.setTitle("MHL.Coffee v1.0");
		int w=Toolkit.getDefaultToolkit().getScreenSize().width;
		int h=Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setLocation((w-354)/2, (h-543)/2);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton button = new JButton("确认");
		button.setBounds(54, 384, 117, 29);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("退出");
		button_1.addActionListener(this);
		button_1.setActionCommand("exit");
		button_1.setBounds(183, 384, 117, 29);
		getContentPane().add(button_1);
		
		JLabel label = new JLabel("帐号：");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label.setBounds(85, 280, 54, 16);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("密码：");
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_1.setBounds(85, 315, 54, 16);
		getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(131, 275, 134, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(131, 313, 134, 21);
		getContentPane().add(passwordField);
		
//		JButton button_2 = new JButton("");
//		button_2.setBounds(21, 17, 30, 29);
//		button_2.setBorder(null);
//		ImageIcon closeimg = new ImageIcon("image/login_index/close.png");
//		button_2.setIcon(closeimg);
//		
//		getContentPane().add(button_2);
//		button_2.addActionListener(this);
//		button_2.setActionCommand("exit");
		

		//设置背景
		jp1=new JP_login1();
		jp1.setBounds(0, 0, 354, 543);
		getContentPane().add(jp1);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("exit"))
		{
			System.exit(0);
		}
	}
}

class JP_login1 extends JPanel
{
	Image im;
	public void paint(Graphics g)
	{
		
		//背景图片
		
		try {
			im=ImageIO.read(new File("image/login_index/new_login.png"));
			g.drawImage(im,0,0,354,543,this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}

