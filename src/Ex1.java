/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {

    public static int charToInt (char c) { //פו עזר שמחזירה לי את ערך האינדקס עבור תו/ מס.
        int ans = -1;
        char [] arr = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G'};
        for (int i=0 ;  i<arr.length; i++){ //הגדרה של סך האינדקסים שקיימים לי
            if (arr[i]==c) {
                ans=i;
            }

        }
        return ans;
    }
    public static char gatBase (String a) { //פו עזר מהו בסיס

        if (!isNumber(a)){return 'X';}
        if (a.contains("b")) {return a.charAt(a.indexOf('b')+1);}
        return 'A';
    }

        /**
         * Convert the given number (num) to a decimal representation (as int).
         * It the given number is not in a valid format returns -1.
         * @param num a String representing a number in basis [2,16]
         * @return
         */
        public static int number2Int(String num) { //פו המרת הnum לייצוג עשרוני
            int ans = -1;

            if (isNumber(num) && isNumber(base)) {
                if (num.contains("b")) {
                num =  num.substring(0, num.indexOf("b")) ;};//מהו num;
                if (base.contains("b")) {
                    base = base.substring(num.indexOf("b")+1);}
                ans = Integer.parseInt(num,base); // המרה ישירה לבסיס 10 מקצר את החישוב לעשרוני, לברר אם מספיק

            } else {return ans;}

            return ans;
        }

        /**
         * This static function checks if the given String (g) is in a valid "number" format.
         * @param a a String representing a number
         * @return true iff the given String is in a number format
         */
        public static boolean isNumber(String a) { //num
            boolean ans = true;

            char base = a.charAt(a.indexOf('b') + 1);
            if (charToInt(base) == -1) {
                return false;
            }

            String numValue;
            if (a.contains("b")) {
                numValue = a.substring(0, a.indexOf("b"));
            } else {
                numValue = a;
                base = 'A';
            }
            for (char c : numValue.toCharArray()) {
                if (charToInt(c) == -1) {
                    return false;
                }
                if (charToInt(c) >= charToInt(base)) {
                    return false;
                }
            }

            int counter = 0;
            for (char c : a.toCharArray()) {
                if (c == 'b') {
                    counter++;
                }
            }
            if (counter > 1) {
                return false;
            }

            if (counter == 0) {
                for (char c : numValue.toCharArray()) {
                    if ((charToInt(c) == -1)) {
                        return false;
                    }
                    if (charToInt(c) >= 10) {
                        return false;
                    }
                }
            }
            if (a.length() != a.indexOf('b') + 2) {
                return false;
            }
            return ans;

        }

        /**
         * Calculate the number representation (in basis base)
         * of the given natural number (represented as an integer).
         * If num<0 or base is not in [2,16] the function should return "" (the empty String).
         * @param num the natural number (include 0).
         * @param base the basis [2,16]
         * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
         */
        public static String int2Number(int num, int base){ //פו שממירה לבסיס 10{
            String ans = "";
            int sum = 0;
          //  int P =
            return ans;
        }

        /**
         * Checks if the two numbers have the same value.
         * @param n1 first number
         * @param n2 second number
         * @return true iff the two numbers have the same values.
         */
        public static boolean equals(String n1, String n2) {
            boolean ans = true;


            return ans;
        }

        /**
         * This static function search for the array index with the largest number (in value).
         * In case there are more than one maximum - returns the first index.
         * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
         * @param arr an array of numbers
         * @return the index in the array in with the largest number (in value).
         *
         */
        public static int maxIndex(String[] arr) {
            int ans = 0;
            // add your code here

            ////////////////////
            return ans;
        }
}
