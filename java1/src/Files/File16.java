package Files;

import java.io.FileInputStream;
import java.io.InputStream;

public class File16 {
	//이미지(Binary) 형태 byte 단위로 설정 (FileReader X)
	//InputStream으로 이용
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream is = new FileInputStream("E:\\memo\\ive.jpg");
			System.out.println(is.read());
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
