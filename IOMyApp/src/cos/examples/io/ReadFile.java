package cos.examples.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("files/byte.txt"));
		while(br.ready()){
			System.out.println(br.readLine());
		}
		br.close();
				
		File f = new File("files/char.txt");
		f.delete();
		
		File f1 = new File("files/byte.txt");
		f1.renameTo(f);
	}

}
