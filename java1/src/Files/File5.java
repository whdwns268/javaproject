package Files;

import java.io.FileWriter;
import java.util.Scanner;

public class File5 {
	/*
	user.txt라는 파일에 다음과 같이 저장 되도록 코드를 작성하시오

	사용자 아이디를 입력하세요.
	총 5번의 질문을 물어보며, 사용자가 직접 입력합니다.
	사용자가 입력한 내용은 user.txt에 남아 있어야합니다.
	*/
	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("E:\\git_java\\javaproject\\java1\\src\\Files\\user.txt",true);
		Scanner sc = new Scanner(System.in);
		
		//true를 안쓰는 이유는 반복문 안에 적용시에만 true 필요
		int co = 0;
		while(co < 5) {
			System.out.println("사용자 아이디를 입력하세요");
			String userid = sc.next();	
			fw.write(userid+"\n");
			co++;
		}
		sc.close();
		fw.close();
	}

}
