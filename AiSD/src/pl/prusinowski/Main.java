package pl.prusinowski;

import pl.prusinowski.Alogrithm.*;
import pl.prusinowski.Generator.ValueGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            HeapSort heapSort = new HeapSort();
            InsertionSort insertionSort = new InsertionSort();
            QuickSort quickSort = new QuickSort();
            QuickSortRandomPivot quickSortRandomPivot = new QuickSortRandomPivot();
            SelectionSort selectionSort = new SelectionSort();
            System.out.println("RANDOM");
            System.out.println("heap sort || " + "insertion sort  || " + "quickSort || " + "quickSortRandomPivot || " + "selectionSort" );
        for (int i =1 ; i <=10; i++){

            List<Integer> data = new ArrayList<>();

            ValueGenerator.random(1000 * i, data);

            heapSort.setDataSource(data);
            insertionSort.setDataSource(data);
            quickSort.setDataSource(data);
            quickSortRandomPivot.setDataSource(data);
            selectionSort.setDataSource(data);



            long start_heap = System.currentTimeMillis();
            heapSort.sort();
            System.out.print(System.currentTimeMillis() - start_heap);
            System.out.print(" ");

            long start_insertion = System.currentTimeMillis();
            insertionSort.sort();
            System.out.print(System.currentTimeMillis() - start_insertion);
            System.out.print(" ");

            long start_quick = System.currentTimeMillis();
            quickSort.sort();
            System.out.print(System.currentTimeMillis() - start_quick);
            System.out.print(" ");

            long start_quickRandom = System.currentTimeMillis();
            quickSortRandomPivot.sort();
            System.out.print(System.currentTimeMillis() - start_quickRandom);
            System.out.print(" ");

            long start_selection = System.currentTimeMillis();
            selectionSort.sort();
            System.out.print(System.currentTimeMillis() - start_selection);
            System.out.println();
        }
            System.out.println("MALEJĄCO");
        for (int i =1 ; i <=10; i++){

            List<Integer> data = new ArrayList<>();

            ValueGenerator.decreasing(1000 * i,1000, data);

            heapSort.setDataSource(data);
            insertionSort.setDataSource(data);
            quickSort.setDataSource(data);
            quickSortRandomPivot.setDataSource(data);
            selectionSort.setDataSource(data);



            long start_heap = System.currentTimeMillis();
            heapSort.sort();
            System.out.print(System.currentTimeMillis() - start_heap);
            System.out.print(" ");

            long start_insertion = System.currentTimeMillis();
            insertionSort.sort();
            System.out.print(System.currentTimeMillis() - start_insertion);
            System.out.print(" ");

            long start_quick = System.currentTimeMillis();
            quickSort.sort();
            System.out.print(System.currentTimeMillis() - start_quick);
            System.out.print(" ");

            long start_quickRandom = System.currentTimeMillis();
            quickSortRandomPivot.sort();
            System.out.print(System.currentTimeMillis() - start_quickRandom);
            System.out.print(" ");

            long start_selection = System.currentTimeMillis();
            selectionSort.sort();
            System.out.print(System.currentTimeMillis() - start_selection);
            System.out.println();
        }
            System.out.println("ROSNĄCO");
        for (int i =1 ; i <=10; i++){

            List<Integer> data = new ArrayList<>();

            ValueGenerator.increasing(1000 * i,1000, data);

            heapSort.setDataSource(data);
            insertionSort.setDataSource(data);
            quickSort.setDataSource(data);
            quickSortRandomPivot.setDataSource(data);
            selectionSort.setDataSource(data);



            long start_heap = System.currentTimeMillis();
            heapSort.sort();
            System.out.print(System.currentTimeMillis() - start_heap);
            System.out.print(" ");

            long start_insertion = System.currentTimeMillis();
            insertionSort.sort();
            System.out.print(System.currentTimeMillis() - start_insertion);
            System.out.print(" ");

            long start_quick = System.currentTimeMillis();
            quickSort.sort();
            System.out.print(System.currentTimeMillis() - start_quick);
            System.out.print(" ");

            long start_quickRandom = System.currentTimeMillis();
            quickSortRandomPivot.sort();
            System.out.print(System.currentTimeMillis() - start_quickRandom);
            System.out.print(" ");

            long start_selection = System.currentTimeMillis();
            selectionSort.sort();
            System.out.print(System.currentTimeMillis() - start_selection);
            System.out.println();
        }
        System.out.println("V-KSZTAŁTNY");
        for (int i =1 ; i <=10; i++){

            List<Integer> data = new ArrayList<>();

            ValueGenerator.V_shapely(1000 * i,1000, data);

            heapSort.setDataSource(data);
            insertionSort.setDataSource(data);
            quickSort.setDataSource(data);
            quickSortRandomPivot.setDataSource(data);
            selectionSort.setDataSource(data);



            long start_heap = System.currentTimeMillis();
            heapSort.sort();
            System.out.print(System.currentTimeMillis() - start_heap);
            System.out.print(" ");

            long start_insertion = System.currentTimeMillis();
            insertionSort.sort();
            System.out.print(System.currentTimeMillis() - start_insertion);
            System.out.print(" ");

            long start_quick = System.currentTimeMillis();
            quickSort.sort();
            System.out.print(System.currentTimeMillis() - start_quick);
            System.out.print(" ");

            long start_quickRandom = System.currentTimeMillis();
            quickSortRandomPivot.sort();
            System.out.print(System.currentTimeMillis() - start_quickRandom);
            System.out.print(" ");

            long start_selection = System.currentTimeMillis();
            selectionSort.sort();
            System.out.print(System.currentTimeMillis() - start_selection);
            System.out.println();
        }




    }
}
