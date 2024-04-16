/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author theau
 */
public class GameFrame extends javax.swing.JFrame {
    //    Global variables used for guesses
    javax.swing.JLabel[] guessRow0;
    javax.swing.JLabel[] guessRow1;
    javax.swing.JLabel[] guessRow2;
    javax.swing.JLabel[] guessRow3;
    javax.swing.JLabel[] guessRow4;
    javax.swing.JLabel[] guessRow5;
    
    ArrayList<JLabel[]> guesses_arr;
    int guessCount;
    
    /**
     * Creates new form GameFrame
     */
    public GameFrame() {
        initComponents();
        
        guessCount = 0;
         /**
          * initializes arrays containing rows of guess labels 
          * sets visibility of these rows to false
          * Then adds each array to an arraylist of arrays
          */
         guesses_arr = new ArrayList<JLabel[]>();
        guessRow0 = new javax.swing.JLabel[]{guess0, typing0, paradigm0, level0, test0, year0};
        guesses_arr.add(guessRow0);
        guessRow1 = new javax.swing.JLabel[]{guess1, typing1, paradigm1, level1, test1, year1};
        guesses_arr.add(guessRow1);
        guessRow2 = new javax.swing.JLabel[]{guess2, typing2, paradigm2, level2, test2, year2};
        guesses_arr.add(guessRow2);
        guessRow3 = new javax.swing.JLabel[]{guess3, typing3, paradigm3, level3, test3, year3};
        guesses_arr.add(guessRow3);
        guessRow4 = new javax.swing.JLabel[]{guess4, typing4, paradigm4, level4, test4, year4};
        guesses_arr.add(guessRow4);
        guessRow5 = new javax.swing.JLabel[]{guess5, typing5, paradigm5, level5, test5, year5};
        guesses_arr.add(guessRow5);
           
//        Sets all the guess arrays to be invisible to start
        for(javax.swing.JLabel[] guessRow : guesses_arr) {
            guessVisibility(false, guessRow);
        }
    }
    
