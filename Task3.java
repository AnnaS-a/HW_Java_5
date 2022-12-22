//Задача 3: Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class Task3 {
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)     // Построение кучи (перегруппируем массив)
            heapify(arr, n, i);

        for (int i=n-1; i>=0; i--) {       // Один за другим извлекаем элементы из кучи 
            int temp = arr[0];           // Перемещаем текущий корень в конец
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);      // Вызываем процедуру heapify на уменьшенной куче
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
// индексом в arr[]. n - размер кучи
     void heapify(int arr[], int n, int i){
        int largest = i;           // Инициализируем наибольший элемент как корень
        int l = 2*i + 1;           // левый = 2*i + 1
        int r = 2*i + 2;           // правый = 2*i + 2

        if (l < n && arr[l] > arr[largest])  // Если левый дочерний элемент больше корня
            largest = l;

          
        if (r < n && arr[r] > arr[largest])    // Если правый дочерний элемент больше, 
            largest = r;                       //чем самый большой элемент на данный момент
       
        if (largest != i) {        // Если самый большой элемент не корень
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest); // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
        }
    }

    static void printArray(int arr[]){   //функция для вывода на экран массива размера n 
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[]) { // Управляющая программа
        int arr[] = {2, 11, 13, 5, 17, 25, 3, 6, 7, 8};
        int n = arr.length;

        Task3 ob = new Task3();
        ob.sort(arr);

        System.out.println("Отсортированный массив");
        printArray(arr);
    }
}
