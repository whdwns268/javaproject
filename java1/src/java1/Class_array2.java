package java1;

import java.util.Scanner;
public class Class_array2 {
	//2개의 배열 값 - scoring.java 연계
	/*
	 응용문제2. (다시)
	 "검색하고자 하는 이름을 적어주세요?" 출력하게 됩니다.
	 검색어에 이순신이라고 검색을 하게 되면,
	 "이순신님은 80점 입니다." 라고 출력 되도록 합니다.
	 단, scoring에서는 해당 배열에 있는 데이터를 검색하는 용도로만 사용되도록 합니다.
	 */
	public static void main(String[] args) {
		String a1[] = {"홍길동","이순신","강감찬","유관순","김유신"};
		String a2[] = {"100","80","39","42","55"};
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요? : ");
		String id = sc.next().intern(); //사용자 입력 단어
		scoring a = new scoring(); //외부 class 객체 생성
		a.search(a1,a2,id); //해당 메소드로 3개의 인자값 전달
		
		
		
	}

}
