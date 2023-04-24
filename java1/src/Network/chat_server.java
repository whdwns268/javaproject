package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chat_server {
   //채팅 서버
   public static void main(String[] args) {
      chat_sv cs = new chat_sv();
      cs.chatserver();
   }
}
class chat_sv{
   private int port = 10001;
   ServerSocket sk = null;
   Socket so = null;
   Scanner sc = null;
   InputStream is = null;
   OutputStream os = null;
   private String mid = null;
   public void chatserver() {
      try {
         this.sk = new ServerSocket(this.port);
         this.sc = new Scanner(System.in);
         System.out.println("login id : "); //방 개설자 아이디
         this.mid = sc.next();
         System.out.println("Chating Room Open");
         while(true) {
            this.so = sk.accept();
            this.is = this.so.getInputStream(); //클라이언트에게 받는 메세지
            this.os = this.so.getOutputStream(); //클라이언트에게 보내는 메세지
            byte msg[] = new byte[1024];
            int n = this.is.read(msg);
            String text = new String(msg,0,n);
            System.out.println(text); //클라이언트 입장 메세지(채팅 메세지)
            /*
             클라이언트 메세지 출력
             서버에서 클라이언트에서 메세지를전송하는 코드
             */
            this.sc = new Scanner(System.in);
            System.out.println("Sever message : ");
            text = this.sc.nextLine();
            if(text.equals("exit")) {
            	this.sk.close();
            	this.so.close();
            	break;
            }
            
            String cms = "["+this.mid+"]:" + text;
            this.os.write(cms.getBytes());
            this.os.flush();            
            
         }
      }
      catch (Exception e) {
         System.out.println("Port Connect Error!!");
      }
   }
}