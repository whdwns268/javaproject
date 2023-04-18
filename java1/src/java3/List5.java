package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List5 {
	//List 배열 사용법
	//List (Array 업그레이드) 순서가 있는 데이터 집합 배열과는 다르게 빈 배열값을 허용하지 않습니다.
	//메모리 공간의 크기를 동적으로 변경가능 합니다.
	//메모리 재사용이 편리하다.
	
	public static void main(String[] args) {
		
		String data[] = {"hong","kim","park"};
		List<String> aa = new ArrayList<>(Arrays.asList(data));
		aa.remove("park");
		System.out.println(aa);
		//1 = 1M(1메가)
		List<Integer> bb = new ArrayList<>(); // 메모리 초기 용량 크기 10으로 설정됨.
		//ex) 메모리 할당용량이 5라는 뜻이지, 배열의 갯수가 5는 아니다.
		int w = 0;
		while(w < 10) {
			bb.add(w);
			w++;
		}
		System.out.println(bb);
		
	}

}
