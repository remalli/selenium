package utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



import com.google.common.io.FileWriteMode;

public class fileData {

	static File file;
	static FileWriter filewriter;
	String filename;
	static BufferedWriter bwriter;
	static FileReader reader;
	static BufferedReader breader;
	
	
	public fileData (String filename) throws IOException {
		this.filename=filename;
		file =new File(filename);
		file.createNewFile();
		filewriter =new FileWriter(file);
		
	}
	
	public void fileWriter(String value) throws IOException {
		bwriter.newLine();
		bwriter.write(value);
		bwriter.flush();
	}
	
	public String Fileread() throws IOException {
		reader =new FileReader(filename);
		breader =new BufferedReader(reader);
		breader.ready();
		return breader.readLine();
	}
}
