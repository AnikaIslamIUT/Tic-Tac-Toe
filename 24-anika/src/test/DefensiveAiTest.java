import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class DefensiveAiTest {
    AiMove defensiveAi = new DefensiveAi();
    TicTacToe ticTacToe= new TicTacToe();
    @Test
    void ifDefensivePlayForWin() {
        int i;
        for (i=0;i<9;i++)
        {
            GameBoard.playerTypeMoveStore[i]="";
        }
        GameBoard.playerTypeMoveStore[0]=GameBoard.playerTypeMoveStore[1]="AI";
        GameBoard.playerTypeMoveStore[3]=GameBoard.playerTypeMoveStore[4]="You";
        defensiveAi.aiMove(i);
        Assertions.assertEquals( "AI",GameBoard.playerTypeMoveStore[2]);
    }

    @Test
    void ifDefensiveAi_No_Chance_Of_Winning_then_Block_Human() {
        int i;
        for (i=0;i<9;i++)
        {
            GameBoard.playerTypeMoveStore[i]="";
        }
        GameBoard.playerTypeMoveStore[0]="AI";
        GameBoard.playerTypeMoveStore[3]=GameBoard.playerTypeMoveStore[4]="You";
        defensiveAi.aiMove(i);
        Assertions.assertEquals( "AI",GameBoard.playerTypeMoveStore[5]);
    }
}