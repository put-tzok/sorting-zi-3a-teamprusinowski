package pl.prusinowski.Interface;

import java.util.List;

public interface Swappable {
    static void swap(int from , int to  , List<Integer> data){
        int tmp = data.get(from);
        data.set(from , data.get(to));
        data.set(to,tmp );
    }
}
