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

    //States
    private State gameState;
    private State menuState;

    Game(String title, int width, int height)
    {
        this.width = width;
        this.height = height;
        this.title = title;

    }

    private void init()
    {
        gameView = new GameView(title, width, height);

        gameState = new GameState();
        menuState = new MenuState();
        State.setState(gameState);
    }

    private void update()
    {
        if(State.getState() != null)
        {
            State.getState().update(g);
        }
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
        //clear screen
        g.clearRect(0, 0, width, height);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        //draw

        if(State.getState() != null)
        {
            State.getState().render(g);
        }

        //end drawing
        bs.show();
        g.dispose();
    }

    public void run()
    {
        init();
        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;

        while(running)
        {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;

            if(delta >= 1)
            {
                update(); //wysypuje sie bo game object dopiero zostanie stworzony w render? to jak inaczej mam robic update
                render();
                ticks++;
                delta--;
            }

            if(timer >= 1000000000)
            {
                ticks = 0;
                timer = 0;
            }
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
