import java.awt.*;

public class GameOver {
    public void gameEnd(int a, int b, int c,String player)
    {
        GameBoard.move_buttons[a].setBackground(new Color(128, 111, 128));
        GameBoard.move_buttons[b].setBackground(new Color(128, 111, 128));
        GameBoard. move_buttons[c].setBackground(new Color(128, 111, 128));
        for(int i=0;i<9;i++)
        {
            GameBoard.move_buttons[i].setEnabled(false);
        }
        TicTacToe.topBar_Title.setText(player + " Win!!!");

    }
}
