package Network;

public class Thread5 {
	//멀티 쓰레드 응용편
	/*
	 응용문제1. 멀티 쓰레드를 이용하여 각각의 구구단을 출력하는 프로세서를 제작하시오.
	 첫번째 쓰레드에는 구구단 5단, 두번째 쓰레드에는 구구단 9단
	 */
	static int a = 5;
	static int b = 9;
	public static void main(String[] args) {
		Runnable ra = new gu1();
		Thread th = new Thread(ra);
		th.start();
		
		
		Runnable ra2 = new gu2();
		Thread th2 = new Thread(ra2);
		th2.start();

	}
}
class gu1 implements Runnable{
	public void run() {
		int sum = 0;
		int w = 1;
		while(w<=9) {
			sum = Thread5.a * w;
			System.out.println(Thread5.a + "*" + w + "=" + sum);
			//System.out.printf("%d * %d = %d\n",Thread5.a,w,Thread5.a*w);
			w++;
		}
		
	}
}

class gu2 implements Runnable{
	public void run() {
		int sum = 0;
		int w = 1;
		while(w<=9) {
			sum = Thread5.b * w;
			System.out.println(Thread5.b + "*" + w + "=" + sum);
			//System.out.printf("%d * %d = %d\n",Thread5.b,w,Thread5.b*w);
			w++;
		}
		
	}
}
