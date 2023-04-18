package java1;

public class Class3 {
	//외부 class 생성시 static 유/무 활용 및 return 메소드
	public static void main(String[] args) {
		Box b = new Box();
		b.abc();
		//같은 클래스라도 해당 객체 생성후 메소드 로드한다.
		Class3 c = new Class3(); 
		c.bbb();
		
		//리턴 메소드로 값 받기
		String result = c.zzz();
		System.out.println(result);
		
		int result2 = c.kkk();
		System.out.println(result2);
		
		/*
		 event라는 메소드가 static 메모리에 이미 할당 되어 있으므로
		 Coupon Class를 로드 후 바로 해당 메소드를 호출 할 수 있음.
		 */
		Coupon.event();
	}

	public void bbb() {
		int a = 10000;
		double b = a / 0.5;
		System.out.println(b);
	}
	
	//리턴 메소드(문자 형태)
	public String zzz() {
		String a = "거북선";
		return "a";
	}
	//리턴 메소드(숫자 형태)
	public int kkk() {
		int a = 100;
		return a;
	}
}

//static 메소드가 있는 경우
class Coupon{
	public static void event() {
		int cp = 30;
		System.out.println(cp);
	}
}

class Box{
	public void abc() { //static void : 메모리에 할당 되는 메소드임.
		//단, static 사용하지 않을 경우 같은 package안에서는 공유가 가능하다.
		System.out.println("test");
	}
	
}