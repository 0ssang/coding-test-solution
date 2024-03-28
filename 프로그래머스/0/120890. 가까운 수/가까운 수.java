class Solution {
    public int solution(int[] arr, int n) {
        int res = 0;
        int near = Integer.MAX_VALUE;
        int cur = 0;
        int index = 0;
        for(int i=0; i<arr.length; i++){
            cur = n - arr[i];
            if(cur < 0)
                cur *= -1;
            if(cur < near){
                near = cur;
                index = i;
                res = arr[i];
            }else if(cur == near){
                if(arr[index] < arr[i])
                    res = arr[index];
                else
                    res = arr[i];
            }
        }
        return res;
    }
}