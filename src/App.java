import java.util.Scanner;

/*課題リンク
https://github.com/dragonfly91/java-class/blob/main/questions.md
*/

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        q3();
    }

    private static void q1() {
        System.out.println("Hello Samuel Bangari");
    }

    private static void q2() {

        int a = 1;
        String aString = Integer.toString(a);
        int b = 2;
        String bString = Integer.toString(b);
        int c = a + b;
        String cString = Integer.toString(c);

        String sumString = "Sum of " + a + " and " + b + " is " + c;

        System.out.println(sumString);
    }

    private static void q3() {

        System.out.print("Input first number:");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        System.out.print("Input second number:");
        int b = scan.nextInt();

        int c = a * b;

        String multipleSting = a + " ×  " + b + " = " + c;
        System.out.println(multipleSting);
    }
}
