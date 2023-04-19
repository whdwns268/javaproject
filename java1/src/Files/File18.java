package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//Stream을 사용하고 나서 Buffer 사용: read, write 단독으로 사용은 하지 않음

//read: int 형태, readLine : String형태

/*
 InputStream > InputStreamReader > BufferedReader (0)
 InputStream > BuffredInputStream (0)
 InputStream > 
 
 버퍼리더 close() 메모리종로
 버퍼와이트 flush 메모리초기화 
 */
public class File18 {

	public static void main(String[] args) {
		try {
			/*
			OutputStreamWriter os = new OutputStreamWriter(System.out);
			BufferedWriter bw = new BufferedWriter(os);
			bw.write("홍길동");
			bw.close();
			*/
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			
			/*
			FileInputStream => BufferedInputStream
			FileOutputStream => BufferedOutputStream 
			 */
			String test = br.readLine();
			System.out.println(test);
		}
		catch (Exception e) {
			
		}
		

	}

}
