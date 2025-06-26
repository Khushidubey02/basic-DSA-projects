import java.util.*;

public class LRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>(3, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > 3;
            }
        };

        while (true) {
            System.out.println("\n1. Put");
            System.out.println("2. Get");
            System.out.println("3. Show Cache");
            System.out.println("4. Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter key and value: ");
                int key = sc.nextInt();
                int value = sc.nextInt();
                cache.put(key, value);
            } else if (ch == 2) {
                System.out.print("Enter key to get: ");
                int key = sc.nextInt();
                if (cache.containsKey(key)) {
                    System.out.println("Value: " + cache.get(key));
                } else {
                    System.out.println("Not found.");
                }
            } else if (ch == 3) {
                System.out.println("Cache: " + cache);
            } else if (ch == 4) {
                break;
            }
        }
    }
}
