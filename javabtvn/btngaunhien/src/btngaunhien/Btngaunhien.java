package btngaunhien;

import java.util.Random;

public class Btngaunhien {

    public static void main(String[] args) {
        Random rad = new Random();
        int random1 = rad.nextInt(100 - 23 + 1) + 23;
        if (random1 % 2 != 0) {
            System.out.println("so le la: " + random1);
        } else {
            System.out.println("so chan la: " + random1);
        }
    }
}
