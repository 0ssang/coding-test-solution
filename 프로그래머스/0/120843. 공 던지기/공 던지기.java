class Solution {
    public int solution(int[] arr, int k) {
        int res = 0;
        if(arr.length % 2 == 0){
            res = arr[(k-1)% (arr.length / 2) * 2];
        } else{
            int[] newArr = new int[arr.length];
            for(int i = 0; i <= arr.length / 2; i++){
                newArr[i] = arr[i*2];
            }
            for(int i = 0; i < arr.length / 2; i++){
                newArr[arr.length / 2 + i + 1] = arr[2*i + 1];
            }
            res = newArr[(k-1) % arr.length];
        }
        return res;
    }
}