package game.ducks;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageManager
{
    private BufferedImage yellowDuck;
    private BufferedImage blueDuck;
    private BufferedImage pinkDuck;
    private static ImageManager imageManager = new ImageManager();

    private ImageManager()
    {
        File file = new File("C:\\Users\\jszymczak\\Desktop\\ducks\\blue\\BishopB.png");
        try
        {
            yellowDuck = ImageIO.read(file);
            blueDuck = ImageIO.read(file);
            pinkDuck = ImageIO.read(file);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public BufferedImage getYellowDuck()
    {
        return yellowDuck;
    }

    public BufferedImage getBlueDuck()
    {
        return blueDuck;
    }


    public BufferedImage getPinkDuck()
    {
        return pinkDuck;
    }

    public static ImageManager getInstance()
    {
        return imageManager;
    }

}
