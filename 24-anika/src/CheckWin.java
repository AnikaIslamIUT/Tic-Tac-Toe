public class CheckWin {
    GameOver gameOver = new GameOver();
    public boolean winnerCheck(String player)
    {
        for(int i=0;i<3;i++)
        {
            if((GameBoard.playerTypeMoveStore[i*3]=="You")&&(GameBoard.playerTypeMoveStore[i*3+1]=="You")&& (GameBoard.playerTypeMoveStore[i*3+2] == "You"))
            {
                gameOver.gameEnd(i*3,i*3+1,i*3+2,"You");
                return true;
            }
            else if((GameBoard.playerTypeMoveStore[i*3]=="AI")&&(GameBoard.playerTypeMoveStore[i*3+1]=="AI")&& (GameBoard.playerTypeMoveStore[i*3+2] == "AI"))
            {
                gameOver.gameEnd(i*3,i*3+1,i*3+2,"Ai");
                return true;
            }
            else if((GameBoard.playerTypeMoveStore[i]=="You")&&(GameBoard.playerTypeMoveStore[i+3]=="You")&& (GameBoard.playerTypeMoveStore[i+6] == "You"))
            {
                gameOver.gameEnd(i,i+3,i+6,"You");
                return true;
            }
            else if((GameBoard.playerTypeMoveStore[i]=="AI")&&(GameBoard.playerTypeMoveStore[i+3]=="AI")&& (GameBoard.playerTypeMoveStore[i+6] == "AI"))
            {
                gameOver.gameEnd(i,i+3,i+6,"Ai");
                return true;
            }
        }
        if((GameBoard.playerTypeMoveStore[0]=="You")&&(GameBoard.playerTypeMoveStore[4]=="You")&& (GameBoard.playerTypeMoveStore[8] == "You"))
        {
            gameOver.gameEnd(0,4,8,"You");
            return true;
        }
        else if((GameBoard.playerTypeMoveStore[0]=="AI")&&(GameBoard.playerTypeMoveStore[4]=="AI")&& (GameBoard.playerTypeMoveStore[8] == "AI"))
        {
            gameOver.gameEnd(0,4,8,"Ai");
            return true;
        }

        if((GameBoard.playerTypeMoveStore[2]=="You")&&(GameBoard.playerTypeMoveStore[4]=="You")&& (GameBoard.playerTypeMoveStore[6] == "You"))
        {
            gameOver.gameEnd(2,4,6,"You");
            return true;
        }
        else if((GameBoard.playerTypeMoveStore[2]=="AI")&&(GameBoard.playerTypeMoveStore[4]=="AI")&& (GameBoard.playerTypeMoveStore[6] == "AI"))
        {
            gameOver.gameEnd(2,4,6,"Ai");
            return true;
        }

        else
        {
            return false;
        }

    }






}
