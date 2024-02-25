import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


          final int SENTINEL = -1;
          int navigator = 0;

        do {
            double a;
            double b;
            double c;

            System.out.println("Welcome to the root and discriminant calculator. " +
                    "\n Please start by entering variable a: ");
            a = input.nextDouble();

            System.out.println("Now enter variable b: ");
            b = input.nextDouble();

            System.out.println("Lastly, enter variable c: ");
            c = input.nextDouble();

            Controller controller = new Controller(a, b, c);

            System.out.println(controller.beregnDiskriminant());
            System.out.println(controller.beregnRødder());

            System.out.println("Would you like to exit the program? " +
                    "\n if so, please enter '-1' ");

            navigator = input.nextInt();

        } while (navigator != SENTINEL);
    }
}
