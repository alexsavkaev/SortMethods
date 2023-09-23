public class Program {
    public static void main(String[] args) {
        int[] array = ArrayUtils.prepareArray();
/*        ArrayUtils.printArray(array);
        array = ArrayUtils.prepareArray();
        System.out.println();
        SortUtils.directSort(array);
        ArrayUtils.printArray(array);
        SortUtils.quickSort(array);
        ArrayUtils.printArray(array);
        SortUtils.heapSort(array);
        ArrayUtils.printArray(array);
*/
        array = ArrayUtils.prepareArray(300000);
        int[] array1 = array.clone();
        long startTime = System.currentTimeMillis();
        SortUtils.directSort(array1);
        long endTime = System.currentTimeMillis();
        System.out.printf("Сортировка выбором: %d мс.\n", endTime - startTime);

        int[] array2 = array.clone();
        startTime = System.currentTimeMillis();
        SortUtils.quickSort(array2);
        endTime = System.currentTimeMillis();
        System.out.printf("Быстрая сортировка: %d мс.\n", endTime - startTime);

        int[] array3 = array.clone();
        startTime = System.currentTimeMillis();
        SortUtils.heapSort(array3);
        endTime = System.currentTimeMillis();
        System.out.printf("Сортировка кучей: %d мс.\n", endTime - startTime);
    /*
        array = new int[] {-5, 10, 11, -6, 50, 4, -8,9};
        ArrayUtils.printArray(array);
        SortUtils.quickSort(array);
        ArrayUtils.printArray(array);
        int searchElement = 12;
        int searchRes = SearchUtils.binarySearch(array, searchElement);
        System.out.printf("Значение %d %s\n", searchElement,
                searchRes>=0? String.format("найдено в массиве по индексу %d",searchRes):
                "Не найдено в массиве");
    */

    }


}
