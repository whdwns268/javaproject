package java1;

public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 응용문제 8.
		 데이터 배열에 있는 모든 짝수값에 합산 결과를 출력하시오
		 단, 해당 배열은 2차 배열 형태입니다.
		 
		 1번데이터 : 11 42 22 16
		 2번데이터 : 7 33 10 29
		 최종결과값 90
		 */
		
		int data[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		
		int ea = data[0].length;
		int co = 0;
		int sum = 0;
		
		while(co < ea) {
			if(data[0][co] % 2 == 0) {
				sum = sum + data[0][co];
			}
			
			if(data[1][co] % 2 == 0) {
				sum = sum + data[1][co];
			}
			co++;
		}
		System.out.println(sum);
		
	}

}
