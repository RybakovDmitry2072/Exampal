package semestrivka;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Array {
    public List<Integer> createArray(){
        List<Integer> array=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < 1000; i++) {
            array.add(random.nextInt(1000)+1);
        }
        return array;
    }
}
