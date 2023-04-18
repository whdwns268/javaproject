package Java2;


public class Method10 {
	
	private String name=null;
	private String subject=null;
	private String sign = "false";
	
	public String gtdata() {//getter
		return sign; //최종 결과값을 method9으로 전달하는 기능
	}
	
	
	public void score(String name, String subject) { //setter
		//method9에서 사용자가 입력한 값을 받아오는 역활
		this.name = name;
		this.subject = subject;
		
		String user[][]= {
				{"홍길동","이순신","유관순","강감찬","장보고"},
				{"80","77","92","67","100"}, //국어
				{"40","100","80","92","67"}, //수학
				{"95","88","42","98","50"}, //과학
				{"41","92","100","95","30"} //역사
				};
		int ea= user[0].length;
		int count = 0;
		this.sign = "";
		while(count < ea){
			
			if(user[0][count].equals(this.name)) {
				
				int ww = 1;
				while(ww < ea) {
					//과목명
					
					switch(this.subject) {
					case "국어":
						this.sign = user[1][count];
					break;
					
					case "수학":
						this.sign = user[2][count];
					break;
						
					case "과학":
						this.sign = user[3][count];
					break;
						
					case "역사":
						this.sign = user[4][count];
					break;
					
					case "전체":
						this.sign += user[ww][count]+",";
					break;
						
					default:
						this.sign = "";
						this.sign = "해당 데이터는 찾을 수 없슴돠";
					break;
					
					}
					//System.out.println(user[ww][count]);
					ww++;
				}
			}
			
		count++;
		}
		
	}
	
}
