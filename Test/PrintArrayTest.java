import java.util.Arrays;

public class PrintArrayTest {
    public static void main(String[] args) {
        PrintArray printArray = new PrintArray();

        int[] test = new int[5];
        for(int i = 0; i < test.length; i++){
            //int k = (int) Math.random();
            int k = (int) (Math.random() * 22);
            test[i] = k;
        }
        System.out.println("The ACTUAL values are: " + Arrays.toString(test));
        printArray.reverse(test);


        //printArray.copyOf(test);
        System.out.println("The COPIED values are: " + Arrays.toString(printArray.copyOf(test)));


        int[] test2 = new int[5];
        for(int i = 0; i < test2.length; i++){
            //int k = (int) Math.random();
            int k = (int) (Math.random() * 9);
            test2[i] = k;
        }
        //printArray.swap(test, test2);
        System.out.println("The ACTUAL values of ARRAY1 are: " + Arrays.toString(test));
        System.out.println("The ACTUAL values of ARRAY2 are: " + Arrays.toString(test2));
        System.out.println("The have been swapped?: " + printArray.swap(test, test2));
    }
}
