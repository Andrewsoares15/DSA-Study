package study.bynarySearch;

public class BinarySearch {

    private static Integer binarySearch(int[] nums, int target) {
        var right = nums.length - 1;
        var left = 0;

        while(left < right) { // temos uma variação aqui, ou usamos o sinal de igual aqui. Nesse caso conseguimos garantir que sempre teremos acesso ao mid + 1

            int mid = (left + right) / 2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        if(nums[left] ==  target) return left; // ou fazemos a verificação aqui, quando os valores se equivalem

        return -1;
    }
    //When
    private static Integer binarySearch2(int[] nums, int target) {
        var right = nums.length - 1;
        var left = 0;

        while(left + 1 < right) { // Nesse caso conseguimos garantir que sempre teremos acesso ao mid + 1 e ao mid - 1

            int mid = left + (right - left) / 2; // Não cair no cenário de integer overflow

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        // nesse caso aqui ao sair do loop, left e right serão valores diferentes, então precisamos verificar os dois
        if(nums[left] ==  target) return left;
        if(nums[right] ==  target) return right;
        return -1;
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
