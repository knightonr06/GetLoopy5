public class PartA
{
    static void main(String[] args)
    {
        for (int h = 0; h < 31; h++)
        {
            System.out.print(h + " ");
        }
        System.out.println();
        for (int h = 30; h > -1; h--)
        {
            System.out.print(h + " ");
        }
        System.out.println();
        for (int h = 0; h < 21; h += 3)
        {
            System.out.print(h + " ");
        }
        System.out.println();
        for (int h = 10; h > -2; h -= 2)
        {
            System.out.print(h + " ");
        }
        System.out.println();
    }
}