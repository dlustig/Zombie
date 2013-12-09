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


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZombieAttack().setVisible(true);
            }
        });
    }

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
