package Java2;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		gugudan2 b = new gugudan2();
		b.gugu();

	}

}

/*
 응용문제 1. 사용자가 구구단 숫자를 하나 입력합니다.
 세컨 개발자가 입력된 사항을 1~9까지 결과가 출력되는
 구구단을 개발합니다. 단, 상속받은 메소드에서 처리 되도록 코드를 작성합니다.
 */

class gugudan{
	protected int number;
	public void gugu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 구구단을 입력하세요");
		this.number = sc.nextInt();
	}
	public void result(int nm) {
		
	}
}

class gugudan2 extends gugudan{
	@Override
	public void gugu() {
		super.gugu();
		result(this.number);
	}
	
	@Override	
	public void result(int nm){
		super.result(nm);
		int count = 1;
		while(count < 10) {
			int sum = this.number * count;
			System.out.println(number + " * " +count + " = " + sum);
			count++;
		}
		
	}
}


