package cos.examples.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class WriteFile {

	static String byteStr = "Hello from byte stream";
	static String charStr = "Hello from char stream";

	public static void main(String[] args) throws IOException {
//		file write by byte stream
		File fileByte = new File("files/byte.txt");
		OutputStream fos = new FileOutputStream(fileByte);
		for (int i = 0; i < byteStr.length(); i++) {
			fos.write(byteStr.charAt(i));
		}
		fos.flush();
		fos.close();
		
//		file write by char stream
		File fileChar = new File("files/char.txt");
		Writer wf = new FileWriter(fileChar);
		for(int i = 0; i < charStr.length(); i++){
			wf.write(charStr.charAt(i));
		}
		wf.flush();
		wf.close();
	}

}
