package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class File17 {
	//이미지 용량제한 체크 프로세서 만들기

	/*
	이미지 업로드 할 수 있는 최대 용량은 1mb이하입니다.
	1mb이상 파일을 업로드시 "이미지 제한 용량은 1mb이하 까지 입니다" 라는
	메세지를 출력 단 정상적인 1MB이하면 e:memo에 이미지 복사되도록 함
	*/
	public static void main(String[] args) {
		try {
			//String file = "E:\\memo\\ive.jpg"; //1MB이하
			String file = "E:\\memo\\imaaa.jpg"; //1MB이상
			InputStream is = new FileInputStream(file);			

			int size = is.available();
			int imgs = 0;	
			int check = 0;
			if(size > 1048576) {
				System.out.println("이미지 제한 용량은 1mb이하 까지 입니다");
			}else {
				byte img[] = new byte[size/100];
				OutputStream os = new FileOutputStream("e:\\memo\\imgaaa2.jpg");
				
				while(true) {
					imgs = is.read(img); 
					if(imgs == -1) {
						break;
					}
					else {
						os.write(img,0,imgs);			
					}
					check++;
					if(check % 2 == 0) {
						System.out.println(check + "%");
					}
				}
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}

