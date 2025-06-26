import java.util.Scanner;

public class studentRecords {
    static int roll[] = new int[100];
    static String name[] = new String[100];
    static int marks[] = new int[100];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All");
            System.out.println("3. Sort by Roll");
            System.out.println("4. Search by Roll");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter Roll: ");
                roll[count] = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Enter Name: ");
                name[count] = sc.nextLine();
                System.out.print("Enter Marks: ");
                marks[count] = sc.nextInt();
                count++;
            } else if (ch == 2) {
                for (int i = 0; i < count; i++) {
                    System.out.println("Roll: " + roll[i] + ", Name: " + name[i] + ", Marks: " + marks[i]);
                }
            } else if (ch == 3) {
                for (int i = 0; i < count - 1; i++) {
                    for (int j = 0; j < count - i - 1; j++) {
                        if (roll[j] > roll[j + 1]) {
                            int temp = roll[j];
                            roll[j] = roll[j + 1];
                            roll[j + 1] = temp;

                            String tname = name[j];
                            name[j] = name[j + 1];
                            name[j + 1] = tname;

                            int tmarks = marks[j];
                            marks[j] = marks[j + 1];
                            marks[j + 1] = tmarks;
                        }
                    }
                }
                System.out.println("Sorted by roll number.");
            } else if (ch == 4) {
                System.out.print("Enter roll to search: ");
                int key = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (roll[i] == key) {
                        System.out.println("Found: " + name[i] + ", Marks: " + marks[i]);
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println("Not found.");
            } else if (ch == 5) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
