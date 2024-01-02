package basicsofjava;

public class LoopControlExample {

    public static void main(String[] args) {
        // Using break and continue statements
        System.out.println("Using break and continue statements:");

        // Using break to exit a loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
            if (i == 3) {
                System.out.println("Breaking out of the loop");
                break;
            }
        }

        // Using continue to skip an iteration
        for (int j = 1; j <= 5; j++) {
            if (j == 2 || j == 4) {
                System.out.println("Skipping iteration " + j);
                continue;
            }
            System.out.println("Processing iteration " + j);
        }
    }
}
