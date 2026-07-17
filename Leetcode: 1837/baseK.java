class Solution {
    public int sumBase(int n, int k) {
        if(n == k) return 1;
        if(n < k) return n;
        int rem = 0;
        while(n >= k){
            int a = n % k;
            rem = (rem * 10) + a;
            n = n / k;

            if(n < k){
                rem = (rem * 10) + n;
                break;
            }
        }
        System.out.println(rem);
        int sum = 0;
        while(rem > 0){
            int a = rem % 10;
            sum = sum + a;
            rem = rem / 10;
        }
        return sum;
    }
}