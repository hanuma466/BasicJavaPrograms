package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTxtFile {
	public static void main(String[] args) throws IOException {
		BufferedWriter bm=new BufferedWriter(new FileWriter("input.txt"));
		bm.write("hanuma");
		bm.flush();
		bm.close();
		test();
	}
	public static void test() throws IOException {
		BufferedWriter bm=new BufferedWriter(new FileWriter("input1.txt"));
		for(int i=0;i<5;i++) {
			bm.write(i);
			bm.newLine();
		}
		bm.flush();
		bm.close();
	}
	
	
}
