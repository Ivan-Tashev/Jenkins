import java.util.Date;
import java.util.Random;

public class Math_Maxi {
    public static void main(String[] args) {

        Random rnd = new Random();
        String[] signs = {"+", "-", "*", "/"};

        System.out.println(new Date());
        System.out.println();

        // System.out.println("Събиране: + ");
        for (int i = 1; i <= 12; i++) {
            int a = rnd.nextInt(900);
            int b = rnd.nextInt(800);
            System.out.print(a + " + " + b + " =         ");
            if (i % 3 == 0) System.out.println();
        }
        System.out.println();

        //System.out.println("Изваждане: - ");
        for (int i = 1; i <= 12; i++) {
            int a = rnd.nextInt(1000);
            int b = rnd.nextInt(990) + 10;
            if (a > b) {
                System.out.print(a + " - " + b + " =         ");
            } else {
                i--;
                continue;
            }
            if (i % 3 == 0) System.out.println();
        }
        System.out.println();

        //System.out.println("Умножение: * ");
        for (int i = 1; i <= 12; i++) {
            int a = rnd.nextInt(30) + 1;
            int b = rnd.nextInt(8) + 2;
            System.out.print(a + " * " + b + " =         ");
            if (i % 3 == 0) System.out.println();
        }
        System.out.println();

        //System.out.println("Деление без остатък: : ");
        for (int i = 1; i <= 12; i++) {
            int a = rnd.nextInt(100) + 1;
            int b = (rnd.nextInt(8) + 2);
            if (a % b == 0) {
                System.out.print(a + " : " + b + " =         ");
            } else {
                i--;
                continue;
            }
            if (i % 3 == 0) System.out.println();
        }
        System.out.println();

        //System.out.println("Деление с остатък: : ");
        for (int i = 1; i <= 3; i++) {
            int a = rnd.nextInt(100) + 1;
            int b = (rnd.nextInt(8) + 2);
            System.out.print(a + " : " + b + " =         ");
            if (i % 3 == 0) System.out.println();
        }
    }
}
