import javax.swing.*;
import java.awt.*;

public class Contrast implements Theme {
    //JFrame frame= new JFrame();

    @Override
    public void changeTheme() {
        TicTacToe.frame.getContentPane().setBackground(new Color(75, 75, 74));
        TicTacToe.topBar_Title.setForeground(new Color(203, 203, 198, 243));
        for (int i=0;i<3;i++)
        {
            ThemeOptions.theme_buttons[i].setBackground(new Color(203, 203, 198));
            ThemeOptions.theme_buttons[i].setForeground(new Color(80, 77, 77));
        }
        ThemeOptions.theme_title_panel.setBackground(new Color(75, 75, 74));
        ThemeOptions.themeTitle.setForeground(new Color(203, 203, 198));
        StartOptions.start_title_panel.setBackground(new Color(75, 75, 74));
        StartOptions.startTitle.setForeground(new Color(203, 203, 198));
        for (int i=0;i<2;i++)
        {
            StartOptions.start_buttons[i].setBackground(new Color(203, 203, 198));
            StartOptions.start_buttons[i].setForeground(new Color(80, 77, 77));
        }

        for (int i=0;i<9;i++)
        {

            GameBoard.move_buttons[i].setBackground(buttonColor());
            GameBoard.move_buttons[i].setBorder(BorderFactory.createLineBorder(new Color(155, 158, 155), 5));
            GameBoard.move_buttons[i].setForeground(new Color(17, 17, 17));

        }

    }

    @Override
    public Color buttonColor() {

        return new Color(82, 80, 80);
    }

    @Override
    public void humanMove( int humanPosition) {

        GameBoard.move_buttons[humanPosition].setBackground(new Color(0, 0, 0));

    }

    @Override
    public void aiMove( int aiPosition) {
        GameBoard.move_buttons[aiPosition].setBackground(new Color(250, 250, 250));
    }

}
