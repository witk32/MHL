package git_MHL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class index {
	static FileReader fr=null;
	static BufferedReader bf=null;
	String a="";

	public static void main(String[] args) {
		try {
			fr=new FileReader("src/db/db_user");
			bf=new BufferedReader(fr);
			String s="";
			String id="";
			String co="";
			id=bf.readLine();
			co=bf.readLine();

		} catch (Exception e1) {
			e1.printStackTrace();
	}
			finally{
			try {
				fr.close();
				bf.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		
		
	}

}
