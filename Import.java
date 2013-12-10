import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;

public class Import{
	public String[] Import() {
	    String returnVal[] = new String[10];
	    FileReader file = null;
	    
	    try{
		file = new FileReader("scores.txt");
		BufferedReader reader = new BufferedReader(file);
		for(int i = 0; i < 10; i++){
		    returnVal[i] = reader.readLine();
		    i++;
		}
	    } catch(Exception e){
		throw new RuntimeException(e);
	    }finally{
		if(file!=null){
		    try{
			file.close();
		    } catch(IOException e){
		    }
		}
	    }
        SortedScores sort = new SortedScores();
        //returnVal = sort;
        System.out.println(sort);
	    return returnVal;
	}
}
