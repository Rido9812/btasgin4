
package slidearr;

public class flawed {
    int[] numbers = {11, 42, -5, 27, 0, 89};
    for(int i = 0; i < numbers.length; i++){
    int temp = numbers[i];
    numbers[i] = numbers[numbers.length - 1 - i];
    numbers[numbers.length - 1 -i] = temp;
}
}
