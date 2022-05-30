package game.ducks;

public abstract class Duck
{
    private String color;
    private int amountOfLife;

    Duck(String color, int amountOfLife)
    {
        this.color = color;
        this.amountOfLife = amountOfLife;
    }

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
}
