import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.Gridlayout;

public class Highs extends JFrame{
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    private JLabel scores;
    private JButton svButton;
	static String scoreText="";
	static String scoreShow="";
    public void Gui(){
        svButton = new JButton("SAVE SCORES");
        svButton.setEnabled(false);
		int finalScore = GameWorld.getScore();
        String [] x = Import.Import();
        int l = x.length;
        int [] scorearray = new int[l];


        String s = "";

        for(int t = 0; t < l; t++){
            scoreShow= scoreShow + x[t] + "\n";
        }

        for(int i = 0; i < l; i++){
            scorearray[i] = Integer.parseInt(x[i]);
        }

        if(finalScore > scorearray[l-1]){
            scorearray[l-1] = finalScore;
            for(int y =0; y < l; y++){
                s = Integer.toString(scorearray[y]);
                scoreText=scoreText + s + "\n";
                System.out.println("..."+scoreText);
            }
            svButton.setEnabled(true);
            scoreShow = scoreShow + "\n You made the high score list!";
        }
        else{
            scoreShow = scoreShow + "\n You didn't make the high scores.";
        }
		scores = new JLabel(scoreShow);
        setTitle("HIGH SCORES");
        setSize(WIDTH, HEIGHT);

        Container pane = getContentPane();
        GridLayout grid = new GridLayout(2,1);
        pane.setLayout(grid);


        pane.add(scores);
        pane.add(svButton);

        svButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sv){
				Highs.exportText();

            }
        });
		setVisible(true);
    }

public static void exportText(){
	System.out.println(scoreText);
	Export Exporting = new Export(scoreText);
}
    public static void main(String[] args){
        Highs frame = new Highs();
        frame.Gui();

    }


}
