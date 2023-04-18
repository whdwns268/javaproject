package java1;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/*
		 응용문제7
		 데이터 배열2가지가 있습니다. 해당 데이터 배열을
		 다음 결과처럼 값을 출력시키시오.
		 1번data : 대한민국 일본 중국 베트남 태국
		 2번data : 40 35 70 55 32
		 결과출력 data
		 ["대한민국(40)",..."태국(32)"]
		 */
		
		String[] country = {"대한민국","일본","중국","베트남","태국"};
		String[] number = {"40","35","70","55","32"};
		int ea = country.length;
		String[] mydata = new String[ea];
		for(int co = 0;co < ea; co++) {
			mydata[co] = country[co]+"("+number[co]+")";
		}
		System.out.println(Arrays.toString(mydata));
	}

}
