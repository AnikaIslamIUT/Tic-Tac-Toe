import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class TicTacToe{
    public static Random random= new Random();
    public static JFrame frame= new JFrame();
    GameOptionPanel themeOptions = new ThemeOptions();
    GameOptionPanel startOptions = new StartOptions();


    ImageIcon frameLogo;
    //JPanel topbar_panel= new JPanel();
    public static JLabel topBar_Title;
    public static boolean player1_turn;
    public static int playerMoveCount=0;


    TicTacToe()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setResizable(false);
        frame.setSize(850,650);
        frame.getContentPane().setBackground(new Color(250, 244, 244));
        frame.setLayout(null);
        frame.setTitle("Tic-Tac-Toe");
        frame.setVisible(true);
        frameLogo = new ImageIcon(getClass().getResource("logo.png"));
        frame.setIconImage(frameLogo.getImage());

        topBar_Title = new JLabel();
        //topBar_Title.setBackground(new Color(194, 153, 255));
        topBar_Title.setForeground(new Color(14, 14, 14));
        topBar_Title.setFont(new Font("Ink Free",Font.BOLD,75));
        topBar_Title.setBounds(0,20,800,50);
        topBar_Title.setHorizontalAlignment(JLabel.CENTER);
        topBar_Title.setText("Tic-Tac-Toe");
        frame.add(topBar_Title);
        //topBar_Title.setOpaque(true);
        //Theme Options
        themeOptions.optionTitle();
        themeOptions.options();

        // start Option
        startOptions.optionTitle();
        startOptions.options();

        //topbar_panel.setLayout(new BorderLayout());
        //topbar_panel.setBounds(0,0,850,100);
        //topbar_panel.add(topBar_Title);

        //move_button_panel










    }







}
