import java.awt.*;

public class DefensiveAi implements AiMove {
    DefensiveAiWin defensiveAiWin = new DefensiveAiWin();
    DefensiveBlockHuman defensiveBlockHuman = new DefensiveBlockHuman();
    CheckWin checkWin = new CheckWin();
    AiMove randomAi = new RandomAi();
    Theme classic = new Classic();
    Theme forest  = new Forest();
    Theme contrast = new Contrast();
    AIMoveUIChange aiMoveUIChange = new AIMoveUIChange();
    @Override
    public void aiMove(int i) {
        // System.out.println(defensiveAiWin.winDefensiveAi());
        // System.out.println(defensiveBlockHuman.blockHuman());


        if(defensiveAiWin.winDefensiveAi())
        {
            aiMoveUIChange.uIChangeForAIMove(DefensiveAiWin.aiPosition);
        }
        else if (defensiveBlockHuman.blockHuman())
        {
            aiMoveUIChange.uIChangeForAIMove(DefensiveBlockHuman.humanPositionInDefensive);
        }
        else
        {
            randomAi.aiMove(i);

        }
    }
}
