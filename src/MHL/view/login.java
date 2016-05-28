package MHL.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;


public class login extends JDialog implements KeyListener,ActionListener{
	gjp jp1;
	JLabel jl1,jl2,jl3;
	JButton jb1,jb2;
	JTextField jtf1,jtf2;
	JPasswordField jpf;
	
	public login()
	{
		this.setLayout(null);
		this.setSize(544, 543);
		this.setUndecorated(true);
		int w=Toolkit.getDefaultToolkit().getScreenSize().width;
		int h=Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setLocation((w-544)/2, (h-543)/2);

	//设置背景
		jp1=new gjp();
		jp1.setBounds(0, 0, 544, 543);
		this.add(jp1);
		//初始化组件

				jl1=new JLabel("MHL·Coffee 管理系统-登录");
				jl2=new JLabel("用户名:");
				jl3=new JLabel("密  码:");
				Font font=new Font("Arial",Font.BOLD,25);
				jl1.setFont(font);

				jtf1=new JTextField(20);
				//添加enter激活
				jtf1.addKeyListener(this);
				jpf=new JPasswordField(20);
				//添加enter激活
				jpf.addKeyListener(this);

				jb1=new JButton("登录");
				jb2=new JButton("退出");
				//注册监听
				jb1.addActionListener(this);
				jb1.setActionCommand("log");
				jb2.addActionListener(this);
				jb2.setActionCommand("esc");

		
	}
	public static void main(String[] args)
	{
		login lo=new login();
		lo.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}






class gjp extends JPanel{
	Image im;

	public void paint(Graphics g)
	{
		try {
			im=ImageIO.read(new File("image/login_index/bg_log.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//      不知道为什么用toolkit不成功
//		im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/qqicon.jpg"));
		g.drawImage(im,0,0,544,543,this);
	}
	
}