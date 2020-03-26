package pl.prusinowski.Alogrithm;

import pl.prusinowski.Interface.Swappable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort implements Swappable {
    private List<Integer> dataSource;

    public QuickSort(List<Integer> data) {
        this.dataSource = new ArrayList<>(data);
    }

    public QuickSort() {
    }

    public void setDataSource(List<Integer> dataSource) {
        this.dataSource = dataSource;
    }

    public List<Integer> sort(){
        Random random = new Random();

        quickSort(0,dataSource.size()-1);

        return dataSource;
    }
    private void quickSort( int left , int right){
        if(left >= right){
            return;
        }
        int pivot = dataSource.get(right);
        int border = left-1;
        int i = left;
        while(i<right){
            if (dataSource.get(i) < pivot){
                border++;
                if (border != i ){
                    Swappable.swap(border, i , dataSource);
                }
            }
            i++;
        }
        border++;
        if (border!=right){
            Swappable.swap(border , right , dataSource);
        }
        quickSort(left  , border-1);
        quickSort(border+1 , right );
    }
}
