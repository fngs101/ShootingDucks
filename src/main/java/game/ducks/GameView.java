package game.ducks;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GameView extends JFrame
{

    private JFrame frame;
    private int width;
    private int height;
    private String title;
    private Canvas canvas;
//    private List<Duck> duckList; przeniesc do game

    GameView(String title, int width, int height)
    {
        this.title = title;
        this.width = width;
        this.height = height;
        createGameView();
    }

    private void createGameView()
    {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));

        frame.add(canvas);
        frame.pack();
    }

    public Canvas getCanvas()
    {
        return canvas;
    }
}
