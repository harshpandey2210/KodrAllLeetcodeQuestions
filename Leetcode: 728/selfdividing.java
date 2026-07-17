class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> l = new ArrayList<>();
        while(left <= right){
            int num = left;
            boolean flag = false;
            while(num > 0){
                int a = num % 10;
                if(a != 0 && (left % a == 0)){
                    flag  = true;
                }
                else{
                    flag = false;
                    break;
                }
                num = num / 10;
            }
            if(flag == true) l.add(left);
            left++;
        }
        return l;
    }
}