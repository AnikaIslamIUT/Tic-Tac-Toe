import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckWinTest {

    TicTacToe ticTacToe= new TicTacToe();
    CheckWin checkWin= new CheckWin();
    AiMove defensiveAi = new DefensiveAi();
    @Test
    void Check_If_Ai_WinTest() {

        int i;
        for (i=0;i<9;i++)
        {
            GameBoard.playerTypeMoveStore[i]="";
        }
        GameBoard.playerTypeMoveStore[0]=GameBoard.playerTypeMoveStore[1]="AI";
        GameBoard.playerTypeMoveStore[3]=GameBoard.playerTypeMoveStore[4]="You";
        defensiveAi.aiMove(i);
        checkWin.winnerCheck("Ai");

        Assertions.assertEquals( "Ai Win!!!",TicTacToe.topBar_Title.getText());

    }
    @Test
    void Check_If_Human_WinTest() {

        int i;
        for (i=0;i<9;i++)
        {
            GameBoard.playerTypeMoveStore[i]="";
        }
        GameBoard.playerTypeMoveStore[0]=GameBoard.playerTypeMoveStore[1]=GameBoard.playerTypeMoveStore[2]="You";

        checkWin.winnerCheck("You");

        Assertions.assertEquals( "You Win!!!",TicTacToe.topBar_Title.getText());

    }
}