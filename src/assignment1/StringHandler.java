package assignment1;

public class LogicsAndNumbersStuff {

    /**
     * This method returns the difference between a and b multiplied by c.
     *
     * @param a The first number
     * @param b The second number
     * @param c The last number
     * @return The difference of a and b, multiplied by c.
     */
    public int diffMultipliedByC(int a, int b, int c) {
        //TODO Delete line below, and implement this method
        throw new UnsupportedOperationException();
        //return the difference between a and b multiplied by c

     /*   a = 5;
        b = 8;
        c = 10;
        int dif;
        dif = (a - b) * c;
        return dif; */


    }

    /**
     * Returns true if you can stay in bed this morning. You can stay in bed if it is not a weekday, or if you are on vacation.
     *
     * @param weekday  True if its a weekday, false if it is not.
     * @param vacation True if you are on vacation, false if you are not.
     * @return True if you can stay in bed given the parameters.
     */
    public boolean canYouStayInBed(boolean weekday, boolean vacation) {
        //TODO Delete line below, and implement this method
        throw new UnsupportedOperationException();
        weekday = true;
        vacation = false;
        if (weekday == false || vacation == true) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method returns the sum of all the given numbers
     *
     * @param numbers The array containing all the numbers to calculate the sum of.
     * @return The sum of all integers in the numbers array.
     */
    public int sumOfNumbers(int[] numbers) {
        //TODO Delete line below, and implement this method
        //return the sum of all given numbers

        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;

    }

    /**
     * This method returns the average of all the given numbers.
     *
     * @param numbers The array containing all the numbers to calculate the average of.
     * @return The average of all the integers in the numbers array.
     */
    public double averageOfNumber(int[] numbers) {
        //TODO Delete line below, and implement this method

        //returns the average of all the given numbers
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;

        System.out.println("Average" + sum / numbers.length);

    }

    /**
     * Finds the number in the array that occurs the most times.
     * Say that the array is [1,2,5,42,42,42] the the return value should be 42 since that number occurs 3 times.
     * If there is a tie, as with the array [42,42,1984,1984,1,2,3] where both 42 and 1984 occurs twice,
     * the number that appears first in the array must be the return value. So in that case 42 should be returned.
     *
     * @param numbers The array of numbers.
     * @return The number that occurs most often in the array.
     */
    public int numberWithMostOccurrences(int[] numbers) {
        //TODO Delete line below, and implement this method
        int arr[] = {1, 2, 3, 4, 5, 6};
        int mostOccurringNumber = 0;
        int mostOccurrences = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int currentOccurrences = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == currentNumber) {
                    currentOccurrences++;
                }
            }
            if (currentOccurrences > mostOccurrences) {
                mostOccurrences = currentOccurrences;
                mostOccurringNumber = currentNumber;
            }
        }
        System.out.println(mostOccurringNumber + "og " + mostOccurrences);


    }
}


