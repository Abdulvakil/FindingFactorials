import java.util.Scanner;

public class RecursionFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please enter a number to find its factorial:");
                int a = scanner.nextInt();
                System.out.println(factorial(a));
            } catch (Exception e) {
                System.out.println("Something is not right, try that again :)");
                scanner.nextLine();
            }
        }
    }

    public static int factorial(int a){
        if (a == 1){
            System.out.println("Factorial (" + a + ") = 1");
            return 1;
        }

        else {
            //Printing out that to find the factorial of (a) = (a) * factorial of (a -1).
            System.out.println("Factorial (" + a + ") = " + a + " * factorial(" + (a-1)+ ")");
            return a * factorial(a-1);

        }
    }

}
