package java1;

import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {
		/*
		 응용문제7
		 adata와 bdata 두가지 배열값을 더한 후
		 해당 배열값을 기준으로 짝수,홀수인지를 나열하는
		 배열 결과를 출력하는 코드를 작성하시오.
		 
		 Result = ["짝수","홀수","짝수","짝수","짝수"]
		 
		 
		 */
		
		int Adata[] = {5,17,19,22,33};
		int Bdata[] = {1,2,3,4,5};

		int data[][] = {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
		
		int ea = data[0].length;
		
		
		int dateaa[][] = new int[2][5]; 
		dateaa[0]=Adata;
		dateaa[1]=Bdata;
		
		System.out.println(Arrays.toString(dateaa[1]));
		
		
		String dataval[] = new String[ea];
		
		int count = 0;
		int sum = 0;
		while(count < ea) {
		
		sum = data[0][count]+data[1][count];
		//System.out.println(sum);
		if(sum % 2 == 0) {
			dataval[count] = "짝수";
		}else {
			dataval[count] = "홀수";
		}
		count++;
		};
		System.out.println(Arrays.toString(dataval));
		
	}

}
