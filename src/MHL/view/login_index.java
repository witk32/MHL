package MHL.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class login_index extends JWindow implements Runnable{



	JP jp;
	
	public login_index()
	{
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setLocation((width-704)/2, (height-348)/2);

		
		jp=new JP();
		this.add(jp);
		this.setSize(704, 348);
	}
	
	public void run() {
		//出现欢迎界面后，等待1000毫秒
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login_wd l=new login_wd();
		l.setVisible(true);
		this.dispose();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login_index li=new login_index();
		li.setVisible(true);
		Thread t1=new Thread(li);
		t1.start();
	}

}

class JP extends JPanel
{
	Image im;
	public void paint(Graphics g)
	{
		try {
			im=ImageIO.read(new File("image/login_index/welcome.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//      不知道为什么用toolkit不成功
//		im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/qqicon.jpg"));
		g.drawImage(im,0,0,704,348,this);
		
	}	
}