package game.ducks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class GameView extends JFrame
{
    private GamePanel gamePanel;
    private List<Duck> duckList;
    GameView()
    {
        setVisible(true);
        setSize(1000, 1000);
        setTitle("Duck game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        gamePanel = new GamePanel();
        duckList = new ArrayList<>();
        duckList.add(new YellowDuck("yellow", 1));
        duckList.add(new BlueDuck("blue", 5));
        duckList.add(new PinkDuck("pink", 7));
        add(gamePanel);
    }

    class GamePanel extends JPanel
    {
        private Timer timer;
        private int x = 10;
        private int y = 10;

        GamePanel()
                //gotowy lepszy engine obczaj majnkfrata kwadraty zastapic klasami chicken a najlepiej z klasami dziedzicznymi
        {
            timer = new Timer(1, (ActionEvent e) -> updateImage());
            timer.start();
        }
        @Override
        protected void paintComponent(Graphics g)
        {
            g.clearRect(0, 0, 1000, 1000);
            x++;
            y++;

            g.setColor(Color.CYAN);
            g.drawRect(x, y, 50, 30);

            System.out.println("metoda paint compoentn");
        }

        private void updateImage()
        {
            repaint();
        }
    }
}