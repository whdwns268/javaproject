package java1;

import java.util.Arrays;

public class Array10 {
	//2차 배열 + 다차원 배열
	public static void main(String[] args) {
		int data[][] = {
				{1,2,3},
				{3,4,5}
		};
		//정적배열 형태
		int indata[][] = new int[2][5];
		indata[0][0] = 10;
		indata[0][1] = 102;
		indata[0][2] = 103;
		indata[0][3] = 101;
		indata[0][4] = 102;
		
		indata[1][0] = 105;
		indata[1][1] = 103;
		indata[1][2] = 102;
		indata[1][3] = 101;
		indata[1][4] = 105;
		
		System.out.println(Arrays.toString(indata[0]));
	}

}
