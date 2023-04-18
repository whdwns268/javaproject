package java1;

import java.text.SimpleDateFormat;
import java.util.*;
//*를 쓰면 모든 라이브러리를 다 쓴다는 의미

public class index13 {
	//JAVA : OOP (객체지향언어), javascipit : oop 스크립틴 언어
	public static void main(String[] args) {
		// 날짜 출력 형태
		Date today = new Date();
		System.out.println(today);
		
		//y:년, m:월, d:일 : ("yy-mm-dd") , ("yy년mm월dd") , ("yyyy년m월dd") 형태로도 사용가능
		SimpleDateFormat date = new SimpleDateFormat("yy-mm-dd");
		
		//H:시간, m:분, s:초, 소문자h:am,pm 별도로 구성
		SimpleDateFormat time = new SimpleDateFormat("H:mm:ss");
		
		SimpleDateFormat datetime = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		
		//a : 오전, 오후 표시
		SimpleDateFormat date2 = new SimpleDateFormat("hh:mm:ss a");
		
		//format() : 구격화된 형태로 값을 표현할 때 사용하게 됩니다.
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		System.out.println(datetime.format(today));
		System.out.println(date2.format(today));
	}

}
