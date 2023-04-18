package java1;

//class만 단독으로 사용가능.
public class Class1 { //class없이 method는 없습니다.
	//필드공간 (전역변수, 전역 객체)
	//static : 메모리를 직접적으로 핸들링하는 속성
	
	static int money = 1000; //클래스 변수
	
	public static void main(String[] args) { //main 실행 메소드라 합니다.
		//String name = "강감찬"; //지역변수
		
		Adata ad = new Adata(); //해당 클래스를 객체로 변환
		Bdata bd = new Bdata(); 
		System.out.println(ad.a); //해당 객체에 있는 변수값을 로드함.
		System.out.println(bd.b);
		
		Cdata cd = new Cdata();
		cd.aa = 10; //Cdata 클래스 안에 변수를 호출 후 값을 이관함.
		cd.bb = 30;
		cd.cc = cd.aa + cd.bb;
		System.out.println(cd.cc);
	}
	
	
}
class Adata{
	String a = "홍길동";
}
class Bdata{
	String b = "이순신";
}
class Cdata{
	//인스턴스 변수 생성
	int aa; //숫자할당
	int bb; //숫자할당
	int cc; //결과값
}