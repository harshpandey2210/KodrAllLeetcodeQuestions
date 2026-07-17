class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while(true){
            while(num > 0){
            int a = num % 10;
            sum = sum + a;
            num = num / 10;
        }
            if(sum > 9){
                num = sum;
                sum = 0;
            }
            else break;
        }
        return sum;
    }
}