package school.mjc.stage0.loops.finalTask;

public class Pyramid
{
    public void printPyramid(int cathetusLength)
    {
        for (int i = 0; i < cathetusLength; i++)
        {
            for (int j = 0; j < cathetusLength + i; j++)
            {
                System.out.print(cathetusLength - i - 1 <= j && cathetusLength + i - 1 >= j ? (cathetusLength > j ? cathetusLength - j: j - cathetusLength + 2): " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        new Pyramid().printPyramid(7);
    }
}
