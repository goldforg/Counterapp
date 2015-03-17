import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.ResourceBundle;


public class Counterapp {

 

   public Counterapp(){
    
   }

   public static void main(String []args){
	

			try {

	InputStream iS = null;
	InputStream iS2 = null;
	Properties prop = new Properties();
	String path = "C:\\Counterapplication\\src\\main\\config\\venus.properties";
	String path2 = "C:\\Counterapplication\\src\\main\\config\\zombo.properties";

				iS = new FileInputStream(path);
				iS2 = new FileInputStream(path2);
				if (iS != null && iS2 != null) {
				prop.load(iS);
				System.out.println(prop.getProperty("message"));
				prop.load(iS2);
				System.out.println(prop.getProperty("message"));

 }
				else {
				System.out.println("Nofile");

					} 
	


			}


			catch (IOException e) {
			System.out.println("No file");
			}

	

   }


}