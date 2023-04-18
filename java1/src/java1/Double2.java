package java1;

import java.util.Scanner;

public class Double2 {

	public static void main(String[] args) {
		/*
		 응용문제 7.
		 사용자가 숫자를 3개를 입력시킵니다.
		 3개의 숫자 중 짝수의 대한 숫자만 곱하여
		 결과값을 출력합니다. 단, 짝수의 숫자가 한개 또는 없을 경우
		 "짝수의 숫자는 모두 확인 되지 않습니다." 라는 메세지를 출력합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int w = 1;
		
		while(w < 4) {
			
			
			w++;

		}
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		System.out.println(a);
		int b = sc.nextInt();
		System.out.println(b);
		int c = sc.nextInt();
		System.out.println(c);
		
		
		
		int sum = 0;
		
		if(a % 2 == 1 && b % 2 == 1 && c % 2 == 1) {
			System.out.println("짝수의 숫자는 모두 확인 되지 않습니다");
		}else {
			
			if(a % 2 == 1){
				a = 0;
				System.out.println(a);
			}
			
			if(b % 2 != 0){
				b=0;
				System.out.println(b);
			}
			
			if(c % 2 != 0){
				c=0;
				System.out.println(c);
			}
				sum = a * b * c;
				System.out.println("수식계산"+sum);
		}
		
		

		
	}

}
