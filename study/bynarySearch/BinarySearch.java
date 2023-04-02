package study.bynarySearch;

public class BinarySearch {
    // has to return boxed integer in order to comfort to interface defined in the book
    private static Integer binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1; // 1
        int i = 0;
        long initialTime = System.currentTimeMillis();
        while (low <= high) {
            i++;
            int mid = (low + high) / 2;
            int trY = list[mid];
            if (trY == item) {
                long finish = System.currentTimeMillis();
                long finalTime = finish - initialTime;
                System.out.println(finalTime);
                System.out.println(i);
                return item;
            }
            if (trY > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] myList = new int[100000000]; // 101 -> 101
        for(int i = 0; i < 100000000;i++){
            myList[i] = i;
        }
//        int i = 0;
//        long initialTime = System.currentTimeMillis();
//        for (int num : myList){
//            if (num == 10000000) {
//                long finish = System.currentTimeMillis();
//                long finalTime = finish - initialTime;
//                System.out.println(finalTime);
//                System.out.println(i);
//            }
//13
//10000000
//            i++;
//        }
        System.out.println(binarySearch(myList, 10000000)); // null
    }
}
