import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.Gridlayout;

public class Highs extends JFrame{
    private static final int WIDTH = 100;
    private static final int HEIGHT = 400;

    private JLabel s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
    private JButton svButton;
	static String scoreText="";
	static String scoreShow="";
    static String [] x = Import.Import();


    public void Gui(){
        svButton = new JButton("SAVE SCORES");
        svButton.setEnabled(false);
		int finalScore = GameWorld.getScore();

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
            //scoreShow = scoreShow + "\n You made the high score list!";
        }
        else{
            //scoreShow = scoreShow + "\n You didn't make the high scores.";
        }

        setTitle("HIGH SCORES");
        setSize(WIDTH, HEIGHT);

        s1 = new JLabel(x[0]);
        s1.setHorizontalAlignment(SwingConstants.CENTER);
        s2 = new JLabel(x[1]);
        s2.setHorizontalAlignment(SwingConstants.CENTER);
        s3 = new JLabel(x[2]);
        s3.setHorizontalAlignment(SwingConstants.CENTER);
        s4 = new JLabel(x[3]);
        s4.setHorizontalAlignment(SwingConstants.CENTER);
        s5 = new JLabel(x[4]);
        s5.setHorizontalAlignment(SwingConstants.CENTER);
        s6 = new JLabel(x[5]);
        s6.setHorizontalAlignment(SwingConstants.CENTER);
        s7 = new JLabel(x[6]);
        s7.setHorizontalAlignment(SwingConstants.CENTER);
        s8 = new JLabel(x[7]);
        s8.setHorizontalAlignment(SwingConstants.CENTER);
        s9 = new JLabel(x[8]);
        s9.setHorizontalAlignment(SwingConstants.CENTER);
        s10 = new JLabel(x[9]);
        s10.setHorizontalAlignment(SwingConstants.CENTER);

        Container pane = getContentPane();
        GridLayout grid = new GridLayout(11,1);
        pane.setLayout(grid);


        pane.add(s1);
        pane.add(s2);
        pane.add(s3);
        pane.add(s4);
        pane.add(s5);
        pane.add(s6);
        pane.add(s7);
        pane.add(s8);
        pane.add(s9);
        pane.add(s10);
        pane.add(svButton);

        svButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent sv){
				Highs.exportText();

            }
        });
		setVisible(true);
    }

    public static void exportText(){
       // System.out.println(scoreText);
        Export Exporting = new Export(scoreText);
    }
    public static void main(String[] args){
        Highs frame = new Highs();
        frame.Gui();

    }


}
