package java1;

import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {

		System.out.println("1. 무지개룸 2.패밀리룸 3.달빛아래룸");
		Scanner sc = new Scanner(System.in);
		System.out.println("방 번호를 입력하세요");
		int number = sc.nextInt();
		if(number > 3) {
			System.exit(0);
		}
		int money = 0;
		switch(number) {
		
		case 1:
			money = 60000;
		break;
		
		case 2:
			money = 125000;
		break;
		
		case 3:
			money = 100000;
		break;
		}
		
		System.out.printf("%d 선택 가격은:%d",number,money);
		System.out.println("\n30% 할인 쿠폰을 적용하시겠습니까? (y/n)");
		String result = sc.next().intern();
		if(result.equals("n")) {
			System.out.println("결제하실 금액은" + money + "원 입니다.");
		}else {
			//double sales = money * 0.7;
			double n = 0.7;
			int sales = (int)Math.round(money * n);
			System.out.println("결제하실 금액은" + sales + "원 입니다.");
		}
		
		System.exit(0);
		room a1 = new room();

	}

}

class room{
	public room() {
		roomck();
	}
	
	public void roomck() {
		
		price(60000, 125000, 100000);
		roomname("1.무지개룸", "2.패밀리룸", "3.달빛아래룸");
		String num1 = inputs("방 번호를 입력하세요","");
		
		if(num1.equals("1")) {
			String num2 = inputs("해당 가격은 60000","");
		}
		else if(num1.equals("2")) {
			
		}
		else if(num1.equals("3")) {
			
		}
		else {
			System.out.println("올바른 값이 아닙니다.");
		}
		System.exit(0);
	}

	public String inputs(String msg, String exit) {
		Scanner scc = new Scanner(System.in);
		System.out.println(msg);
		String result = scc.next();
		return result;
	}
	
	public void roomname(String a, String b, String c) {
		//System.out.printf(a,b,c);
	}
	
	public void price(int a, int b, int c) {
		//System.out.println(a+"원 "+b+"원 "+c+"원 ");
	}

}





