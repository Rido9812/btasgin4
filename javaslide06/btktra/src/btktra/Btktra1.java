
package btktra;


import java.util.ArrayList;

public class Btktra1 {
    
    
    public static int[] importData(int[] arrays) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int value : arrays) {
            list.add(value);
        }
     
        return list.stream().mapToInt(i -> i).toArray();
    }

   
    public static void printData(float[] arrays) {
        for (float value : arrays) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


    public static int findMax2(int[] arrays) {
        if (arrays.length < 2) {
            System.out.println("Mang khong co đu phan tu đe tim gia tri lon thu 2.");
            return Integer.MIN_VALUE;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int value : arrays) {
            if (value > max1) {
                max2 = max1;
                max1 = value;
            } else if (value > max2 && value != max1) {
                max2 = value;
            }
        }
        return max2;
    }

    
    public static int[] deleteOddNumber(int[] arrays) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int value : arrays) {
            if (value % 2 == 0) {
                list.add(value);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}


