
import java.io.File;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usitha
 */
public class Normal extends javax.swing.JFrame {

    /**
     * Creates new form Normal
     */
   
    public Normal() {
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

        jLabel1 = new javax.swing.JLabel();
        jbtnExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jbtnNum3 = new javax.swing.JButton();
        jbtnNum2 = new javax.swing.JButton();
        jbtnNum4 = new javax.swing.JButton();
        jbtnNum1 = new javax.swing.JButton();
        jbtnNum7 = new javax.swing.JButton();
        jbtnNum6 = new javax.swing.JButton();
        jbtnNum8 = new javax.swing.JButton();
        jbtnNum5 = new javax.swing.JButton();
        jbtnNum12 = new javax.swing.JButton();
        jbtnNum10 = new javax.swing.JButton();
        jbtnNum11 = new javax.swing.JButton();
        jbtnNum9 = new javax.swing.JButton();
        jbtnNum14 = new javax.swing.JButton();
        jbtnNum13 = new javax.swing.JButton();
        jbtnNum15 = new javax.swing.JButton();
        jbtnemp = new javax.swing.JButton();
        PlayerName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("                 Puzzle Game");

        jbtnExit.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtnNum3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum3.setText("3");
        jbtnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum3ActionPerformed(evt);
            }
        });

        jbtnNum2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum2.setText("1");
        jbtnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum2ActionPerformed(evt);
            }
        });

        jbtnNum4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum4.setText("4");
        jbtnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum4ActionPerformed(evt);
            }
        });

        jbtnNum1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum1.setText("2");
        jbtnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum1ActionPerformed(evt);
            }
        });

        jbtnNum7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum7.setText("7");
        jbtnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum7ActionPerformed(evt);
            }
        });

        jbtnNum6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum6.setText("6");
        jbtnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum6ActionPerformed(evt);
            }
        });

        jbtnNum8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum8.setText("8");
        jbtnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum8ActionPerformed(evt);
            }
        });

        jbtnNum5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum5.setText("5");
        jbtnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum5ActionPerformed(evt);
            }
        });

        jbtnNum12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum12.setText("12");
        jbtnNum12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbtnNum12MouseReleased(evt);
            }
        });
        jbtnNum12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum12ActionPerformed(evt);
            }
        });

        jbtnNum10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum10.setText("10");
        jbtnNum10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbtnNum10MouseReleased(evt);
            }
        });
        jbtnNum10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum10ActionPerformed(evt);
            }
        });

        jbtnNum11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum11.setText("11");
        jbtnNum11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum11ActionPerformed(evt);
            }
        });

        jbtnNum9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum9.setText("9");
        jbtnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum9ActionPerformed(evt);
            }
        });

        jbtnNum14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum14.setText("14");
        jbtnNum14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum14ActionPerformed(evt);
            }
        });

        jbtnNum13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum13.setText("13");
        jbtnNum13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum13ActionPerformed(evt);
            }
        });

        jbtnNum15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum15.setText("15");
        jbtnNum15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum15ActionPerformed(evt);
            }
        });

        jbtnemp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnempActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnNum13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnNum14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbtnNum15, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnemp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbtnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jbtnNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbtnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jbtnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbtnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jbtnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnNum14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnNum15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnNum13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnemp, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        PlayerName.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setText("Shuffle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton3.setText("Main Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(PlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
  /*public void shuffle(){
      int[] bnum = new int[15];
      int i, j, rowchecker;
      Boolean flag = false;
      
      i = 1;
      do 
      {
          Random rnd = new Random();
          rowchecker = rnd.nextInt((15) + 1);
          
          for( j = 1; j <= i; j++){
              if (bnum[j] <= rowchecker){
                  flag = true;
                  break;
              }
          }
          if(flag == true)
          {
              flag = false;
          }
          else
          {
              bnum[i] = rowchecker;
              i = i + 1;
          }
      }
      while(i<=15);
      jbtnNum1.setText(Integer.toString(bnum[1]));
       jbtnNum2.setText(Integer.toString(bnum[2]));
       jbtnNum3.setText(Integer.toString(bnum[3]));
       jbtnNum4.setText(Integer.toString(bnum[4]));
       jbtnNum5.setText(Integer.toString(bnum[5]));
       jbtnNum6.setText(Integer.toString(bnum[6]));
       jbtnNum7.setText(Integer.toString(bnum[7]));
       jbtnNum8.setText(Integer.toString(bnum[8]));
       jbtnNum9.setText(Integer.toString(bnum[9]));
       jbtnNum10.setText(Integer.toString(bnum[10]));
        jbtnNum11.setText(Integer.toString(bnum[11]));
       jbtnNum12.setText(Integer.toString(bnum[12]));
       jbtnNum13.setText(Integer.toString(bnum[13]));
       jbtnNum14.setText(Integer.toString(bnum[14]));
       jbtnNum15.setText(Integer.toString(bnum[15]));
       jbtnemp.setText("");
  }*/
    
    public void shufflePuzzle(JButton[] buttons) {
  Random random = new Random();
  for (int i = 0; i < buttons.length; i++) {
    // Swap current tile with a random tile (excluding itself)
    int randomIndex = random.nextInt(buttons.length - 1);
    if (randomIndex >= i) {
      randomIndex++; // Avoid swapping with itself if chosen as random
    }
    JButton temp = buttons[i];
    buttons[i] = buttons[randomIndex];
    buttons[randomIndex] = temp;
  }
}
        
    
        public void playSound(String soundFileName) {
  try {
    // Get the audio input stream from the sound file
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFileName));
    // Get a clip to play the audio
    Clip clip = AudioSystem.getClip();
    // Open the clip with the audio stream
    clip.open(audioInputStream);
    // Start playback
    clip.start();
  } catch (Exception e) {
    e.printStackTrace();  // Handle any exceptions during sound playback
  }
}
        public void EmptySpotChecker(JButton button1, JButton button2) {
    if (button2.getText().isEmpty()) { // Use isEmpty() for empty string check
        String tempText = button1.getText(); // Store current text of button1
        button1.setText(""); // Set button1 text to empty
        button2.setText(tempText); // Set button2 text to previously stored value
    }
}
       public void SolutionChecker()
   {
       String b1 = jbtnNum1.getText();
       String b2 = jbtnNum2.getText();
       String b3 = jbtnNum3.getText();
       String b4 = jbtnNum4.getText();
       String b5 = jbtnNum5.getText();
       String b6 = jbtnNum6.getText();
       String b7 = jbtnNum7.getText();
       String b8 = jbtnNum8.getText();
       String b9 = jbtnNum9.getText();
       String b10 = jbtnNum10.getText();
       String b11 = jbtnNum11.getText();
       String b12 = jbtnNum12.getText();
       String b13 = jbtnNum13.getText();
       String b14 = jbtnNum14.getText();
       String b15 = jbtnNum15.getText();

      if ("1".equals(b1) && "2".equals(b2) && "3".equals(b3) && 
              "4".equals(b4) && "5".equals(b5) && "6".equals(b6) &&
              "7".equals(b7) && "8".equals(b8) && "9".equals(b9) && 
              "10".equals(b10) && "11".equals(b11) &&
              "12".equals(b12) && "13".equals(b13) &&
              "14".equals(b14) && 
              "15".equals(b15) ) 
      {
          JOptionPane.showMessageDialog(this, "You win the Game","Puzzle Game",
                  JOptionPane.INFORMATION_MESSAGE);
      }
   }
   public void Solution(){
       jbtnNum1.setText("1");
        jbtnNum2.setText("2");
        jbtnNum3.setText("3");
        jbtnNum4.setText("4");
        jbtnNum5.setText("5");
        jbtnNum6.setText("6");
        jbtnNum7.setText("7");
        jbtnNum8.setText("8");
        jbtnNum9.setText("9");
        jbtnNum10.setText("10");
        jbtnNum11.setText("11");
        jbtnNum12.setText("12");
        jbtnNum13.setText("13");
        jbtnNum14.setText("14");
        jbtnNum15.setText("15");
       jbtnemp.setText("");      
   }
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        JFrame frame = new JFrame("Exit");
        if ( JOptionPane.showConfirmDialog(frame, "Do you want to exit","Puzzle Game",
            JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum3ActionPerformed
        EmptySpotChecker(jbtnNum3, jbtnNum2);
        EmptySpotChecker(jbtnNum3, jbtnNum4);
        EmptySpotChecker(jbtnNum3, jbtnNum7);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum3ActionPerformed

    private void jbtnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum2ActionPerformed
        EmptySpotChecker(jbtnNum2, jbtnNum1);
        EmptySpotChecker(jbtnNum2, jbtnNum3);
        EmptySpotChecker(jbtnNum2, jbtnNum6);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum2ActionPerformed

    private void jbtnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum4ActionPerformed
        EmptySpotChecker(jbtnNum4, jbtnNum3);
        EmptySpotChecker(jbtnNum4, jbtnNum8);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum4ActionPerformed

    private void jbtnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum1ActionPerformed
        EmptySpotChecker(jbtnNum1, jbtnNum2);
        EmptySpotChecker(jbtnNum1, jbtnNum5);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum1ActionPerformed

    private void jbtnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum7ActionPerformed
        EmptySpotChecker(jbtnNum7, jbtnNum3);
        EmptySpotChecker(jbtnNum7, jbtnNum6);
        EmptySpotChecker(jbtnNum7, jbtnNum8);
        EmptySpotChecker(jbtnNum7, jbtnNum11);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum7ActionPerformed

    private void jbtnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum6ActionPerformed
        EmptySpotChecker(jbtnNum6, jbtnNum2);
        EmptySpotChecker(jbtnNum6, jbtnNum5);
        EmptySpotChecker(jbtnNum6, jbtnNum7);
        EmptySpotChecker(jbtnNum6, jbtnNum10);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum6ActionPerformed

    private void jbtnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum8ActionPerformed
        EmptySpotChecker(jbtnNum8, jbtnNum4);
        EmptySpotChecker(jbtnNum8, jbtnNum7);
        EmptySpotChecker(jbtnNum8, jbtnNum12);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum8ActionPerformed

    private void jbtnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum5ActionPerformed
        EmptySpotChecker(jbtnNum5, jbtnNum1);
        EmptySpotChecker(jbtnNum5, jbtnNum6);
        EmptySpotChecker(jbtnNum5, jbtnNum9);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum5ActionPerformed

    private void jbtnNum12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum12ActionPerformed
        EmptySpotChecker(jbtnNum12, jbtnNum8);
        EmptySpotChecker(jbtnNum12, jbtnNum11);
        EmptySpotChecker(jbtnNum12,  jbtnemp);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum12ActionPerformed

    private void jbtnNum10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum10ActionPerformed
        EmptySpotChecker(jbtnNum10, jbtnNum6);
        EmptySpotChecker(jbtnNum10, jbtnNum9);
        EmptySpotChecker(jbtnNum10, jbtnNum11);
        EmptySpotChecker(jbtnNum10, jbtnNum14);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum10ActionPerformed

    private void jbtnNum11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum11ActionPerformed
        EmptySpotChecker(jbtnNum11, jbtnNum7);
        EmptySpotChecker(jbtnNum11, jbtnNum10);
        EmptySpotChecker(jbtnNum11, jbtnNum12);
        EmptySpotChecker(jbtnNum11, jbtnNum15);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum11ActionPerformed

    private void jbtnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum9ActionPerformed
        EmptySpotChecker(jbtnNum9, jbtnNum5);
        EmptySpotChecker(jbtnNum9, jbtnNum10);
        EmptySpotChecker(jbtnNum9, jbtnNum13);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum9ActionPerformed

    private void jbtnempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnempActionPerformed
        EmptySpotChecker(jbtnemp, jbtnNum12);
        EmptySpotChecker(jbtnemp, jbtnNum15);
    }//GEN-LAST:event_jbtnempActionPerformed

    private void jbtnNum14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum14ActionPerformed
        EmptySpotChecker(jbtnNum14, jbtnNum10);
        EmptySpotChecker(jbtnNum14, jbtnNum13);
        EmptySpotChecker(jbtnNum14, jbtnNum15);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum14ActionPerformed

    private void jbtnNum13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum13ActionPerformed
        EmptySpotChecker(jbtnNum13, jbtnNum9);
        EmptySpotChecker(jbtnNum13, jbtnNum14);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum13ActionPerformed

    private void jbtnNum15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum15ActionPerformed
        EmptySpotChecker(jbtnNum15, jbtnNum11);
        EmptySpotChecker(jbtnNum15, jbtnNum14);
        EmptySpotChecker(jbtnNum15, jbtnemp);
        playSound("Click.wav");
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Main jf1 = new Main();
        int response = JOptionPane.showConfirmDialog(this,"Are You Sure ?","CONFIRMDIALOGBOX",JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_OPTION==response){
            jf1.show();
            dispose();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbtnNum12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNum12MouseReleased
       
    }//GEN-LAST:event_jbtnNum12MouseReleased

    private void jbtnNum10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNum10MouseReleased
       SolutionChecker(); 
    }//GEN-LAST:event_jbtnNum10MouseReleased

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
            java.util.logging.Logger.getLogger(Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Normal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel PlayerName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnNum1;
    private javax.swing.JButton jbtnNum10;
    private javax.swing.JButton jbtnNum11;
    private javax.swing.JButton jbtnNum12;
    private javax.swing.JButton jbtnNum13;
    private javax.swing.JButton jbtnNum14;
    private javax.swing.JButton jbtnNum15;
    private javax.swing.JButton jbtnNum2;
    private javax.swing.JButton jbtnNum3;
    private javax.swing.JButton jbtnNum4;
    private javax.swing.JButton jbtnNum5;
    private javax.swing.JButton jbtnNum6;
    private javax.swing.JButton jbtnNum7;
    private javax.swing.JButton jbtnNum8;
    private javax.swing.JButton jbtnNum9;
    private javax.swing.JButton jbtnemp;
    // End of variables declaration//GEN-END:variables
}
