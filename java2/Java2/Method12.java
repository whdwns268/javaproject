package Java2;

import java.util.Scanner;

public class Method12 {

	public static void main(String[] args) {
		bbox2 b = new bbox2();
		b.ask();
	}

}

class bbox1{
	protected String user;
	public void ask() { // 기본 메소드 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("고객명을 입력하세요");
		this.user = sc.next(); //사용자가 입력한 값을 변수로 이관
	}
	public void search(String nm) { //일반 메소드만 생성
		
	}
}

class bbox2 extends bbox1{
	
	@Override
	public void ask() {
		super.ask(); //bbox1에 메소드를 상속받음
		search(this.user); //search메소드로 전달
	}
	@Override
	public void search(String nm) {
		//상속받은 search메소드에 추가코드 작성
		super.search(nm);
		if(nm.equals("홍길동")) { //사용자 이름 조건
			System.out.println("가입된 사용자입니다.");
		}
		else {
			System.out.println("미가입자 사용자 입니다.");
		}
	}
	
	
}