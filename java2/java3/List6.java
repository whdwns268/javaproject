package java3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class List6 {
	/*
	List, ArrayList : 데이터 추가 빠름 (단, 순차적으로 저장) (앞에서부터 차곡차곡)
	단, 단점은 검색 속도가 느림, 삭제 느림 (노드번호가 무조검 0 부터 시작)
	*/
	
	//LinkedList : 검색 속도가 배열 선언문 중에서는 가장 빠름 (뒤로 밀고 앞에 들어감)
	//데이터 추가 저장, 삭제 빠름 (맨마지막 데이터 부터 저장)
	//단점 : 메모리 할당이 높음, 크기변경을 못함
	public static void main(String[] args) {
		Integer a[] = {1,3,5,7,9}; 
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a));
		System.out.println(ln);
		ln.addFirst(2);
		ln.addLast(30);
		ln.removeLast();
		ln.remove(5);
		
		Collections.sort(ln);
		System.out.println(ln);
		
		//문자배열 형태
		String b[] = {"aa","bb","cc","dd"};
		LinkedList<String> ls = new LinkedList<>(Arrays.asList(b));
		ls.remove("cc");
		ls.addFirst("zz");
		System.out.println(ls);
	}

}
