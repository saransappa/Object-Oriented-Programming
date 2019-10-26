import java.io.*;

public class fileOutput {
	public static void main(String [] args) throws Exception {
		File file = new File("/home/examuser/output.txt");
		try {
			if(file.exists()) {
				throw new Exception("File already exists.\nPlease give another name.");
			}
			file.createNewFile();
			if(!file.exists()) {
				throw new FileNotFoundException("Unable to create new file");
			}
			FileWriter writer = new FileWriter(file);
			writer.write("I am learning files, IO and Exception handling in Java \n");
			writer.close();
		}	
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		
	}
}
