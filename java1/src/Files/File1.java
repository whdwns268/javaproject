package Files;

import java.io.FileReader;
import java.io.IOException;

public class File1 {
//I/O : inputStream, OutputStream
	/*
	 * 입력스트림 : 프로그램으로 들어오는 부분 (키보드,마우스, hdd)
	 * 출력스트림 : 프로그램으로 나가는 부분 (모니터, hdd, 프린터)
	 * Stram : API 라이브러리를 사용하는 형태
	 * JAVA.io (API)
	 * 
	 * (일반 : File, fileRader) -> StreamAPI (FileinputStream)
	 * (일반 : FileWriter) -> StreamAPI(FileoutputStream)
	 */
	
	
	/*
	 FileReader : 문자데이터를 파일로부터 읽어들이는 클래스
	 - 파일 이름을 생성자 인수값(파라미터)로 사용해서 filereader 객체를 생성
	 
	 I/O : throws 사용하던가 또는 try-catch를 무조건 사용해야만 적용할 수 있음
	 */
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\git_java\\javaproject\\java1\\src\\Files\\messege1.txt");
		while(true) {
			int m = fr.read();
			System.out.println((char)m);
			if(m==-1) {
				break;
			}
		}
		fr.close();
		}

}
