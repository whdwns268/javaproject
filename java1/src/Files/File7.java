package Files;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) throws Exception{
		notice2 n = new notice2();
		try {
			n.view();
		}catch (Exception e) {
			System.out.println("메소드 함수 오류");
		}
		
	}
}
/*
class notice2{
	ArrayList<String> ar2;
	FileReader fr = null;
	Scanner sc = null;
	String result;
	FileWriter fw;
	public void view() throws Exception {
		this.fr = new FileReader("E:\\git_java\\javaproject\\java1\\src\\Files\\member.txt",Charset.forName("UTF8"));
		
		this.sc = new Scanner(this.fr);
		
		while(this.sc.hasNext()) { 

			String[] aa2 = this.sc.nextLine().split(",");
			this.ar2 = new ArrayList<String>(Arrays.asList(aa2));
			//result += ar2;
			//this.fw = new FileWriter("E:\\git_java\\javaproject\\java1\\src\\Files\\member.txt");
			//fw.write(result);
			System.out.println(ar2);
		}
		
		this.fr.close();
		this.sc.close();
		this.fw.close();
		
	}
}
*/
class notice2{

	public void view() throws Exception {

		ArrayList<String> a1 = new ArrayList<>();
		ArrayList<String> a2 = new ArrayList<>();
		ArrayList<ArrayList<String>> all = new ArrayList<>();
		String data = "1,2,3,4,5,7,8,9,90,100";
		String data2[] = data.split(",");
		int ea = data2.length;
		int w = 0;
		while(w < ea) {
			if(w < 5) {
				a1.add(data2[w]);
			}
			else {
				a2.add(data2[w]);
			}
			w++;
		}
		all.add(a1);
		all.add(a2);
		System.out.println(all);
		
	}
}




