package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 *(주)CJ운송에서 테스트 코딩
		 *사용자가 8명 있습니다.
		 *각각의 사용자에게 포인트를 주어야합니다. 다음 결과와 같이 나오도록 코드를 작성하시오.
		 *customer data : 서울 경기도 인천 대전 충북 충남 전북 전남
		 *
		 * "서울 님에게 포인트 추가하시겠습니까?
		 * "전남 님에게 포인트 추가하시겠습니까?
		 * 
		 * 무조건 숫자를 입력하며 숫자 외에 입력시 " 포인트는 숫자만 입력합니다" 출력
		 * 
		 * 단 인천님 포인트 입력시 문자를 사용하여 오류 발생이 되면 다시
		 * "인천님에게 포인트를 추가하시겠습ㄴ까? " 질문이 나와야합니다
		 * 
		 * 최종결과정보
		 * 
		 * 서울 500
		 * 경기도:300
		 * 인천:300
		 */
		
		
		abox1 ab = new abox1();
		ab.dataload();
	}

}


abstract class box10{
	public abstract void dataload();
}

class abox1 extends box10{
	
	String data[] = {"서울","경기도","인천","대전","충북","충남","전북","전남"};
	@Override
	public void dataload() {
		System.out.println(Arrays.toString(data));
		System.out.println(data[1]);
		ArrayList<String> mapdata = new ArrayList<>();
		int ea = data.length;
		int count = 0;
		
		while(true) {
			try{
			Scanner sc = new Scanner(System.in);
			System.out.println(data[count]+"님에게 포인트 추가하시겠습니까?");
			int point = sc.nextInt();
			mapdata.add(data[count] +":"+point);
			count++;	
			if(count == ea) {
				break;
			}
			}
			catch (Exception e) { //숫자 미입력시
				System.out.println("숫자만 제발 입력하세요");
			continue; //다시 반복문으로 복귀
			}
		}
		

		}
			
	}

