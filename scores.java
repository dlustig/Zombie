import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.io.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class scores extends JFrame{
    
    
    public static void saveScores(int score){
        boolean greaterThan = false;
        int [] scs = new int[10];
        String[] ScoresString = new String[10];
        int i =0;
        int min = 0;
        int tempMin;
        String s;
        String scoreText;
    
        BoxLayout ble = new BoxLayout();
        ble.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
       
        
        ble.setTitle("High Scores \n");
        ble.setSize(450, 450);
        ble.getContentPane().setLayout(
                                   new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        JButton save = new JButton("Button 1");
        save.setEnabled(false);
        save.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sv){
                Export Exporting = new Export(scoreText);
            }
        });

        JLabel scores = new JLabel("High Scores:");
        JLabel message = new JLabel("");
        JLabel instructions = new JLabel("Close the window with the x button to continue");
        
        getContentPane().add(scores);
        getContentPane().add(message);
        getContentPane().add(save);
        getContentPane().add(instructions);
        
        Scanner f;
		try {
			f = new Scanner(new File("scores.txt"));
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
        
		if(greaterThan == true){
		    save.setEnabled(true);
		    message.setText("You made the high score list!");
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
                ScoreText = ScoreText + "\n" + s;
                //scores.append(ScoresString[y] + "\n");
    			System.out.println(ScoresString[y]);
    		}
		}
		else if(greaterThan == false){
		    save.setEnabled(false);
            message.setText("You did not make the high score list.");
            
        }
            ble.setVisible(true);
        
    }
}