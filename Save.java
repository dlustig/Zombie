import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Save{
	public static void SaveGame(final int SCORE, final int HEALTH, final int LEVEL, final int EXP, final int TOTALEXP, final int HITS, final int KILLS, final int ACC){
				
		//create and set up the window
		JFrame saveFrame = new JFrame("Save");
	
		//make the program close when the window closes
		saveFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		saveFrame.getContentPane().setLayout(null);
		
		
		JButton save = new JButton("Save Game");
		
	    save.addActionListener(new ActionListener( ) {
	      public void actionPerformed(ActionEvent e) {
	    	  java.io.File file=new java.io.File("savedGame.txt");
	    	  String S = Integer.toString(SCORE);
			  String H = Integer.toString(HEALTH);
		  	  String L = Integer.toString(LEVEL);
			  String E = Integer.toString(EXP);
			  String TE = Integer.toString(TOTALEXP);
			  String HI = Integer.toString(HITS);
			  String K = Integer.toString(KILLS);
			  String A = Integer.toString(ACC);
	          try {
	              PrintWriter output = new PrintWriter(file);
	              output.println(S);
				  output.println(H);
				  output.println(L);
				  output.println(E);
				  output.println(TE);
				  output.println(HI);
				  output.println(K);
				  output.println(A);
				  output.close();
	              output.close();
	          } catch (FileNotFoundException ex) {
	              System.out.println("Unable to save file");
	          }
	      }   
	    }); 
	    saveFrame.getContentPane().add(save);
	}

}