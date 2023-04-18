package Files;

import java.io.FileReader;
import java.nio.charset.Charset;


public class File2 {

	public static void main(String[] args) throws Exception {
		try {
			
			/*
			Charset.forName("EUC_KR") : 인코딩 인어셋을 변경할 때 사용합니다
			단, 출력하는 형태 인어셋만 바꾸는 명령어임. 파일차제는 아님
			*/
			
			FileReader fr = new FileReader("E:\\git_java\\javaproject\\java1\\src\\Files\\agree.txt",Charset.forName("EUCKR")); 
			System.out.println(fr.getEncoding()); //파일 인코딩 언어 확인
			System.out.println(fr.read()); //데이터 크기
			while(true) {
				int a = fr.read();
				System.out.println((char)a);
				if(a==-1) {
					break;
				}
			}
			fr.close();//로드한 파일을 닫을 때 사용
		}
		catch(Exception e) {
			System.out.println("파일 경로 실패");
		}

	}
}
