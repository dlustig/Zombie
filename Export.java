import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Export {
    
    public Export(String scoreT) {
	FileWriter output = null;
	try{
	    output = new FileWriter("scores.txt");
	    BufferedWriter writer = new BufferedWriter(output);
	    writer.write(scoreT);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
	    if(output != null){
		try{
		    output.close();
		} catch (IOException e){
		}
	    }
	}
    }
}
