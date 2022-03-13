package resources;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Util {

	public static void writeFile (String fileName) {
		 try {
	        	File fakeFile = new File ("./SavesDir");
	            File realFile = new File (fakeFile, fileName);
	            FileWriter fw = new FileWriter (realFile);
	            PrintWriter pw = new PrintWriter (fw);
	            pw.println("true");
	            pw.close();
	          }
	          catch (IOException localIOException7) {}
	}
}
