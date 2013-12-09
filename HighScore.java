import java.util.Scanner;
import javax.swing.*;

public class HighScoreSaves extends javax.swing.JFrame {
    boolean greaterThan = false;
    int [] scs = new int[10];
    String[] ScoresString = new String[10];
    int score = 999999999;
    String pS = Integer.toString(score);
    int i =0;
    int min = 0;
    int tempMin;
    String s;
    Scanner f;
    boolean nope = true;
    int l = scs.length;
    
    private JLabel jLabel1;
    private JButton sSButton;
    private JLabel showHighScores;
    private JLabel showMessage;
    public HighScoreSaves() {
        initComponents();
        
        Scanner f;
		try {
			f = new Scanner(new File("/Users/annikalewis/Desktop/Eclipse_Java/Game/src/scores.txt"));
			while (f.hasNextInt()){
				scs[i] = f.nextInt();
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(int x =0; x < 10; x++){
			if(score > scs[x]){
				greaterThan = true;
			}
			s = Integer.toString(scs[x]);
			ScoresString[x] = s;
		}
    }
    if(greaterThan==true){
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
        
        for( int p = 0; p < scs.length/2; p++ )
        {
            int temp = scs[p];
            scs[p] = scs[scs.length - p - 1];
            scs[scs.length - p - 1] = temp;
        }
        for(int y =0; y< 10; y++){
            s = Integer.toString(scs[y]);
            ScoresString[y] = s;
            System.out.println(ScoresString[y]);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {
        
        showHighScores = new javax.swing.JLabel();
        showMessage = new javax.swing.JLabel();
        sSButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("");
        
        showHighScores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showHighScores.setText("High Scores:");
        for(int o=0; o < l; o++){
            showHighScores.append(scs[o] + "\n");
        }
        showHighScores.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        
        showMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showMessage.setText("");
        if(nope ==true){
            showMessage.setText("You did not make the high scores list.\n");
            sSButton.setEnabled(false);
        }
        else if(nope == false){
            showMessage.setText("You made the high score list! Congratulations!");
        }
        
        public static void SaveFile(String ScoresString[]){
            sSButton.setText("SAVE");
            sSButton.addActionListener(new ActionListenter){
                public void actionPerformed(ActionEvent e){
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
            
        }
        
        
        
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 2, 10));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X out of this window to continue");
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                  .addGroup(layout.createSequentialGroup()
                                            .addGap(130, 130, 130)
                                            .addComponent(sSButton)
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap(54, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                      .addComponent(showHighScores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(showMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                                            .addGap(57, 57, 57))
                                  );
        layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                          .addComponent(showHighScores, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(showMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(sSButton)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(jLabel1)
                                          .addContainerGap())
                                );
        
        pack();
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HighScoreSaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HighScoreSaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HighScoreSaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HighScoreSaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HighScoreSaves().setVisible(true);
            }
        });
    }
    
}
