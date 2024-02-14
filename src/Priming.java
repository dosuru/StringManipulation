public class Priming {
    public static void main(String[] args) {
        int count = 0;
        int num = 2; // Start checking from 2, the first prime number
        
        System.out.println("The first 10 prime numbers are:");
        
        while (count < 10) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
    
    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
