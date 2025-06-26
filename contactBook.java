import java.util.Scanner;

public class contactBook {
    static String[] contacts = new String[100];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Search by Prefix");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter contact name: ");
                contacts[count++] = sc.nextLine().toLowerCase();
            } else if (ch == 2) {
                System.out.print("Enter prefix: ");
                String prefix = sc.nextLine().toLowerCase();
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (contacts[i].startsWith(prefix)) {
                        System.out.println("Suggested: " + contacts[i]);
                        found = true;
                    }
                }
                if (!found) System.out.println("No match.");
            } else if (ch == 3) {
                break;
            } else {
                System.out.println("Wrong choice.");
            }
        }

        sc.close();
    }
}
