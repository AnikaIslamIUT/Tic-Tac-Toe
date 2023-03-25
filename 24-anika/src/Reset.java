import java.awt.*;

public class Reset {
    Theme classic = new Classic();
    Theme forest  = new Forest();
    Theme contrast = new Contrast();
    void ResetGameBoard()
    {
        for(int i=0;i<9;i++)
        {
            GameBoard.move_buttons[i].setEnabled(true);
            GameBoard.move_buttons[i].setText("");
            GameBoard.move_buttons[i].setIcon(null);
            GameBoard.playerTypeMoveStore[i]= "";

        }
        if(ThemeOptions.themeType=="Forest")
        {
            forest.changeTheme();

        }
        else if(ThemeOptions.themeType=="Contrast")
        {
            contrast.changeTheme();
        }
        else
        {
            classic.changeTheme();
        }

        TicTacToe.playerMoveCount=0;
    }
}
