class Solution {
    public int[] solution(int[] arr, int n) {
        // n을 기준으로 nList 차례대로 순차적으로 비교한다.
        // n - nList[i] 의 절대값을 기준으로 더 작은값을 배열의 앞으로 정렬한다.
        // 절대값이 같은 경우 원소를 비교하여 원소가 더 큰 경우에 배열의 앞으로 스왑한다.
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                int a = Math.abs(n - arr[i]);
                int b = Math.abs(n - arr[j]);
                if(b < a){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }else if(b == a){
                    if(arr[i] < arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }
}