package Java2;

public class Method4 {
	//private에 대한 객체선언 형태
	public static void main(String[] args) {
		insert i = new insert();
		i.userid = "hong"; //아이디값
		String member_key = "123456"; //보안키
		String msg = i.checks(member_key); //return 결과값확인
		if(msg.equals("ok")) {
			System.out.println("정상적인접근");
		}
		else {
			System.out.println("올바른 접근xx");
		}
	}

}

class insert{
	String userid = null;
	private String key = "memberok"; //내부 변수로 값을 변경못함
	
	public String checks(String userkey) { //main에서 인자값을 보낸 보안키
		String call = null;
		if(userkey.equals(key)) {  //내부 변수값과 인자값을 비교
			call = "ok";
		}
		else { //다른경우
			call = "error";
		}
		return call; //retrun으로 이관
	}
}
