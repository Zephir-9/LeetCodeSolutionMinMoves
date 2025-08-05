package MinMoves;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Array size: ");
        int size = input.nextInt();
        int[] num = new int[size];

        System.out.println("Enter " + size + " numbers");
        for(int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            num[i] = input.nextInt();
        }
        System.out.println("Moves: " + MinMovesService.minMoves2(num));
    }
}