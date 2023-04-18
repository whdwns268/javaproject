package java1;

public class Double1 {

	public static void main(String[] args) {
		/*
		 :D ~ 응용문제 4 ~ <:
		 다음과 같이 합계를 출력하는 LOOP문을 작성하시오.
		 예시)
		 5+5=10
		 5+4=9
		 5+3=8
		 ...
		 2+1=3;
		 */
		
		int a = 5;
		int b = 5;
		int sum = 0;

			
		do {
			b=5;
			do {
				sum = a + b;
				System.out.println(a+"+"+b+"="+sum);
				b--;
			}while(b > 0);
			a--;
		}while(a > 1);
	
		/*
		 응용문제6.
		 구구단 9단 중 9*64까지 숫자 중 결과값이 홀수에 대한 평균
		 */
		int qa = 9;
		int qw = 1;
		int qsum = 0;
		int qsumfull = 0;
		int qsuma = 0;
		do {
			qsum = qa * qw;
			if(qsum % 2 == 1) {
				qsuma = qsuma + qsum;
				qsumfull++;
			}
			qw++;
		}while(qw <= 64);

		System.out.println(qsuma / qsumfull); 
	}

}
