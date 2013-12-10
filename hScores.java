import javax.swing.*;
import java.awt.BorderLayout;


public class hScores extends JFrame{
    private static final int WIDTH = 300;
    private static final int HEIGHT = 500;
    private JLabel scoreLabel;
    private JButton saveB;
    
    private SButtonHandler sbHandler;

    public static void saveScores(int score){

	setTitle("High Scores");
	setZide(WIDTH, HEIGHT);
	
	Container pane = getContentPane();
	BorderLayout b = new BorderLayout();
	
	
    String topTen[] = new String[10];
    topTen = Import.Import();
    
    int s = 0;
    int tempMin=0;
    int min = 9999999;
    int minLoc=0;
    int [] sArray = new int[10];    
    boolean greaterThan = false;
    String sc;
    String ScoresString = "";

    
    for(int i = 0; i < 10; i++){
	s = String.toInteger(topTen[i]);
	sArray[i] = s;
	if(score > s){
	    greaterThan = true;
	    tempMin = sArray[i];
	    if(tempMin < min) {
		min = tempMin;
		minLoc = i;
	    }
	    sArray[minLoc] = score;
	}
    }
    
    for( int o = 0; o < scs.length/2; ++o )
        	{
                int temp = scs[o];
                scs[o] = scs[scs.length - o - 1];
                scs[scs.length - o - 1] = temp;
        	}
    for(int y =0; y< 10; y++){
    			
    	sc = Integer.toString(scs[y]);
    	ScoresString = ScoresString + sc + "\n";
    		}

    scoreLabel= new JLabel(ScoresString);
    saveB = new SButtonHandler();
    saveB.addActionListener(sbHandler);
    
    pane.add(scoreLabel, BorderLayout.NORTH);
    pand.add(saveB, BorderLayout.SOUTH);
    
    
    
    }

    private class SButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
	    Export.Export(ScoresString);
    }
}