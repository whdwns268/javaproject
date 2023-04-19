package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Net7 {

	public static void main(String[] args) {
		String ip="192.168.10.156";
		int port = 9001;
		try {
			chat ch = new chat();
			ch.server_connect(ip,port);
		}
		catch (Exception e) {
			System.out.println("Server Error!!");
		}
	}

}

class chat{
	
	//client 와 server 모두 공용으로 사용하는 클래스
	Socket sk = null;
	Scanner sc = null;
	OutputStream os = null;
	InputStream is = null;
	
	public void server_connect(String ip,int port) throws Exception {
		this.sk = new Socket(ip,port); //상대방 ip,port번호
		System.out.println("OK!");

		this.os = this.sk.getOutputStream();//server로 값을 보내는 사항
		this.is = this.sk.getInputStream();//server 값을 받을 때
			this.sc = new Scanner(System.in);
			System.out.println("messege: ");
			String msg = this.sc.nextLine();
			String username = "newjeans : " ;
			String chats = username + msg;
			this.os.write(chats.getBytes()); //write로 getBytes 전송
			this.os.flush(); // 메모리값을 초기화
			this.os.close(); // 종료
	}
}