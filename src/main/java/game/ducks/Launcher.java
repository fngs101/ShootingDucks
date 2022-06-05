package game.ducks;


public class Launcher
{
    public static void main(String[] args)
    {
        Game game = new Game("Ducks", 1000, 1000);
        game.start();

    }
}
