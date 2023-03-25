import java.awt.*;

public class AIMoveUIChange {
    int aiPositionIndex;
    CheckWin checkWin = new CheckWin();
    Theme classic = new Classic();
    Theme forest  = new Forest();
    Theme contrast = new Contrast();

    void uIChangeForAIMove(int aiPositionIndex)
    {
        GameBoard.move_buttons[aiPositionIndex].setForeground(new Color(3, 3, 3));
        if(ThemeOptions.themeType=="Forest")
        {
            forest.aiMove(aiPositionIndex);

        }
        else if(ThemeOptions.themeType=="Contrast")
        {
            contrast.aiMove(aiPositionIndex);
        }
        else
        {
            classic.aiMove(aiPositionIndex);
        }
        GameBoard.playerTypeMoveStore[aiPositionIndex]="AI";
        TicTacToe.player1_turn=true;
        TicTacToe.topBar_Title.setText("Your Turn");
        checkWin.winnerCheck("Ai");
    }
}
