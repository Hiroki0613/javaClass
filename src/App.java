/*課題リンク
https://github.com/dragonfly91/java-class/blob/main/questions.md
*/

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        q2();
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

        String sumString = "Sum of " + aString + " and " + bString + " is " + cString;

        System.out.println(sumString);
    }

    private static void q3() {

    }
}
