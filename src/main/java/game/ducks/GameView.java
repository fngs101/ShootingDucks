package game.ducks;

import javax.swing.*;
import java.awt.*;

public class GameView extends JFrame
{
    private GamePanel gamePanel;
    GameView()
    {
        setVisible(true);
        setSize(1000, 1000);
        setTitle("Duck game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        gamePanel = new GamePanel();
        add(gamePanel);
    }

    class GamePanel extends JPanel
    {
        @Override
        protected void paintComponent(Graphics g)
        {
            g.drawRect(10, 10, 50, 30);
        }
    }
}
