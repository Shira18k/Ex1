/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        System.out.println(Ex1.isNumber("10b2"));
        System.out.println(Ex1.number2Int("10b2"));

        String[] numbers = { "1b2" , "6BbH" , "123b4", "666b9", "777"};

        System.out.println(Ex1.maxIndex(numbers));

        System.out.println(Ex1.int2Number(123,6));

    }
}
