package Java2;

public class mssql {
	
	public void abc() {
		System.out.println("외부 클래스 로드 완료");
	}
	
	public String bbb() {
		String user = "홍길동";
		return user; //무조건 return 넣어줘야 한다.
	}
	
	public static void main(String[] args) {
		System.out.println("외부 클래스 메인 로드 완료");
	}
}
