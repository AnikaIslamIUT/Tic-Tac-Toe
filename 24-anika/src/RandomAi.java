import java.awt.*;

public class RandomAi implements AiMove {
    CheckWin checkWin = new CheckWin();
    Theme classic = new Classic();
    Theme forest  = new Forest();
    Theme contrast = new Contrast();
    AIMoveUIChange aiMoveUIChange = new AIMoveUIChange();
    public static int Random_Ai_move;
    @Override
    public void aiMove(int i) {
        Random_Ai_move =i;
        while (GameBoard.playerTypeMoveStore[Random_Ai_move]!="")
        {
            Random_Ai_move = TicTacToe.random.nextInt(9);
        }

        aiMoveUIChange.uIChangeForAIMove(Random_Ai_move);
    }
}
