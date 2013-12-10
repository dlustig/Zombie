import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.Gridlayout;

public class Highs extends JFrame{
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    
    private JLabel scores;
    private JButton svButton;
    
    public class Gui(){
        int finalScore = enemyClass.gameWorld.getScore();
        String [] x = Import();
        int l = x.length();
        int [] scorearray = new int[l];
        String scoreShow="";
        String scoreText="";
        String s = "";
        
        for(int t = 0; t < l; t++){
            scoreShow= scoreShow + x[l] + "\n";
        }
        
        for(int i = 0; i < l; i++){
            scorearray[i] = Integer.parseInt(x[i]);
        }
        
        if(score > scorearray[l-1]){
            scorearray[l-1] = score;
            for(int y =0; y < l; y++){
                s = Integer.toString(scorearray[y]);
                scoreText=scoreText + s + "\n";
            }
            svButton.setEnabled(true);
            scoreShow = scoreShow + "\n You made the high score list!";
        }
        else{
            scoreShow = scoreShow + "\n You didn't make the high scores.";
        }
        
        setTitle("HIGH SCORES");
        setSize(WIDTH, HEIGHT);
        
        Container pane = getContentPane();
        GridLayout grid = new GridLayout(2,1);
        pane.setLayout(grid);
        
        scores = new JLabel(scoreShow);
        svButton = new JButton("SAVE SCORES");
        svButton.setEnabled(false);
        svButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sv){
                Export Exporting = new Export(scoreText);
            }
        });
        
    }
    
    public static void main(String[] args){
        JFrame frame = new Gui();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
    }

    
}
