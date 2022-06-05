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
    private int width;
    private int height;

    Duck(String color, int amountOfLife, int width, int height)
    {
        this.color = color;
        this.amountOfLife = amountOfLife;
        image = prepareImage();  //-> factory method wzorzec projektowy
        this.width = width;
        this.height = height;

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

    public abstract void render(Graphics g);

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }
}
