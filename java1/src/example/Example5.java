package example;

import java.util.Arrays;
import java.util.Collections;

//반복문 (for, while, do-while)
//배열 관련 (for(:))
public class Example5 {
	Integer data[] = {10,8,5,3,1}; //1차 숫자배열, 배열 선언할때는 배열 기호를 넣어줘야 한다.
	String data2[] = {"b","c","z","a","b","d"};
			
	public static void main(String[] args) {
		Example5 ex = new Example5();
		ex.array();
	}
	
	public void array() {
		
		//Arrays.sort(data); //Arrays.sort : 오름차순으로 정렬 [1, 3, 5, 8, 10]
		
		//내림차순 정렬
		Arrays.sort(this.data,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(this.data)); //[10, 8, 5, 3, 1]
		
		/*
		 응용문제2. 해당 배열에 모든 값을 합한 결과를 출력하시오.
		 */
		int sum = 0; //최종 결과 변수
		int ea = this.data.length; //배열 갯수
		int f;
		for(f=0; f<ea; f++) {
			sum += this.data[f];
		}
		System.out.println(sum);
	}

}
