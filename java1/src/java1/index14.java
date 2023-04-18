package java1;

import java.util.Scanner;

public class index14 {
	//할인율 구하는 공식 방법^00^
	public static void main(String[] args) {
		int money = 10000;
		int coupon = 20;
		double a = coupon * 0.01;
		double b = money * a;
		double c = money - b;
		
		//(int)란 double 자료형을 변환 시킬 때 사용
		int total = (int)Math.round(c);
		
		//한줄라인으로 표현
		//double sum = money-(money*(coupon * 0.01));
		System.out.println(total);
		
		/*
		 응용문제4.
		 총 상품금액이 50000원 입니다.
		 사용자에게 "할인 쿠폰을 얼마를 적용할까요?" 라는 질문과 함께 숫자를 받습니다.
		 결과값으로 사용자가 적용한 할인율을 최종상품금액으로 출력하시오.
		 
		 총 상품금액 50000 할인 쿠폰을 얼마를 적용할까요?
		 20
		 "최종 상품금액은 40000원 입니다."
		 */
		
		Scanner dis1 = new Scanner(System.in);
		System.out.println("할인 쿠폰을 얼마를 적용할까요?");
		int disnum = dis1.nextInt();
		dis1.close();
		int ss = 50000;
		double a1 = disnum * 0.01;
		double a2 = ss * a1;
		double a3 = ss - a2;
		
		int totaldis = (int)Math.round(a3);
		System.out.printf("최종 상품금액은 %d 원 입니다.",totaldis);
		
		
		
	}

}
