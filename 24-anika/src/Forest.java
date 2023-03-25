import javax.swing.*;
import java.awt.*;

public class Forest implements Theme {

    @Override
    public void changeTheme() {
        TicTacToe.frame.getContentPane().setBackground(new Color(102, 153, 0));
        TicTacToe.topBar_Title.setForeground(new Color(38, 77, 0));
        for (int i = 0; i < 3; i++) {
            ThemeOptions.theme_buttons[i].setBackground(new Color(204, 204, 0));
            ThemeOptions.theme_buttons[i].setForeground(new Color(0, 102, 102));

        }
        ThemeOptions.theme_title_panel.setBackground(new Color(102, 153, 0));
        ThemeOptions.themeTitle.setForeground(new Color(38, 77, 0));
        StartOptions.start_title_panel.setBackground(new Color(102, 153, 0));
        StartOptions.startTitle.setForeground(new Color(38, 77, 0));
        for (int i = 0; i < 2; i++) {
            StartOptions.start_buttons[i].setBackground(new Color(204, 204, 0));
            StartOptions.start_buttons[i].setForeground(new Color(0, 102, 102));
        }

        for (int i = 0; i < 9; i++) {

            GameBoard.move_buttons[i].setBackground(buttonColor());
            GameBoard.move_buttons[i].setBorder(BorderFactory.createLineBorder(new Color(32, 128, 0), 5));
            GameBoard.move_buttons[i].setForeground(new Color(0, 77, 0));


        }

    }

    @Override
    public Color buttonColor() {
        return new Color(102, 255, 102);
    }

    @Override
    public void humanMove(int humanPosition) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("rose.png"));
        Image img = imageIcon.getImage();
        Image newimg = img.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        GameBoard.move_buttons[humanPosition].setIcon(imageIcon);
    }

    @Override
    public void aiMove(int aiPosition) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("fruit.png"));
        Image img = imageIcon.getImage();
        Image newimg = img.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        GameBoard.move_buttons[aiPosition].setIcon(imageIcon);
    }

}
