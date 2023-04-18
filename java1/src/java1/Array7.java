package java1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array7 {
	// 배열생성 응용편
	public static void main(String[] args) {
	
	/*
	 응용문제6.
	 사용자가 상품을 검색합니다. 사용자가 검색한 내용을 배열로 저장되도록 하십시오.
	 예시)
	 상품검색 : 선풍기
	 상품검색 : 냉장고
	 상품검색 : 모니터
	 상품검색 : 검색종료
	 
	 [선풍기,냉장고,모니터,null,null,null,null];
	 */
		String user[] = new String[7];
		Scanner m = new Scanner(System.in);
		int co = 0;
		while(co < 7) {
			System.out.println("상품검색 : ");
			String word = m.nextLine().intern();
			if(word=="검색종료"){
				//Arrays.toString : 숫자, 문자, 소수[] 현재 배열값을 출력하는 함수입니다.^00^
				System.out.println(Arrays.toString(user));
				break;
			}
			else {
				user[co] = word;
			}
			co++;
		}
		

		
		int ea = user.length;
		String[] mymenu = new String[ea];
		

	}

}
