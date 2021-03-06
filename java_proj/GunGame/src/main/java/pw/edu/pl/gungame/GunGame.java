
package pw.edu.pl.gungame;

import java.awt.Color;
import java.io.FileNotFoundException;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GunGame extends javax.swing.JFrame {

    /**
     * Creates new form GunGame
     */
    public GunGame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pauseMenu = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        mainMenu = new javax.swing.JDialog();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        playerNameDialog = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        playerLeftText = new javax.swing.JTextField();
        playerRightText = new javax.swing.JTextField();
        playerNameAccept = new javax.swing.JButton();
        errorDialog = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        errorDialogAccept = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        playerLeftLabel = new javax.swing.JLabel();
        playerRightLabel = new javax.swing.JLabel();
        lPlayerScore = new javax.swing.JTextField();
        rPlayerScore = new javax.swing.JTextField();
        board2 = new Board(this);
        levelLabel = new javax.swing.JLabel();

        pauseMenu.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        pauseMenu.setTitle("Game paused");
        pauseMenu.setLocation(new java.awt.Point(0, 0));
        pauseMenu.setLocationByPlatform(true);
        pauseMenu.setMinimumSize(new java.awt.Dimension(398, 316));
        pauseMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pauseMenuComponentShown(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(1, 1, 1));
        jButton3.setForeground(new java.awt.Color(254, 254, 254));
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(1, 1, 1));
        jButton4.setForeground(new java.awt.Color(254, 254, 254));
        jButton4.setText("Resume");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(1, 1, 1));
        jButton5.setForeground(new java.awt.Color(254, 254, 254));
        jButton5.setText("Return to menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pauseMenuLayout = new javax.swing.GroupLayout(pauseMenu.getContentPane());
        pauseMenu.getContentPane().setLayout(pauseMenuLayout);
        pauseMenuLayout.setHorizontalGroup(
            pauseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pauseMenuLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(pauseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );

        pauseMenuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, jButton4, jButton5});

        pauseMenuLayout.setVerticalGroup(
            pauseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pauseMenuLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pauseMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, jButton4, jButton5});

        mainMenu.setTitle("Main menu");
        mainMenu.setBackground(new java.awt.Color(20, 43, 55));
        mainMenu.setIconImage(null);
        mainMenu.setLocationByPlatform(true);
        mainMenu.setMinimumSize(new java.awt.Dimension(800, 600));
        mainMenu.setResizable(false);
        mainMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                mainMenuComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                mainMenuComponentShown(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(1, 1, 1));
        jButton6.setForeground(new java.awt.Color(254, 254, 254));
        jButton6.setText("Configure");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(1, 1, 1));
        jButton7.setForeground(new java.awt.Color(254, 254, 254));
        jButton7.setText("Exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(1, 1, 1));
        jButton8.setForeground(new java.awt.Color(254, 254, 254));
        jButton8.setText("Play");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Authors: Krzysztof Anderson, Micha?? Malinowski");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 128)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Gun Game");

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu.getContentPane());
        mainMenu.getContentPane().setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainMenuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton6, jButton7, jButton8});

        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton6, jButton7, jButton8});

        jFileChooser1.setDialogTitle("Configuration");
        jFileChooser1.setFileFilter(new MyCustomFilter());
        jFileChooser1.setFileHidingEnabled(false);
        jFileChooser1.setSelectedFile(new java.io.File("/home/rudy/Code/2019L_JIMP2_git_gr3/java_proj/GunGame"));
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        playerNameDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        playerNameDialog.setTitle("Choose player names");
        playerNameDialog.setLocationByPlatform(true);
        playerNameDialog.setMinimumSize(new java.awt.Dimension(285, 148));
        playerNameDialog.setResizable(false);
        playerNameDialog.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                playerNameDialogComponentShown(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(250, 250, 250));
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Player 1");

        jLabel4.setBackground(new java.awt.Color(250, 250, 250));
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Player 2");

        playerLeftText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerLeftTextActionPerformed(evt);
            }
        });

        playerNameAccept.setBackground(new java.awt.Color(1, 1, 1));
        playerNameAccept.setForeground(new java.awt.Color(254, 254, 254));
        playerNameAccept.setText("Accept");
        playerNameAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerNameAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout playerNameDialogLayout = new javax.swing.GroupLayout(playerNameDialog.getContentPane());
        playerNameDialog.getContentPane().setLayout(playerNameDialogLayout);
        playerNameDialogLayout.setHorizontalGroup(
            playerNameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerNameDialogLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(playerNameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(playerNameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerLeftText, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(playerRightText))
                .addGap(18, 18, 18)
                .addComponent(playerNameAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        playerNameDialogLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {playerLeftText, playerRightText});

        playerNameDialogLayout.setVerticalGroup(
            playerNameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerNameDialogLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(playerNameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(playerNameAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(playerNameDialogLayout.createSequentialGroup()
                        .addGroup(playerNameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playerLeftText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(playerNameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playerRightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(30, 30, 30))
        );

        playerNameDialogLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {playerLeftText, playerRightText});

        errorDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        errorDialog.setTitle("Error!");
        errorDialog.setMinimumSize(new java.awt.Dimension(237, 150));
        errorDialog.setResizable(false);
        errorDialog.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                errorDialogComponentShown(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Error! Bad data.");

        errorDialogAccept.setBackground(new java.awt.Color(1, 1, 1));
        errorDialogAccept.setForeground(new java.awt.Color(254, 254, 254));
        errorDialogAccept.setText("Accept");
        errorDialogAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorDialogAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout errorDialogLayout = new javax.swing.GroupLayout(errorDialog.getContentPane());
        errorDialog.getContentPane().setLayout(errorDialogLayout);
        errorDialogLayout.setHorizontalGroup(
            errorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorDialogLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(errorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(errorDialogAccept)
                    .addComponent(jLabel5))
                .addGap(52, 52, 52))
        );
        errorDialogLayout.setVerticalGroup(
            errorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorDialogLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(errorDialogAccept)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gun Game");
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(1, 1, 1));
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Pause");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(1, 1, 1));
        jButton2.setForeground(new java.awt.Color(254, 254, 254));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        playerLeftLabel.setForeground(new java.awt.Color(254, 254, 254));
        playerLeftLabel.setText("Player 1 score:");

        playerRightLabel.setForeground(new java.awt.Color(254, 254, 254));
        playerRightLabel.setText("Player 2 score:");

        lPlayerScore.setEditable(false);
        lPlayerScore.setText("0");
        lPlayerScore.setFocusable(false);
        lPlayerScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lPlayerScoreActionPerformed(evt);
            }
        });

        rPlayerScore.setEditable(false);
        rPlayerScore.setText("0");
        rPlayerScore.setFocusable(false);
        rPlayerScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPlayerScoreActionPerformed(evt);
            }
        });

        board2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        board2.setFocusCycleRoot(true);

        javax.swing.GroupLayout board2Layout = new javax.swing.GroupLayout(board2);
        board2.setLayout(board2Layout);
        board2Layout.setHorizontalGroup(
            board2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 907, Short.MAX_VALUE)
        );
        board2Layout.setVerticalGroup(
            board2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        levelLabel.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        levelLabel.setForeground(new java.awt.Color(254, 254, 254));
        levelLabel.setText("Level 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerLeftLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lPlayerScore, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 314, 314)
                        .addComponent(levelLabel)
                        .addGap(279, 279, 279)
                        .addComponent(playerRightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rPlayerScore, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(board2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(547, 547, 547)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerLeftLabel)
                    .addComponent(playerRightLabel)
                    .addComponent(lPlayerScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rPlayerScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(board2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lPlayerScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lPlayerScoreActionPerformed

    }//GEN-LAST:event_lPlayerScoreActionPerformed

    private void rPlayerScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPlayerScoreActionPerformed

    }//GEN-LAST:event_rPlayerScoreActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int status = jFileChooser1.showSaveDialog(null);
        if (status == JFileChooser.APPROVE_OPTION) {
            try {
                board2.getWriter().writeFile(jFileChooser1.getSelectedFile().getAbsolutePath(), board2);
            } catch (FileNotFoundException ex) {
                System.out.println("Nie mo??na zapisa?? pliku w tej lokalizacji.");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        pauseMenu.dispose();
        this.setVisible(false);
        board2.timer.stop();
        board2.inserter.running = false;
        board2.reset();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        board2.timer.stop();
        board2.inserter.running = false;
        pauseMenu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pauseMenu.dispose();
        board2.requestFocusInWindow();
        board2.timer.start();
        board2.inserter.running = true;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        playerNameDialog.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int status = jFileChooser1.showOpenDialog(null);
        if (status == JFileChooser.APPROVE_OPTION) {
            board2.config = jFileChooser1.getSelectedFile();
            board2.read();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed

    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void playerLeftTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerLeftTextActionPerformed

    }//GEN-LAST:event_playerLeftTextActionPerformed

    private void playerNameAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerNameAcceptActionPerformed
        if (playerLeftText.getText().length() < 9) {
            Board.playerLeft.playerName = playerLeftText.getText();
        } else {
            errorDialog.setVisible(true);
            return;
        }
        if (playerRightText.getText().length() < 9) {
            Board.playerRight.playerName = playerRightText.getText();
        } else {
            errorDialog.setVisible(true);
            return;
        }
        playerNameDialog.dispose();
        mainMenu.dispose();
        this.getPlayerLeftLabel().setText(Board.playerLeft.playerName + " score");
        this.getPlayerRightLabel().setText(Board.playerRight.playerName + " score");
        this.levelLabel.setText("Level 0");
        this.setVisible(true);
        board2.timer.start();
        board2.inserter.running = true;
        board2.reset();
        board2.requestFocusInWindow();
    }//GEN-LAST:event_playerNameAcceptActionPerformed

    private void playerNameDialogComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_playerNameDialogComponentShown
        playerNameDialog.getContentPane().setBackground(Color.DARK_GRAY);
        playerLeftText.setText(Board.playerLeft.playerName);
        playerRightText.setText(Board.playerRight.playerName);
    }//GEN-LAST:event_playerNameDialogComponentShown

    private void errorDialogAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorDialogAcceptActionPerformed
        errorDialog.dispose();
    }//GEN-LAST:event_errorDialogAcceptActionPerformed

    private void mainMenuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_mainMenuComponentShown
        mainMenu.getContentPane().setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_mainMenuComponentShown

    private void pauseMenuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pauseMenuComponentShown
        pauseMenu.getContentPane().setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_pauseMenuComponentShown

    private void errorDialogComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_errorDialogComponentShown
        errorDialog.getContentPane().setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_errorDialogComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_formComponentShown

    private void mainMenuComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_mainMenuComponentHidden
        System.exit(0);
    }//GEN-LAST:event_mainMenuComponentHidden

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
            java.util.logging.Logger.getLogger(GunGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GunGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GunGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GunGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GunGame gunGame = new GunGame();
                gunGame.mainMenu.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pw.edu.pl.gungame.Board board2;
    private javax.swing.JDialog errorDialog;
    private javax.swing.JButton errorDialogAccept;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lPlayerScore;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JDialog mainMenu;
    private javax.swing.JDialog pauseMenu;
    private javax.swing.JLabel playerLeftLabel;
    private javax.swing.JTextField playerLeftText;
    private javax.swing.JButton playerNameAccept;
    private javax.swing.JDialog playerNameDialog;
    private javax.swing.JLabel playerRightLabel;
    private javax.swing.JTextField playerRightText;
    private javax.swing.JTextField rPlayerScore;
    // End of variables declaration//GEN-END:variables

    public JLabel getPlayerLeftLabel() {
        return playerLeftLabel;
    }

    public JLabel getPlayerRightLabel() {
        return playerRightLabel;
    }

    public JDialog getErrorDialog() {
        return errorDialog;
    }

    public JTextField getLeftPlayerText() {
        return lPlayerScore;
    }

    public JTextField getRightPlayerText() {
        return rPlayerScore;
    }

    public JLabel getLevel() {
        return levelLabel;
    }
}
