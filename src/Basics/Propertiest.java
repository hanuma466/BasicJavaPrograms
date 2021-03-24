package Basics;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Propertiest {
	public static void main(String[] args) throws IOException {
		FileReader s=new FileReader("test.properties");
		Properties p=new Properties();
		p.load(s);
		System.out.println(p.get("test"));
		s.close();
		
		FileWriter f=new FileWriter("test.properties", true);
		f.append("testhanuma");
		//f.close();
		
		Properties d=new Properties();
		d.setProperty("hanuma123", "automation");
		p.store(f, "updating the data");		f.close();
		
	}

}
