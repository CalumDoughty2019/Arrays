import java.util.Arrays;

public class ReverseTest {
    public static void main(String[] args) {
        PrintArray printArray = new PrintArray();

        int[] test = new int[5];
        for (int i = 0; i < test.length; i++) {
            //int k = (int) Math.random();
            int k = (int) (Math.random() * 22);
            test[i] = k;
        }
        System.out.println("The ACTUAL values are: " + Arrays.toString(test));
        printArray.reverse(test);
    }
}
