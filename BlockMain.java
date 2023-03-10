import java.awt.Point;

public class BlockMain
{
    public static void main(String[] args)
    {
        Block1 b1 = new Block1(10, 10);
        Block2 b2 = new Block2(110, 110);
        Block3 b3 = new Block3(160, 310);
        Rectangle r = new Rectangle(new Point(10, 10));
        Rectangle r2 = new Rectangle(new Point(20, 20), new Point(70, 70));

        System.out.println("r");
        System.out.println(r);

        System.out.println("r2");
        System.out.println(r2);

        System.out.println("b1");
        System.out.println(b1);

        System.out.println("b2");
        System.out.println(b2);

        System.out.println("b3");
        System.out.println(b3);

        b1.translate(10, -10);
        System.out.println("b1");
        System.out.println(b1);

        b2.translate(10, -10);
        System.out.println("b2");
        System.out.println(b2);

        b3.translate(10, -10);
        System.out.println("b3");
        System.out.println(b3);
    }
}