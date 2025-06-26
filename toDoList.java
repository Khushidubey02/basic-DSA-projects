import java.util.Scanner;
import java.util.Stack;

public class toDoList {
    public static void main(String[] args) {
        Stack<String> undo = new Stack<>();
        Stack<String> redo = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                undo.push(task);
                redo.clear(); 
            } else if (choice == 2) {
                if (!undo.isEmpty()) {
                    String task = undo.pop();
                    redo.push(task);
                    System.out.println("Undone: " + task);
                } else {
                    System.out.println("No task to undo.");
                }
            } else if (choice == 3) {
                if (!redo.isEmpty()) {
                    String task = redo.pop();
                    undo.push(task);
                    System.out.println("Redone: " + task);
                } else {
                    System.out.println("No task to redo.");
                }
            } else if (choice == 4) {
                System.out.println("Your tasks:");
                for (int i = undo.size() - 1; i >= 0; i--) {
                    System.out.println("- " + undo.get(i));
                }
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Wrong choice!");
            }
        }
    }
}
