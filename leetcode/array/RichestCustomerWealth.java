package leetcode.array;

public class RichestCustomerWealth {
    static int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for(int i = 0; i < accounts.length; i++) {
            int auxCount = 0;
            for(int num : accounts[i]) {
                auxCount += num;
            }
            if (auxCount > wealth)
                wealth =  auxCount;
        }
        return wealth;
    }
}
