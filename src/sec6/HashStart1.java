package sec6;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {

        Integer[] inputArr = new Integer[4];

        inputArr[0] = 1;
        inputArr[1] = 2;
        inputArr[2] = 5;
        inputArr[3] = 8;

        System.out.println("inputArr = " + Arrays.toString(inputArr));

        int searchVal = 8;

        for (int inputVal : inputArr){
            if (inputVal == searchVal){
                System.out.println("inputVal = " + inputVal);
            }
        }
    }
}
