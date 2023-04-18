package java1;

import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {
		
		user a = new user();
	}

}

class user{
	
	String id = "hong";
	String pw = "a123456";
	int w = 0;
	public user() {
		login();
	}
	
	public void login() {
		String id1 = inputs("아이디를 입력하세요");
		if(id1.equals(id)) {
			String id2 = inputs("패스워드를 입력하세요");
			while (w < 3) {
				if (id2.equals(pw)) {
	                System.out.println("로그인 완료");
	                break;
	            } 
				else {
					id2 = inputs("패스워드를 다시 입력해주세요");
	                w++;
	            }
            }
			
			if(w == 3) {
				System.out.println("해당 아이디는 10분 후에 다시 로그인 하실 수 있습니다.");
			}
		}
		else {
			
			id1 = inputs("가입되지 않은 사용자 입니다. 아이디를 확인해주세요");

		}
	}
	public String inputs(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		String result = sc.next();
		return result;
	}
	
}
