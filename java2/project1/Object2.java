package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Object2 {
	//Object 배열 응용편
	public static void main(String[] args) {
		//Object로 숫자와 문자 데이터를 각각 입력시킴
		ArrayList<Object> al = new ArrayList<>();
		al.add("hong");
		al.add(25);
		al.add("hong@nate.com");
		al.add(6000);
		al.add("01023451235");
		System.out.println(al);
		
		//2차 배열 Object
		Object data[][] = {
				{"hong", "kim", "park", "jang"},
				{25,30,44,21}
		};
		//Object 자료형 선언시 원시 배열도 만들 수 있음
		System.out.println(Arrays.toString(data[1]));
		
		//복합적 Object 배열
		Object userinfo[] = {"hong",25,"서울","01023457789",5000};

	}

}