     // This sets the visibility of an array of JLabels
    private void guessVisibility(boolean isVisible, javax.swing.JLabel[] labels) {
        for (javax.swing.JLabel label : labels) {
            label.setVisible(isVisible);
        }
    }
    
//    Handles setting the text of your guess as well as its typing, paradigm, level, test and year
    private void setGuess(JLabel[] guessRow, String guess) {
        guessRow[0].setText(guess);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        gamePanel = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        guessButton = new javax.swing.JButton();
        winButton = new javax.swing.JButton();
        promptLabel = new javax.swing.JLabel();
        guess = new javax.swing.JLabel();
        paradigm = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        test = new javax.swing.JLabel();
        yearCreated = new javax.swing.JLabel();
        typing = new javax.swing.JLabel();
        guess0 = new javax.swing.JLabel();
        typing0 = new javax.swing.JLabel();
        paradigm0 = new javax.swing.JLabel();
        level0 = new javax.swing.JLabel();
        test0 = new javax.swing.JLabel();
        year0 = new javax.swing.JLabel();
        guess1 = new javax.swing.JLabel();
        typing1 = new javax.swing.JLabel();
        paradigm1 = new javax.swing.JLabel();
        level1 = new javax.swing.JLabel();
        test1 = new javax.swing.JLabel();
        year1 = new javax.swing.JLabel();
        guess2 = new javax.swing.JLabel();
        typing2 = new javax.swing.JLabel();
        paradigm2 = new javax.swing.JLabel();
        level2 = new javax.swing.JLabel();
        test2 = new javax.swing.JLabel();
        year2 = new javax.swing.JLabel();
        guess3 = new javax.swing.JLabel();
        typing3 = new javax.swing.JLabel();
        paradigm3 = new javax.swing.JLabel();
        level3 = new javax.swing.JLabel();
        test3 = new javax.swing.JLabel();
        year3 = new javax.swing.JLabel();
        guess4 = new javax.swing.JLabel();
        typing4 = new javax.swing.JLabel();
        paradigm4 = new javax.swing.JLabel();
        level4 = new javax.swing.JLabel();
        test4 = new javax.swing.JLabel();
        year4 = new javax.swing.JLabel();
        guess5 = new javax.swing.JLabel();
        typing5 = new javax.swing.JLabel();
        paradigm5 = new javax.swing.JLabel();
        level5 = new javax.swing.JLabel();
        test5 = new javax.swing.JLabel();
        year5 = new javax.swing.JLabel();
        winPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Classic");
        jButton1.setRolloverEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.setRolloverEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Hello Wordle");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(321, 321, 321))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "html", "Python", "C++", "Java" }));

        guessButton.setText("Guess");
        guessButton.setRolloverEnabled(false);
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });

        winButton.setText("To Win");
        winButton.setRolloverEnabled(false);
        winButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winButtonActionPerformed(evt);
            }
        });

        promptLabel.setText("What language am I thinking of?");

        guess.setText("Guess");

        paradigm.setText("Paradigm");

        level.setText("High/Low Level");

        test.setText("test");

        yearCreated.setText("Year Created");

        typing.setBackground(new java.awt.Color(153, 0, 51));
        typing.setText("Typing");

        guess0.setText("guess0");

        typing0.setText("typing0");

        paradigm0.setText("paradigm0");

        level0.setText("level0");

        test0.setText("test0");

        year0.setText("year0");

        guess1.setText("guess1");

        typing1.setText("typing1");

        paradigm1.setText("paradigm1");

        level1.setText("level1");

        test1.setText("test1");

        year1.setText("year1");

        guess2.setText("guess2");

        typing2.setText("typing2");

        paradigm2.setText("paradigm2");

        level2.setText("level2");

        test2.setText("test2");

        year2.setText("year2");

        guess3.setText("guess3");

        typing3.setText("typing3");

        paradigm3.setText("paradigm3");

        level3.setText("level3");

        test3.setText("test3");

        year3.setText("year3");

        guess4.setText("guess4");

        typing4.setText("typing4");

        paradigm4.setText("paradigm4");

        level4.setText("level4");

        test4.setText("test4");

        year4.setText("year4");

        guess5.setText("guess5");

        typing5.setText("typing5");

        paradigm5.setText("paradigm5");

        level5.setText("level5");

        test5.setText("test5");

        year5.setText("year5");

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePanelLayout.createSequentialGroup()
                                        .addComponent(guess0)
                                        .addGap(27, 27, 27)
                                        .addComponent(typing0)
                                        .addGap(18, 18, 18)
                                        .addComponent(paradigm0)
                                        .addGap(28, 28, 28)
                                        .addComponent(level0))
                                    .addGroup(gamePanelLayout.createSequentialGroup()
                                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(gamePanelLayout.createSequentialGroup()
                                                .addComponent(guess, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(96, 96, 96)
                                                .addComponent(paradigm))
                                            .addGroup(gamePanelLayout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addComponent(typing)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(level))
                                    .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(gamePanelLayout.createSequentialGroup()
                                            .addComponent(guess2)
                                            .addGap(27, 27, 27)
                                            .addComponent(typing2)
                                            .addGap(18, 18, 18)
                                            .addComponent(paradigm2)
                                            .addGap(28, 28, 28)
                                            .addComponent(level2))
                                        .addGroup(gamePanelLayout.createSequentialGroup()
                                            .addComponent(guess1)
                                            .addGap(27, 27, 27)
                                            .addComponent(typing1)
                                            .addGap(18, 18, 18)
                                            .addComponent(paradigm1)
                                            .addGap(28, 28, 28)
                                            .addComponent(level1))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePanelLayout.createSequentialGroup()
                                        .addComponent(test0)
                                        .addGap(28, 28, 28)
                                        .addComponent(year0))
                                    .addGroup(gamePanelLayout.createSequentialGroup()
                                        .addComponent(test1)
                                        .addGap(28, 28, 28)
                                        .addComponent(year1))
                                    .addGroup(gamePanelLayout.createSequentialGroup()
                                        .addComponent(test)
                                        .addGap(34, 34, 34)
                                        .addComponent(yearCreated))))
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(gamePanelLayout.createSequentialGroup()
                                            .addComponent(guess3)
                                            .addGap(27, 27, 27)
                                            .addComponent(typing3)
                                            .addGap(18, 18, 18)
                                            .addComponent(paradigm3)
                                            .addGap(28, 28, 28)
                                            .addComponent(level3))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                                            .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(gamePanelLayout.createSequentialGroup()
                                                    .addComponent(guess4)
                                                    .addGap(27, 27, 27)
                                                    .addComponent(typing4)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(paradigm4)
                                                    .addGap(28, 28, 28)
                                                    .addComponent(level4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(test4))
                                                .addGroup(gamePanelLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(test3)))
                                            .addGap(28, 28, 28)
                                            .addComponent(year3)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                                        .addComponent(guess5)
                                        .addGap(27, 27, 27)
                                        .addComponent(typing5)
                                        .addGap(18, 18, 18)
                                        .addComponent(paradigm5)
                                        .addGap(28, 28, 28)
                                        .addComponent(level5)
                                        .addGap(82, 82, 82)
                                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(gamePanelLayout.createSequentialGroup()
                                                .addComponent(test5)
                                                .addGap(28, 28, 28)
                                                .addComponent(year5))
                                            .addGroup(gamePanelLayout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(year4)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(promptLabel)
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guessButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(test2)
                        .addGap(28, 28, 28)
                        .addComponent(year2)
                        .addGap(39, 39, 39)))
                .addGap(87, 87, 87)
                .addComponent(winButton)
                .addGap(32, 32, 32))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(promptLabel)
                .addGap(35, 35, 35)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guessButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(typing)
                        .addComponent(guess))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(level)
                        .addComponent(paradigm)
                        .addComponent(test)
                        .addComponent(yearCreated)))
                .addGap(24, 24, 24)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guess0)
                    .addComponent(typing0)
                    .addComponent(paradigm0)
                    .addComponent(level0)
                    .addComponent(test0)
                    .addComponent(year0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guess1)
                    .addComponent(typing1)
                    .addComponent(paradigm1)
                    .addComponent(level1)
                    .addComponent(test1)
                    .addComponent(year1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guess2)
                    .addComponent(typing2)
                    .addComponent(paradigm2)
                    .addComponent(level2)
                    .addComponent(test2)
                    .addComponent(year2))
                .addGap(18, 18, 18)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guess3)
                    .addComponent(typing3)
                    .addComponent(paradigm3)
                    .addComponent(level3)
                    .addComponent(test3)
                    .addComponent(year3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guess4)
                    .addComponent(typing4)
                    .addComponent(paradigm4)
                    .addComponent(level4)
                    .addComponent(test4)
                    .addComponent(year4))
                .addGap(18, 18, 18)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(winButton)
                    .addComponent(guess5)
                    .addComponent(typing5)
                    .addComponent(paradigm5)
                    .addComponent(level5)
                    .addComponent(test5)
                    .addComponent(year5))
                .addGap(19, 19, 19))
        );

        jComboBox1.getAccessibleContext().setAccessibleDescription("");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("You Win!");

        jButton5.setText("Main Menu");
        jButton5.setRolloverEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Quit");
        jButton6.setRolloverEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout winPanelLayout = new javax.swing.GroupLayout(winPanel);
        winPanel.setLayout(winPanelLayout);
        winPanelLayout.setHorizontalGroup(
            winPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winPanelLayout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addGroup(winPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jLabel10))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        winPanelLayout.setVerticalGroup(
            winPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(100, 100, 100)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(gamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(winPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(winPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Change to second JPanel
        gamePanel.setVisible(true);
        menuPanel.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //Switch to Jpanel 1
        winPanel.setVisible(false);
        menuPanel.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void winButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winButtonActionPerformed
        // TODO add your handling code here:
        //Change to JPanel3
        winPanel.setVisible(true);
        gamePanel.setVisible(false);
    }//GEN-LAST:event_winButtonActionPerformed

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
        // TODO add your handling code here:
        //this part should call the guessing method
        String guess = (String) jComboBox1.getSelectedItem();

        //        Sets the guess string appropriately based on the user's input
        setGuess(guesses_arr.get(guessCount), guess);

        //        Makes the next guess row visible.
        guessVisibility(true, guesses_arr.get(guessCount));

        //        Adds 1 to the guesscount
        guessCount+=1;

        //        If there have been 6 guesses, then make the guess button unclickable.
        if(guessCount > 5) {
            guessButton.setEnabled(false);
        }

    }//GEN-LAST:event_guessButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameFrame gui = new GameFrame();
                gui.setVisible(true);
                gui.gamePanel.setVisible(false);
                gui.winPanel.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel guess;
    private javax.swing.JLabel guess0;
    private javax.swing.JLabel guess1;
    private javax.swing.JLabel guess2;
    private javax.swing.JLabel guess3;
    private javax.swing.JLabel guess4;
    private javax.swing.JLabel guess5;
    private javax.swing.JButton guessButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel level;
    private javax.swing.JLabel level0;
    private javax.swing.JLabel level1;
    private javax.swing.JLabel level2;
    private javax.swing.JLabel level3;
    private javax.swing.JLabel level4;
    private javax.swing.JLabel level5;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel paradigm;
    private javax.swing.JLabel paradigm0;
    private javax.swing.JLabel paradigm1;
    private javax.swing.JLabel paradigm2;
    private javax.swing.JLabel paradigm3;
    private javax.swing.JLabel paradigm4;
    private javax.swing.JLabel paradigm5;
    private javax.swing.JLabel promptLabel;
    private javax.swing.JLabel test;
    private javax.swing.JLabel test0;
    private javax.swing.JLabel test1;
    private javax.swing.JLabel test2;
    private javax.swing.JLabel test3;
    private javax.swing.JLabel test4;
    private javax.swing.JLabel test5;
    private javax.swing.JLabel typing;
    private javax.swing.JLabel typing0;
    private javax.swing.JLabel typing1;
    private javax.swing.JLabel typing2;
    private javax.swing.JLabel typing3;
    private javax.swing.JLabel typing4;
    private javax.swing.JLabel typing5;
    private javax.swing.JButton winButton;
    private javax.swing.JPanel winPanel;
    private javax.swing.JLabel year0;
    private javax.swing.JLabel year1;
    private javax.swing.JLabel year2;
    private javax.swing.JLabel year3;
    private javax.swing.JLabel year4;
    private javax.swing.JLabel year5;
    private javax.swing.JLabel yearCreated;
    // End of variables declaration//GEN-END:variables
}
