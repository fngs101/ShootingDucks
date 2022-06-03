package game.ducks;

public class Game
{
    private GameView gameView;
    public int width;
    public int height;
    Game(String title, int width, int height)
    {
        this.width = width;
        this.height = height;
        gameView = new GameView(title, width, height);
    }
}
