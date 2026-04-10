package SamuelKabuya_COMP254Lab6_Ex2;

public class Task_2 {
    public static void main(String[] args) {
        SortedTableMap<String, Integer> map = new SortedTableMap<>();

        // I  added a key Apple with a value 100
        map.put("Apple", 100);
        // I  added a key Banana with null value since instructions asked it for testing
        map.put("Banana", null);

        System.out.println("Testing containsKey");

        // 1. Normal key with everything
        System.out.println("1. Checking 'Apple':");
        System.out.println("containKey: " + map.containKey("Apple"));
        System.out.println("get value: " + map.get("Apple"));

        // 2. Key with null
        System.out.println("\n2. Checking 'Banana':");
        System.out.println("containKey: " + map.containKey("Banana"));
        System.out.println("get value: " + map.get("Banana"));

        // 3. Key that does not exist
        System.out.println("\n3. Checking 'Peach' (does NOT exist):");
        System.out.println("containKey: " + map.containKey("Peach"));
        System.out.println("get value: " + map.get("Peach"));

    }
}
