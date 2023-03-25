import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThemeOptions implements GameOptionPanel {

    public static JPanel theme_title_panel= new JPanel();
    JPanel theme_panel= new JPanel();
    public static JLabel themeTitle;
    public static JButton[] theme_buttons= new JButton[3];
    public static String themeType;

    Theme classic = new Classic();
    Theme forest  = new Forest();
    Theme contrast = new Contrast();
    IconChangeWithTheme iconChangeWithTheme = new IconChangeWithTheme();

    @Override
    public void optionTitle() {
        themeTitle = new JLabel();
        themeTitle.setForeground(new Color(9, 9, 9));
        themeTitle.setFont(new Font("Ariel",Font.BOLD,30));
        themeTitle.setHorizontalAlignment(JLabel.CENTER);
        themeTitle.setText("Theme");

        theme_title_panel.setLayout(new BorderLayout());
        theme_title_panel.setBounds(600,120,100,30);
        theme_title_panel.setBackground(new Color(250, 244, 244));
        theme_title_panel.add(themeTitle);

        TicTacToe.frame.add(theme_title_panel);


    }

    @Override
    public void options() {

        theme_panel.setLayout(new GridLayout(3,1));
        theme_panel.setBounds(550,155,200,90);

        for (int i=0;i<3;i++)
        {
            theme_buttons[i] = new JButton();
            theme_buttons[i].setBackground(new Color(142, 142, 142));
            theme_buttons[i].setForeground(new Color(9, 9, 9));
            theme_buttons[i].setHorizontalAlignment(JLabel.CENTER);
            theme_buttons[i].setFont(new Font("MV Boli", Font.BOLD, 20));
            theme_buttons[i].setFocusable(false);
            theme_buttons[i].setOpaque(true);
        }
        theme_buttons[0].setText("Classic");
        theme_panel.add(theme_buttons[0]);
        theme_buttons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                themeType="Classic";
                classic.changeTheme();
                iconChangeWithTheme.changeIconWithTheme();
            }
        });

        theme_buttons[1].setText("Forest");
        theme_panel.add(theme_buttons[1]);
        theme_buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                themeType="Forest";
                forest.changeTheme();
                iconChangeWithTheme.changeIconWithTheme();

            }
        });

        theme_buttons[2].setText("High Contrast");
        theme_panel.add(theme_buttons[2]);
        theme_buttons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                themeType="Contrast";
                contrast.changeTheme();
                iconChangeWithTheme.changeIconWithTheme();
            }
        });

        TicTacToe.frame.add(theme_panel);

    }
}
