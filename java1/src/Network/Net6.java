package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Net6 {
	//Client 생성
	public static void main(String[] args) {
		try {
			System.out.println("Client Connect");
			String ip = "192.168.10.155";
			int port = 9001;
			Socket sk = new Socket(ip,port);
			
			//System.out.println("servergogogo");
			//client에서 server로 보내는 메세지
			String cmsg = "aaa~~jongjun";
			
			//client에서 server로 보내는 통로 byte로 전송
			OutputStream os = sk.getOutputStream();
			os.write(cmsg.getBytes());
			os.flush();
			
			//server에서 보낸 메세지를 client가 받는 통로
			byte[] data = new byte[1024];
			InputStream is = sk.getInputStream();
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			sk.close();
			os.close();
			}
		catch (Exception e) {
			System.out.println("Error Server Connect");
		}
	}
}
