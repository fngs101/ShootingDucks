package game.ducks;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Duck
{
    private String color;
    private int amountOfLife;
    BufferedImage image;
    private int x;
    private int y;

    Duck(String color, int amountOfLife, int width, int height)
    {
        this.color = color;
        this.amountOfLife = amountOfLife;
        image = prepareImage();  //-> factory method wzorzec projektowy
        this.x = width;
        this.y = height;

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

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}
