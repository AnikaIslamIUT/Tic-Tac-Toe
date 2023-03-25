import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartOptions implements GameOptionPanel {
    //JFrame TicTacToe.frame= new JFrame();
    public static JPanel start_title_panel= new JPanel();
    public static JLabel startTitle;
    public static JPanel start_type=new JPanel();
    public static JButton[] start_buttons= new JButton[2];
    public static JButton randomAiStart,defensiveAiStart;
    StartButtonUiDesign startButtonUIDesign = new StartButtonUiDesign();
    Reset reset = new Reset();
    PlayerMove playerMove= new PlayerMove();



    @Override
    public void optionTitle() {
        startTitle = new JLabel();
        startTitle.setForeground(new Color(9, 9, 9));
        startTitle.setFont(new Font("Ariel",Font.BOLD,30));
        startTitle.setHorizontalAlignment(JLabel.CENTER);
        startTitle.setText("Start");

        start_title_panel.setLayout(new BorderLayout());
        start_title_panel.setBounds(600,380,100,30);
        start_title_panel.setBackground(new Color(250, 244, 244));
        start_title_panel.add(startTitle);

        TicTacToe.frame.add(start_title_panel);


    }

    @Override
    public void options() {
        start_type.setLayout(new GridLayout(2,1));
        start_type.setBounds(520,420,300,90);

        for (int i=0;i<2;i++)
        {

            startButtonUIDesign.start_Button_UI_Design(start_buttons,i);
        }
        randomAiStart = new JButton();
        randomAiStart = start_buttons[0];
        randomAiStart.setText("Start With Random AI");
        start_type.add(randomAiStart);

        randomAiStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlayerMove.aiType="Random";
                reset.ResetGameBoard();
                playerMove.move();

            }
        });

        defensiveAiStart = new JButton();
        defensiveAiStart = start_buttons[1];
        defensiveAiStart.setText("Start With Defensive AI");
        start_type.add( defensiveAiStart);
        defensiveAiStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlayerMove.aiType="Defensive";
                reset.ResetGameBoard();
                playerMove.move();
            }
        });

        TicTacToe.frame.add(start_type);

    }


}
