package java1;

public class Class4 {

	/*
	 응용문제4. (다시)
	 static이 없는 class이며, 해당 class에 두개의 숫자를 인자값으로 보냅니다.
	 해당 두개의 숫자 범위 안에 모든 값을 더하여 결과값을 받아서 출력하는 코드를 작성하시오.
	 (return method 필수)
	 */
	public static void main(String[] args) {
	Abc i = new Abc(); //외부 클래스 객체 생성
	int total = i.kkk(3,7); //따로 변수 하나 만들어주기, 해당 클래스에 두 인자값 전달 및 return으로 확인
	System.out.println(total);
	}

}
//같은 package 안에 동일한 class는 사용하지 못합니다.
class Abc{ //class안에는 class 쓸 수 없기 때문에 밖에다가 써줘야 작동 된다. 
	public int kkk(int num3, int num4) {
		int sum = 0;
		do {
			sum += num3;
			num3++;
		}while(num3<=num4);
		return sum; //return하면 system.out.println은 사용x, result 값은 두개씩 사용x
		
	}
}