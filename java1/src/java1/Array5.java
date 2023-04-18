package java1;

public class Array5 {

	public static void main(String[] args) {
		/*
		 응용문제3. 배열데이터를 모두 합한 결과값을 출력하시오.
		 15 60 11 14 27 => 127
		 */
		int a[] = {15,60,11,14,27};
		int ea = a.length;
		int w = 0;
		int sum = 0;
		while(w<ea) {
			sum += a[w];
			w++;
		}
		System.out.println("배열데이터를 모두 합한 결과값은 " + sum);
		
		int data[] = {15,60,11,14,27};
		//for in와 동일한 형태의 배열전용 반복문
		int sum1 = 0;
		for(int f : data) {
			sum1 += f;
			//System.out.println(f);
		}
		System.out.println(sum);
		
		String id[] = {"hong","kim","park","lee","jang","jung"};
		/*
		 응용문제4. 아이디 데이터 중 4글자 이상인 아이디만 출력하시오.
		 */
		for(String z : id) {
			int word = z.length(); //배열안에있는 각 문자의 길이
			if(word >= 4) {
			System.out.println(z);
			}
		}
	}

}
