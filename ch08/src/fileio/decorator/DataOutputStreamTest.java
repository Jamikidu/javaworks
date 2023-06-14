package fileio.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		//기반 스트림 - FileOutputStream
		//보조 스트림 - DataOutputStream
		try(FileOutputStream fos = new FileOutputStream("file1.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeChar(67);
			dos.writeByte(66);			//아스키코드
			dos.writeInt(65);			//정수
			dos.writeFloat(2.54F);		//실수
			dos.writeUTF("감사합니다.");	//문자열
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("수행 완료");
		
		try(FileInputStream fis = new FileInputStream("file1.txt");
				DataInputStream dis = new DataInputStream(fis)){
				System.out.println(dis.readChar());
				System.out.println(dis.readByte());
				System.out.println(dis.readInt());
				System.out.println(dis.readFloat());
				System.out.println(dis.readUTF());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
