package Files;

import java.io.OutputStream;
import java.util.Arrays;

//OutputStream : 출력 담당
// - FileOutputStream, ObjectOutputStream
public class File11 {
	public static void main(String[] args) {
		try {
			load l = new load();
			l.output();
		}
		catch (Exception e) {
			System.out.println("메소드 오류");
		}
	}
}
class load{
	OutputStream os = null; //Output자체가 sysout을 사용안함
	public void output() throws Exception{
		String data = "abcde";
		//byte[] : 문자열을 ASCII키 형태의 배열로 변경하는 것을 말합니다.
		byte[] b = data.getBytes();	//getBytes : 문자를 숫자형태로 변환
		//System.out.println(Arrays.toString(b));
		this.os = System.out;
		
		//byte 단위의 배열값을 역으로 해석해서 문자화 시킴
		this.os.write(b,0,b.length); //write(배열변수,시작값,종료값)
		this.os.flush(); //flush : 메모리를 깨끗하게 비워줌
		this.os.close();
	}
}
