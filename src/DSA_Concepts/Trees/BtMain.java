package DSA_Concepts.Trees;

import java.util.Scanner;

public class BtMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.display();
    }
}
