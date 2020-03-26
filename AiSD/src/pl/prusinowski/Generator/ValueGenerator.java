package pl.prusinowski.Generator;

import java.util.List;
import java.util.Random;

public class ValueGenerator {


    public static void random(int amount , List<Integer> data){
        Random random = new Random();
        for (int i  =0 ; i<=amount;i++){
            data.add(random.nextInt(10000));
        }
    }

    public static void increasing(int amount , int interval , List<Integer> data){
        Random random = new Random();
        int startingValue = random.nextInt(10000);
        for (int i  =1; i<=amount;i++){
            data.add(startingValue + (interval*i) ) ;
        }
    }
    public static void decreasing(int amount , int interval , List<Integer> data){
        Random random = new Random();
        int startingValue = random.nextInt(10000);
        for (int i = 1 ; i < amount ;i++){
            data.add(startingValue - (i * interval) );
        }
    }

    public static void V_shapely(int amount , int interval , List<Integer> data){
        Random random = new Random();
        int startingValue = random.nextInt(1000);
        if (amount%2==0){
           for (int i  =1 ; i <= amount/2 ; i++){
               data.add(startingValue - (interval*i));
           }
            startingValue = data.get(data.size()-1);
           for ( int i = 1 ; i <= amount/2 ;i++){
               data.add(startingValue + (interval*i));
           }
        }else {
            for (int i  =1 ; i <=( amount/2 ) +1 ; i++){
                data.add(startingValue - (interval*i));
            }
            startingValue = data.get(data.size());
            for ( int i = 1 ; i <=amount/2 ;i++){
                data.add(startingValue + (interval*i));
            }

        }
    }
}
