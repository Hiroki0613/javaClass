import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

        InputStreamReader isrA = new InputStreamReader(System.in);
        BufferedReader brA = new BufferedReader(isrA);

        InputStreamReader isrB = new InputStreamReader(System.in);
        BufferedReader brB = new BufferedReader(isrB);

        String aString = "";
        String bString = "";

        System.out.println("Input first number");

        try {
            aString = brA.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Input second number");

        try {
            bString = brB.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int intA = Integer.parseInt(aString);
        int intB = Integer.parseInt(bString);
        int intC = intA * intB;

        String cString = Integer.toString(intC);

        System.out.println(aString + " × " + bString + " = " + cString);

    }
}
