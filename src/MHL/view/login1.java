package MHL.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class login1 extends JFrame implements ActionListener,KeyListener{
	JLabel jl1,jl2,jl3;
	JButton jb1,jb2;
	JTextField jtf1,jtf2;
	JPasswordField jpf;
	JPanel jp1,jp2,jp3,jp4;
	Image logo;
	JP_login jpl;
	public login1()
	{
		
		//添加jpl画图类
		jpl=new JP_login();
		this.add(jpl);
		//
		this.setTitle("MHL·Coffee v1.0");
		this.setSize(800, 600);
//		logo=Toolkit.getDefaultToolkit().getImage("image/login_index/logo.png");
//		this.setIconImage(logo);
		int w=Toolkit.getDefaultToolkit().getScreenSize().width;
		int h=Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setLocation((w-800)/2,(h-600)/2);
		this.setLayout(new GridLayout(5,1));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

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

		//加入JPanel 和JFrame

		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();

		jp1.add(jl1);
		jp2.add(jl2);
		jp2.add(jtf1);
		jp3.add(jl3);
		jp3.add(jpf);
		jp4.add(jb1);
		jp4.add(jb2);




		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);
		//注册监听
		jb1.addActionListener(this);
		jb1.setActionCommand("log");
		jb2.addActionListener(this);
		jb2.setActionCommand("esc");
	}


	public static void main(String[] args) {

		login1 sl=new login1();
		sl.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("log"))
		{
			String log_id=jtf1.getText();
			String log_pw=new String(jpf.getPassword());
//			db1 db=new db1();
//			//获得返回值
//			String db1_re=db.db1(log_id, log_pw);
//			//判断返回值得到帐号密码情况
//			switch(db1_re)
//			{
//			case "error_pw":
//				JOptionPane.showMessageDialog(null,"密码输入错误，请重新输入", "密码错误", JOptionPane.ERROR_MESSAGE);
//				break;
//			case "error_user_notfound":
//				JOptionPane.showMessageDialog(null,"用户不存在，请重新输入", "用户不存在", JOptionPane.ERROR_MESSAGE);
//				break;
//			case "AD":
//				JOptionPane.showMessageDialog(null,"欢迎您："+log_id+"管理员！", "登录成功", JOptionPane.INFORMATION_MESSAGE);
//				//打开AD表单  关闭当前窗口
//				stu_AD sl=new stu_AD();
//				sl.setVisible(true);
//				this.dispose();
//
//				break;
//			case "TEACHER":
//				JOptionPane.showMessageDialog(null,"欢迎您："+log_id+"老师！", "登录成功", JOptionPane.INFORMATION_MESSAGE);
//				//打开TEACHER表单 关闭当前窗口
//				stu_TEACHER st=new stu_TEACHER();
//				st.setVisible(true);
//				this.dispose();
//				break;
//			case "STUDENT":
//				JOptionPane.showMessageDialog(null,"欢迎您："+log_id+"同学！", "登录成功", JOptionPane.INFORMATION_MESSAGE);
//				//打开STUDENT表单 关闭当前窗口
//				stu_STUDENT ss=new stu_STUDENT(log_id);
//				ss.setVisible(true);
//				this.dispose();
//				break;
//			}

		}
		else if(e.getActionCommand().equals("esc"))
		{
			System.exit(0);
		}

	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER)
		{
			jb1.doClick();
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

class JP_login extends JPanel
{
	Image im;
	public void paint(Graphics g)
	{
		
		//添加logo
		try {
			im=ImageIO.read(new File("image/login_index/logo.png"));
			g.drawImage(im,350,10,100,100,this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
