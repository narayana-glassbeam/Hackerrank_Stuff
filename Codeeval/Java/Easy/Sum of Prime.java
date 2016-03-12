public class Main {
    public static void main (String[] args) {
        long result = 0;
        int number = 2;
        int count = 0;
        while (count < 1000) {
            if (checkPrime(number)) {
                result = result + number;
                count++;
            }
            number++;
        }
        System.out.println(result);
    }

    public static boolean checkPrime(int number) {
        int s = (int) Math.round(Math.sqrt(number));
        for (int i = 2; i <= s; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }
}


/*SUM OF PRIMES
CHALLENGE DESCRIPTION:

Write a program which determines the sum of the first 1000 prime numbers.

INPUT SAMPLE:

There is no input for this program.

OUTPUT SAMPLE:

Print to stdout the sum of the first 1000 prime numbers.

3682913*/
