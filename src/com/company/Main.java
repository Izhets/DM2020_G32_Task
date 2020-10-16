package com.company;

//Хныкин 3.2

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int array [] = {10,20,30,40,45,50,58,60,62,75,78,80,91};
        //int array [] = {1,2,3,4,5,6,7,8,9,10,11,12};

        System.out.print("Введен массив: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите искомый элемент: ");
        int elementSearch = sc.nextInt();

        int index = LinearSearch.linearSearch(array, elementSearch);
        LinearSearch.print(elementSearch, index);

        int binaryIndex = BinarySearch.binarySearch(array, elementSearch);
        BinarySearch.print(elementSearch, binaryIndex);

        int recBinaryIndex = BinarySearch.recBinarySearch(array, 1, array.length - 1, elementSearch);
        BinarySearch.printRec(elementSearch, recBinaryIndex);
    }
}