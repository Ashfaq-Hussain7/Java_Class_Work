/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question3;

import java.util.Scanner;
/**
 *
 * @author ashfa
 */
public class PascalsTriangle {
   

    public static void print_ptriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.format("%" + (rows - i) * 2 + "s", ""); // Print spaces before each row

            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number); // Print each number in a formatted width
                number = number * (i - j) / (j + 1); // Calculate the next number
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();
        scanner.close();

        print_ptriangle(rows);
    }
}


