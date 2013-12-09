<<<<<<< HEAD
import javax.swing.*;
=======
>>>>>>> c2e0e576f6a413df749099daf26ee83f9ea87a8d
import java.awt.*;


public class ZombieAttack extends javax.swing.JFrame {

    public ZombieAttack() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
                             
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        clearPanel = new javax.swing.JPanel();
        sButton = new javax.swing.JButton();
        pButton = new javax.swing.JButton();
        qButton = new javax.swing.JButton();
        scoreLabel = new javax.swing.JLabel();
        expShow = new javax.swing.JLabel();
        scoreShow = new javax.swing.JLabel();
        hitsLabel = new javax.swing.JLabel();
        accLabel = new javax.swing.JLabel();
        lvlLabel = new javax.swing.JLabel();
        expLabel = new javax.swing.JLabel();
        lvlShow = new javax.swing.JLabel();
        hitsShow = new javax.swing.JLabel();
        accShow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 768));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        clearPanel.setOpaque(false);
        clearPanel.setPreferredSize(new java.awt.Dimension(202, 597));

        sButton.setText("SAVE");
        sButton.setEnabled(false);

        pButton.setText("PAUSE");
        pButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pButtonActionPerformed(evt);
            }
        });

        qButton.setText("QUIT");

        scoreLabel.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("SCORE");

        expShow.setFont(new java.awt.Font("Lucida Grande", 2, 30)); // NOI18N
        expShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expShow.setText("0");

        scoreShow.setFont(new java.awt.Font("Lucida Grande", 2, 30)); // NOI18N
        scoreShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreShow.setText("0");

        hitsLabel.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        hitsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hitsLabel.setText("HITS");

        accLabel.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        accLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accLabel.setText("ACC");

        lvlLabel.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lvlLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvlLabel.setText("LEVEL");

        expLabel.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        expLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expLabel.setText("EXP");

        lvlShow.setFont(new java.awt.Font("Lucida Grande", 2, 30)); // NOI18N
        lvlShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvlShow.setText("0");

        hitsShow.setFont(new java.awt.Font("Lucida Grande", 2, 30)); // NOI18N
        hitsShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hitsShow.setText("0");

        accShow.setFont(new java.awt.Font("Lucida Grande", 2, 30)); // NOI18N
        accShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accShow.setText("0");

        javax.swing.GroupLayout clearPanelLayout = new javax.swing.GroupLayout(clearPanel);
        clearPanel.setLayout(clearPanelLayout);
        clearPanelLayout.setHorizontalGroup(
            clearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clearPanelLayout.createSequentialGroup()
                .addContainerGap(1158, Short.MAX_VALUE)
                .addGroup(clearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(expLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreShow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(expShow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lvlLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lvlShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hitsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hitsShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        clearPanelLayout.setVerticalGroup(
            clearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clearPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scoreShow, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expShow, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lvlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lvlShow, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hitsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hitsShow, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accShow, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(pButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(qButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(725, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        getContentPane().add(clearPanel, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/field1.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>                        

    private void pButtonActionPerformed(java.awt.event.ActionEvent evt) {                                        
        sButton.setEnabled(true);
        
        
    }                                       

    private void sButtonActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Save saveWindow = new Save();
        
    }  
    
    private void qButtonActionPerformed(java.awt.event.ActionEvent evt) {                                        
        System.exit(0);
    }  
   
    public static void main(String args[]) {

<<<<<<< HEAD
		
		JTextPane txtpnScore = new JTextPane();
		txtpnScore.setText("SCORE");
		txtpnScore.setOpaque(false);
		GridBagConstraints gbc_txtpnScore = new GridBagConstraints();
		gbc_txtpnScore.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnScore.anchor = GridBagConstraints.NORTH;
		gbc_txtpnScore.gridx = 0;
		gbc_txtpnScore.gridy = 0;
		sidebar.add(txtpnScore, gbc_txtpnScore);
		
		JTextArea scoreDisplay = new JTextArea();
		scoreDisplay.setOpaque(false);
		GridBagConstraints gbc_scoreDisplay = new GridBagConstraints();
		gbc_scoreDisplay.insets = new Insets(0, 0, 5, 0);
		gbc_scoreDisplay.fill = GridBagConstraints.VERTICAL;
		gbc_scoreDisplay.gridx = 0;
		gbc_scoreDisplay.gridy = 1;
		sidebar.add(scoreDisplay, gbc_scoreDisplay);
		
		JTextArea txtrHealth = new JTextArea();
		txtrHealth.setText("HEALTH");
		txtrHealth.setOpaque(false);
		GridBagConstraints gbc_txtrHealth = new GridBagConstraints();
		gbc_txtrHealth.insets = new Insets(0, 0, 5, 0);
		gbc_txtrHealth.fill = GridBagConstraints.VERTICAL;
		gbc_txtrHealth.gridx = 0;
		gbc_txtrHealth.gridy = 2;
		sidebar.add(txtrHealth, gbc_txtrHealth);
		
		JTextArea healthDisplay = new JTextArea();
		healthDisplay.setOpaque(false);
		GridBagConstraints gbc_healthDisplay = new GridBagConstraints();
		gbc_healthDisplay.insets = new Insets(0, 0, 5, 0);
		gbc_healthDisplay.fill = GridBagConstraints.VERTICAL;
		gbc_healthDisplay.gridx = 0;
		gbc_healthDisplay.gridy = 3;
		sidebar.add(healthDisplay, gbc_healthDisplay);
		
		JTextArea txtrLevel = new JTextArea();
		txtrLevel.setText("LEVEL");
		txtrLevel.setOpaque(false);
		GridBagConstraints gbc_txtrLevel = new GridBagConstraints();
		gbc_txtrLevel.insets = new Insets(0, 0, 5, 0);
		gbc_txtrLevel.fill = GridBagConstraints.VERTICAL;
		gbc_txtrLevel.gridx = 0;
		gbc_txtrLevel.gridy = 4;
		sidebar.add(txtrLevel, gbc_txtrLevel);
		
		JTextArea levelDisplay = new JTextArea();
		levelDisplay.setOpaque(false);
		GridBagConstraints gbc_levelDisplay = new GridBagConstraints();
		gbc_levelDisplay.insets = new Insets(0, 0, 5, 0);
		gbc_levelDisplay.fill = GridBagConstraints.VERTICAL;
		gbc_levelDisplay.gridx = 0;
		gbc_levelDisplay.gridy = 5;
		sidebar.add(levelDisplay, gbc_levelDisplay);
		
		JTextArea txtrExperienceToNext = new JTextArea();
		txtrExperienceToNext.setText("EXP to next level");
		txtrExperienceToNext.setOpaque(false);
		GridBagConstraints gbc_txtrExperienceToNext = new GridBagConstraints();
		gbc_txtrExperienceToNext.insets = new Insets(0, 0, 5, 0);
		gbc_txtrExperienceToNext.fill = GridBagConstraints.VERTICAL;
		gbc_txtrExperienceToNext.gridx = 0;
		gbc_txtrExperienceToNext.gridy = 6;
		sidebar.add(txtrExperienceToNext, gbc_txtrExperienceToNext);
		
		JTextArea expNextDisplay = new JTextArea();
		expNextDisplay.setOpaque(false);
		GridBagConstraints gbc_expNextDisplay = new GridBagConstraints();
		gbc_expNextDisplay.insets = new Insets(0, 0, 5, 0);
		gbc_expNextDisplay.fill = GridBagConstraints.VERTICAL;
		gbc_expNextDisplay.gridx = 0;
		gbc_expNextDisplay.gridy = 7;
		sidebar.add(expNextDisplay, gbc_expNextDisplay);
		
		JTextArea txtrTotalExperience = new JTextArea();
		txtrTotalExperience.setOpaque(false);
		txtrTotalExperience.setText("Total Experience");
		GridBagConstraints gbc_txtrTotalExperience = new GridBagConstraints();
		gbc_txtrTotalExperience.insets = new Insets(0, 0, 5, 0);
		gbc_txtrTotalExperience.fill = GridBagConstraints.VERTICAL;
		gbc_txtrTotalExperience.gridx = 0;
		gbc_txtrTotalExperience.gridy = 8;
		sidebar.add(txtrTotalExperience, gbc_txtrTotalExperience);
		
		JTextArea expDisplay = new JTextArea();
		expDisplay.setOpaque(false);
		GridBagConstraints gbc_expDisplay = new GridBagConstraints();
		gbc_expDisplay.insets = new Insets(0, 0, 5, 0);
		gbc_expDisplay.fill = GridBagConstraints.VERTICAL;
		gbc_expDisplay.gridx = 0;
		gbc_expDisplay.gridy = 9;
		sidebar.add(expDisplay, gbc_expDisplay);
		
		JTextArea txtrHits = new JTextArea();
		txtrHits.setOpaque(false);
		txtrHits.setText("HITS");
		GridBagConstraints gbc_txtrHits = new GridBagConstraints();
		gbc_txtrHits.insets = new Insets(0, 0, 5, 0);
		gbc_txtrHits.fill = GridBagConstraints.VERTICAL;
		gbc_txtrHits.gridx = 0;
		gbc_txtrHits.gridy = 11;
		sidebar.add(txtrHits, gbc_txtrHits);
		
		JTextPane hitsDisplay = new JTextPane();
		hitsDisplay.setOpaque(false);
		GridBagConstraints gbc_hitsDisplay = new GridBagConstraints();
		gbc_hitsDisplay.insets = new Insets(0, 0, 5, 0);
		gbc_hitsDisplay.fill = GridBagConstraints.VERTICAL;
		gbc_hitsDisplay.gridx = 0;
		gbc_hitsDisplay.gridy = 12;
		sidebar.add(hitsDisplay, gbc_hitsDisplay);
		
		JTextPane txtpnKills = new JTextPane();
		txtpnKills.setOpaque(false);
		txtpnKills.setText("KILLS");
		GridBagConstraints gbc_txtpnKills = new GridBagConstraints();
		gbc_txtpnKills.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnKills.fill = GridBagConstraints.VERTICAL;
		gbc_txtpnKills.gridx = 0;
		gbc_txtpnKills.gridy = 13;
		sidebar.add(txtpnKills, gbc_txtpnKills);
		
		JTextPane killDisplay = new JTextPane();
		killDisplay.setOpaque(false);
		GridBagConstraints gbc_killDisplay = new GridBagConstraints();
		gbc_killDisplay.insets = new Insets(0, 0, 5, 0);
		gbc_killDisplay.fill = GridBagConstraints.VERTICAL;
		gbc_killDisplay.gridx = 0;
		gbc_killDisplay.gridy = 14;
		sidebar.add(killDisplay, gbc_killDisplay);
		
		JTextPane txtpnAccuracy = new JTextPane();
		txtpnAccuracy.setOpaque(false);
		txtpnAccuracy.setText("ACCURACY");
		GridBagConstraints gbc_txtpnAccuracy = new GridBagConstraints();
		gbc_txtpnAccuracy.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnAccuracy.fill = GridBagConstraints.VERTICAL;
		gbc_txtpnAccuracy.gridx = 0;
		gbc_txtpnAccuracy.gridy = 15;
		sidebar.add(txtpnAccuracy, gbc_txtpnAccuracy);
		
		JTextPane accDisplay = new JTextPane();
		accDisplay.setOpaque(false);
		GridBagConstraints gbc_accDisplay = new GridBagConstraints();
		gbc_accDisplay.insets = new Insets(0, 0, 5, 0);
		gbc_accDisplay.fill = GridBagConstraints.VERTICAL;
		gbc_accDisplay.gridx = 0;
		gbc_accDisplay.gridy = 16;
		sidebar.add(accDisplay, gbc_accDisplay);
		
		final JButton saveButton = new JButton("SAVE");
		saveButton.setBorder(null);
		saveButton.setBorderPainted(false);
		saveButton.setContentAreaFilled(false);
		saveButton.setOpaque(false);
		GridBagConstraints gbc_saveButton = new GridBagConstraints();
		gbc_saveButton.gridx = 0;
		gbc_saveButton.gridy = 21;
		sidebar.add(saveButton, gbc_saveButton);
		saveButton.setEnabled(false);
		saveButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent s){
				Save.SaveGame(SCOREF, HEALTHF, LEVELF, EXPF, TOTALEXPF, HITSF, KILLSF, ACCF);				
			}
		});
		JButton pauseButton = new JButton("PAUSE");	
		pauseButton.setBorder(null);
        pauseButton.setBorderPainted(false);
        pauseButton.setContentAreaFilled(false);
        pauseButton.setOpaque(false);
		GridBagConstraints gbc_pauseButton = new GridBagConstraints();
		gbc_pauseButton.insets = new Insets(0, 0, 5, 0);
		gbc_pauseButton.fill = GridBagConstraints.VERTICAL;
		gbc_pauseButton.gridx = 0;
		gbc_pauseButton.gridy = 19;
		sidebar.add(pauseButton, gbc_pauseButton);
		pauseButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent p){
				saveButton.setEnabled(true);
				
			}
		});

		
		PlainJButton quitButton = new PlainJButton("QUIT");
		GridBagConstraints gbc_quitButton = new GridBagConstraints();
		gbc_quitButton.gridx = 0;
		gbc_quitButton.gridy = 20;
		sidebar.add(quitButton, gbc_quitButton);
	
		// display the window
		frame.pack();
		frame.setVisible(true);
=======

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZombieAttack().setVisible(true);
            }
        });
    }
>>>>>>> c2e0e576f6a413df749099daf26ee83f9ea87a8d

    // Variables declaration - do not modify                     
    private javax.swing.JLabel accLabel;
    private javax.swing.JLabel accShow;
    private javax.swing.JPanel clearPanel;
    private javax.swing.JLabel expLabel;
    private javax.swing.JLabel expShow;
    private javax.swing.JLabel hitsLabel;
    private javax.swing.JLabel hitsShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lvlLabel;
    private javax.swing.JLabel lvlShow;
    private javax.swing.JButton pButton;
    private javax.swing.JButton qButton;
    private javax.swing.JButton sButton;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel scoreShow;
    // End of variables declaration                   
}
