import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ZombieAttack {
	public static void main(String args[]){
		int SCORE;
		int HEALTH;
		int LEVEL;
		int EXP;
		int TOTALEXP;
		int HITS;
		int KILLS;
		int ACC;

		// params need to be set to final in order to work in button listener
		// once these have been initialized from the other parts of the program
		// i can make these equal to what their corresponding normal int 
		// parameters are
		final int SCOREF = 0;
		final int HEALTHF = 0;
		final int LEVELF = 0;
		final int EXPF = 0;
		final int TOTALEXPF = 0;
		final int HITSF = 0;
		final int KILLSF = 0;
		final int ACCF = 0;
		
		
		//create and set up the window
		JFrame frame = new JFrame("Zombie Attack!");
		
		//make the program close when the window closes
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.CYAN);
		
		// set up game panel
		JPanel gameboard = new JPanel();
		gameboard.setBounds(0, 16, 466, 576);
		gameboard.setOpaque(false);
		frame.getContentPane().add(gameboard);
		
		// set side panel
		JPanel sidebar = new JPanel();
		sidebar.setBounds(469, 16, 140, 562);
		sidebar.setOpaque(false);
		frame.getContentPane().add(sidebar);
		GridBagLayout gbl_sidebar = new GridBagLayout();
		gbl_sidebar.columnWidths = new int[]{0, 0};
		gbl_sidebar.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_sidebar.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_sidebar.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		sidebar.setLayout(gbl_sidebar);

		
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

		
	}
}
