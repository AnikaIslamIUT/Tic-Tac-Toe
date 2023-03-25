import javax.swing.*;
import java.awt.*;

public class Classic implements Theme {

    @Override
    public void changeTheme() {

        TicTacToe.frame.getContentPane().setBackground(new Color(250, 244, 244));
        TicTacToe.topBar_Title.setForeground(new Color(9, 9, 9));
        for (int i=0;i<3;i++)
        {
            ThemeOptions.theme_buttons[i].setBackground(new Color(142, 142, 142));
            ThemeOptions.theme_buttons[i].setForeground(new Color(9, 9, 9));
        }
        ThemeOptions.theme_title_panel.setBackground(new Color(250, 244, 244));
        ThemeOptions.themeTitle.setForeground(new Color(9, 9, 9));
        StartOptions.start_title_panel.setBackground(new Color(250, 244, 244));
        StartOptions.startTitle.setForeground(new Color(9, 9, 9));
        for (int i=0;i<2;i++)
        {
            StartOptions.start_buttons[i].setBackground(new Color(142, 142, 142));
            StartOptions.start_buttons[i].setForeground(new Color(9, 9, 9));
        }

        for (int i=0;i<9;i++)
        {

            GameBoard.move_buttons[i].setBackground(buttonColor());
            GameBoard.move_buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));

        }

    }

    @Override
    public Color buttonColor() {

        return Color.WHITE;
    }

    @Override
    public void humanMove( int humanPosition) {
        GameBoard.move_buttons[humanPosition].setText("X");

    }

    @Override
    public void aiMove( int aiPosition) {
        GameBoard.move_buttons[aiPosition].setText("O");
    }


}
