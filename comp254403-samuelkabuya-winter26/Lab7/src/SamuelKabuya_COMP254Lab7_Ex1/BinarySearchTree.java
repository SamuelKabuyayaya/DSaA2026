package SamuelKabuya_COMP254Lab7_Ex1;

public class BinarySearchTree {

    public static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    private Node root;

    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
            return;
        }

        Node current = root;
        while (true) {
            if (key < current.key) {
                if (current.left == null) {
                    current.left = new Node(key);
                    return;
                }
                current = current.left;
            } else if (key > current.key) {
                if (current.right == null) {
                    current.right = new Node(key);
                    return;
                }
                current = current.right;
            } else {
                return;
            }
        }
    }

    public Node treeSearchIterative(int key) {
        Node walk = root;
        while (walk != null && walk.key != key) {
            if (key < walk.key) {
                walk = walk.left;
            } else {
                walk = walk.right;
            }
        }
        return walk;
    }

    public Node treeSearchRecursive(int key) {
        return treeSearchRecursive(root, key);
    }

    private Node treeSearchRecursive(Node p, int key) {
        if (p == null || p.key == key) {
            return p;
        }
        if (key < p.key) {
            return treeSearchRecursive(p.left, key);
        }
        return treeSearchRecursive(p.right, key);
    }

    public Node getRoot() {
        return root;
    }
}
