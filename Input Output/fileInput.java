import java.util.*;
import java.io.*;
public class fileInput {
	
	public static void main(String [] args)  throws IOException{
		Scanner scan;
		File file;
		try {
			file = new File("/home/examuser/output.txt");
			if(!file.exists()) {
				throw new FileNotFoundException("File not found");
			}
			scan = new Scanner(file);
			if(!scan.hasNext()) {
				throw new IOException("File is empty");
			}
			String a = scan.nextLine();
			System.out.println(a);
			if(scan.hasNext()) {
				throw new IOException("There is some more data left in the file.");
			}
		}
		catch(FileNotFoundException ioe) {
			
			System.out.println(ioe.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
