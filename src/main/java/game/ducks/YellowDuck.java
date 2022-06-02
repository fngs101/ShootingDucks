package game.ducks;

import java.awt.*;
import java.awt.image.BufferedImage;

public class YellowDuck extends Duck
{
    YellowDuck(String color, int amountOfLife)
    {
        super(color, amountOfLife);
        image = ImageManager.getInstance().getYellowDuck();
    }

    @Override
    public BufferedImage prepareImage()
    {
        return ImageManager.getInstance().getYellowDuck();
    }

    @Override
    public void render(Graphics g)
    {
        g.drawImage(image, 500, 150, null);
    }
}

