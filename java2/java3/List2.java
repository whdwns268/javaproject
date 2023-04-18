package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List2 {

	public static void main(String[] args) {
		String user[] = {"hong","kim","park","jang"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(user));
		int ea = al.size();//4
		int w = 0;
		
		/*
		while(w<ea) {
			ea = al.size();
		*/
		while(w<al.size()) {
			if(al.get(w).equals("kim")) {
				al.remove(w); //remove 시 실제 배열 번호가 변경됩니다.
			}
			w++;	
		}
		System.out.println(al);
		
		/*
		 			* 응 용 문 제 *
		 해당 배열을 확인 후 짝수의 숫자를 모두 삭제하여
		 최종 결과 배열을 출력하시오.
		 
		 10 7 6 1 11 37 41 22
		 
		 결과 7 1 11 37 41
		 */
		
		Integer num[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> nm = new ArrayList<>(Arrays.asList(num));
		w=0;
		while(w <nm.size()) {
			if(nm.get(w) % 2== 0) {
				nm.remove(w);
			}
			w++;
		}
		Collections.sort(nm,Collections.reverseOrder());
		System.out.println(nm);
		
		
		
		
		
		
		
		
	}

}
