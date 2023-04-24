package Network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class multi_client {
	//멀티채팅 클라이언트
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("user id : ");
		String mid = sc.nextLine().intern();
		if(mid=="") {
			System.out.println("id error");
		}
		else {
			ch_client cc = new ch_client(mid);
			cc.start();
		}
	}
}

class ch_client extends Thread{
	private String ip = "192.168.10.156";
	private int port = 10001;
	Socket sk = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	String msg = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	public ch_client(String id) {
		try {
			this.sk = new Socket(this.ip,this.port);
			System.out.println("Server connect");
		}
		catch (Exception e) {
			System.out.println("Server connect Error");
		}
	}
}




