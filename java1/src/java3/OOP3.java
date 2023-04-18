package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class OOP3 {
	/*
	(주)씨이랩
	응용문제2.
	본데이터 15,22,37,8,11,19,41 이 있습니다.
	해당 본 데이터를 다음 결과값이 커스텀 하여 출력하시오
	커스텀 결과 [7,15,22,8,11,39,41]
	테스트 시간(10분)
	*/
	public static void main(String[] args) {
	Integer data[] = {15,22,37,8,11,19,41};
	ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(data));
	ar.add(0,7);
	ar.remove(3);
	ar.remove(5);
	ar.add(5,39);
	System.out.println(ar);
	}
}
/*
class num1{
	Integer data[] = {15, 22, 37, 8, 11, 19, 41};
	LinkedList<Integer> ls = new LinkedList<>(Arrays.asList(data));
	ls.addFirst(2);
	
	
}
*/