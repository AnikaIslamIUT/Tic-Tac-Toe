public class DefensiveAiWin {
    public static int aiPosition;
    public static int index;
    public boolean winDefensiveAi()
    {
        if(rowCheck())
        {
            return true;
        }
        else if (columnCheck())
        {
            return true;
        }
        else if (diagonalCheck())
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public boolean rowCheck( )
    {
        for(index =0; index <3; index++) {
            if((GameBoard.playerTypeMoveStore[index *3]=="AI")&&(GameBoard.playerTypeMoveStore[index *3+1]=="AI") && (GameBoard.playerTypeMoveStore[index *3+2]==""))
            {
                aiPosition= index*3+2;
                return true;
            }

            else if((GameBoard.playerTypeMoveStore[index *3]=="AI")&&(GameBoard.playerTypeMoveStore[index *3+1]=="")&& (GameBoard.playerTypeMoveStore[index *3+2]=="AI"))
            {
                aiPosition= index *3+1;
                return true;
            }
            else if((GameBoard.playerTypeMoveStore[index *3]=="")&&(GameBoard.playerTypeMoveStore[index *3+1]=="AI") && (GameBoard.playerTypeMoveStore[index *3+2]=="AI"))
            {
                aiPosition= index *3;
                return true;
            }

        }

        return false;
    }

    public boolean columnCheck( )
    {
        for(index =0; index <3; index++) {
            if((GameBoard.playerTypeMoveStore[index]=="AI")&&(GameBoard.playerTypeMoveStore[index +3]=="AI") && (GameBoard.playerTypeMoveStore[index +6]==""))
            {
                aiPosition= index+6;
                return true;
            }

            else if((GameBoard.playerTypeMoveStore[index]=="AI")&&(GameBoard.playerTypeMoveStore[index +3]=="") && (GameBoard.playerTypeMoveStore[index +6]=="AI"))
            {
                aiPosition= index+3;
                return true;
            }
            else if((GameBoard.playerTypeMoveStore[index]=="")&&(GameBoard.playerTypeMoveStore[index +3]=="AI") && (GameBoard.playerTypeMoveStore[index +6]=="AI"))
            {
                aiPosition= index;
                return true;
            }

        }
        return false;
    }

    public boolean diagonalCheck( )
    {

        if((GameBoard.playerTypeMoveStore[0]=="AI")&&(GameBoard.playerTypeMoveStore[4]=="AI") && (GameBoard.playerTypeMoveStore[8]==""))
        {
            aiPosition=8;
            return true;
        }

        else if((GameBoard.playerTypeMoveStore[0]=="AI")&&(GameBoard.playerTypeMoveStore[4]=="") && (GameBoard.playerTypeMoveStore[8]=="AI"))
        {
            aiPosition=4;
            return true;
        }
        else if((GameBoard.playerTypeMoveStore[0]=="")&&(GameBoard.playerTypeMoveStore[4]=="AI")&& (GameBoard.playerTypeMoveStore[8]=="AI"))
        {
            aiPosition=0;
            return true;
        }


        else if((GameBoard.playerTypeMoveStore[2]=="AI")&&(GameBoard.playerTypeMoveStore[4]=="AI") && (GameBoard.playerTypeMoveStore[6]==""))
        {
            aiPosition=6;
            return true;
        }

        else if((GameBoard.playerTypeMoveStore[2]=="AI")&&(GameBoard.playerTypeMoveStore[4]=="") && (GameBoard.playerTypeMoveStore[6]=="AI"))
        {
            aiPosition=4;
            return true;
        }
        else if((GameBoard.playerTypeMoveStore[2]=="")&&(GameBoard.playerTypeMoveStore[4]=="AI") && (GameBoard.playerTypeMoveStore[6]=="AI"))
        {
            aiPosition=2;
            return true;
        }

        else
        {
            return false;
        }



    }
}

