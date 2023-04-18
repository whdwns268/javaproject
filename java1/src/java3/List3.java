package java3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {
		/*
		 * 응용문제3.
		 * 넘버데이터 3 6 9 12 15
		 * 넘버데이터 2 4
		 * 결과 2 3 4 6 9 12 15 로 출력 ArrayList로 작성
		 */
		
		Integer num1[] = {3,6,9,12,15};
		Integer num2[] = {2,4};

		
		ArrayList<Integer> nm = new ArrayList<>(Arrays.asList(num1));
		ArrayList<Integer> nm2 = new ArrayList<>(Arrays.asList(num2));
		
		//nm.addAll(nm2);  = addAll : ArrayList에 있는 모든값을 기존 배열로 추가
		int addnum = 0;
		int count = 0;
		while(count < nm2.size()) {
			addnum = nm2.get(count);
			nm.add(addnum);
			count++;
		}
		Collections.sort(nm);
		System.out.println(nm);
		
		//무한루프
		Scanner sc = new Scanner(System.in);
		while(true) { //무한루프 사용형태 (while, do~while문 에서만 가능
			System.out.println("숫자를 입력하셈");
			String nono = sc.next();
			if(nono.equals("멈춰!")) { //사용자가 숫자 10을 입력하면 무한루프가 정지됨
				break;
			}else {
			}
		}
		
		
		
		System.out.println(nm);
		

	}

}
