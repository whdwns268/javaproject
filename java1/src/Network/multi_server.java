package Network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class multi_server {
	//멀티채팅 서버
	public static void main(String[] args) {
		multi_server ms = new multi_server();
		ms.info();
	}
	public void info() {
		ServerSocket ss = null; //서버 소켓 클래스 로드
		Socket sk = null; //소켓 클래스 로드
		try {
			ss =  new ServerSocket(10001); //서버 오픈 포트
			while(true){ //사용자가 추가될 때 마다 멀티 쓰레드가 작동
				System.out.println("charting room start");
				sk = ss.accept(); //연결유지(반복문 필수)
				ch_server ch = new ch_server(sk);//즉시실행 메소드 소켓전달
				ch.start(); //멀티스레드로 전달

			}
			
		}
		catch(Exception e) { //소켓에러시
			System.out.println("chroom start");
		}
	}
}

class ch_server extends Thread{
	//사용자 정보를 저장하는 부분 (메모리에 등록) - 미등록 시 초기화됨
	static ArrayList<PrintWriter> user = new ArrayList<>();
	
	InputStream is = null;
	Socket sk = null;
	BufferedReader br = null;
	PrintWriter pw = null;
	InputStreamReader isr = null;
	OutputStream os = null;
	
	public ch_server(Socket s) { //setter 기본 옵션을 모두 셋팅
		this.sk = s; //소켓을 필드값으로 전달
		try { //모든 필드값에 속성값을 전달
			this.os = this.sk.getOutputStream(); //쓰기
			//this.pw = new PrintWriter(this.sk.getOutputStream());
			this.pw = new PrintWriter(this.os);
			
			this.is = this.sk.getInputStream();
			this.isr = new InputStreamReader(this.is); //읽기
			this.br = new BufferedReader(this.isr);
			//위 내용을 하기처럼 축약하여 작성가능
			//this.br = new BufferedReader(new InputStreamReader(this.sk.getInputStream()));
			user.add(this.pw); //배열에 사용자를 저장
		}
		catch (Exception e) {
			System.out.println("Socket Error");
		}
	}
	@Override
	public void run() { //Thread 작동
		String name = "";
		try {
			name = this.br.readLine();
			//System.out.println("["+name+"]"); 접속자 사항
			info("["+name+"] Welcome");//클라이언트 환영 메세지 출력 1회
			
			while(this.br != null) {//클라이언트 입력한 메세지를 전달
				String inmsg = this.br.readLine();
				if(inmsg.equals("exit")) {//클라이언트 exit 입력시
					user.remove(this.pw); //사용자 삭제
					info(name +"[Out]");//사용자들에게 접속을 종료한 아이디를 출력
					break;//반복문 종료
				}
				else {
					info(name + " : " + inmsg);					
				}
			}
		}
		catch (Exception e) {
			System.out.println("user id error");
		}
	}
	public void info(String s) { //전달 형태
		for(PrintWriter p : user) { //배열값
			p.println(s); //메세지 전달
			p.flush(); //메모리 메세지 초기화
		}
	}
}