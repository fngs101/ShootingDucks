package game.ducks;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class Duck
{
    private String color;
    private int amountOfLife;
    BufferedImage image;

    Duck(String color, int amountOfLife)
    {
        this.color = color;
        this.amountOfLife = amountOfLife;
        image = prepareImage();  //-> factory method wzorzec projektowy

    }

    public abstract BufferedImage prepareImage();

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getAmountOfLife()
    {
        return amountOfLife;
    }

    public void setAmountOfLife(int amountOfLife)
    {
        this.amountOfLife = amountOfLife;
    }

    public void render(Graphics g)
    {

    }
}
