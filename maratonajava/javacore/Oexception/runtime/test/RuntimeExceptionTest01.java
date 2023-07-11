package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //checked e unchecked


        Object object = null;
        //object.toString();            nao existe nada no objeto = nullpinterexception


        int[] nums = {1,2};
        //System.out.println(nums[2]);      // nao existe posição numero 2 no array = arrayindexoutofboundsexception
    }
}