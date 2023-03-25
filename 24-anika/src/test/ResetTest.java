
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResetTest {
    TicTacToe ticTacToe= new TicTacToe();
    Reset reset = new Reset();
    @Test
    public void if_Every_Move_Buttons_Become_Null()
    {
        int i;
        for (i=0;i<9;i++)
        {
            GameBoard.move_buttons[i].setText("O");
        }
        reset.ResetGameBoard();
        Assertions.assertEquals( "",GameBoard.move_buttons[4].getText());
    }

    @Test
    public void  if_Every_playerTypeMoveStore_Become_Empty()
    {
        int i;
        for (i=0;i<9;i++)
        {
            GameBoard.playerTypeMoveStore[i]="AI";
        }
        reset.ResetGameBoard();
        Assertions.assertEquals( "", GameBoard.playerTypeMoveStore[4]);
    }

}