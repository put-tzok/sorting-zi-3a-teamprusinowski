package pl.prusinowski.Alogrithm;

import pl.prusinowski.Interface.Swappable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSortRandomPivot implements Swappable {
    private List<Integer> dataSource;

    public QuickSortRandomPivot(List<Integer> dataSource) {
        this.dataSource = new ArrayList<>(dataSource);
    }

    public QuickSortRandomPivot() {
    }

    public void setDataSource(List<Integer> dataSource) {
        this.dataSource = dataSource;
    }

    public List<Integer> sort(){
        Random random = new Random();

        quickSortRandomPivot(0,this.dataSource.size()-1);

        return this.dataSource;
    }
    private void quickSortRandomPivot( int left , int right){
        if(left >= right){
            return;
        }
        randomPivot(left, right);
        int pivot = this.dataSource.get(right);

        int border = left-1;
        int i = left;
        while(i<right){
            if (this.dataSource.get(i) < pivot){
                border++;
                if (border != i ){
                    Swappable.swap(border, i , this.dataSource);
                }
            }
            i++;
        }
        border++;
        if (border!=right){
            Swappable.swap(border , right , this.dataSource);
        }

        quickSortRandomPivot(left  , border-1);
        quickSortRandomPivot(border+1 , right );
    }
    private void randomPivot(int left, int right){
        int range = right - left;
        Random random = new Random();
        int border = left + random.nextInt(range);
        if (border != right){
            Swappable.swap(border , right , this.dataSource);
        }
    }
}
