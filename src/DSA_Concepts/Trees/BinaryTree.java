package DSA_Concepts.Trees;

import java.util.Scanner;

public class BinaryTree {

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }


    }
    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root element");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(root, scanner);
    }

    private void populate(Node node, Scanner scanner) {
        if(node == null) {
            return;
        }
        System.out.println("You want to enter left of the node "+node.data);
        boolean l = scanner.nextBoolean();
        if (l) {
            System.out.println("Enter value");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(node.left, scanner);
        }

        System.out.println("You want to enter right  of the node "+node.data);
        boolean r = scanner.nextBoolean();
        if (r) {
            System.out.println("Enter value");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(node.right, scanner);
        }
    }

    public void display() {
        display(root, 0);
    }

    private void display(Node node, int level) {
        if (node == null) {
            return;
        }

        display(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----------->" +node.data);
        }else {
            System.out.println(node.data);
        }

        display(node.left, level + 1);


    }

}
