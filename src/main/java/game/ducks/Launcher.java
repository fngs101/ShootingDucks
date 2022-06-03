package game.ducks;

import javax.swing.*;
import java.io.IOException;

public class Launcher
{
    public static void main(String[] args)
    {
        Game game = new Game("Ducks", 400, 400);
//        SwingUtilities.invokeLater(new Runnable()
//        {
//            @Override
//            public void run()
//            {
//                try
//                {
//                    GameView gameView = new GameView();
//                } catch (IOException e)
//                {
//                    e.printStackTrace();
//                }
//
//            }
//        });


    }
}
