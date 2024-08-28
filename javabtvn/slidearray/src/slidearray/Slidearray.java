package slidearray;
import java.util.Arrays;

public class Slidearray {

    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println("number :");
    for (int i = 0; i < 8; i++) {
            arr[i] = i ;
            System.out.print( " " +arr[i] + " ");
        }
        System.out.println(Arrays.toString(arr));
    }

}
