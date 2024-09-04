
package btktra;


import java.util.ArrayList;

public class Btktra {
    
    // 1. Method nhập mảng số thực
    public static int[] importData(int[] arrays) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int value : arrays) {
            list.add(value);
        }
        // Chuyển ArrayList về mảng int[]
        return list.stream().mapToInt(i -> i).toArray();
    }

    // 2. Method xuất mảng ra màn hình
    public static void printData(float[] arrays) {
        for (float value : arrays) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 3. Method tìm giá trị phần tử lớn thứ 2 trong mảng
    public static int findMax2(int[] arrays) {
        if (arrays.length < 2) {
            System.out.println("Mảng không có đủ phần tử để tìm giá trị lớn thứ 2.");
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

    // 4. Method xoá các phần tử lẻ ra khỏi mảng
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


