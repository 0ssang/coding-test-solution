//import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        // 1. 순수 알고리즘
        int max = -1;
        int idx = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                idx = i;
            }
        }
        int[] res = {max, idx};
        return res;

        // 2. Arrays 의 메서드 사용하기
        //Arrays.sort(arr);
        //int[] res2 = {arr[arr.length-1], arr.length-1};
    }
}