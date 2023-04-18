package Java2;

import java.util.Arrays;

public class Method5 {
	//private 관련사항(변수설정) + 배열값 추가
	public static void main(String[] args) {
		apink a = new apink();
		a.test();

	}

}

class apink{
	//private 선언 변수는 무조건 class필드에만 적용가능합니다.
	private String user[] = {"1","2","3","4","5"};

	public void test() {
		//신규 생성 배열을 적용
		String user2[] = new String[this.user.length+1];//데이터 한개를 더 추가
		
		int w= 0;
		while(w < this.user.length) { //기존 배열값을 전달
			user2[w] = this.user[w];
			w++;
		}
		user2[5] = "6";
		System.out.println(Arrays.toString(user2));
	}
}