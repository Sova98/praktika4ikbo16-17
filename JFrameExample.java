import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameExample extends JFrame{
    int milanScore = 0;
    int madridScore = 0;

    JLabel resultLabel = new JLabel ("Result: 0 X 0");
    JLabel lastLabel = new JLabel ("Last Scorer: N/A");
    JLabel winnerLabel = new JLabel ("Winner: DRAW");
    JButton milanBtn = new JButton("AC Milan");
    JButton madridBtn = new JButton("Real Madrid");

    public JFrameExample(){
        setLayout(new FlowLayout());
        setSize(600,200);
        add(resultLabel);
        add(lastLabel);
        add(winnerLabel);
        add(milanBtn);
        add(madridBtn);

        milanBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                milanScore ++;
                resultLabel.setText("Result: " + milanScore + " X " + madridScore);
                lastLabel.setText("Last Scorer: AC Milan");
                setWinner();
            }
        });

        madridBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                madridScore++;
                resultLabel.setText("Result: " + milanScore + " X " + madridScore);
                lastLabel.setText("Last Scorer: Real Madrid");
                setWinner();
            }
        });

        setVisible(true);
    }

    public void setWinner(){
        if(milanScore > madridScore){
            winnerLabel.setText("winnerLabel: AC Milan");
        }
        else{
            winnerLabel.setText("winnerLabel: Real Madrid");
        }
    }

    public static void main(String[]args)
    {
        new JFrameExample();
    }
}
