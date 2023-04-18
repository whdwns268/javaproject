package Java2;

public class Sleep {

	//시간타이머
	public static void main(String[] args) {
		try {
			//Thread ??
		int w = 0;
		while(w < 101) {
			
			Thread.sleep(1000); //1초에 한번 씩 반복하는 형태
			System.out.println(w);
			w++;
		}
		
		}catch(Exception e) {
			
		}
	}

}
