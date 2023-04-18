package java1;

public class scoring {
	//배열값 및 사용자가 검색한 단어 인자값을 ㅗ받음
	public void search(String data1[], String data2[], String data3) { //배열 기호 사용
		int ea = data1.length;
		int count = 0;
		int w = 0;
		while(w < ea) {
			//검색단어와 배열값 비교
			if(data1[w]==data3) { //intern()안쓰면  .equals로 사용해야한다. 
				System.out.printf("%s님의 점수는 %s 입니다.",data1[w],data2[w]);
				count++;
			}
			w++;
		}
		if(count==0) { //검색단어에 배열값이 없을 경우
			System.out.println("미확인 되었습니다.");
		}
	}
}
