package Network;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Net4 {

	public static void main(String[] args) {
		try {
			crawling2 cl = new crawling2();
			cl.creak();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class crawling2{
	
	Scanner sc = null;
	String url = "";
	URL urls = null;
	InputStream is =null;
	InputStreamReader ir = null;	
	BufferedInputStream bs = null;
	public void creak() throws Exception{
		
		this.sc = new Scanner(System.in);
		System.out.println("크롤링 할 url 주소를 입력하세요(파일명 포함)");
		this.url = this.sc.nextLine();
		this.urls = new URL(this.url);
		URLConnection con = this.urls.openConnection();
		this.is = this.urls.openStream();
		//BufferedInputStream 적용 후 byte 변환
		this.bs = new BufferedInputStream(this.is); //url 소스파일읽기
		byte[] code = new byte[1024];
		FileOutputStream fs = new FileOutputStream("E:\\memo\\test.html");
		int z = 0;
		while((z=this.bs.read(code)) != -1) {
			//int 형태로 write
			fs.write(code, 0, z);
		}
		this.bs.close();
		fs.flush();
		fs.close();
		System.out.println("크롤링 완료");
	}
}