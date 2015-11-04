package fallSemesterPackage.Utilities;

import java.util.*;
import java.io.*;

public class SearchFunction {
	 String word;
	
		 public static String Write(File txtDocument){
			 String doc = "";
			 
			 try{
				 Scanner reader = new Scanner(txtDocument);
				 
				 while(reader.hasNextLine()){
					 String line = reader.nextLine().toLowerCase();
					 doc += line;	 
				 }
				 
				 reader.close();
				 
			 } catch (FileNotFoundException e) {
				 e.printStackTrace();
			 }
			 
			 return doc;
			 
		 }
		
	public static void Find(String x, String fileLocation){
		String staticWord = x;
		File txtDocument = new File(fileLocation);
		String doc = Write(txtDocument);
		
		try {
			Scanner scanner = new Scanner(txtDocument);
			int lineNumber = 0;
			int wordPosition = 0;
			int instanceCounter = 0;
			
			while(scanner.hasNextLine()){
				String line = scanner.nextLine().toLowerCase();
				int length = line.length();
				int resultIntervalStart, resultIntervalEnd;				
				lineNumber++;
				
				if(line.indexOf(staticWord) != -1){
					instanceCounter++;
					wordPosition += line.indexOf(staticWord);
					
					if (wordPosition <= 25)
						resultIntervalStart = wordPosition + 2;
					else
						resultIntervalStart = 25;
					
					if (doc.length() < wordPosition + 25)
						resultIntervalEnd = doc.length() - wordPosition;
					else 
						resultIntervalEnd = 25;
					
					String paragraph = "\"" + doc.substring((wordPosition - resultIntervalStart), (wordPosition + resultIntervalEnd)) + "\"";
					System.out.println(paragraph);
					System.out.println("Instance " + instanceCounter + " of " + staticWord + " at line " + lineNumber);
					
					wordPosition += length - line.indexOf(staticWord);
				} else
					wordPosition += length;				
			}

			scanner.close();
			
			System.out.println("There were " + instanceCounter + " instances of \"" + staticWord + "\".");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String wordInput = "";
		String fileInput = "";
		
		while (fileInput.length() == 0){
			System.out.println("Please enter the file path for the text document to search:.. ");
			fileInput = reader.nextLine().trim();
			
			if (fileInput.length() == 0){
				System.out.println("That is an invalid entry.");
			}
		}
		
		while (wordInput.length() == 0){	
			System.out.println("What is the string to search for:.. ");
			wordInput = reader.nextLine().trim();
			
			if (wordInput.length() == 0){
				System.out.println("That is an invalid entry.");
			}
		}
		
		System.out.println("Please wait. Your request is being processed:.. ");
		Find(wordInput, fileInput);
		System.out.println("Done. \nThe file containing the search results is stored at: \n" + fileInput);		
		
		reader.close();
		
	}

}
