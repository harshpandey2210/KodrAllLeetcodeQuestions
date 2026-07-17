class Solution {
    public int countDigits(int num) {
        int copy = num;
        int total = 0;
        while(copy > 0){
            int a = copy % 10;
            if(num % a == 0) total++;
            copy = copy / 10;
        }
        return total;
    }
}