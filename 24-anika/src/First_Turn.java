import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class First_Turn {
    public void firstTurn()
    {

        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }


        TicTacToe.player1_turn=true;
        TicTacToe.topBar_Title.setText("Your Turn");


    }
}
