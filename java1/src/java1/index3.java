package java1;

public class index3 {

	public static void main(String[] args) {
		//if문
		//+.-,*,/ 사칙연산
		int a,b;
		a = 10;
		b = 20;
		if (a < b) {
			System.out.println("b값이 큽니다.");
		}
		else if(a > b) {
			System.out.println("a값이 큽니다.");
		}
		else {
			System.out.println("두 값이 값습니다.");
		}
		
		/*
		응용문제 1.
			1번 항목의 숫자 10, 9 ,22 이며,
			2번 항목의 숫자는 19, 10, 2 입니다.
			첫번째 두번째 숫자는 더하며, 세번째 숫자는 곱할 경우
			결과값이 작은 항목이 출력 되도록 코드를 작성하시오.
			결과예시_ 1번 항목 결과가 작습니다.
		*/
		
		int a1, a2, a3; //1번항목
		a1 = 10;
		a2 = 9;
		a3 = 22;
		
		int a4 = a1+a2+a3;
		
		int b1, b2, b3; //2번 항목
		b1 = 19;
		b2 = 10;
		b3 = 2;
		
		int b4 = b1+b2*b3;
	
		
		if(a4 < b4) {
			System.out.println("2번 항목이 작습니다.");
		}
		else if(a4 > b4) {
			System.out.println("1번 항목이 작습니다.");
		}
		else {
			System.out.println("두 값 동일합니다.");
		}

		String userid="hong";
		String userpw="a123456";
		if(userid=="hong" && userpw=="a123456") {
			System.out.println("로그인 되었습니다.");
		}
		else {
			System.out.println("아이디 및 패스워드를 확인");
		}
		
		
		//정수에서 소수점 결과를 출력하는 경우
		int aa1 = 100;
		double aa2 = aa1 / (double)3;
		System.out.println(aa2);
		
		
		//Integer : 매게체에 대한 속성.toString() 문자열 변환
		//.parseInt() 또는 valueOf() 문자를 숫자로 변환
		
		//숫자를 문자로 변환하여 출력하는 경우
		int bb1 = 500;
		String bb2 = Integer.toString(bb1);
		System.out.println(bb2);
		
		//문자를 숫자로 변환하여 출력하는 경우
		String c1 = "600";
		int d1 = 10;
		//int sum = Integer.valueOf(c1) + d1;
		int sum = Integer.parseInt(c1) + d1;
		System.out.println(sum);
		
		//증가(++) 감소(--)
		int z = 10;
		z++;
		System.out.println(z);
		
		
		// +=, -=, *=, /= (연산기호)
		int k = 50;
		//k = k + k;
		//k += k;
		System.out.println(k);
			
		//간단 문자 표현 (char - ''와 적용 해야함)
		char ff = 'H';
		System.out.print(ff);
		
		
	}

}
