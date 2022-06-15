package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxtFIle {
	
	public static void main(String[] args) throws IOException {
		File f= new File("input.txt");
		BufferedReader br
        = new BufferedReader(new FileReader(f));

    // Declaring a string variable
    String st;
    // Condition holds true till
    // there is character in a string
    while ((st = br.readLine()) != null)

        // Print the string
        System.out.println(st);
}
	
	

}
