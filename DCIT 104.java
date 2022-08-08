import java.util.Scanner;

class Main {
    static void arePrime() {
        int value;
        int sum = 0;
        float total = 0;
        float avg;
        System.out.print("Please enter a positive number: ");
        Scanner input = new Scanner(System.in);
        value = input.nextInt();
        System.out.println("___________________________________________");
        System.out.println("Prime numbers below " + value + " are");
        // Using the loop for the repition process to get the prime numbers.
        for (int x = 2; x < value; x++) {
            int follow = 0;
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    follow = 1;
                    break;
                }
            }
            if (follow == 0) {
                System.out.println(x);
                sum = sum + x;
                total += 1;
                input.close();
            }
        }
        System.out.println(" ");
        avg = sum / total;
        System.out.println("The  total number of prime numbers below " + value + " is " + total);
        System.out.println(" ");
        System.out.println("The sum of prime numbers below " + value + " is " + sum);
        System.out.println(" ");
        System.out.println("The average of the prime numbers is " + avg);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        arePrime();
    }
}