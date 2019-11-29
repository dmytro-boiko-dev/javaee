package BoostBrain;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Collections {
	
	
	public static void main(String... args) throws IOException{
		
	//read from file
	InputStream stream = new FileInputStream("c:/input_file.csv");
	
	//get file length
	int length = stream.available();
	byte[] data = new byte[length];
	stream.read(data);
	
	//revert readed data to string
	String text = new String(data);
	
	//adding Collections logic as array of strings
	ArrayList<String []> lineWords = new ArrayList<>();
	
	//separate gotten text on lines
	String[] lines = text.split("\n");
	for(String line : lines){
		String[] words = line.split(",");
		lineWords.add(words);
	}
	
	for(String[] words : lineWords){
		for(String word : words){
			System.out.print(word);
			System.out.print("|");
		}
	}
	
	
	}
}
