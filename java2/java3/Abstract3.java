package java3;

public class Abstract3 {
	//상속 2개 이상 가져오긴
	public static void main(String[] args) {
		

	}

}
//추상 클래스는 super가 없음
class ab3 extends aa2{
	//aa추상 클래스에 aa2상속을 받고 그리고 외부 클래스에서 로드
	//할 경우 aa에 사용된 메소드도 호출해야함
	@Override
	public String user_info() {
		return null;
	}
	@Override
	public int password() {
		return 0;
	}
	
}

//super가 붙으면 일반 메소드의 상속값을 받아옴
class ab4 extends aa3{
	@Override
	public String aa3_method() {
		return super.aa3_method();
	}
}