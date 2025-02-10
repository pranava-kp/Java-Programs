import java.util.Random;
import java.util.Scanner;

public class Transmission {

    public static void transmission(long i, long N, long tf, long[] tt) {
        while (i <= tf) {
            int z = 0;
            for (long k = i; k < i + N && k <= tf; k++) {
                System.out.println("Sending Frame " + k + "...");
                tt[0]++;
            }
            for (long k = i; k < i + N && k <= tf; k++) {
                int f = new Random().nextInt(2);
                if (f == 0) {
                    System.out.println("Acknowledgment for Frame " + k + "...");
                    z++;
                } else {
                    System.out.println("Timeout!! Frame Number : " + k + " Not Received");
                    System.out.println("Retransmitting Window...");
                    break;
                }
            }
            System.out.println();
            i += z;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Total number of frames: ");
        long tf = scanner.nextLong();
        System.out.print("Enter the Window Size: ");
        long N = scanner.nextLong();

        long i = 1;
        long[] tt = {0}; // Using an array to allow passing by reference
        transmission(i, N, tf, tt);

        System.out.println("Total number of frames which were sent and resent are: " + tt[0]);

        scanner.close();
    }
}