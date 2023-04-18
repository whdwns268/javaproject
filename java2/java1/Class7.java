package java1;

import java.util.Scanner;

public class Class7 {
	//응용편 : 회원가입시 약관 동의 및 간편회원 가입 진행

	public static void main(String[] args) {
		//해당 코드는 단 한줄로만 사용합니다.(외부 클래스 기준으로 작성)
		Login u = new Login();
		ship a = new ship();
		
	}

}

class Login{

	Scanner sc = new Scanner(System.in);
	
	public Login(){
		System.out.println("회원가입 약간에 동의하시겠습니까? ( Y / N )");
		String sc1 = sc.next();
		
		if(sc1.equals("n") || sc1.equals("N")) {
			System.out.println("회원가입이 취소되었습니다");
		}
		else if(sc1.equals("y") || sc1.equals("Y")){
			list();
		}else {
			System.out.println("y 혹은 n 만 입력하세요");
		}

	}
	public void list() {
		System.out.println("아이디를 입력하세요");
		String scid1 = sc.next();
		
		if("admin".equals(scid1)) {
			System.out.println("중복된 아이디입니다.");
			System.exit(0);
		}
		System.out.println("패스워드를 입력하세요");
		String scpw1 = sc.next();
		
		System.out.println("가입자명을 입력하세요");
		String scname1 = sc.next();
		System.out.println("정상적으로 회원가입이 완료되었습니다.");
		System.out.printf("아이디:%s 패스워드:%s 가입자명:%s",scid1,scpw1,scname1);
		System.exit(0);
	}
}



//강사님 코드
class ship{
	public ship() {
		agree();
	}
	
	public void agree() {
		String ag1 = inputs("회원가입 약관에 동의 하시겠습니까? (y/n) :","");
		if(ag1.equals("y")) {
			String ag2 = inputs("아이디를 입력하세요","");
			if(ag2.equals("admin")) {
				System.out.println("해당 아이디는 중복되었습니다.");
				
			}
			else {
				String ag3 = inputs("패스워드를 입력하세요 :","");
				String ag4 = inputs("가입자명을 입력하세요 :","y");
				System.out.printf("아이디:%s 패스워드:%s 가입자명:%s",ag2,ag3,ag4);
			}
		}
		else {
			System.out.println("회원가입이 취소 되었습니다.");
			System.exit(0);
		}
	}
	
	public String inputs(String msg, String exit) {
		Scanner scc = new Scanner(System.in);
		System.out.println(msg);
		String result = scc.next();
		if(exit.equals("y")) {			
			scc.close();
		}
		return result;
	}
	
}
