package game.ducks;

import java.awt.*;

public class GameState extends State
{
    @Override
    public void tick()
    {

    }

    @Override
    public void render(Graphics g)
    {
        BlueDuck blue = new BlueDuck("bl", 5, 0, 0);
        blue.prepareImage();
        blue.render(g);
    }
}
