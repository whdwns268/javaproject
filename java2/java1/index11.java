package java1;

import java.util.Scanner;

public class index11 {
	//while문, do ~ while문
	public static void main(String[] args) {
		
		int a = 1;
		while(a < 10) {
			//System.out.println(a);
			a++;
		}

		//do-while문
		int b = 1;
		do {
			//System.out.println(b);
			b++;
		}while(b < 10);
		
		/*
		 응용문제3.(다시) (while 또는 do-while문으로 작성)
		 사용자가 2개의 숫자를 입력합니다.
		 두 숫자의 범위에 있는 모든 값을 더하는 코드를 작성하시오.
		 예시) 10 15
		 10+11+12+13+14+15 : 결과값 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 숫자를 입력합니다.");
		int a1 = sc.nextInt();
		int a2= sc.nextInt();
		int sum = 0;
		sc.close();
		do {
			sum += a1;
			a1++;
			
		} while(a1 <= a2);
		
		System.out.printf("최종 결과값은? %d 입니다.",sum);
	
	}

}
