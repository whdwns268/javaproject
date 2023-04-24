package Network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class multi_client {
	//멀티채팅 클라이언트
	public static void main(String[] args) {
		multi_client mc = new multi_client();
		mc.info();
	}
	
	public void info() {
		Socket sk = null;
		BufferedReader br = null;
		InputStream is = null;
		InputStreamReader isr = null;
		Scanner sc = null;
		try {
			sk = new Socket("192.168.10.156",10001);
			System.out.println("connet success");
			sc = new Scanner(System.in);
			System.out.println("user id:");
			String name = sc.next();
			//멀티스레드로 사용자 아이디 및 소켓 전달
			Thread tr = new ch_client(sk,name);
			tr.start();//멀티스레드 가동
			
			is = sk.getInputStream(); //읽기
			isr = new InputStreamReader(is);//byte -> String
			br = new BufferedReader(isr); //메모리에 저장
			
			while(br != null) {
				String msg = br.readLine(); //메모리 문자 확인
				System.out.println("MSG : " + msg); //메시지 전달
			}
		}
		catch (Exception e) {
			System.out.println("server connect Error..");
		}
	}
}
	

class ch_client extends Thread{
	Socket sk = null;
	String name = null;
	Scanner sc = null;
	public ch_client(Socket s, String name) {
		this.sk = s;
		this.name = name;
	}
	
	@Override
	public void run() {
		try {
			//byte ->Sting 전환
			PrintStream ps = new PrintStream(this.sk.getOutputStream());
			ps.println(this.name);//입장에 대한 1회만 사용
			ps.flush();
			
			while(true) { //사용자가 입력하는 메세지를 전달
				this.sc = new Scanner(System.in);
				String msg = this.sc.nextLine();
				ps.println(msg); //전달 메세지 출력
				ps.flush();//메세지 초기화
			}
		}
		catch (Exception e) {
			System.out.println("Mseege Error!!");
		}
	}
}




