package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2 {
	//ArrayList, List, Linkedlist -2차 배열 선언
	public static void main(String[] args) {
		String data[][] = {
				{"hong","kim","park"},
				{"서울","강원","경기"}
		};
		//String[] : 2차 배열 이상 Integer[] : 숫자로 된 2차배역ㄹ
		ArrayList<String[]> ar = new ArrayList<String[]>(Arrays.asList(data));
		int ea = ar.size();
		System.out.println(ar.get(1)[1]);
		System.out.println(ea); //배열 그룹 갯수
		System.out.println(ar.get(1).length); //첫번째 배열에 데이터갯수
		System.out.println(Arrays.toString(ar.get(1))); //그룹에 있는 모든 데이터출력
		
		//해당 크룹에 있는 데이터를 출력하는 반복문
		int w = 0;
		while(w < ar.get(0).length) {
			System.out.println(ar.get(0)[w]);
			w++;
		}
	}

}
