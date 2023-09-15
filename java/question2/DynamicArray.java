/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

/**
 *
 * @author ashfa
 */
public class DynamicArray {
    private int[] array;
    private int size;

    public DynamicArray(int initial_capacity) {
        array = new int[initial_capacity];
        size = 0;
    }

    public void print_array() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void add_element(int element) {
        if (size == array.length) {
            resize_array();
        }
        array[size] = element;
        size++;
    }

    public void add_element(int element, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        if (size == array.length) {
            resize_array();
        }
        for (int i = size; i > position; i--) {
            array[i] = array[i - 1];
        }
        array[position] = element;
        size++;
    }

    public void remove_elmnt(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }
        for (int i = position; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public int search_element(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    private void resize_array() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public static void main(String[] args) {
        DynamicArray dynamic_array = new DynamicArray(5);

        dynamic_array.add_element(10);
        dynamic_array.add_element(20);
        dynamic_array.add_element(30);
        dynamic_array.add_element(40);
        dynamic_array.add_element(50);
        dynamic_array.print_array(); // Output: 10 20 30 40 50

        dynamic_array.add_element(25, 1);
        dynamic_array.print_array(); // Output: 10 25 20 30 40 50

        dynamic_array.remove_elmnt(3);
        dynamic_array.print_array(); // Output: 10 25 20 40 50

        int search_index = dynamic_array.search_element(25);
        if (search_index != -1) {
            System.out.println("Element 25 found at index: " + search_index);
        } else {
            System.out.println("Element 25 not found");
        }
    }
}
