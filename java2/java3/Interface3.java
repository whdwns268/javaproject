package java3;

import java.util.Arrays;

public class Interface3 {
	/*
	 * user1.java, user2.java 응용편
	 * 
	 *  응용문제2.(주)리노스
	 *  가입된 모든 사용자의 정보를 출력합니다.
	 *  출력형태는 다음과 같습니다.
	 *  아이디:hong 고객명:홍길동 이메일:hong@nate.com 지역:서울시 영등포구
	 */
	
	public static void main(String[] args) {

		userinfo2 ui = new userinfo2();
		ui.myinfo(null);
	}

}

class userinfo2 implements user2,user1{
	
	//class userinfo2 implements user1{
	//user2 인터페이스는 로드하지 않음, 단 user2에 있는 필드 변수명은 별도로 호출 할 수 있음

	@Override
	public void mytel(String usertel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String pointck(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void myinfo(String userid) {

		int count = 0;
		while(count < dataea()) {
			System.out.println("아이디:" +infodata[count][0] + 
					" 고객명:" +infodata[count][1]+ 
					" 이메일:" +userdata[count][2]+ 
					" 지역:" +infodata[count][2]);
			
			count++;
		}
	}
}