/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2 = "", quit = "quit";
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            if (num1.equals("quit")) {
                System.out.println("ERR: num1 is in the wrong format! (" + num1 + ")");
            } else {
                System.out.println("num1 = " + num1 + "is number:" + Ex1.isNumber(num1) + " , value:" + Ex1.number2Int(num1));
                continue;
            }
            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            num2 = sc.next();
            if (num2.equals("quit")) {
                System.out.println("ERR: num1 is in the wrong format! (" + num2 + ")");
            } else {
                System.out.println("num2 = " + num2 + "is number:" + Ex1.isNumber(num2) + " , value:" + Ex1.number2Int(num2));
                continue;
            }
            System.out.println("Enter a base for output: (a number [2,16] ");
            int base;
            base = sc.nextInt();
            if (2 < base || base < 16) {
                int a = Ex1.number2Int(num1);
                int b = Ex1.number2Int(num2);
                String x = Ex1.int2Number((a + b ), base);
                String y = Ex1.int2Number((a * b), base);
                System.out.println(num1 + " + " + num2 + "=" + x + "b" + base);
                System.out.println(num1 + " * " + num2 + "=" + y + "b" + base);

                System.out.println("Max number over [" + num1 + "," + num2 + "," + x + "," + y + "] is:" + (Ex1.maxIndex(new String[]{num1, num2, x, y})));

                System.out.println("quiting now...");
            }
        }
    }
}


