package game.ducks;

import javax.swing.*;

public class Launcher
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(1000, 1000);
        jFrame.setTitle("Duck game");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }
}
