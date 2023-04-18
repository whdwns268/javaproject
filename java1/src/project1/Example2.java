package project1;

public class Example2 {
	//배열 + abstract 사용하기
	public static void main(String[] args) {
		//추상 클래스ㅡㄹ 사용하게 되면, 빠르게 객체를 로드할 수 있습니다.
		
		//추상 클래스명으로 배열을 생성하여
		//new 메소드명으로 전체를 등록시킴
		box[] b = { new abox(), new abox(), new abox3()};
		/*    //배열값으로 각각의 메소드를 볼러오는 방법
		b[0].dataload();
		b[1].dataload();
		b[2].dataload();
		 */
		
		
		//반복문을 이용하여 추상클래스와 연결된 모든 메소드 호출
		int w = 0;
		while(w < b.length) {
			if( w != 1) { //배열값 중 인덱스 1번 클래스 외에 로드
				b[w].dataload();
			}
			w++;
		}
	}

}

abstract class box{
	public abstract void dataload();
}

class abox extends box{
	@Override
	public void dataload() {
		System.out.println("1번 데이터 로드");
	}
}

class abox2 extends box{
	@Override
	public void dataload() {
		System.out.println("2번 데이터 로드");
	}
}

class abox3 extends box{
	@Override
	public void dataload() {
		System.out.println("3번 데이터 로드");
	}
}