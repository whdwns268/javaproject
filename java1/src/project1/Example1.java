package project1;

import java.util.Scanner;

import java3.user2;

public class Example1 {

	public static void main(String[] args) {
		/*
		 *응용문제4
		 *업, 다운 퀴즈를 하도록 합니다.
		 *pc가 1~10까지 임의숫자를 선택합니다.
		 *단,inter페이스사용
		 *
		 *1~10까지 숫자를 입력하세요
		 *라는 메세지와 함게 사용자가 숫자를 하나 서너ㅐㄱ합니ㅏㄷ
		 *
		 *결과는 피시가 4라는 숫자를 선택하였고 사용자가 8이라는 숫자를 선택
		 *하였다면 down을 만약 사용자가 1이라는 숫자를 선택하였다면
		 *up이라는 메세지가 출력
		 *단 회수는 딱 4회만 할 수 있고
		 *pc가 뽑은 숫자와 사용자가 뽑은 숫자가 같을 경우
		 *정답 이라는 메세출력
		 *4회이상일때는 정답을 맞추지 못했습니다 라는 결과출력
		 */
		
		
		//내꺼 호출
		//updowngame ug = new updowngame();
		//ug.qqea(null);
		
		//강사님꺼
		updowngame1 ug = new updowngame1();
		
		
	}

}

class updowngame1 implements updown{

	@Override
	public void user() {
		System.out.println();
		
	}

	@Override
	//int a : pc숫자 , int b :사용자가 입력한 숫자
	public String restult(int a, int b) {
		String msg="";
		if(a > b) {
			msg = "UP";
		}
		else if(a < b) {
			msg = "DOWN";
		}
		return "";
	}
	
}

/*
 *  내꺼
 * 
class updowngame implements updown{


	@Override
	public int qqea(String gamepoint) {
		System.out.println(number);
		Scanner sc = new Scanner(System.in);
		
		int ck = 0;
		while(ck <= 3) {
			System.out.println("1~10까지 숫자를 입력하세요");
			int userno = sc.nextInt();
			
			if(userno < number) {
				System.out.println("up");
				ck++;
			}
			else if(userno > number) {
				System.out.println("down");
				ck++;
			}
			else {
				System.out.println("ㅇㅋ");
				break;
			}
		}
		
		return 0;
	}

}

*/
