package SamuelKabuya_COMP254Lab7_Ex1;

public class Exercise1App {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] data = {50, 30, 70, 20, 40, 60, 80, 10, 35, 65};
        for (int value : data) {
            bst.insert(value);
        }

        int[] targets = {60, 35, 99};

        System.out.println("Iterative treeSearch");
        for (int target : targets) {
            BinarySearchTree.Node result = bst.treeSearchIterative(target);
            if (result != null) {
                System.out.println("Key " + target + " found.");
            } else {
                System.out.println("Key " + target + " not found.");
            }
        }

        System.out.println("\nDeep Unbalanced Tree Quick Check");
        BinarySearchTree unbalanced = new BinarySearchTree();
        for (int i = 1; i <= 20000; i++) {
            unbalanced.insert(i);
        }

        BinarySearchTree.Node deepResult = unbalanced.treeSearchIterative(20000);
        System.out.println("Search for 20000 in unbalanced tree: " + (deepResult != null ? "found" : "not found"));
    }
}
