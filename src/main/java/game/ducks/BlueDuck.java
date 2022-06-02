package game.ducks;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;


public class BlueDuck extends Duck
{

    BlueDuck(String color, int amountOfLife)
    {
        super(color, amountOfLife);

    }

    @Override
    public BufferedImage prepareImage()
    {
        return ImageManager.getInstance().getBlueDuck();
    }

    @Override
    public void render(Graphics g)
    {

        g.drawImage(image, 23, 150, null);
//        g.drawRect(40, 40, 50, 50);
    }
}
