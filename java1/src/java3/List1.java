package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class List1 {
	//List 라이브러리
	public static void main(String[] args) {
		String member[] = {"박소은","윤준승","김여름"};
		//ArrayList : java 라이브러리 배열 메소드
		//Arrays.asList : 로드할 배열값을 말함
		//add(추가) , get(배열 데이터 로드), remove(배열값 삭제), size(배열 데이터 갯수)
		//중요사항
		ArrayList<String> a1 = new ArrayList<>(Arrays.asList(member));
		System.out.println(a1.size());
		/*a1.add("박소은");
		a1.add("윤준승");
		a1.add("김여름");*/
		a1.add("심규환");
		a1.add("이하늘");
		//System.out.println(a1);
		String user = a1.get(4);
		System.out.println(user);
		a1.remove(4);
		System.out.println(a1);
	}

}
