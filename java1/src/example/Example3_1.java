package example;

import java.util.Scanner;

/*
응용문제1.
질문 "7000원 결제 하시겠습니까?" 라고 출력되며,
숫자 1을 입력하면, "결제가 진행 됩니다" 라고 출력 후 프로세서는 종료됩니다.
숫자 2를 입력하면, "결제가 취소 되었습니다." 라고 출력 후 동일하게 프로세서는 종료됩니다.
*/

public class Example3_1 { //쌤코드
	final int money = 7000;
	Scanner sc = new Scanner(System.in); //가상으로 입력받는 클래스.
	
	public static void main(String[] args) {
		Example3_1 ex = new Example3_1();
		ex.result();

	}
	public void result() {
		System.out.println(this.money + "원 결제 하시겠습니까?");
		int call = this.sc.nextInt();
		//String일 경우 intern 또는 equals 해야만 조건을 확인 할 수 있습니다.
		if(call==1) {
			System.out.println("결제가 진행 됩니다.");
		}
		else if(call==2) {
			System.out.println("결제가 취소 되었습니다.");
		}
		this.sc.close();
	}
}
