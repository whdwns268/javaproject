package java1;

class Member{ //외부 클래스
	String user = "홍길동"; //인스턴스 변수값
	public void abc() { //void : return이 없는 메소드.
		String user2 = "이순신";
		System.out.println(user2);
	}
}

/*
 [접근 제어자]
 public : 기본으로 필요시 접근이 용이하게 사용. (접근 제한이 없음)
 private : 자신의 클래스 내에서만 접근이 됨.(같은 패키지 아니여도 됨)
 protected : 같은 패키지 안에서 파생되는 클래스만 접근이 됨.
 외부 클래스 : default (동일한 패키지만 접근이 됨)
 */

public class Class2 {
	//외부 Class 및 외부 메소드 활용
	public static void main(String[] args) {
		Member m = new Member(); //객체생성
		m.abc(); //Member Class에 abc 메소드를 호출.

		Inject i = new Inject(); //객체생성
		i.user("hong", "a123456"); //인자값으로 해당 메소드 전송
		
		/* 
		 응용문제1. 외부 class를 이용하여 2개의 숫자 값을 
		 외부 class 안에 있는 메소드를 이용하여 곱합니다. 해당 곱한 값이
		 짝수 인지 홀수 인지 검토하는 코드를 작성하시오.
		 */
		i.mutiply(5,8);
		
	}

}
class Inject{
	//user 메소드에 두개의 인자값 및 자료형을 받는 형태
	public void user(String name, String pw) {
		System.out.println("사용자명:"+name+"패스워드:"+pw);
	}
	public void mutiply(int a, int b) {
		int sum = a * b;
		if(sum % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
	}
}
