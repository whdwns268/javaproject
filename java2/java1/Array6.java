package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {

	//배열 + 키오스크 응용편
	public static void main(String[] args) {
		/*
		 응용문제5.
		 "주문하고자 하는 음식을 선택해 주세요?" 메세지가 출력됨.
		 사용자가 원하는 음식을 선택 합니다.
		 선택된 음식 리스트를 출력하십시오.
		 단, 주문종료를 선택했을 경우만 주문한 음식 리스트가 나와야 합니다.
		 메뉴 : 햄버거, 피자, 치킨, 라면, 김밥, 커피
		 
		 출력예시)
		 1.햄버거 2.피자 3.치킨 4.라면 5.김밥 6.커피 7.주문완료
		 "주문하고자 하는 음식을 선택해 주세요? "
		 [치킨,라면,햄버거]
		 */;

		String[] menu = {"햄버거","피자","치킨","라면","김밥","커피","주문완료"};
		int ea = menu.length;
		String[] mymenu = new String[ea]; //사용자가 선택한 값을 입력시키기 위한 빈 배열 변수
		Scanner m = new Scanner(System.in);
		System.out.printf("1.%s 2.%s 3.%s 4.%s 5.%s 6.%s",menu[0],menu[1],menu[2],menu[3],menu[4],menu[5]);
		
		int ct = 0; //배열번호 별로 순차적 입력 시키는 변수값
		for(String f : menu) {
			System.out.println("\n메뉴를 선택해주세요? : ");
			String s = m.next();
			if(s.equals("7")) {
				System.out.println("주문종료");
				break;
			}
			else {
				int my = Integer.parseInt(s)-1;
				mymenu[ct] = menu[my];
				ct++;
			}
			System.out.println(Arrays.toString(mymenu));
		}
		m.close();
		
	}

}
