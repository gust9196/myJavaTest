package assignment1;

public class StringHandler {

    /**
     *
     * @param str
     * @return a string where all characters 'c' is replaced by the character 's'
     * Case insensitive.
     */

    public String stringManipulation(String str) {
        //TODO Delete line below, and implement this method
        throw new UnsupportedOperationException();
        String name = "christian";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c' || str.charAt(i) == 'C') {
                name += 's';
            } else {
                name += str.charAt(i);
            }
        }
    }

    /**
     *
     * @param str
     * @return the length of str
     * If the input str is null or "" you must return 0
     *
     */
    public int stringLength(String str) {
        //TODO Delete line below, and implement this method
        //return the length of the string
        public static void main(String[] args) {
            String str = "Christian";
            System.out.println(str.length());
        }

        /**
         *
         * @param arr
         * @return the cumulative length of all strings in arr
         * e.g. if arr is ["hi","hello","hej"] the method should return 10
         */
        public int stringArrayLength(String[] arr) {
            //TODO Delete line below, and implement this method
            int sum = 0;
            int[] arr = {"Hej med dig Christian!!!! :DD lol"}; //forventet 33
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i].length();
            }
            return sum;

        }


        /**
         *
         * @param str
         * @return reverse the characters in the String str
         * e.g. "Hello" -> "olleH"
         */
        public String stringReverse(String str) {
            //TODO Delete line below, and implement this method
            throw new UnsupportedOperationException();
            //reverse the characters in the String str
            //e.g. "Hello" -> "olleH"
            String result = "Christian";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
            System.out.println(result); //naitsirhC

        }

        /**
         *
         * @param str any string
         * @param c the character to count
         * @return how many occurences of the character c in the String str
         * The method should not be case sensitive.
         * e.g. parameters: "Change comes through passion", 'g' should return 2
         */
        public int charCount(String str, char c) {
            //TODO Delete line below, and implement this method
            throw new UnsupportedOperationException();
        }

        /**
         * Returns a string that contains exactly the amount of chars c, as stated by the given amount. So if amount => 4 and
         * char => c then the return value must be "cccc". If amount => 3 and c => X then the return value must be "XXX".
         *
         * @param amount The amount of chars in the return string
         * @param c      The chars the return string must consist of
         * @return The string created using the given parameters.
         */
        public String stringOfChars(int amount, char c) {
            //TODO Delete line below, and implement this method
            throw new UnsupportedOperationException();
        }


    }
