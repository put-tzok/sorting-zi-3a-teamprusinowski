package pl.prusinowski.Alogrithm;

import pl.prusinowski.Interface.Swappable;

import java.util.ArrayList;
import java.util.List;


public class SelectionSort implements Swappable {
    private List<Integer> dataSource;

    public SelectionSort(List<Integer> data) {
        this.dataSource = new ArrayList<>(data);
    }

    public SelectionSort() {
    }

    public void setDataSource(List<Integer> dataSource) {
        this.dataSource = dataSource;
    }

    public List<Integer> sort(){
        for (int i = 0; i < dataSource.size(); i++){

            int minValueIndex=-1; ;

            for (int j = i+1; j < dataSource.size()-1; j++){

                if (dataSource.get(j) > dataSource.get(j+1)){
                    minValueIndex =j+1;
                }else{
                    minValueIndex = j;
                }
            }
            if (minValueIndex!=-1 && (dataSource.get(i) > dataSource.get(minValueIndex))){
                Swappable.swap(i , minValueIndex , dataSource);
            }
        }
        return dataSource;
    }



}
