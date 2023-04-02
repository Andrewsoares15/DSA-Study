package study.recursion;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
//        int sumLoop = sumRecursion(new int[]{1, 2, 3, 4, 3});
//        System.out.println(sumLoop);

//        int biggestValue = getBiggestValue(new int[]{1, 30, 4, 15, 20, 7});
//        System.out.println(biggestValue);
////
//
        int countRecursion = countRecursion((new int[]{0, 1, 2, 3, 4, 5}));// 6
        System.out.println(countRecursion);
    }

    static int sumRecursion(int[] intList) {
        if (intList.length == 2) {
            return intList[0] + intList[1]; // caso base
        }
        else {
            return intList[0] + (sumRecursion(Arrays.copyOfRange(intList, 1, intList.length)));
        }
    }

    static int sumLoop(int[] intList) {
        int sum = 0;
        for (int i = 0; i < intList.length; i++) {
            sum += intList[i];
        }
        return sum;
    }

    static int countRecursion(int[] list) {
        if (list.length == 1) {
            return 1;
        }else {
            return 1 + (countRecursion(Arrays.copyOfRange(list, 1, list.length)));
        }
    }

    static int getBiggestValue(int[] list) {
        if (list.length == 2)
            return list[0] < list[1] ? list[0] : list[1];

        int max = getBiggestValue(Arrays.copyOfRange(list, 1, list.length));
        return max > list[0] ? max : list[0];
    }

}
