package maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest13 {
    public static void main(String[] args) {
        long num = 100_000_000;
        //StreamSumParall(num);
        LongStreamSumParall(num);
        forSum(num);

    }
    private static void StreamSumParall(Long num){
        System.out.println("StreamSumParall");
        long init = System.currentTimeMillis();
        Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(end-init);


    }
    private static void LongStreamSumParall(Long num){
        System.out.println("LongStreamSumParall");
        long init = System.currentTimeMillis();
        LongStream.rangeClosed(1L,num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(end-init);


    }

    private static void forSum(Long num){
        System.out.println("ForSum");
        long init = System.currentTimeMillis();
        long result = 0;
        for (int i = 1; i < num ; i++) {
            result =+ i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result+" "+(end-init));
    }
}



