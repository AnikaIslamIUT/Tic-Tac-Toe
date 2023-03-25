
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameBoard {
    public static JPanel move_button_panel = new JPanel();
    public static JButton[] move_buttons = new JButton[9];
    public static String[] playerTypeMoveStore = new String[9] ;

    public GameBoard()
    {
        move_button_panel.setLayout(new GridLayout(3,3));
        move_button_panel.setBounds(0,100,500,500);
        move_button_panel.setBackground(new Color(255, 255, 255));

        //move_buttons
        for (int i=0;i<9;i++)
        {
            move_buttons[i] = new JButton();
            move_button_panel.add(move_buttons[i]);
            move_buttons[i].setBackground(Color.WHITE);
            move_buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            move_buttons[i].setFocusable(true);
            move_buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));

        }



        TicTacToe.frame.add(move_button_panel);

    }


}
