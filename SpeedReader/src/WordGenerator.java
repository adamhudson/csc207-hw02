import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WordGenerator {
	public static Scanner text;
		
	public static boolean hasNext() {
		return text.hasNext();
	}
	
	public static String next() {
		if (text.next() != null) { return text.next(); }
		else { return null; }
	}
		
	public static int getWordCount() {
		int words = 0;
		if (next() != null) { words++; }
		return words;
	}
		
	public static int getSentenceCount() {
		int sentences = 0;
		if (next().equals(".") || next().equals("!") || next().equals("?")) {
			sentences++;
		}
			
		return sentences;
	}
		
	public WordGenerator (String filename) throws IOException {
		text = new Scanner(new File(filename));
		int words;
		int sentences;
			 
		    while (hasNext()) {
		    	next();
		    	words = getWordCount();
		    	sentences = getSentenceCount();
		    }
		text.close();
	}
	
	public static void main(String[] args) throws IOException {
		WordGenerator test = new WordGenerator("/home/hudsonad17/csc207/hw02/SpeedReader/src/newfile.txt");
	}
}
