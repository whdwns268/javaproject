package java3;

//추상 클래스 (가상 클래스)
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class box2 extends box{
	@Override
	void sbox() {
		
	}
	@Override
	String result() {
		// TODO Auto-generated method stub
		return null;
	}
}

//abstract : 추상 메소드가 존재하며, 해당 추상 메소드를 사용하지않을 경우(오버라이드)
//			 error가 발생합니다.
abstract class box{
	abstract void sbox();//추상메소드
	abstract String result(); //추상 리턴 메소드
}