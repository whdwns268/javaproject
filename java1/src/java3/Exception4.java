package java3;

import java.util.ArrayList;

//예외처리 응용2 (다시)
/*
 "hong3000"
 "park12580"
 "kang852"
 "kim1819"
 "lee5117"
 
 전체 포인트 합계를 출력하는 프로세서를 구축하시오.
 3000 12580 852 1819 5117
 */
public class Exception4 {

	public static void main(String[] args) {
		String data[] = {"hong3000","park12580","kang852","kim1819","lee5117"};
		ArrayList<String> al = new ArrayList<>();
		int w = 0;
		while(w < data.length) {
			al.add(data[w].replaceAll("[a-zA-Z]", "")); //문자 a-z,A-Z 공백으로 비움 그러면 숫자만 출력됨
			w++;
		}
		try {
			ex e = new ex();
			e.datain(al);
		}
		catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
	}
}
class ex {
	public void datain(ArrayList point) throws Exception{ //위에서 쓴 자료형으로 맞는걸로 써주기
		int w = 0;
		int sum = 0;
		while(w < point.size()) {
			//ArrayList에서 숫자로 변환시 
			//자료형 적용 후 Integer.valueOf (String)
			//또는 Integer.parseInt를 이용하여 자료형 없이 적용가능
			
			sum += Integer.valueOf((String)point.get(w)); //주의!
			w++;
		}
		System.out.println(sum);
		Exception e = new Exception(); //혹시나 문제가 발생하면 e로 넘겨라
		throw e;
	}
}
