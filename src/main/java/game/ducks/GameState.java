package game.ducks;

import java.awt.*;

public class GameState extends State
{
        //tu ma byc budowanie swiata
    //prosciej bedzie z jednym oknem
    BlueDuck blue = new BlueDuck("blue", 5, 10, 10);
    @Override
    public void update(Graphics g)
    {
        blue.move(g);
            //zrobic blue duck wyzej i sprawic zeby sie przesunelo, potem myslec jak to ladnie zrobic, moze tutaj world i w srodku world te wszystkie lementy
    }

    @Override
    public void render(Graphics g)
    {
        blue.prepareImage();
        blue.render(g);
    }
}
