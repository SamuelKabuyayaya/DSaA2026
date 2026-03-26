package SamuelKabuya_COMP254Lab5_Ex1;

public class Exercise1 {

    static class Node {
        int element;
        Node left, right, parent;

        Node(int element, Node parent) {
            this.element = element;
            this.parent = parent;
        }
    }
    
    public static Node inorderNext(Node p) {
        if (p == null)
            return null;

        if (p.right != null) {
            Node walk = p.right;
            while (walk.left != null) {
                walk = walk.left;
            }
            return walk;
        }

        Node ancestor = p.parent;
        Node child = p;
        while (ancestor != null && ancestor.right == child) {
            child = ancestor;
            ancestor = ancestor.parent;
        }
        return ancestor;
    }

    public static void main(String[] args) {
        Node root = new Node(1, null);
        root.left = new Node(8, root);
        root.right = new Node(25, root);
        root.left.left = new Node(9, root.left);
        root.left.right = new Node(6, root.left);

        Node nextafter8 = inorderNext(root.left);
        System.out.println("Here is what goes after 8: " + (nextafter8 != null ? nextafter8.element : "null"));

        Node nextafter6 = inorderNext(root.left.right);
        System.out.println("Here is what goes after 6: " + (nextafter6 != null ? nextafter6.element : "null"));

        Node nextafter25 = inorderNext(root.right);
        System.out.println("Here is what goes after 25: " + (nextafter25 != null ? nextafter25.element : "null"));
    }
}
