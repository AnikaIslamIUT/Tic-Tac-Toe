import java.awt.*;

public interface Theme {

    public void changeTheme();
    public Color buttonColor();

    public void humanMove(int humanPosition );
    public void aiMove(int aiPosition);
}
