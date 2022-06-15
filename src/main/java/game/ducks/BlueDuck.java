package game.ducks;

import java.awt.*;
import java.awt.image.BufferedImage;


public class BlueDuck extends Duck
{

    //wywalic te width i height bez sensu, ustawic jednakowe
    //koordynaty z randoma w okreslonym range? na pewno nie tak jak teraz na stałe
    private int width;
    private int height;
    private int x;
    private int y;
    BlueDuck(String color, int amountOfLife, int width, int height)
    {
        super(color, amountOfLife, width, height);
        this.width = width;
        this.height = height;
        x = 750;
        y = 100;

    }

    @Override
    public BufferedImage prepareImage()
    {
        return ImageManager.getInstance().getBlueDuck();
    }

    @Override
    public void render(Graphics g)
    {
        g.drawImage(image, x, y, null);
    }

    public void move(Graphics g)
    {
//        g.drawImage(image, x++, y++, null); 2/10 bez sensu rysuje obrazek na nowo, zmien koordynaty jak czlowiek
        x=x-5;
//        y--;  //wyjdzie na ukos
    }
}
