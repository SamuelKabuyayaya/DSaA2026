package SamuelKabuya_COMP254Lab6_Ex2;

public class Task_2 {
    public static void main(String[] args) {
        SortedTableMap<String, Integer> map = new SortedTableMap<>();

        map.put("Apple", 100);
        map.put("Banana", null);

        System.out.println("Testing containsKey");

        // 1. Normal key with everything
        System.out.println("Checking 'Apple':");
        System.out.println("containKey: " + map.containKey("Apple"));
        System.out.println("get value: " + map.get("Apple"));

        // 2. Key with null
        System.out.println("\n Checking 'Banana':");
        System.out.println("containKey: " + map.containKey("Banana"));
        System.out.println("get value: " + map.get("Banana"));

        // 3. Key that does not exist
        System.out.println("\n Checking 'Peach': ");
        System.out.println("containKey: " + map.containKey("Peach"));
        System.out.println("get value: " + map.get("Peach"));

    }
}
