package java3;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class OOP1_1 {

	public static void main(String[] args) {
		bank a = new bank();
		a.indata();
	}
}
class bank{
	Scanner sc;
	LinkedList<Integer> li;
	Integer sum = 0;

	public void indata() {
		this.li = new LinkedList<>();
		
		while(true) {
		try {	//숫자 입력시
		this.sc = new Scanner(System.in);
		System.out.println("입금할 금액을 적어주세요:");
		int money = this.sc.nextInt();
		this.li.add(money);
		this.sum += new Integer(money); //heap로 설정함
		int count = li.size(); //사용자가 입력한 누적 배열 데이터 갯수
		if(count == 8) { //배열 데이터 갯수 체크
			break; //무한 loop 종료
		}
		
		}
		catch (Exception e) { //숫자 미입력시
			System.out.println("숫자만 제발 입력하세요");
			continue; //다시 반복문으로 복귀
		}
		}
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(this.li);
		System.out.println("입금한 총 금액은 " + df.format(this.sum) + "원");
		this.sc.close();
	}
}


