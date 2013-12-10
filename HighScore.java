import javax.swing.*;

import java.util.Scanner;
import java.io.*;
import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HighScore {
	public static void addButton(final String text, Container pane, final String ScoresString[]) {
	    // add a button object
		
	    JButton save = new JButton(text);
	    save.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                java.io.File file=new java.io.File("scores.txt");
                try {
                    PrintWriter output = new PrintWriter(file);
                    for(int d = 0; d < 10; d++){
                        output.print(ScoresString[d]);
                    }
                    output.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("");
                }
            }
	    });
	    ((JFrame) pane).getContentPane( ).add(save);
    }
    
	public static void addComponentsToPane(Container pane) {
		boolean greaterThan = false;
        int [] scs = new int[10];
		String[] ScoresString = new String[10];
		int score = 999999999;
		String pS = Integer.toString(score);
		int i =0;
		int min = 0;
		int tempMin;
		String s;
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        
        
		TextArea area = new TextArea();
		TextArea playerScore = new TextArea();
		TextArea nope = new TextArea();
		nope.append("You did not make the high scores list. \n");
		
		
		
		Scanner f;
		try {
			f = new Scanner(new File("/Users/annikalewis/Desktop/Eclipse_Java/Game/src/scores.txt"));
			while (f.hasNextInt()){
				scs[i] = f.nextInt();
				System.out.println(scs[i]);
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int x =0; x < 10; x++){
			if(score > scs[x]){
				greaterThan = true;
			}
			s = Integer.toString(scs[x]);
			ScoresString[x] = s;
			System.out.println(ScoresString[x]);
		}
		getScores(area, ScoresString);
		pane.add(area);
		
		
		playerScore.append("Player Score: \n" + pS);
        pane.add(playerScore);
        
        if(greaterThan == true){
        	for(int l = 0; l < 10; l++){
        		if(scs[l] < score){
        			tempMin = scs[l];
        			if(tempMin < min){
        				min = tempMin;
        			}
        		}
        	}
        	for(int r = 0; r < 10; r++){
        		if(scs[r] == min){
        			scs[r] = score;
        			break;
        		}
        	}
        	
        	for( int o = 0; o < scs.length/2; ++o )
        	{
                int temp = scs[o];
                scs[o] = scs[scs.length - o - 1];
                scs[scs.length - o - 1] = temp;
        	}
        	for(int y =0; y< 10; y++){
    			
    			s = Integer.toString(scs[y]);
    			ScoresString[y] = s;
    			System.out.println(ScoresString[y]);
    		}
        	addButton("Save", pane, ScoresString);
        }
        else{
        	pane.add(nope);
        }
    }
    
    
	public static void createGUI(){
		JFrame frame = new JFrame("HIGH SCORES:");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
	}
    public static void main(String[] args) {
    	createGUI();
        
    }
    
    public static void getScores(TextArea area, String[] ScoresString) {
        // System.out.println(theDrinks[arrayCount].toString());
        
		for(int j = 0; j < 10; j++){
			
			area.append(ScoresString[j] + "\n");			
		}
        
    }
    
}
