package SamuelKabuya_COMP254Lab5_Ex2;

import SamuelKabuya_COMP254Lab5_Ex1.Exercise1;

public class Exercise2 {

    static class Node {
        int element;
        Node left, right;

        Node(int element) {
            this.element = element;
        }
    }

    public static int printHeights(Node p){

        if (p == null){
            return -1;
        }

        int leftH = printHeights(p.left);
        int rightH = printHeights(p.right);

        int currentHeight = 1 + Math.max(leftH, rightH);

        System.out.println("Element: " + p.element + " Height: " + currentHeight);

        return currentHeight;
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(8);
        root.right = new Node(25);
        root.left.left = new Node(9);
        root.left.right = new Node(6);

        System.out.println("Postorder Traversal");
        printHeights(root);
    }
}
