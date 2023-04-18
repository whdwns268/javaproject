package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class File13 {
	//파일 생성
	public static void main(String[] args) {
		try {
		File fi = new File("E:\\git_java\\javaproject\\java1\\src\\Files\\abc.dat");
		if(fi.exists()) { //해당경로에 파일 유무 확인
			fi.createNewFile(); //파일 생성
		}
		String data = "홍길동";//데이터
		OutputStream os = new FileOutputStream(fi);//파일저장경로
		byte[] b = data.getBytes();//데이터를 byte 단위로 생성
		os.write(b);//파일에쓰기
		os.flush(); //메모리초기화
		os.close();//파일닫기
		
		}
		catch (Exception e) {
		
		}
	}
}
