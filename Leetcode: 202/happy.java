class Solution {
    public boolean isHappy(int n) {
        if(n == 1) return true;
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        while(sum != 1){
            set.add(n);
            while(n > 0){
                int a = n % 10;
                sum = sum + (a*a);
                n = n / 10;
            }
            if(set.contains(sum)) return false;
            if(sum != 1){
                n = sum;
                sum = 0;
            }
        }
        return true;
    }
}