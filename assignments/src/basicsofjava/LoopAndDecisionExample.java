package basicsofjava;

public class LoopAndDecisionExample {

    public static void main(String[] args) {
        // Decision Making with if-else statement
        int number = 15;

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Loop Control with for loop
        System.out.println("Printing numbers from 1 to 5 using a for loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Loop Control with while loop
        System.out.println("Printing numbers from 1 to 5 using a while loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // Loop Control with do-while loop
        System.out.println("Printing numbers from 1 to 5 using a do-while loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}
