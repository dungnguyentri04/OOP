package bth2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Stack stack = new Stack();
        System.out.println("Input n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            int k = scanner.nextInt();
            stack.push(k);
        }
        System.out.println(stack.peak());
        stack.displayElement();
        System.out.println(stack.numOfElement());
    }
}
