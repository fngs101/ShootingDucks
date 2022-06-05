package game.ducks;

import java.awt.*;
import java.awt.image.BufferedImage;


public class BlueDuck extends Duck
{

    private int width;
    private int height;
    BlueDuck(String color, int amountOfLife, int width, int height)
    {
        super(color, amountOfLife, width, height);
        this.width = width;
        this.height = height;
    }

    @Override
    public BufferedImage prepareImage()
    {
        return ImageManager.getInstance().getBlueDuck();
    }

    @Override
    public void render(Graphics g)
    {
        g.drawImage(image, 0, 0, null);
    }
}
