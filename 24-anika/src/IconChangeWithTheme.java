public class IconChangeWithTheme {
    Theme theme;
    public void changeIconWithTheme()
    {
        themeChange();
        for(int i=0;i<9;i++)
        {
            if(GameBoard.playerTypeMoveStore[i]=="You")
            {
                GameBoard.move_buttons[i].setText("");
                GameBoard.move_buttons[i].setIcon(null);
                theme.humanMove(i);
            }
            if(GameBoard.playerTypeMoveStore[i]=="AI")
            {
                GameBoard.move_buttons[i].setText("");
                GameBoard.move_buttons[i].setIcon(null);
                theme.aiMove(i);
            }
        }
    }

    void themeChange()
    {
        if(ThemeOptions.themeType=="Forest")
        {
            theme = new Forest();

        }
        else if(ThemeOptions.themeType=="Contrast")
        {
            theme = new Contrast();
        }
        else
        {
            theme = new Classic();
        }
    }
}
