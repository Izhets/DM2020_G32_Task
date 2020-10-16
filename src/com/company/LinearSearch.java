package com.company;

//Хныкин 3.2
//Сложность данного алгоритма - O(N).

public class LinearSearch {

    private static int count = 0;

    public static int linearSearch(int arr[], int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            count++;
            if (arr[index] == elementToSearch){
                return index;
            }
        }
        return -1;
    }

    public static void print(int elementToSearch, int index) {
        System.out.println();
        System.out.println("Результат линейного поиска: ");
        if (index == -1){
            System.out.println(elementToSearch + " не найдено.");
        }
        else {
            System.out.println(elementToSearch + " соответствует индексу: " + index);
        }
        System.out.println("Операций было выполнено: " + count);
    }

}
