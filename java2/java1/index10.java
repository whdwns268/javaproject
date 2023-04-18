package java1;

import java.util.Scanner;

public class index10 {
	//for문 + scanner
	
	public static void main(String[] args) {
		/*
		 응용문제2.
		 Q. 원하는 구구단 숫자를 입력하세요?
		 사용자가 원하는 숫자를 입력하면, 해당 숫자에 맞는 구구단이 출력되도록 하시오.
		 예시) 3을 입력할 경우 구구단 3*1=3부터 3*9=27까지 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Q. 원하는 구구단 숫자를 입력하세요?");
		int n = sc.nextInt();
		sc.close();
		int f;
		for(f=1; f<=9; f++) {
			System.out.printf("%d * %d = %d\n",n,f,(n*f));
		}
		
	}
}

