package game.ducks;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game implements Runnable
{
    private GameView gameView;
    public int width;
    public int height;
    public String title;

    private boolean running = false;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    Game(String title, int width, int height)
    {
        this.width = width;
        this.height = height;
        this.title = title;

    }

    private void init()
    {
        gameView = new GameView(title, width, height);
    }

    private void update()
    {

    }

    private void render()
    {
        bs = gameView.getCanvas().getBufferStrategy();
        if(bs == null)
        {
            gameView.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();

        g.fillRect(0, 0, width, height);
        bs.show();
        g.dispose();
    }

    public void run()
    {
        init();
        while(running)
        {
            update();
            render();
        }

        stop();
    }

    public synchronized void start()
    {
        if(running)
            return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    public synchronized void stop()
    {
        if(!running)
            return;
        running = false;
        try
        {
            thread.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }


}
