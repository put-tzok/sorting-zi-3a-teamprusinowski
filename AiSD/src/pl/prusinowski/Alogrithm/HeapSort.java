package pl.prusinowski.Alogrithm;
import pl.prusinowski.Interface.Swappable;

import java.util.ArrayList;
import java.util.List;

public class HeapSort implements Swappable {
    private List<Integer> dataSource;

    public HeapSort(List<Integer> data) {
        this.dataSource = new ArrayList<>(data);
    }

    public HeapSort() {
    }

    public void setDataSource(List<Integer> dataSource) {
        this.dataSource = dataSource;
    }

    public List<Integer> sort(){
        int n = dataSource.size();

        for(int i = n / 2 - 1; i >= 0; i--){
            maxHeap(dataSource, n, i);
        }

        for(int i = n - 1; i > 0; i--){
            Swappable.swap(i, 0, dataSource);
            --n;
            maxHeap(dataSource, n, 0);
        }
        return dataSource;
    }

    private void maxHeap(List<Integer> data, int heapSize, int parentIndex){
        int maxIndex = parentIndex;
        int leftChild = parentIndex * 2 + 1;
        int rightChild = parentIndex * 2 + 2;

        if(leftChild < heapSize && dataSource.get(leftChild) > dataSource.get(maxIndex)){
            maxIndex = leftChild;
        }
        if(rightChild < heapSize && dataSource.get(rightChild) > dataSource.get(maxIndex)){
            maxIndex = rightChild;
        }
        if(maxIndex != parentIndex){
            Swappable.swap( maxIndex, parentIndex,dataSource);
            maxHeap(dataSource, heapSize, maxIndex);
        }
    }
}
