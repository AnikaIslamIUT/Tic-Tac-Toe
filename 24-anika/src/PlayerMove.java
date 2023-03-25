import java.awt.*;
import java.awt.event.*;

public class PlayerMove {
    AiMove randomAi = new RandomAi();
    GameBoard gameBoard= new GameBoard();
    First_Turn first_turn= new First_Turn();
    CheckWin checkWin= new CheckWin();
    AiMove defensiveAi = new DefensiveAi();
    Theme classic = new Classic();
    Theme forest  = new Forest();
    Theme contrast = new Contrast();
    public static String aiType;
    public void move()
    {
        for(int i=0;i<9;i++)
        {
            GameBoard.move_buttons[i].addActionListener(buttonListener);

        }
        first_turn.firstTurn();

    }
    private ActionListener buttonListener=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for(int i=0; i<9; i++)
            {
                if( e.getSource()==GameBoard.move_buttons[i])
                {
                    if(TicTacToe.player1_turn)
                    {
                        if(GameBoard.playerTypeMoveStore[i]=="")
                        {
                            GameBoard.move_buttons[i].setForeground(new Color(3, 3, 3));
                            if(ThemeOptions.themeType=="Forest")
                            {
                                forest.changeTheme();
                                forest.humanMove(i);
                            }
                            else if(ThemeOptions.themeType=="Contrast")
                            {
                                contrast.humanMove(i);
                            }
                            else
                            {
                                classic.humanMove(i);
                            }
                            GameBoard.playerTypeMoveStore[i]="You";
                            TicTacToe.player1_turn=false;
                            checkWin.winnerCheck("You");
                            TicTacToe.playerMoveCount++;
                            if (  checkWin.winnerCheck("You"))
                            {
                                break;
                            }
                            if(TicTacToe.playerMoveCount==5)
                            {
                                TicTacToe.topBar_Title.setText("Draw!!!");
                                break;
                            }

                            TicTacToe. topBar_Title.setText("AI's Turn");
                            if(aiType=="Random")
                            {
                                randomAi.aiMove(i);
                            }
                            else if(aiType=="Defensive")
                            {
                                defensiveAi.aiMove(i);
                            }


                        }

                    }

                }
            }

        }

    };

}
