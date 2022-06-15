package game.ducks;

import java.awt.*;

public abstract class State
{
    private static State currentState = null;

    public static void setState(State state)
    {
        currentState = state;
    }

    public static State getState()
    {
        return currentState;
    }

    public abstract void update(Graphics g);

    public abstract void render(Graphics g);
}
