import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ticketQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        while (true) {
            System.out.println("\n1. Book Ticket");
            System.out.println("2. Serve Ticket");
            System.out.println("3. Show Queue");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                queue.add(name);
                System.out.println("Ticket booked for " + name);
            } else if (ch == 2) {
                if (!queue.isEmpty()) {
                    System.out.println("Now serving: " + queue.poll());
                } else {
                    System.out.println("Queue is empty.");
                }
            } else if (ch == 3) {
                System.out.println("Current Queue:");
                for (String name : queue) {
                    System.out.println("- " + name);
                }
            } else if (ch == 4) {
                break;
            } else {
                System.out.println("Invalid.");
            }
        }
    }
}
