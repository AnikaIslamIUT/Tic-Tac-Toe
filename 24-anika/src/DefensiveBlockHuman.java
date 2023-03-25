public class DefensiveBlockHuman {
    public static int humanPositionInDefensive;
    public static int index2;
    public boolean blockHuman()
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
        for(index2=0;index2<3;index2++) {
            if((GameBoard.playerTypeMoveStore[index2*3]=="You")&&(GameBoard.playerTypeMoveStore[index2*3+1]=="You") && (GameBoard.playerTypeMoveStore[index2*3+2]==""))
            {
                humanPositionInDefensive=index2*3+2;
                return true;
            }

            else if((GameBoard.playerTypeMoveStore[index2*3]=="You")&&(GameBoard.playerTypeMoveStore[index2*3+1]=="")&& (GameBoard.playerTypeMoveStore[index2*3+2]=="You"))
            {
                humanPositionInDefensive=index2*3+1;
                return true;
            }
            else if((GameBoard.playerTypeMoveStore[index2*3]=="")&&(GameBoard.playerTypeMoveStore[index2*3+1]=="You") && (GameBoard.playerTypeMoveStore[index2*3+2]=="You"))
            {
                humanPositionInDefensive=index2*3;
                return true;
            }

        }

        return false;
    }

    public boolean columnCheck( )
    {
        for(index2=0;index2<3;index2++) {
            if((GameBoard.playerTypeMoveStore[index2]=="You")&&(GameBoard.playerTypeMoveStore[index2+3]=="You") && (GameBoard.playerTypeMoveStore[index2+6]==""))
            {
                humanPositionInDefensive=index2+6;
                return true;
            }

            else if((GameBoard.playerTypeMoveStore[index2]=="You")&&(GameBoard.playerTypeMoveStore[index2+3]=="") && (GameBoard.playerTypeMoveStore[index2+6]=="You"))
            {
                humanPositionInDefensive=index2+3;
                return true;
            }
            else if((GameBoard.playerTypeMoveStore[index2]=="")&&(GameBoard.playerTypeMoveStore[index2+3]=="You") && (GameBoard.playerTypeMoveStore[index2+6]=="You"))
            {
                humanPositionInDefensive=index2;
                return true;
            }

        }
        return false;
    }

    public boolean diagonalCheck( )
    {

        if((GameBoard.playerTypeMoveStore[0]=="You")&&(GameBoard.playerTypeMoveStore[4]=="You") && (GameBoard.playerTypeMoveStore[8]==""))
        {
            humanPositionInDefensive=8;
            return true;
        }

        else if((GameBoard.playerTypeMoveStore[0]=="You")&&(GameBoard.playerTypeMoveStore[4]=="") && (GameBoard.playerTypeMoveStore[8]=="You"))
        {
            humanPositionInDefensive=4;
            return true;
        }
        else if((GameBoard.playerTypeMoveStore[0]=="")&&(GameBoard.playerTypeMoveStore[4]=="You")&& (GameBoard.playerTypeMoveStore[8]=="You"))
        {
            humanPositionInDefensive=0;
            return true;
        }


        else if((GameBoard.playerTypeMoveStore[2]=="You")&&(GameBoard.playerTypeMoveStore[4]=="You") && (GameBoard.playerTypeMoveStore[6]==""))
        {
            humanPositionInDefensive=6;
            return true;
        }

        else if((GameBoard.playerTypeMoveStore[2]=="You")&&(GameBoard.playerTypeMoveStore[4]=="") && (GameBoard.playerTypeMoveStore[6]=="You"))
        {
            humanPositionInDefensive=4;
            return true;
        }
        else if((GameBoard.playerTypeMoveStore[2]=="")&&(GameBoard.playerTypeMoveStore[4]=="You") && (GameBoard.playerTypeMoveStore[6]=="You"))
        {
            humanPositionInDefensive=2;
            return true;
        }

        else
        {
            return false;
        }



    }

}
