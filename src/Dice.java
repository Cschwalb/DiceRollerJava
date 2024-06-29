public class Dice
{
    public int diceFace;
    public int numberOfDice;

    public void setDiceFace(int diceFace)
    {
        this.diceFace = diceFace;
    }

    public void setnumberOfDice(int numberOfDice)
    {
        this.numberOfDice = numberOfDice;
    }

    public Dice(int diceFace, int numberOfDice)
    {
        this.diceFace = diceFace;
        this.numberOfDice = numberOfDice;
    }

    public Dice()
    {
        this.diceFace = 20;
        this.numberOfDice = 1;
    }

    public int parseAndRoll(String sinput)
    {
        String [] arr = sinput.split("d");

        diceFace = Integer.parseInt(arr[1]);
        numberOfDice = Integer.parseInt(arr[0]);
        int randomInt = (int) (Math.floor(Math.random() * diceFace) + 1);
        System.out.println(randomInt);
        return randomInt;
    }

}
