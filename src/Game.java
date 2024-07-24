
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import static java.lang.Thread.sleep;
import java.util.TimerTask;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.io.FileWriter;
import java.io.IOException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usitha
 */
public class Game extends javax.swing.JFrame {

    
     boolean isFirstRun = false;
        boolean responsestate = false;
        int Counter = 0;
       MyTimer myTimer = new MyTimer();
      //  File file = new File("filename.txt");
        
       
    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
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
    public void isFirstRuncheck(){
           if(!responsestate){
//               if ( JOptionPane.showConfirmDialog(this, "Do you want to start","Puzzle Game",
//            JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
//    {
                    myTimer.startTimer();
//        }
//                else if ( JOptionPane.showConfirmDialog(this, "Do you want to start","Puzzle Game",
//        JOptionPane.YES_NO_OPTION)== JOptionPane.NO_OPTION)
//       {
//          Main jMain = new Main();
//          jMain.show();
//          dispose();
//
//        }
      
     }
  
         responsestate = true;    
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
  
       if(myTimer.time != null ){
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

      if (b1 =="1" && b2 == "2" && b3 == "3" && 
              b4 == "4" && b5 == "5" && b6 == "6" &&
              b7 == "7" && b8 == "8" && b9 == "9" && 
              b10 == "10" && b11 == "11" &&
              b12 == "12" && b13 == "13" && 
              b14 == "14" && b15 == "15" ) 
      {
          myTimer.stopTimer();
         JOptionPane.showMessageDialog(this, "You win the Game","Puzzle Game",
                JOptionPane.INFORMATION_MESSAGE);
         
         Ranks jf4 = new Ranks();
        jf4.show();
        dispose();
         try {
      FileWriter myWriter = new FileWriter("filename.txt",true);
      myWriter.append(PlayerName.getText().substring(6) + " " + Counter + " " + myTimer.time +  " " + "Finished" + "\n" );
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      }
      
      
       }
     
   }
   public void Count(){
      Counter = Counter + 1;
      ClickLabel1.setText(Integer.toString(Counter));
      if (Counter == 30){
          myTimer.stopTimer(); 
        JOptionPane.showMessageDialog(null, "Your Count is over" );
        Ranks jf4 = new Ranks();
        jf4.show();
        dispose();
          try {
      FileWriter myWriter = new FileWriter("filename.txt",true);
      myWriter.append(PlayerName.getText().substring(6) + " " + Counter + " " + myTimer.time + " " + "Unfinished" + "\n");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
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
   

   public class MyTimer {

    private Timer timer;
    private int milliseconds;
    private int seconds = 0;
    private int minutes = 0;
    // private int hours = 0;
    String time;

    public void startTimer() {
        timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milliseconds++;
                if (milliseconds == 60) {
                    milliseconds = 0;
                    seconds++;
                }
                if (seconds == 60) {
                       seconds = 0;
                       minutes++;
                   }
                if (minutes == 1) { // Auto-stop after 3 minutes
                        stopTimer();
                        JOptionPane.showMessageDialog(null, "Your time is over","title", JOptionPane.INFORMATION_MESSAGE);
                        Ranks jf4 = new Ranks();
                       jf4.show();
                      dispose();
                     try {
         FileWriter myWriter = new FileWriter("filename.txt",true);
      myWriter.append(PlayerName.getText().substring(6) + " " + Counter + " " + myTimer.time + " " + "Unfinished" + "\n");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e1) {
      System.out.println("An error occurred.");
      e1.printStackTrace();
    }
                }
                int remainingSeconds = (3 * 60) - (minutes * 60 + seconds);
                timeLabel1.setText(String.format("%02d:%02d", remainingSeconds / 60, remainingSeconds % 60));
                time = String.format("%02d:%02d:%02d", minutes, seconds, milliseconds);
                timeLabel.setText(String.format("%02d:%02d:%02d", minutes, seconds, milliseconds));
            }
        });

        timer.start();
    }

    public void stopTimer() {
        if (timer != null) {
            timer.stop(); // Stop the timer
        }
    }
    public void resetTimer() {
        timer.stop();
        milliseconds = 0;
        seconds = 0;
        minutes = 0;
        timeLabel.setText(String.format("%02d:%02d:%02d", minutes, seconds, milliseconds));
    }
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
        jbtnSolution = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        timeLabel1 = new javax.swing.JLabel();
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
        jbtnemp = new javax.swing.JButton();
        jbtnNum14 = new javax.swing.JButton();
        jbtnNum13 = new javax.swing.JButton();
        jbtnNum15 = new javax.swing.JButton();
        PlayerName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ClickLabel1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Puzzle Game");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Puzzle Game");

        jbtnSolution.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnSolution.setText("New Game");
        jbtnSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSolutionActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        timeLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        timeLabel1.setText("00 : 00");

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
        jbtnNum2.setText("2");
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
        jbtnNum1.setText("1");
        jbtnNum1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbtnNum1MouseReleased(evt);
            }
        });
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
        jbtnNum12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum12ActionPerformed(evt);
            }
        });

        jbtnNum10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNum10.setText("10");
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

        jbtnemp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnempActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnemp, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        PlayerName.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("/ 30");

        ClickLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ClickLabel1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ClickLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickLabel1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Moves");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton2.setText("Save To LeaderBoard");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        timeLabel.setText("00 : 00 : 00");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Remaining Time :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PlayerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jbtnSolution)
                                    .addGap(101, 101, 101)
                                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(152, 152, 152)
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(timeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ClickLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(PlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnSolution)
                            .addComponent(jbtnExit))
                        .addGap(24, 24, 24)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClickLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSolutionActionPerformed
        Main jMain = new Main();
       
    
         int response = JOptionPane.showConfirmDialog(this,"Are You Sure ?","CONFIRMDIALOGBOX",JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_OPTION==response){
            jMain.show();
            dispose();
         
        }
    }//GEN-LAST:event_jbtnSolutionActionPerformed

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
        Count();
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum3ActionPerformed

    private void jbtnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum2ActionPerformed
        EmptySpotChecker(jbtnNum2, jbtnNum1);
        EmptySpotChecker(jbtnNum2, jbtnNum3);
        EmptySpotChecker(jbtnNum2, jbtnNum6);
        playSound("Click.wav");
        Count();
        SolutionChecker();
    }//GEN-LAST:event_jbtnNum2ActionPerformed

    private void jbtnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum4ActionPerformed
        EmptySpotChecker(jbtnNum4, jbtnNum3);
        EmptySpotChecker(jbtnNum4, jbtnNum8);
        playSound("Click.wav");
        Count();
        SolutionChecker();
        isFirstRuncheck();
    }//GEN-LAST:event_jbtnNum4ActionPerformed

    private void jbtnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum1ActionPerformed
        EmptySpotChecker(jbtnNum1, jbtnNum2);
        EmptySpotChecker(jbtnNum1, jbtnNum5);
        playSound("Click.wav");
        Count();
        SolutionChecker();
        isFirstRuncheck();
    }//GEN-LAST:event_jbtnNum1ActionPerformed

    private void jbtnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum7ActionPerformed
        EmptySpotChecker(jbtnNum7, jbtnNum3);
        EmptySpotChecker(jbtnNum7, jbtnNum6);
        EmptySpotChecker(jbtnNum7, jbtnNum8);
        EmptySpotChecker(jbtnNum7, jbtnNum11);
        playSound("Click.wav");
        Count();
       SolutionChecker();
        isFirstRuncheck();
    }//GEN-LAST:event_jbtnNum7ActionPerformed

    private void jbtnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum6ActionPerformed
        EmptySpotChecker(jbtnNum6, jbtnNum2);
        EmptySpotChecker(jbtnNum6, jbtnNum5);
        EmptySpotChecker(jbtnNum6, jbtnNum7);
        EmptySpotChecker(jbtnNum6, jbtnNum10);
        playSound("Click.wav");
        Count();
       SolutionChecker();
        isFirstRuncheck();
    }//GEN-LAST:event_jbtnNum6ActionPerformed

    private void jbtnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum8ActionPerformed
        EmptySpotChecker(jbtnNum8, jbtnNum4);
        EmptySpotChecker(jbtnNum8, jbtnNum7);
        EmptySpotChecker(jbtnNum8, jbtnNum12);
        playSound("Click.wav");
        Count();
        SolutionChecker();
        isFirstRuncheck();
    }//GEN-LAST:event_jbtnNum8ActionPerformed

    private void jbtnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum5ActionPerformed
        EmptySpotChecker(jbtnNum5, jbtnNum1);
        EmptySpotChecker(jbtnNum5, jbtnNum6);
        EmptySpotChecker(jbtnNum5, jbtnNum9);
        playSound("Click.wav");
        Count();
        SolutionChecker();
        isFirstRuncheck();
    }//GEN-LAST:event_jbtnNum5ActionPerformed

    private void jbtnNum12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum12ActionPerformed
        EmptySpotChecker(jbtnNum12, jbtnNum8);
        EmptySpotChecker(jbtnNum12, jbtnNum11);
        EmptySpotChecker(jbtnNum12,  jbtnemp);
        playSound("Click.wav");
        Count();
        SolutionChecker();
        isFirstRuncheck();

    }//GEN-LAST:event_jbtnNum12ActionPerformed

    private void jbtnNum10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum10ActionPerformed
        EmptySpotChecker(jbtnNum10, jbtnNum6);
        EmptySpotChecker(jbtnNum10, jbtnNum9);
        EmptySpotChecker(jbtnNum10, jbtnNum11);
        EmptySpotChecker(jbtnNum10, jbtnNum14);
        playSound("Click.wav");
        Count();
        SolutionChecker();
        isFirstRuncheck();
    }//GEN-LAST:event_jbtnNum10ActionPerformed

    private void jbtnNum11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum11ActionPerformed
        EmptySpotChecker(jbtnNum11, jbtnNum7);
        EmptySpotChecker(jbtnNum11, jbtnNum10);
        EmptySpotChecker(jbtnNum11, jbtnNum12);
        EmptySpotChecker(jbtnNum11, jbtnNum15);
        playSound("Click.wav");
        Count();
        SolutionChecker();
        isFirstRuncheck();
    }//GEN-LAST:event_jbtnNum11ActionPerformed

    private void jbtnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum9ActionPerformed
        EmptySpotChecker(jbtnNum9, jbtnNum5);
        EmptySpotChecker(jbtnNum9, jbtnNum10);
        EmptySpotChecker(jbtnNum9, jbtnNum13);
        playSound("Click.wav");
        Count();
        SolutionChecker();
        isFirstRuncheck();
    }//GEN-LAST:event_jbtnNum9ActionPerformed

    private void jbtnempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnempActionPerformed
        EmptySpotChecker(jbtnemp, jbtnNum12);
        EmptySpotChecker(jbtnemp, jbtnNum15);
        isFirstRuncheck();
    }//GEN-LAST:event_jbtnempActionPerformed

    private void jbtnNum14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum14ActionPerformed
        EmptySpotChecker(jbtnNum14, jbtnNum10);
        EmptySpotChecker(jbtnNum14, jbtnNum13);
        EmptySpotChecker(jbtnNum14, jbtnNum15);
        playSound("Click.wav");
        Count();
        SolutionChecker();
        isFirstRuncheck();
    }//GEN-LAST:event_jbtnNum14ActionPerformed

    private void jbtnNum13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum13ActionPerformed
        EmptySpotChecker(jbtnNum13, jbtnNum9);
        EmptySpotChecker(jbtnNum13, jbtnNum14);
        playSound("Click.wav");
        Count();
        SolutionChecker();
        isFirstRuncheck();
    }//GEN-LAST:event_jbtnNum13ActionPerformed

    private void jbtnNum15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum15ActionPerformed
        EmptySpotChecker(jbtnNum15, jbtnNum11);
        EmptySpotChecker(jbtnNum15, jbtnNum14);
        EmptySpotChecker(jbtnNum15, jbtnemp);
        playSound("Click.wav");
        Count();
        SolutionChecker();
        isFirstRuncheck();
    }//GEN-LAST:event_jbtnNum15ActionPerformed

    private void ClickLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickLabel1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        if(myTimer.time != null){
        Ranks jf4 = new Ranks();
        jf4.show();
        dispose();
         myTimer.stopTimer();
            try {
      FileWriter myWriter = new FileWriter("filename.txt",true);
      myWriter.append(PlayerName.getText().substring(6) + " " + Counter + " " + myTimer.time + " " + "Unfinished" + "\n");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Start Game" );
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
    }//GEN-LAST:event_formWindowActivated

    private void jbtnNum1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNum1MouseReleased
      
    }//GEN-LAST:event_jbtnNum1MouseReleased

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClickLabel1;
    public javax.swing.JLabel PlayerName;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JButton jbtnSolution;
    private javax.swing.JButton jbtnemp;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel timeLabel1;
    // End of variables declaration//GEN-END:variables
}
