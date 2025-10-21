import java.util.Random;
public class PartC
{
    public static void main(String[] args)
    {
        int die1 = 0;
        int die2 = 1;
        int die3 = 2;

        Random rand = new Random();

        int dieRoll = die1 + die2 + die3;
        int rollNum = 0;

        System.out.println("Roll:     Die1 Die2 Die3 Sum");
        System.out.println("----------------------------");

        while(die1 != die2 || die1 != die3 || die2 != die3)
        {
            rollNum++;
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            die3 = rand.nextInt(6) + 1;
            dieRoll = die1 + die2 + die3;


            System.out.printf("Roll: %-5d %3d %3d %3d %3d\n", rollNum, die1, die2, die3, dieRoll);
        }
        System.out.println("-------------------------");
    }
}
