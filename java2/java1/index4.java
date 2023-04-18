package java1;

public class index4 {

	public static void main(String[] args) {
		//반복문 사용
		int f;
		for(f=1; f <= 10; f++) {
			System.out.println(f);
		}
		
		//더블for문
		int a,b;
		for(a=2; a<10; a++) {
			for(b=1;b<10;b++) {
				System.out.printf("%d*%d=%d\n",a,b,(a*b));
			}
		}
		
		/*
		응용문제2.
		숫자 45~60까지 총 합산한 결과값을 출력하시오.
		*/
		
		int a1;
		int b1 = 0;
		for(a1=45; a1<=60; a1++) {
			b1 += a1;
		}
		System.out.println(b1);
		
		/*
		응용문제3
		1~200까지 숫자 중 홀수값만 모두 더한 결과값을 출력하시오.
		*/
		
		int a2;
		int b2 = 0;
		for(a2=1; a2<=200; a2++) {
			if(a2 %2 == 1) {
				b2 += a2;				
			}
		}System.out.println(b2);
		
		/*
		 응용문제4
		 20~60까지 숫자 중 3의 배수 값만 모두 더한 후 짝수인지 홀수인지를 출력하시오
		 */
		
		int a3;
		int b3 = 0;
		for(a3=20; a3<=60; a3++) {
			if(a3 %3 == 0) {
				b3 += a3;
			}
		}
		
		if(b3 %2 == 0) {
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다");
		}
		
		/*
		 응용문제5
		 구구단 7단~3단까지 역순으로 출력되도록 하시오.
		 단, 그 중 결과값이 홀수 인 값만 출력돱니다.
		 */
		
		int a4,b4;
		int sum = 0;
		for(a4=7; a4 >= 3; a4--) {
			for(b4=9; b4>=1; b4--) {;
				sum = a4 * b4;
				
				if(sum % 2 == 1) {
					System.out.printf("%d*%d=%d\n",a4,b4,sum);
				}
			}
				
		}
		
		
	}

}
