package DSA_Concepts.Trees;

import java.util.Scanner;

public class BtMain {
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        Scanner scanner = new Scanner(System.in);
//        tree.populate(scanner);
//        tree.display();

        int[] arr = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        BinarySearchTree bsTree = new BinarySearchTree();
        bsTree.populate(arr);
        bsTree.display();

    }
}
