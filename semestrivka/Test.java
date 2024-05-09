package semestrivka;

import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random=new Random();
        Array arrayTest=new Array();
        List<Integer> array=arrayTest.createArray();
        BinomialHeap<Integer> binomialHeap=new BinomialHeap<>();
        long startTime, endTime;
        for (int i = 0; i < array.size(); i++) {
            startTime = System.nanoTime();// Зафиксируем время перед вставкой

            binomialHeap.insert(array.get(i));

            endTime = System.nanoTime(); // Зафиксируем время после вставки
            long insertionTime = endTime - startTime; // Рассчитаем время выполнения вставки
            //System.out.println("Insertion " + (i+1) + " took: " + insertionTime + " nanoseconds");
        }
        BinomialHe
        //binomialHeap.delete();
//        for (int i = 0; i < 100; i++) {
//            startTime = System.nanoTime();// Зафиксируем время перед вставкой
//
//            binomialHeap.search(random.nextInt(1000)+1);
//
//            endTime = System.nanoTime(); // Зафиксируем время после вставки
//            long insertionTime = endTime - startTime; // Рассчитаем время выполнения вставки
//            System.out.println("Search " + (i+1) + " took: " + insertionTime + " nanoseconds");
//        }

    }

}
