package Java2;


public class Over3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		brand bd = new brand();
		System.out.println(" 통신사별 인원수 현황");	
		bd.userlist(null);
		/*
		 * 응용문제4. 각 통신사별 인원수 현황을 출력하는 프로세서를 개발하시오.
		 * 결과)
		 * SKT : 1명
		 * KT : 2명
		 * LGT : 1명
		 */
		
	}
}


class brand extends Over1{
	@Override
	public void userlist(String username) {
		super.userlist(username);
		int count = 0;
		int ea = this.list.length;
		int sktck = 0;
		int ktck = 0;
		int lgck = 0;
		
		while(count < ea) {
			switch(this.list[count][4]) {

			case "SKT":
				sktck++;
			break;
			
			case "KT":
				ktck++;
			break;
			
			case "LG":
				lgck++;
			break;
			
			}
			count++;
		}
		System.out.println("SKT이용자수:"+sktck);
		System.out.println("KT이용자수:" +ktck);
		System.out.println("LG이용자수:" +lgck);
	}

}