import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stopwatch implements ActionListener {

    JFrame frame = new JFrame();
    JButton startButton = new JButton("START");
    JButton resetButton = new JButton("RESET");
    JLabel timeLabel = new JLabel();
    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;

    int millisecond = 0; //
    boolean started = false;
    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);
    String millisecond_string = String.format("%02d", millisecond); //

    Timer timer = new Timer(1, new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            elapsedTime = elapsedTime + 1000; //
            millisecond = (elapsedTime / 1000) % 60 ; //
            seconds = (elapsedTime / 60000) % 60;
            minutes = (elapsedTime / 3600000) % 60;
            millisecond_string = String.format("%02d", millisecond);
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);
            timeLabel.setText( minutes_string + ":" + seconds_string + ":" + millisecond_string);

        }

    });


    Stopwatch() {

        timeLabel.setText(minutes_string + ":" + seconds_string + ":" + millisecond_string);
        startButton.addActionListener(this);
        resetButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == startButton) {
            start();
        }
        if (e.getSource() == resetButton) {
            reset();
        }


    }

    void start() {
        timer.start();
    }

    void stop() {
        timer.stop();
    }

    void reset() {
        timer.stop();
        elapsedTime = 0;
        millisecond = 0;
        seconds = 0;
        minutes = 0;
        millisecond_string = String.format("%02d", millisecond);
        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);

        timeLabel.setText(minutes_string + ":" + seconds_string + ":" + millisecond_string);
    }

}
