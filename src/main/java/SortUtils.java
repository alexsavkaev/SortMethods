import java.util.Arrays;
import java.util.Random;

public class SortUtils {
    /**
     * Сортировка выбором
     * @param array массив
     */
    public static void directSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int min = i;
            for (int j = i+1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            if(min != i){
                int buf = array[i];
                array[i] = array[min];
                array[min] = buf;
            }
        }
    }

    public static void quickSort(int[] array){
        quickSort(array, 0, array.length-1);
    }
    private static void quickSort(int[] array, int start, int end){
        int left = start;
        int right = end;
        int middle = array[(start + end)/2];// Значение опорного элемента

        do {
            while (array[left] < middle) {
                left++;
            }
            while (array[right] > middle) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    int buf = array[left];
                    array[left] = array[right];
                    array[right] = buf;
                }
                left++;
                right--;
            }
        }
        while(left<=right);
        if(left < end){
            quickSort(array, left, end);
        }
        if(start < right){
            quickSort(array, start, right);
        }
    }
    public static void heapSort(int[] array){
        //Построение кучи (перегруппируем массив)
        for (int i = array.length/2 -1;i>=0;i--)
            heapify(array,array.length, i);
        //Один за другим извлекаем элементы из кучи
        for (int i = array.length - 1; i>=0; i--){
            // Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // Вызываем процедуру heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }
    private static void heapify(int[] array, int heapsize, int rootindex){
        int largest = rootindex; // инициализируем наибольший элемент как корень
        int leftchild = 2*rootindex +1; // левый = 2*rootindex +1
        int rightchild = 2*rootindex +2; // правый = 2*rootindex +2
        //если левый дочерний элемент больше корня
        if(leftchild < heapsize && array[leftchild] > array[largest])
            largest = leftchild;
        //если правый элемент больше чем самый большой элемент на данный момент
        if(rightchild < heapsize && array[rightchild] > array[largest])
            largest = rightchild;
        // если самый большой элемент не корень
        if(largest != rootindex){
            int temp = array[rootindex];
            array[rootindex] = array[largest];
            array[largest] = temp;
            heapify(array, heapsize, largest);
        }
        // рекурсивно преобразуем в двоичную кучу затронутое поддерево

    }
}










































