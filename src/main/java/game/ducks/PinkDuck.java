package game.ducks;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PinkDuck extends Duck
{
    PinkDuck(String color, int amountOfLife)
    {
        super(color, amountOfLife);
        image = ImageManager.getInstance().getPinkDuck();
    }

    @Override
    public BufferedImage prepareImage()
    {
        return ImageManager.getInstance().getPinkDuck();
    }

    @Override
    public void render(Graphics g)
    {
        g.drawImage(image, 760, 150, null);
    }
}
