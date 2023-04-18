package example;

import Java2.mssql; //외부 클래스 로드

public class Example10 {

	public static void main(String[] args) {
		mssql ms = new mssql();
		ms.abc(); //외부 메소드 로드
		
		//외부 메소드 메인 로드(외부 java 파일 가져올시 main은 로드 하지 않음)
		//ms.main(args);
		String result = ms.bbb();
		System.out.println(result);
	}

}

