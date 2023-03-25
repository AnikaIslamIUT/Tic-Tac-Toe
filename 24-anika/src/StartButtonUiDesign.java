import javax.swing.*;
import java.awt.*;

public class StartButtonUiDesign {

    public void start_Button_UI_Design(JButton[] startbutton, int i)
    {
        startbutton[i] = new JButton();
        startbutton[i].setBackground(new Color(142, 142, 142));
        startbutton[i].setForeground(new Color(9, 9, 9));
        startbutton[i].setHorizontalAlignment(JLabel.CENTER);
        startbutton[i].setFont(new Font("MV Boli", Font.BOLD, 20));
        startbutton[i].setFocusable(false);
        startbutton[i].setOpaque(true);
    }
}
