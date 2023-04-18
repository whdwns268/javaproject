package Files;

import java.io.FileWriter;

public class File4 {
	
	//FileWriter : 문자 데이터를 파일에 쓰는 class

	public static void main(String[] args) throws Exception {
			String userdata[] = {"hong","kim","park","jang"};
			FileWriter fw = new FileWriter("E:\\git_java\\javaproject\\java1\\src\\Files\\messege2.txt");
			//FileWriter에 true를 붙이게 되면, 기존 입력된 사항을 유지하고 추가 데이터가 들어감
			int w= 0;
			do {
				//write : 문자, 배열, 숫자등 다양한 데이터 값을 파일에 저장하는 명령어
				fw.write("{userdb:"+userdata[w]+"},");
				w++;
			}while(w<userdata.length);
			fw.close(); //파일 쓰기 종료
	}

}
