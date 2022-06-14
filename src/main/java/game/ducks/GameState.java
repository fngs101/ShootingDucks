package game.ducks;

import java.awt.*;

public class GameState extends State
{
        //tu ma byc budowanie swiata
    @Override
    public void tick()
    {

    }

    @Override
    public void render(Graphics g)
    {
        BlueDuck blue = new BlueDuck("blue", 5, 10, 10);
        blue.prepareImage();
        blue.render(g);
    }
}
