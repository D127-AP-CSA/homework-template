import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(arr));
    }
}