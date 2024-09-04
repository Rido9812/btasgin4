
package btktra;

import java.util.Scanner;

public class Proccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {5, 3, 8, 6, 7, 2}; 
        float[] arrayFloat = {1.2f, 2.3f, 3.4f, 4.5f};

        int choice;
        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Nhap mang so thuc");
            System.out.println("2. Xuat mang ra man hinh");
            System.out.println("3. Tim phan tu lon thu 2 trong mang");
            System.out.println("4. Xoa cac phan tu le khoi mang");
            System.out.println("0. Thoat");
            System.out.print("Chon mot tuy chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    array = Btktra.importData(array);
                    System.out.println("Mang đa đuoc nhap.");
                    break;
                case 2:
                    Btktra.printData(arrayFloat);
                    break;
                case 3:
                    int max2 = Btktra.findMax2(array);
                    if (max2 != Integer.MIN_VALUE) {
                        System.out.println("Phan tu lon thu 2 trong mang: " + max2);
                    }
                    break;
                case 4:
                    array = Btktra.deleteOddNumber(array);
                    System.out.println("Mang sau khi xoa cac phan tu le: ");
                    for (int value : array) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai.");
            }
        } while (choice != 0);

        scanner.close();
    }
}