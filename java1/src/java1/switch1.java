package java1;

public class switch1 {

	public static void main(String[] args) {
		
		int a = 10;
		switch(a) {
		case 1:
		case 10: //멀티case 사용
			System.out.println("옵션1을 선택");
		break;
		
		case 2:
			System.out.println("옵션2을 선택");
		break;
		
		case 3:
			System.out.println("옵션3을 선택");
		break;
		
		default:
			System.out.println("옵션값을 잘못 선택하였습니다.");
		break;
		}

	}

}
