package pl.prusinowski.Alogrithm;

import pl.prusinowski.Interface.Swappable;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort implements Swappable {
    private List<Integer> dataSource;

    public InsertionSort(List<Integer> data) {
        this.dataSource = new ArrayList<>(data);
    }

    public InsertionSort() {
    }

    public void setDataSource(List<Integer> dataSource) {
        this.dataSource = dataSource;
    }

    public List<Integer> sort(){
        for (int i = 1; i < dataSource.size(); i++){
            for (int j = i ; j >=1; j--){
                if (dataSource.get(j-1) > dataSource.get(j)){
                    Swappable.swap(j-1 , j , dataSource);
                }
            }
        }
        return dataSource;
    }
}
