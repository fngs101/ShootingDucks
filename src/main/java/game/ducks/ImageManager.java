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

        File yellowLeft = new File(String.valueOf(ImageManager.class.getResource("/textures/yellowleft.png").getPath()));
        File blueLeft = new File(String.valueOf(this.getClass().getResource("/textures/blueleft.png").getPath()));
        File pinkLeft = new File(String.valueOf(this.getClass().getResource("/textures/pinkleft.png").getPath()));
        System.out.println(yellowLeft.exists());
        try
        {
            yellowDuck = ImageIO.read(yellowLeft);
            blueDuck = ImageIO.read(blueLeft);
            pinkDuck = ImageIO.read(pinkLeft);
        } catch (IOException e)
        {
            e.printStackTrace();
            System.exit(1);
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
