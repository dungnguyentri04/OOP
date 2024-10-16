package bth7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();

        for (int i = 0 ; i < n ; i++){
            int value;
            value = scanner.nextInt();
            binaryTree.insert(value);
        }

        binaryTree.traversal("preorder");

    }
}