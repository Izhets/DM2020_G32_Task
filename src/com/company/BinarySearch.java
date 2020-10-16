package com.company;

//Хныкин 3.2
//Сложность данного алгоритма - O(log (N)).

public class BinarySearch {

    private static int count = 0;
    private static int countRec = 0;

//    public static int binarySearch(int arr[], int elementToSearch) {
//
//        int firstIndex = 0;
//        int lastIndex = arr.length - 1;
//
//        // условие прекращения (элемент не представлен)
//        while (firstIndex <= lastIndex) {
//            int middleIndex = (firstIndex + lastIndex) / 2;
//            // если средний элемент - целевой элемент, вернуть его индекс
//            if (arr[middleIndex] == elementToSearch) {
//                count++;
//                return middleIndex;
//            }
//
//            // если средний элемент меньше
//            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
//            else if (arr[middleIndex] < elementToSearch) {
//                count++;
//                firstIndex = middleIndex + 1;
//            }
//
//                // если средний элемент больше
//                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
//            else if (arr[middleIndex] > elementToSearch){
//                count++;
//                lastIndex = middleIndex - 1;
//            }
//        }
//        return -1;
//    }

    //Итеративный вариант
    public static int binarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            count++;
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            else if (arr[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }

            else if (arr[middleIndex] > elementToSearch){
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    //Рекурсивный вариант
    public static int recBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {

        if (lastElement >= firstElement) {
            countRec++;
            int mid = firstElement + (lastElement - firstElement) / 2;

            if (arr[mid] == elementToSearch){
                //countRec++;
                return mid;
            }

            if (arr[mid] > elementToSearch){
                //countRec++;
                return recBinarySearch(arr, firstElement, mid - 1, elementToSearch);
            }

            return recBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }
        return -1;
    }

    public static void print(int elementToSearch, int index) {
        System.out.println();
        System.out.println("Результат бинарного поиска (итерация): ");
        if (index == -1) {
            System.out.println(elementToSearch + " не найдено.");
        } else {
            System.out.println(elementToSearch + " соответствует индексу: " + index);
        }
        System.out.println("Операций было выполнено: " + count);
    }

    public static void printRec (int elementToSearch, int index) {
        System.out.println();
        System.out.println("Результат бинарного поиска (рекурсия): ");
        if (index == -1) {
            System.out.println(elementToSearch + " не найдено.");
        } else {
            System.out.println(elementToSearch + " соответствует индексу: " + index);
        }
        System.out.println("Операций было выполнено: " + countRec);
    }
}
